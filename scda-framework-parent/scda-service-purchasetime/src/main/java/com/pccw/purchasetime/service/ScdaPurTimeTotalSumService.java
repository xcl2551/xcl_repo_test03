package com.pccw.purchasetime.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pccw.framework.domain.purchasetime.ScdaPurTimeTotalSum;
import com.pccw.framework.domain.purchasetime.ScdaPurTimeTotalSumExample;
import com.pccw.framework.domain.purchasetime.request.ScdaPurTimeTotalSumRequest;
import com.pccw.framework.domain.purchasetime.response.ScdaPurTimeTotalSumResult;
import com.pccw.framework.exception.ExceptionCast;
import com.pccw.framework.model.response.CommonCode;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.framework.model.response.QueryResult;
import com.pccw.framework.utils.ScdaDateFormartUtil;
import com.pccw.purchasetime.mapper.ScdaPurTimeTotalSumMapper;
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
public class ScdaPurTimeTotalSumService {
    @Autowired
    private ScdaPurTimeTotalSumMapper scdaPurTimeTotalSumMapper;

    /**
     * 获取一个类型的一条数据
     *
     * @param scdaPurTimeTotalSumRequest
     * @return
     */
    public ScdaPurTimeTotalSumResult findOneType(ScdaPurTimeTotalSumRequest scdaPurTimeTotalSumRequest) {
        ScdaPurTimeTotalSumExample example = new ScdaPurTimeTotalSumExample();
        //对参数非空进行判断
        ScdaPurTimeTotalSumExample.Criteria criteria = example.createCriteria();
        if (
                scdaPurTimeTotalSumRequest.getDeadlineDate() == null
                ) {
            ExceptionCast.cast(CommonCode.INVALID_PARAM);
        }
        criteria.andDeadlineDateEqualTo(scdaPurTimeTotalSumRequest.getDeadlineDate());
        criteria.andEnableFlagEqualTo("Y");
        List<ScdaPurTimeTotalSum> scdaPurTimeTotalSums = scdaPurTimeTotalSumMapper.selectByExample(example);
        //对结果进行唯一判断
        if (scdaPurTimeTotalSums.size() != 1) {
            ExceptionCast.cast(CommonCode.DATE_ERROR);
        }
        return new ScdaPurTimeTotalSumResult(CommonCode.SUCCESS, scdaPurTimeTotalSums.get(0));
    }


    /**
     * 按条件分页查询
     *
     * @param scdaPurTimeTotalSumRequest
     * @return
     */
    public QueryResponseResult<ScdaPurTimeTotalSum> findPage(ScdaPurTimeTotalSumRequest scdaPurTimeTotalSumRequest) {
        //1 获取当前页码
        String pageNum = scdaPurTimeTotalSumRequest.getPageNum();
        if (pageNum == null) {
            pageNum = "1";
        }
        //2 获取每页显示条数
        String pageSize = scdaPurTimeTotalSumRequest.getPageSize();
        if (pageSize == null) {
            pageSize = "10";
        }

        //获取开始时间,结束时间
        String startCreateDate = scdaPurTimeTotalSumRequest.getStartCreateDate();
        String endCreateDate = scdaPurTimeTotalSumRequest.getEndCreateDate();

        PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        ScdaPurTimeTotalSumExample example = new ScdaPurTimeTotalSumExample();
        ScdaPurTimeTotalSumExample.Criteria criteria = example.createCriteria();
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
                scdaPurTimeTotalSumRequest.getDeadlineDate() != null
                ) {
            criteria.andDeadlineDateEqualTo(scdaPurTimeTotalSumRequest.getDeadlineDate());
        }
        //添加条件可用状态为Y
        criteria.andEnableFlagEqualTo("Y");
        //按时间倒序排序
        example.setOrderByClause("creation_date desc,key_id desc");
        Page<ScdaPurTimeTotalSum> scdaPurTimeTotalSums = (Page<ScdaPurTimeTotalSum>) scdaPurTimeTotalSumMapper.selectByExample(example);
        QueryResult<ScdaPurTimeTotalSum> queryResult = new QueryResult<>();
        queryResult.setTotal(scdaPurTimeTotalSums.getTotal());
        queryResult.setList(scdaPurTimeTotalSums.getResult());
        return new QueryResponseResult<>(CommonCode.SUCCESS, queryResult);
    }

}
