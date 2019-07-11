package com.pccw.createjavafile.mapper;

import com.pccw.createjavafile.domain.TableDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: xcl
 * @Date: 2019-4-19 10:11
 * @Version 1.0
 */
@Mapper
public interface TableDetailMapper {
    public List<TableDetail>  getDetailFromTableName(@Param("tableName") String tableName);

}
