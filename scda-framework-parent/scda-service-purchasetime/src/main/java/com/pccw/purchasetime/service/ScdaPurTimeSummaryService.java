package com.pccw.purchasetime.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pccw.framework.domain.purchasetime.ScdaPurTimeSummary;
import com.pccw.framework.domain.purchasetime.ScdaPurTimeSummaryExample;
import com.pccw.framework.domain.purchasetime.request.ScdaPurTimeSummaryRequest;
import com.pccw.framework.domain.purchasetime.response.ScdaPurTimeSummaryResult;
import com.pccw.framework.exception.ExceptionCast;
import com.pccw.framework.model.response.CommonCode;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.framework.model.response.QueryResult;
import com.pccw.framework.utils.ScdaDateFormartUtil;
import com.pccw.purchasetime.mapper.ScdaPurTimeSummaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: xcl
 * @Date: 2019-05-05 10:50:24
 * @Version 1.0
 */
@Service
public class ScdaPurTimeSummaryService {
    @Autowired
    private ScdaPurTimeSummaryMapper scdaPurTimeSummaryMapper;

    /**
     * 获取一个类型的一条数据
     *
     * @param scdaPurTimeSummaryRequest
     * @return
     */
    public ScdaPurTimeSummaryResult findOneType(ScdaPurTimeSummaryRequest scdaPurTimeSummaryRequest) {
        ScdaPurTimeSummaryExample example = new ScdaPurTimeSummaryExample();
        //对参数非空进行判断
        ScdaPurTimeSummaryExample.Criteria criteria = example.createCriteria();
        if (
                scdaPurTimeSummaryRequest.getDeadlineDate() == null
                ) {
            ExceptionCast.cast(CommonCode.INVALID_PARAM);
        }
        criteria.andDeadlineDateEqualTo(scdaPurTimeSummaryRequest.getDeadlineDate());
        criteria.andEnableFlagEqualTo("Y");
        List<ScdaPurTimeSummary> scdaPurTimeSummarys = scdaPurTimeSummaryMapper.selectByExample(example);
        //对结果进行唯一判断
        if (scdaPurTimeSummarys.size() != 1) {
            ExceptionCast.cast(CommonCode.DATE_ERROR);
        }
        return new ScdaPurTimeSummaryResult(CommonCode.SUCCESS, scdaPurTimeSummarys.get(0));
    }


    /**
     * 按条件分页查询
     *
     * @param scdaPurTimeSummaryRequest
     * @return
     */
    public QueryResponseResult<ScdaPurTimeSummary> findPage(ScdaPurTimeSummaryRequest scdaPurTimeSummaryRequest) {
        //1 获取当前页码
        String pageNum = scdaPurTimeSummaryRequest.getPageNum();
        if (pageNum == null) {
            pageNum = "1";
        }
        //2 获取每页显示条数
        String pageSize = scdaPurTimeSummaryRequest.getPageSize();
        if (pageSize == null) {
            pageSize = "10";
        }

        //获取开始时间,结束时间
        String startCreateDate = scdaPurTimeSummaryRequest.getStartCreateDate();
        String endCreateDate = scdaPurTimeSummaryRequest.getEndCreateDate();

        PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        ScdaPurTimeSummaryExample example = new ScdaPurTimeSummaryExample();
        ScdaPurTimeSummaryExample.Criteria criteria = example.createCriteria();
        if (startCreateDate != null && endCreateDate != null) {
            Map<String, Date> dateStartAndEnd = null;
            try {
                dateStartAndEnd = ScdaDateFormartUtil.getDateStartAndEnd(startCreateDate, endCreateDate);
            } catch (ParseException e) {
                ExceptionCast.cast(CommonCode.STRDEADLINEDATE_ILLEGALITY);
            }
            criteria.andCreationDateBetween(dateStartAndEnd.get("startDate"), dateStartAndEnd.get("endDate"));
        }
        //条件满足筛选
        if (
                scdaPurTimeSummaryRequest.getDeadlineDate() != null
                ) {
            criteria.andDeadlineDateEqualTo(scdaPurTimeSummaryRequest.getDeadlineDate());
        }
        //添加条件可用状态为Y
        criteria.andEnableFlagEqualTo("Y");
        //按时间倒序排序
        example.setOrderByClause("creation_date desc,key_id desc");
        Page<ScdaPurTimeSummary> scdaPurTimeSummarys = (Page<ScdaPurTimeSummary>) scdaPurTimeSummaryMapper.selectByExample(example);
        QueryResult<ScdaPurTimeSummary> queryResult = new QueryResult<>();
        queryResult.setTotal(scdaPurTimeSummarys.getTotal());
        queryResult.setList(scdaPurTimeSummarys.getResult());
        return new QueryResponseResult<>(CommonCode.SUCCESS, queryResult);
    }

}
