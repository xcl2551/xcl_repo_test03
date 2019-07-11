package com.pccw.purchasecontrol.service;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pccw.framework.domain.purchasecontrol.ScdaYearPurcDemand;
import com.pccw.framework.domain.purchasecontrol.ScdaYearPurcDemandExample;
import com.pccw.framework.domain.purchasecontrol.ScdaYearTwodept;
import com.pccw.framework.domain.purchasecontrol.ScdaYearTwodeptExample;
import com.pccw.framework.domain.purchasecontrol.request.PurchaseControlRequest;
import com.pccw.framework.domain.purchasecontrol.response.PurchaseControlCode;
import com.pccw.framework.domain.purchasecontrol.response.ScdaYearPurcDemandResult;
import com.pccw.framework.domain.purchasecontrol.response.ScdaYearTwodeptResult;
import com.pccw.framework.exception.ExceptionCast;
import com.pccw.framework.model.response.CommonCode;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.framework.model.response.QueryResult;
import com.pccw.framework.utils.CommonNullUtil;
import com.pccw.framework.utils.ScdaDateFormartUtil;
import com.pccw.purchasecontrol.mapper.ScdaYearTwodeptMapper;
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
public class ScdaYearTwodeptService {
    @Autowired
    private ScdaYearTwodeptMapper twodeptMapper;

    /**
     * 依据截止日期,获取一条记录
     *
     * @param purchaseControlRequest
     * @return
     */
    public ScdaYearTwodeptResult findOne(PurchaseControlRequest purchaseControlRequest) {

        if (purchaseControlRequest.getStrDeadlineDate() == null
                || purchaseControlRequest.getYtDept() == null
                || purchaseControlRequest.getYtType() == null) {
            ExceptionCast.cast(CommonCode.INVALID_PARAM);
        }


        //1.获取截止日期
        String strDeadlineDate = purchaseControlRequest.getStrDeadlineDate();

        //2.判断格式是否正确
        if (!ScdaDateFormartUtil.checkSteDatePattern(strDeadlineDate, "yyyy-MM-dd")) {
            ExceptionCast.cast(PurchaseControlCode.PURCHASECONTROL_STRDEADLINEDATE_ILLEGALITY);
        }


        //3.条件查询拼接
        ScdaYearTwodeptExample example = new ScdaYearTwodeptExample();
        ScdaYearTwodeptExample.Criteria criteria = example.createCriteria();
        //3.1 按截止日期字符串筛选
        criteria.andDeadlineDateEqualTo(strDeadlineDate);
        //3.2 按部门筛选
        if (purchaseControlRequest.getYtDept() != null) {
            criteria.andYtDeptEqualTo(purchaseControlRequest.getYtDept());
        }

        //3.3 按类型筛选
        if (purchaseControlRequest.getYtType() != null) {
            criteria.andYtTypeEqualTo(purchaseControlRequest.getYtType());
        }


        List<ScdaYearTwodept> yearTwodepts = twodeptMapper.selectByExample(example);

        //结果空值判断
        if (CommonNullUtil.isEmpty(yearTwodepts)) {
            ExceptionCast.cast(PurchaseControlCode.PURCHASECONTROL_PDRPPRNUMBER_NONE);
        }

        //计数可用记录条数
        int enableNum = 0;
        //定义接收数据对象
        ScdaYearTwodept yearTwodept = null;
        //获取创建时间(必有),然后获取最后更新时间,并取最后更新时间最大的
        for (ScdaYearTwodept scdaYearTwodept : yearTwodepts) {
            //判断是否可用
            if ("Y".equals(scdaYearTwodept.getEnableFlag())) {
                enableNum++;
                //给对象复制
                yearTwodept = scdaYearTwodept;
            }
        }
        if (enableNum == 1) {
            //满足条件
            return new ScdaYearTwodeptResult(CommonCode.SUCCESS, yearTwodept);
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
     * 分页列表
     *
     * @param purchaseControlRequest
     * @return
     */
    public QueryResponseResult<ScdaYearTwodept> findPage(PurchaseControlRequest purchaseControlRequest) {

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
        PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        ScdaYearTwodeptExample example = new ScdaYearTwodeptExample();
        ScdaYearTwodeptExample.Criteria criteria = example.createCriteria();
        //添加条件可用状态为Y
        criteria.andEnableFlagEqualTo("Y");
        // 按部门筛选
        if (purchaseControlRequest.getYtDept() != null) {
            criteria.andYtDeptEqualTo(purchaseControlRequest.getYtDept());
        }
        // 按类型筛选
        if (purchaseControlRequest.getYtType() != null) {
            criteria.andYtTypeEqualTo(purchaseControlRequest.getYtType());
        }
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
        example.setOrderByClause("creation_date desc,yt_id desc");
        Page<ScdaYearTwodept> yearTwodepts = (Page<ScdaYearTwodept>) twodeptMapper.selectByExample(example);


        //数据封装
        QueryResult<ScdaYearTwodept> queryResult = new QueryResult<>();
        queryResult.setTotal(yearTwodepts.getTotal());
        queryResult.setList(yearTwodepts.getResult());
        return new QueryResponseResult<>(CommonCode.SUCCESS, queryResult);
    }
}
