package com.pccw.purchasecontrol.service;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pccw.framework.domain.purchasecontrol.ScdaYearPurcDemand;
import com.pccw.framework.domain.purchasecontrol.ScdaYearPurcDemandExample;
import com.pccw.framework.domain.purchasecontrol.request.PurchaseControlRequest;
import com.pccw.framework.domain.purchasecontrol.response.PurchaseControlCode;
import com.pccw.framework.domain.purchasecontrol.response.ScdaYearPurcDemandResult;
import com.pccw.framework.exception.ExceptionCast;
import com.pccw.framework.model.response.CommonCode;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.framework.model.response.QueryResult;
import com.pccw.framework.utils.CommonNullUtil;
import com.pccw.framework.utils.ScdaDateFormartUtil;
import com.pccw.purchasecontrol.mapper.ScdaYearPurcDemandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: xcl
 * @Date: 2019-3-29 17:30
 * @Version 1.0
 */
@Service
public class ScdaYearPurcDemandService {
    @Autowired
    private ScdaYearPurcDemandMapper yearPurcDemandMapper;

    /**
     * 依据截止日期,获取一条记录
     *
     * @param purchaseControlRequest
     * @return
     */
    public ScdaYearPurcDemandResult findOne(PurchaseControlRequest purchaseControlRequest) {
        //获取截止日期字符串
        String strDeadlineDate = purchaseControlRequest.getStrDeadlineDate();

        //1.判断是否为空
        if (CommonNullUtil.isEmpty(strDeadlineDate)) {
            ExceptionCast.cast(PurchaseControlCode.PURCHASECONTROL_STRDEADLINEDATE_NONE);
        }


        //2.判断格式是否正确
        if (!ScdaDateFormartUtil.checkSteDatePattern(strDeadlineDate, "yyyy-MM-dd")) {
            ExceptionCast.cast(PurchaseControlCode.PURCHASECONTROL_STRDEADLINEDATE_ILLEGALITY);
        }

        //3.条件查询拼接
        ScdaYearPurcDemandExample example = new ScdaYearPurcDemandExample();
        ScdaYearPurcDemandExample.Criteria criteria = example.createCriteria();
        criteria.andDeadlineDateEqualTo(strDeadlineDate);
        List<ScdaYearPurcDemand> scdaYearPurcDemands = yearPurcDemandMapper.selectByExample(example);

        //结果空值判断
        if (CommonNullUtil.isEmpty(scdaYearPurcDemands)) {
            ExceptionCast.cast(PurchaseControlCode.PURCHASECONTROL_PDRPPRNUMBER_NONE);
        }

        //计数可用记录条数
        int enableNum = 0;
        //定义接收数据对象
        ScdaYearPurcDemand yearPurcDemand = null;
        //获取创建时间(必有),然后获取最后更新时间,并取最后更新时间最大的
        for (ScdaYearPurcDemand scdaYearPurcDemand : scdaYearPurcDemands) {
            //判断是否可用
            if ("Y".equals(scdaYearPurcDemand.getEnableFlag())) {
                enableNum++;
                //给对象复制
                yearPurcDemand = scdaYearPurcDemand;
            }
        }
        if (enableNum == 1 ){
            //满足条件
            return new ScdaYearPurcDemandResult(CommonCode.SUCCESS,yearPurcDemand);
        }

        //对计数结果进行判断
        if (enableNum == 0){
            ExceptionCast.cast(PurchaseControlCode.PURCHASECONTROL_ENABLEFLAGE_N);
        }

        //如果超过两条,需要联系管理员
        if (enableNum > 1){
            ExceptionCast.cast(CommonCode.DATE_ERROR);
        }

        return null;
    }

    /**
     * 分页列表
     * @param purchaseControlRequest
     * @return
     */
    public QueryResponseResult<ScdaYearPurcDemand> findPage(PurchaseControlRequest purchaseControlRequest) {
//1 获取当前页码
        String pageNum = purchaseControlRequest.getPageNum();
        if (pageNum == null) {
            pageNum = "1";
        }
        //2 获取每页显示条数
        String pageSize = purchaseControlRequest.getPageSize();
        if (pageSize == null) {
            pageSize = "10";
        }

        //获取开始时间,结束时间
        String startCreateDate = purchaseControlRequest.getStartCreateDate();
        String endCreateDate = purchaseControlRequest.getEndCreateDate();

        //依据创建时间倒序
        PageHelper.startPage(Integer.parseInt(pageNum),Integer.parseInt(pageSize));
        ScdaYearPurcDemandExample example = new ScdaYearPurcDemandExample();
        ScdaYearPurcDemandExample.Criteria criteria = example.createCriteria();
        //添加条件可用状态为Y
        criteria.andEnableFlagEqualTo("Y");
        if (startCreateDate != null && endCreateDate != null) {
            Map<String, Date> dateStartAndEnd = null;
            try {
                dateStartAndEnd = ScdaDateFormartUtil.getDateStartAndEnd(startCreateDate, endCreateDate);
            } catch (ParseException e) {
                ExceptionCast.cast(CommonCode.STRDEADLINEDATE_ILLEGALITY);
            }
            criteria.andCreationDateBetween(dateStartAndEnd.get("startDate"), dateStartAndEnd.get("endDate"));
        }
        //按时间倒序排序
        example.setOrderByClause("creation_date desc,ypd_id desc");
        Page<ScdaYearPurcDemand> scdaYearPurcDemands= (Page<ScdaYearPurcDemand>) yearPurcDemandMapper.selectByExample(example);


        //数据封装
        QueryResult<ScdaYearPurcDemand> queryResult = new QueryResult<>();
        queryResult.setTotal(scdaYearPurcDemands.getTotal());
        queryResult.setList(scdaYearPurcDemands.getResult());
        return new QueryResponseResult<>(CommonCode.SUCCESS,queryResult);
    }


}
