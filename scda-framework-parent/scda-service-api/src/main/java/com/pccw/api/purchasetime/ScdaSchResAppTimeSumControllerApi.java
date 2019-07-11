package com.pccw.api.purchasetime;

import com.pccw.framework.domain.purchasetime.ScdaSchResAppTimeSum;
import com.pccw.framework.domain.purchasetime.request.ScdaSchResAppTimeSumRequest;
import com.pccw.framework.domain.purchasetime.response.ScdaSchResAppTimeSumResult;
import com.pccw.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Author: xcl
 * @Date: 2019-05-05 10:50:23
 * @Version 1.0
 */
@Api(value = "SCDA_SCH_RES_APP_TIME_SUM",description = "提供查询一种类型,及分页功能")
public interface ScdaSchResAppTimeSumControllerApi {

    @ApiOperation("查询一种类型数据")
    public ScdaSchResAppTimeSumResult findOneType(ScdaSchResAppTimeSumRequest scdaSchResAppTimeSumRequest);

    @ApiOperation("查询一种类型数据")
    public QueryResponseResult<ScdaSchResAppTimeSum> findOne(ScdaSchResAppTimeSumRequest scdaSchResAppTimeSumRequest);


    @ApiOperation("按条件分页查询:开始时间,结束时间")
    public QueryResponseResult<ScdaSchResAppTimeSum> findPage(ScdaSchResAppTimeSumRequest scdaSchResAppTimeSumRequest);


        }
