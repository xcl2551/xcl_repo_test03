package com.pccw.api.purchasetime;

import com.pccw.framework.domain.purchaseexecute.request.PurchaseExecuteRequest;
import com.pccw.framework.domain.purchasetime.ScdaPurTimeBase;
import com.pccw.framework.domain.purchasetime.request.ScdaPurTimeBaseRequest;
import com.pccw.framework.domain.purchasetime.response.ScdaPurTimeBaseResult;
import com.pccw.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: xcl
 * @Date: 2019-05-06 14:14:16
 * @Version 1.0
 */
@Api(value = "SCDA_PUR_TIME_BASE", description = "提供查询一种类型,及分页功能")
public interface ScdaPurTimeBaseControllerApi {

    @ApiOperation("查询一种类型数据")
    public ScdaPurTimeBaseResult findOneType(ScdaPurTimeBaseRequest scdaPurTimeBaseRequest);

    @ApiOperation("查询一种类型数据")
    public QueryResponseResult<ScdaPurTimeBase> findOne(ScdaPurTimeBaseRequest scdaPurTimeBaseRequest);


    @ApiOperation("按条件分页查询:开始时间,结束时间")
    public QueryResponseResult<ScdaPurTimeBase> findPage(ScdaPurTimeBaseRequest scdaPurTimeBaseRequest);

    @ApiOperation("提供基础表下载功能")
    public void downloadExcel(ScdaPurTimeBaseRequest scdaPurTimeBaseRequest, HttpServletResponse response, HttpServletRequest request) throws IOException;


}
