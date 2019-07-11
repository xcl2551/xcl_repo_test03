package com.pccw.api.purchasecontrol;

import com.pccw.framework.domain.purchasecontrol.ScdaYearPurcDemand;
import com.pccw.framework.domain.purchasecontrol.request.PurchaseControlRequest;
import com.pccw.framework.domain.purchasecontrol.response.ScdaYearPurcDemandResult;
import com.pccw.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Author: xcl
 * @Date: 2019-4-2 17:55
 * @Version 1.0
 */
@Api(value = "部门需求近12月总览",description = "提供查询一条,及分页功能")
public interface ScdaYearPurcDemandControllerApi {
    @ApiOperation("查询一条数据")
    public ScdaYearPurcDemandResult findOne(PurchaseControlRequest purchaseControlRequest);

    @ApiOperation("按条件分页查询:开始时间,结束时间")
    public QueryResponseResult<ScdaYearPurcDemand> findPage(PurchaseControlRequest purchaseControlRequest);
}
