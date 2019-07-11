package com.pccw.createjavafile.domain;

import lombok.Data;
import lombok.ToString;

/**
 * @Author: xcl
 * @Date: 2019-4-19 10:06
 * @Version 1.0
 */
@Data
@ToString
public class TableDetail {
    private String tableName ;   //获取表名称
    private String columnName ;   //获取表的列名称
    private String javaColumnName; //获取数据库字段对应的表名称
    private String dataType ;   //获取表的字段类型
    private String javaDataType ;   //获取表的字段类型
    private String dataLength ;   //获取表的列字段类型长度
    private String dataPrecision ;   //获取表的列字段类型描述
    private String nullable ;   //获取表的字段,是否可以为空,N表示不可以,Y表示可以
    private String columnId ;   //获取表的列顺序
    private String comments ;   //获取表注释
    private String attrGetName; //get方法名称
    private String attrSetName; //set方法名称
}
