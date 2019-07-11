package com.pccw.api.${modelName};

import com.pccw.framework.domain.${modelName}.${javaTableName};
import com.pccw.framework.domain.${modelName}.request.${javaTableName}Request;
import com.pccw.framework.domain.${modelName}.response.${javaTableName}Result;
import com.pccw.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Author: xcl
 * @Date: ${currentTimeStr}
 * @Version 1.0
 */
@Api(value = "${tableName}",description = "提供查询一种类型,及分页功能")
public interface ${javaTableName}ControllerApi {

    @ApiOperation("查询一种类型数据")
    public ${javaTableName}Result findOneType(${javaTableName}Request ${javaTableName?uncap_first}Request);

    @ApiOperation("查询一种类型数据")
    public QueryResponseResult<${javaTableName}> findOne(${javaTableName}Request ${javaTableName?uncap_first}Request);


    @ApiOperation("按条件分页查询:开始时间,结束时间")
    public QueryResponseResult<${javaTableName}> findPage(${javaTableName}Request ${javaTableName?uncap_first}Request);


        }
