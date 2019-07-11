package com.pccw.api.purchaseexecute;

import com.pccw.framework.domain.purchaseexecute.ScdaYearPurcExecute;
import com.pccw.framework.domain.purchaseexecute.request.PurchaseExecuteRequest;
import com.pccw.framework.domain.purchaseexecute.response.ScdaYearPurcExecuteResult;
import com.pccw.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Author: xcl
 * @Date: 2019-4-9 14:07
 * @Version 1.0
 */
@Api(value = "2_3采购集中度表",description = "提供查询一条,及分页功能")
public interface ScdaYearPurcExecuteControllerApi {
    @ApiOperation("查询一条数据")
    public ScdaYearPurcExecuteResult findOne(PurchaseExecuteRequest purchaseExecuteRequest);

    @ApiOperation("按条件分页查询:开始时间,结束时间")
    public QueryResponseResult<ScdaYearPurcExecute> findPage(PurchaseExecuteRequest purchaseExecuteRequest);
}
