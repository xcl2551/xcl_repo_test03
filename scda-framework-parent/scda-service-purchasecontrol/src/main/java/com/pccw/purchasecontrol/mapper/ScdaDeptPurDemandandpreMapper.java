package com.pccw.purchasecontrol.mapper;

import com.pccw.framework.domain.purchasecontrol.ScdaDeptPurDemandandpre;
import com.pccw.framework.domain.purchasecontrol.ScdaDeptPurDemandandpreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScdaDeptPurDemandandpreMapper {
    int countByExample(ScdaDeptPurDemandandpreExample example);

    int deleteByExample(ScdaDeptPurDemandandpreExample example);

    int deleteByPrimaryKey(String dpdId);

    int insert(ScdaDeptPurDemandandpre record);

    int insertSelective(ScdaDeptPurDemandandpre record);

    List<ScdaDeptPurDemandandpre> selectByExample(ScdaDeptPurDemandandpreExample example);

    ScdaDeptPurDemandandpre selectByPrimaryKey(String dpdId);

    int updateByExampleSelective(@Param("record") ScdaDeptPurDemandandpre record, @Param("example") ScdaDeptPurDemandandpreExample example);

    int updateByExample(@Param("record") ScdaDeptPurDemandandpre record, @Param("example") ScdaDeptPurDemandandpreExample example);

    int updateByPrimaryKeySelective(ScdaDeptPurDemandandpre record);

    int updateByPrimaryKey(ScdaDeptPurDemandandpre record);
}