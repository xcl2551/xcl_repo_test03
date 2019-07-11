package com.pccw.purchasetime.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pccw.framework.domain.purchasetime.ScdaPurDemandDetail;
import com.pccw.framework.domain.purchasetime.ScdaPurDemandDetailExample;
import com.pccw.framework.domain.purchasetime.request.ScdaPurDemandDetailRequest;
import com.pccw.framework.domain.purchasetime.response.ScdaPurDemandDetailResult;
import com.pccw.framework.exception.ExceptionCast;
import com.pccw.framework.model.response.CommonCode;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.framework.model.response.QueryResult;
import com.pccw.framework.utils.ScdaDateFormartUtil;
import com.pccw.purchasetime.mapper.ScdaPurDemandDetailMapper;
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
public class ScdaPurDemandDetailService {
    @Autowired
    private ScdaPurDemandDetailMapper scdaPurDemandDetailMapper;

    /**
     * 获取一个类型的一条数据
     *
     * @param scdaPurDemandDetailRequest
     * @return
     */
    public ScdaPurDemandDetailResult findOneType(ScdaPurDemandDetailRequest scdaPurDemandDetailRequest) {
        ScdaPurDemandDetailExample example = new ScdaPurDemandDetailExample();
        //对参数非空进行判断
        ScdaPurDemandDetailExample.Criteria criteria = example.createCriteria();
        if (
                scdaPurDemandDetailRequest.getDeadlineDate() == null
                ) {
            ExceptionCast.cast(CommonCode.INVALID_PARAM);
        }
        criteria.andDeadlineDateEqualTo(scdaPurDemandDetailRequest.getDeadlineDate());
        criteria.andEnableFlagEqualTo("Y");
        List<ScdaPurDemandDetail> scdaPurDemandDetails = scdaPurDemandDetailMapper.selectByExample(example);
        //对结果进行唯一判断
        if (scdaPurDemandDetails.size() != 1) {
            ExceptionCast.cast(CommonCode.DATE_ERROR);
        }
        return new ScdaPurDemandDetailResult(CommonCode.SUCCESS, scdaPurDemandDetails.get(0));
    }


    /**
     * 按条件分页查询
     *
     * @param scdaPurDemandDetailRequest
     * @return
     */
    public QueryResponseResult<ScdaPurDemandDetail> findPage(ScdaPurDemandDetailRequest scdaPurDemandDetailRequest) {
        //1 获取当前页码
        String pageNum = scdaPurDemandDetailRequest.getPageNum();
        if (pageNum == null) {
            pageNum = "1";
        }
        //2 获取每页显示条数
        String pageSize = scdaPurDemandDetailRequest.getPageSize();
        if (pageSize == null) {
            pageSize = "10";
        }

        //获取开始时间,结束时间
        String startCreateDate = scdaPurDemandDetailRequest.getStartCreateDate();
        String endCreateDate = scdaPurDemandDetailRequest.getEndCreateDate();

        PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        ScdaPurDemandDetailExample example = new ScdaPurDemandDetailExample();
        ScdaPurDemandDetailExample.Criteria criteria = example.createCriteria();
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
                scdaPurDemandDetailRequest.getDeadlineDate() != null
                ) {
            criteria.andDeadlineDateEqualTo(scdaPurDemandDetailRequest.getDeadlineDate());
        }
        //添加条件可用状态为Y
        criteria.andEnableFlagEqualTo("Y");
        //按时间倒序排序
        example.setOrderByClause("creation_date desc,key_id desc");
        Page<ScdaPurDemandDetail> scdaPurDemandDetails = (Page<ScdaPurDemandDetail>) scdaPurDemandDetailMapper.selectByExample(example);
        QueryResult<ScdaPurDemandDetail> queryResult = new QueryResult<>();
        queryResult.setTotal(scdaPurDemandDetails.getTotal());
        queryResult.setList(scdaPurDemandDetails.getResult());
        return new QueryResponseResult<>(CommonCode.SUCCESS, queryResult);
    }

}
