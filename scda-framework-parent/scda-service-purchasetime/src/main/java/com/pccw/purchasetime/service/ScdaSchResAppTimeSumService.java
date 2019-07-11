package com.pccw.purchasetime.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pccw.framework.domain.purchasetime.ScdaSchResAppTimeSum;
import com.pccw.framework.domain.purchasetime.ScdaSchResAppTimeSumExample;
import com.pccw.framework.domain.purchasetime.request.ScdaSchResAppTimeSumRequest;
import com.pccw.framework.domain.purchasetime.response.ScdaSchResAppTimeSumResult;
import com.pccw.framework.exception.ExceptionCast;
import com.pccw.framework.model.response.CommonCode;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.framework.model.response.QueryResult;
import com.pccw.framework.utils.ScdaDateFormartUtil;
import com.pccw.purchasetime.mapper.ScdaSchResAppTimeSumMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: xcl
 * @Date: 2019-05-05 10:50:23
 * @Version 1.0
 */
@Service
public class ScdaSchResAppTimeSumService {
    @Autowired
    private ScdaSchResAppTimeSumMapper scdaSchResAppTimeSumMapper;

    /**
     * 获取一个类型的一条数据
     *
     * @param scdaSchResAppTimeSumRequest
     * @return
     */
    public ScdaSchResAppTimeSumResult findOneType(ScdaSchResAppTimeSumRequest scdaSchResAppTimeSumRequest) {
        ScdaSchResAppTimeSumExample example = new ScdaSchResAppTimeSumExample();
        //对参数非空进行判断
        ScdaSchResAppTimeSumExample.Criteria criteria = example.createCriteria();
        if (
                scdaSchResAppTimeSumRequest.getDeadlineDate() == null
                ) {
            ExceptionCast.cast(CommonCode.INVALID_PARAM);
        }
        criteria.andDeadlineDateEqualTo(scdaSchResAppTimeSumRequest.getDeadlineDate());
        criteria.andEnableFlagEqualTo("Y");
        List<ScdaSchResAppTimeSum> scdaSchResAppTimeSums = scdaSchResAppTimeSumMapper.selectByExample(example);
        //对结果进行唯一判断
        if (scdaSchResAppTimeSums.size() != 1) {
            ExceptionCast.cast(CommonCode.DATE_ERROR);
        }
        return new ScdaSchResAppTimeSumResult(CommonCode.SUCCESS, scdaSchResAppTimeSums.get(0));
    }


    /**
     * 按条件分页查询
     *
     * @param scdaSchResAppTimeSumRequest
     * @return
     */
    public QueryResponseResult<ScdaSchResAppTimeSum> findPage(ScdaSchResAppTimeSumRequest scdaSchResAppTimeSumRequest) {
        //1 获取当前页码
        String pageNum = scdaSchResAppTimeSumRequest.getPageNum();
        if (pageNum == null) {
            pageNum = "1";
        }
        //2 获取每页显示条数
        String pageSize = scdaSchResAppTimeSumRequest.getPageSize();
        if (pageSize == null) {
            pageSize = "10";
        }

        //获取开始时间,结束时间
        String startCreateDate = scdaSchResAppTimeSumRequest.getStartCreateDate();
        String endCreateDate = scdaSchResAppTimeSumRequest.getEndCreateDate();

        PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        ScdaSchResAppTimeSumExample example = new ScdaSchResAppTimeSumExample();
        ScdaSchResAppTimeSumExample.Criteria criteria = example.createCriteria();
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
                scdaSchResAppTimeSumRequest.getDeadlineDate() != null
                ) {
            criteria.andDeadlineDateEqualTo(scdaSchResAppTimeSumRequest.getDeadlineDate());
        }
        //添加条件可用状态为Y
        criteria.andEnableFlagEqualTo("Y");
        //按时间倒序排序
        example.setOrderByClause("creation_date desc,key_id desc");
        Page<ScdaSchResAppTimeSum> scdaSchResAppTimeSums = (Page<ScdaSchResAppTimeSum>) scdaSchResAppTimeSumMapper.selectByExample(example);
        QueryResult<ScdaSchResAppTimeSum> queryResult = new QueryResult<>();
        queryResult.setTotal(scdaSchResAppTimeSums.getTotal());
        queryResult.setList(scdaSchResAppTimeSums.getResult());
        return new QueryResponseResult<>(CommonCode.SUCCESS, queryResult);
    }

}
