package com.pccw.api.purchasetime;

import com.pccw.framework.domain.purchasetime.ScdaPurDemandDetail;
import com.pccw.framework.domain.purchasetime.request.ScdaPurDemandDetailRequest;
import com.pccw.framework.domain.purchasetime.response.ScdaPurDemandDetailResult;
import com.pccw.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Author: xcl
 * @Date: 2019-05-05 10:50:24
 * @Version 1.0
 */
@Api(value = "SCDA_PUR_DEMAND_DETAIL",description = "提供查询一种类型,及分页功能")
public interface ScdaPurDemandDetailControllerApi {

    @ApiOperation("查询一种类型数据")
    public ScdaPurDemandDetailResult findOneType(ScdaPurDemandDetailRequest scdaPurDemandDetailRequest);

    @ApiOperation("查询一种类型数据")
    public QueryResponseResult<ScdaPurDemandDetail> findOne(ScdaPurDemandDetailRequest scdaPurDemandDetailRequest);


    @ApiOperation("按条件分页查询:开始时间,结束时间")
    public QueryResponseResult<ScdaPurDemandDetail> findPage(ScdaPurDemandDetailRequest scdaPurDemandDetailRequest);


        }
