package com.pccw.${modelName}.controller;

import com.pccw.api.${modelName}.${javaTableName}ControllerApi;
import com.pccw.framework.domain.${modelName}.${javaTableName};
import com.pccw.framework.domain.${modelName}.request.${javaTableName}Request;
import com.pccw.framework.domain.${modelName}.response.${javaTableName}Result;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.${modelName}.service.${javaTableName}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xcl
 * @Date: ${currentTimeStr}
 * @Version 1.0
 */
@RestController
@RequestMapping("/${javaTableName?uncap_first}")
public class ${javaTableName}Controller  implements ${javaTableName}ControllerApi{

    @Autowired
    private ${javaTableName}Service ${javaTableName?uncap_first}Service;
    /**
     * 发现一种类型
     * @param ${javaTableName?uncap_first}Request
     * @return
     */
    @Override
    @PostMapping("/findOneType")
    public ${javaTableName}Result findOneType(@RequestBody ${javaTableName}Request ${javaTableName?uncap_first}Request) {

        return ${javaTableName?uncap_first}Service.findOneType(${javaTableName?uncap_first}Request);
    }

    /**
     * 发现一条页面显示数据
     * @param ${javaTableName?uncap_first}Request
     * @return
     */
    @Override
    @PostMapping("/findOne")
    public QueryResponseResult<${javaTableName}> findOne(@RequestBody ${javaTableName}Request ${javaTableName?uncap_first}Request) {
    return null;
    }

    /**
    * 分页查询
    * @param ${javaTableName?uncap_first}Request
    * @return
    */
    @Override
    @PostMapping("/findPage")
    public QueryResponseResult<${javaTableName}> findPage(@RequestBody ${javaTableName}Request ${javaTableName?uncap_first}Request) {
        return ${javaTableName?uncap_first}Service.findPage(${javaTableName?uncap_first}Request);
        }
        }
