package com.pccw.api.purchaseexecute;

import com.pccw.framework.domain.purchaseexecute.ScdaAoGsGroupby;
import com.pccw.framework.domain.purchaseexecute.request.PurchaseExecuteRequest;
import com.pccw.framework.domain.purchaseexecute.response.ScdaAoGsGroupbyResult;
import com.pccw.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Author: xcl
 * @Date: 2019-4-9 14:07
 * @Version 1.0
 */
@Api(value = "2_2集团口径及实际发生统计表",description = "提供查询一种类型,及分页功能")
public interface ScdaAoGsGroupbyControllerApi {
    @ApiOperation("查询一种类型数据")
    public QueryResponseResult<ScdaAoGsGroupby> findOneType(PurchaseExecuteRequest purchaseExecuteRequest);

    @ApiOperation("按条件分页查询:开始时间,结束时间")
    public QueryResponseResult<ScdaAoGsGroupby> findPage(PurchaseExecuteRequest purchaseExecuteRequest);
}
