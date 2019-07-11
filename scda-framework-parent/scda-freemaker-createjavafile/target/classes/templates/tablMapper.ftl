package com.pccw.createjavafile.mapper;

import ${javeBeanPath};
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: xcl
 * @Date: ${currentTimeStr}
 * @Version 1.0
 */
public interface ${javaTableName}Mapper {
    //1.增
    public void addOne(${javaTableName}  ${javaTableName?uncap_first});
    //2.删
    public void deleteOne(${javaTableName}  ${javaTableName?uncap_first});
    //3.改
    public void updateOne(${javaTableName}  ${javaTableName?uncap_first});
    //4.按条件查询一条
    public ${javaTableName} findOne(${javaTableName}  ${javaTableName?uncap_first});
    //5.分页查询
    public List<${javaTableName}> findPage(${javaTableName}  ${javaTableName?uncap_first});
}
