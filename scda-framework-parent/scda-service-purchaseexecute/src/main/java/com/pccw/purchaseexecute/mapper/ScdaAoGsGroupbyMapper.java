package com.pccw.purchaseexecute.mapper;

import com.pccw.framework.domain.purchaseexecute.ScdaAoGsGroupby;
import com.pccw.framework.domain.purchaseexecute.ScdaAoGsGroupbyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScdaAoGsGroupbyMapper {
    int countByExample(ScdaAoGsGroupbyExample example);

    int deleteByExample(ScdaAoGsGroupbyExample example);

    int deleteByPrimaryKey(String pcId);

    int insert(ScdaAoGsGroupby record);

    int insertSelective(ScdaAoGsGroupby record);

    List<ScdaAoGsGroupby> selectByExample(ScdaAoGsGroupbyExample example);

    ScdaAoGsGroupby selectByPrimaryKey(String pcId);

    int updateByExampleSelective(@Param("record") ScdaAoGsGroupby record, @Param("example") ScdaAoGsGroupbyExample example);

    int updateByExample(@Param("record") ScdaAoGsGroupby record, @Param("example") ScdaAoGsGroupbyExample example);

    int updateByPrimaryKeySelective(ScdaAoGsGroupby record);

    int updateByPrimaryKey(ScdaAoGsGroupby record);
}