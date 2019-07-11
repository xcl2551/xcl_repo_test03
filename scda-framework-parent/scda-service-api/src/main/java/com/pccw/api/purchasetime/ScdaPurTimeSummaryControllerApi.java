package com.pccw.api.purchasetime;

import com.pccw.framework.domain.purchasetime.ScdaPurTimeSummary;
import com.pccw.framework.domain.purchasetime.request.ScdaPurTimeSummaryRequest;
import com.pccw.framework.domain.purchasetime.response.ScdaPurTimeSummaryResult;
import com.pccw.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Author: xcl
 * @Date: 2019-05-05 10:50:24
 * @Version 1.0
 */
@Api(value = "SCDA_PUR_TIME_SUMMARY", description = "提供查询一种类型,及分页功能")
public interface ScdaPurTimeSummaryControllerApi {

    @ApiOperation("查询一种类型数据")
    public ScdaPurTimeSummaryResult findOneType(ScdaPurTimeSummaryRequest scdaPurTimeSummaryRequest);

    @ApiOperation("查询一种类型数据")
    public QueryResponseResult<ScdaPurTimeSummary> findOne(ScdaPurTimeSummaryRequest scdaPurTimeSummaryRequest);


    @ApiOperation("按条件分页查询:开始时间,结束时间")
    public QueryResponseResult<ScdaPurTimeSummary> findPage(ScdaPurTimeSummaryRequest scdaPurTimeSummaryRequest);


}
