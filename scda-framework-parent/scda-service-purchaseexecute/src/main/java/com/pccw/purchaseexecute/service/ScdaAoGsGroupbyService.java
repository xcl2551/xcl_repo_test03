package com.pccw.purchaseexecute.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pccw.framework.domain.purchasecontrol.response.PurchaseControlCode;
import com.pccw.framework.domain.purchaseexecute.ScdaAoGsGroupby;
import com.pccw.framework.domain.purchaseexecute.ScdaAoGsGroupbyExample;
import com.pccw.framework.domain.purchaseexecute.request.PurchaseExecuteRequest;
import com.pccw.framework.domain.purchaseexecute.response.PurchaseExecuteCode;
import com.pccw.framework.exception.ExceptionCast;
import com.pccw.framework.model.response.CommonCode;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.framework.model.response.QueryResult;
import com.pccw.framework.utils.CommonNullUtil;
import com.pccw.framework.utils.ScdaDateFormartUtil;
import com.pccw.purchaseexecute.mapper.ScdaAoGsGroupbyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: xcl
 * @Date: 2019-4-9 14:06
 * @Version 1.0
 */
@Service
public class ScdaAoGsGroupbyService {
    @Autowired
    private ScdaAoGsGroupbyMapper scdaAoGsGroupbyMapper;


    /**
     * 发现一种类型的结果集,总共六种
     *
     * @param purchaseExecuteRequest
     * @return
     */
    public QueryResponseResult<ScdaAoGsGroupby> findOneType(PurchaseExecuteRequest purchaseExecuteRequest) {
        //参数安全检验
        //判断截止日期是否为空
        if (CommonNullUtil.isEmpty(purchaseExecuteRequest.getStrDeadlineDate())) {
            ExceptionCast.cast(PurchaseControlCode.PURCHASECONTROL_STRDEADLINEDATE_NONE);
        }
        //获取截止日期
        String strDeadlineDate = purchaseExecuteRequest.getStrDeadlineDate();

        //判断截止字符串格式是否正确
        if (!ScdaDateFormartUtil.checkSteDatePattern(strDeadlineDate, "yyyy-MM-dd")) {
            ExceptionCast.cast(PurchaseControlCode.PURCHASECONTROL_STRDEADLINEDATE_ILLEGALITY);
        }

        String aggType = purchaseExecuteRequest.getAggType();
        String aggPurchaseType = purchaseExecuteRequest.getAggPurchaseType();
        if (CommonNullUtil.isEmpty(aggType) || CommonNullUtil.isEmpty(aggPurchaseType)) {
            //必要的类型选择参数缺失
            ExceptionCast.cast(PurchaseExecuteCode.PURCHASEEXECUTE_PARAM_NONE);
        }

        //1 获取当前页码
        String pageNum = purchaseExecuteRequest.getPageNum();
        if (pageNum == null) {
            pageNum = "1";
        }
        //2 获取每页显示条数
        String pageSize = purchaseExecuteRequest.getPageSize();
        if (pageSize == null) {
            pageSize = "10";
        }

        PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        ScdaAoGsGroupbyExample example = new ScdaAoGsGroupbyExample();
        ScdaAoGsGroupbyExample.Criteria criteria = example.createCriteria();
        criteria.andAggTypeEqualTo(aggType);
        criteria.andAggPurchaseTypeEqualTo(aggPurchaseType);
        criteria.andEnableFlagEqualTo("Y");
        criteria.andDeadlineDateEqualTo(strDeadlineDate);
        //对结果集进行排序
        example.setOrderByClause("to_number(agg_purchase_project_sumamo) DESC");
        Page<ScdaAoGsGroupby> scdaAoGsGroupbies = (Page<ScdaAoGsGroupby>) scdaAoGsGroupbyMapper.selectByExample(example);


        QueryResult<ScdaAoGsGroupby> queryResult = new QueryResult<>();
        queryResult.setTotal(scdaAoGsGroupbies.getTotal());
        queryResult.setList(scdaAoGsGroupbies.getResult());

        return new QueryResponseResult<ScdaAoGsGroupby>(CommonCode.SUCCESS, queryResult);
    }


    public QueryResponseResult<ScdaAoGsGroupby> findPage(PurchaseExecuteRequest purchaseExecuteRequest) {
        //1 获取当前页码
        String pageNum = purchaseExecuteRequest.getPageNum();
        if (pageNum == null) {
            pageNum = "1";
        }
        //2 获取每页显示条数
        String pageSize = purchaseExecuteRequest.getPageSize();
        if (pageSize == null) {
            pageSize = "10";
        }
        //获取开始时间,结束时间
        String startCreateDate = purchaseExecuteRequest.getStartCreateDate();
        String endCreateDate = purchaseExecuteRequest.getEndCreateDate();

        PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        ScdaAoGsGroupbyExample example = new ScdaAoGsGroupbyExample();
        ScdaAoGsGroupbyExample.Criteria criteria = example.createCriteria();
        if (purchaseExecuteRequest.getAggType() != null && purchaseExecuteRequest.getAggPurchaseType() != null) {
            criteria.andAggTypeEqualTo(purchaseExecuteRequest.getAggType());
            criteria.andAggPurchaseTypeEqualTo(purchaseExecuteRequest.getAggPurchaseType());
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
        //添加条件可用状态为Y
        criteria.andEnableFlagEqualTo("Y");
        //按时间倒序排序
        example.setOrderByClause("creation_date desc,pc_id desc");
        Page<ScdaAoGsGroupby> scdaAoGsGroupbies = (Page<ScdaAoGsGroupby>) scdaAoGsGroupbyMapper.selectByExample(example);


        QueryResult<ScdaAoGsGroupby> queryResult = new QueryResult<>();
        queryResult.setTotal(scdaAoGsGroupbies.getTotal());
        queryResult.setList(scdaAoGsGroupbies.getResult());
        return new QueryResponseResult<>(CommonCode.SUCCESS, queryResult);
    }
}
