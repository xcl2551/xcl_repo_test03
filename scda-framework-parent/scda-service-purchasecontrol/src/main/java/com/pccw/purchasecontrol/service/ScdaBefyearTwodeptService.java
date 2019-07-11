package com.pccw.purchasecontrol.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pccw.framework.domain.purchasecontrol.*;
import com.pccw.framework.domain.purchasecontrol.request.PurchaseControlRequest;
import com.pccw.framework.domain.purchasecontrol.response.PurchaseControlCode;
import com.pccw.framework.domain.purchasecontrol.response.ScdaBefyearTwodeptResult;
import com.pccw.framework.exception.ExceptionCast;
import com.pccw.framework.model.response.CommonCode;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.framework.model.response.QueryResult;
import com.pccw.framework.utils.CommonNullUtil;
import com.pccw.framework.utils.ScdaDateFormartUtil;
import com.pccw.purchasecontrol.mapper.ScdaBefyearTwodeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: xcl
 * @Date: 2019-3-29 13:40
 * @Version 1.0
 */
@Service
public class ScdaBefyearTwodeptService {

    @Autowired
    private ScdaBefyearTwodeptMapper befyearTwodeptMapper;

    public ScdaBefyearTwodeptResult findOne(PurchaseControlRequest purchaseControlRequest) {


        //判断截止日期是否为空
        if (CommonNullUtil.isEmpty(purchaseControlRequest.getStrDeadlineDate())) {
            ExceptionCast.cast(PurchaseControlCode.PURCHASECONTROL_STRDEADLINEDATE_NONE);
        }
        //获取截止日期
        String strDeadlineDate = purchaseControlRequest.getStrDeadlineDate();

        //判断截止字符串格式是否正确
        if (!ScdaDateFormartUtil.checkSteDatePattern(strDeadlineDate, "yyyy-MM-dd")) {
            ExceptionCast.cast(PurchaseControlCode.PURCHASECONTROL_STRDEADLINEDATE_ILLEGALITY);
        }

        //查询条件拼接--- 按截止日期字符串查询
        ScdaBefyearTwodeptExample example = new ScdaBefyearTwodeptExample();
        ScdaBefyearTwodeptExample.Criteria criteria = example.createCriteria();
        criteria.andDeadlineDateEqualTo(strDeadlineDate);
        List<ScdaBefyearTwodept> scdaBefyearTwodepts = befyearTwodeptMapper.selectByExample(example);


        //结果空值判断
        if (CommonNullUtil.isEmpty(scdaBefyearTwodepts)) {
            ExceptionCast.cast(PurchaseControlCode.PURCHASECONTROL_PDRPPRNUMBER_NONE);
        }

        //计数可用记录条数
        int enableNum = 0;
        //定义接收数据对象
        ScdaBefyearTwodept scdaBefyearTwodept = null;
        //获取创建时间(必有),然后获取最后更新时间,并取最后更新时间最大的
        for (ScdaBefyearTwodept befyearTwodept : scdaBefyearTwodepts) {
            //判断是否可用
            if ("Y".equals(befyearTwodept.getEnableFlag())) {
                enableNum++;
                //给对象复制
                scdaBefyearTwodept = befyearTwodept;
            }
        }
        if (enableNum == 1) {
            //满足条件
            return new ScdaBefyearTwodeptResult(CommonCode.SUCCESS, scdaBefyearTwodept);
        }

        //对计数结果进行判断
        if (enableNum == 0) {
            ExceptionCast.cast(PurchaseControlCode.PURCHASECONTROL_ENABLEFLAGE_N);
        }

        //如果超过两条,需要联系管理员
        if (enableNum > 1) {
            ExceptionCast.cast(CommonCode.DATE_ERROR);
        }

        return null;
    }

    /**
     * 依据条件进行分页查询
     *
     * @param purchaseControlRequest
     * @return
     */
    public QueryResponseResult<ScdaBefyearTwodept> findPage(PurchaseControlRequest purchaseControlRequest) {
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
        //分页查询条件拼接
        PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        ScdaBefyearTwodeptExample example = new ScdaBefyearTwodeptExample();
        ScdaBefyearTwodeptExample.Criteria criteria = example.createCriteria();
        if (startCreateDate != null && endCreateDate != null) {
            Map<String, Date> dateStartAndEnd = null;
            try {
                dateStartAndEnd = ScdaDateFormartUtil.getDateStartAndEnd(startCreateDate, endCreateDate);
            } catch (ParseException e) {
                ExceptionCast.cast(CommonCode.STRDEADLINEDATE_ILLEGALITY);
            }
            criteria.andCreationDateBetween(dateStartAndEnd.get("startDate"), dateStartAndEnd.get("endDate"));
        }
        //添加条件可用状态为Y
        criteria.andEnableFlagEqualTo("Y");
        //按时间倒序排序
        example.setOrderByClause("creation_date desc,bt_id desc");
        Page<ScdaBefyearTwodept> scdaBefyearTwodepts = (Page<ScdaBefyearTwodept>) befyearTwodeptMapper.selectByExample(example);


        QueryResult<ScdaBefyearTwodept> queryResult = new QueryResult<>();
        queryResult.setTotal(scdaBefyearTwodepts.getTotal());
        queryResult.setList(scdaBefyearTwodepts.getResult());
        return new QueryResponseResult<>(CommonCode.SUCCESS, queryResult);
    }
}
