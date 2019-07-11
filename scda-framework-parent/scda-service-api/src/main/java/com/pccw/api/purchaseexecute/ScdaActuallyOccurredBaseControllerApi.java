package com.pccw.api.purchaseexecute;

import com.pccw.framework.domain.purchaseexecute.ScdaActuallyOccurredBase;
import com.pccw.framework.domain.purchaseexecute.ScdaGroupSizeBase;
import com.pccw.framework.domain.purchaseexecute.request.PurchaseExecuteRequest;
import com.pccw.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: xcl
 * @Date: 2019-4-9 14:07
 * @Version 1.0
 */
@Api(value = "2_1_2实际发生基础数据表",description = "提供查询分页功能")
public interface ScdaActuallyOccurredBaseControllerApi {

    @ApiOperation("按条件分页查询:开始时间,结束时间")
    public QueryResponseResult<ScdaActuallyOccurredBase> findPage(PurchaseExecuteRequest purchaseExecuteRequest);
    @ApiOperation("提供基础表下载功能")
    public void downloadExcel( PurchaseExecuteRequest purchaseExecuteRequest, HttpServletResponse response, HttpServletRequest request) throws IOException;
}
