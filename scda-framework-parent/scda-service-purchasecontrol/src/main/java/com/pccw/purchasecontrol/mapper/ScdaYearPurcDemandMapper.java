package com.pccw.purchasecontrol.mapper;

import com.pccw.framework.domain.purchasecontrol.ScdaYearPurcDemand;
import com.pccw.framework.domain.purchasecontrol.ScdaYearPurcDemandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScdaYearPurcDemandMapper {
    int countByExample(ScdaYearPurcDemandExample example);

    int deleteByExample(ScdaYearPurcDemandExample example);

    int deleteByPrimaryKey(String ypdId);

    int insert(ScdaYearPurcDemand record);

    int insertSelective(ScdaYearPurcDemand record);

    List<ScdaYearPurcDemand> selectByExample(ScdaYearPurcDemandExample example);

    ScdaYearPurcDemand selectByPrimaryKey(String ypdId);

    int updateByExampleSelective(@Param("record") ScdaYearPurcDemand record, @Param("example") ScdaYearPurcDemandExample example);

    int updateByExample(@Param("record") ScdaYearPurcDemand record, @Param("example") ScdaYearPurcDemandExample example);

    int updateByPrimaryKeySelective(ScdaYearPurcDemand record);

    int updateByPrimaryKey(ScdaYearPurcDemand record);

}