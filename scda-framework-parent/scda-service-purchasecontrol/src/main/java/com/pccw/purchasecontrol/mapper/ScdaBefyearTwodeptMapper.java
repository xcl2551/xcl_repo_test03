package com.pccw.purchasecontrol.mapper;

import com.pccw.framework.domain.purchasecontrol.ScdaBefyearTwodept;
import com.pccw.framework.domain.purchasecontrol.ScdaBefyearTwodeptExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScdaBefyearTwodeptMapper {
    int countByExample(ScdaBefyearTwodeptExample example);

    int deleteByExample(ScdaBefyearTwodeptExample example);

    int deleteByPrimaryKey(String btId);

    int insert(ScdaBefyearTwodept record);

    int insertSelective(ScdaBefyearTwodept record);

    List<ScdaBefyearTwodept> selectByExample(ScdaBefyearTwodeptExample example);

    ScdaBefyearTwodept selectByPrimaryKey(String btId);

    int updateByExampleSelective(@Param("record") ScdaBefyearTwodept record, @Param("example") ScdaBefyearTwodeptExample example);

    int updateByExample(@Param("record") ScdaBefyearTwodept record, @Param("example") ScdaBefyearTwodeptExample example);

    int updateByPrimaryKeySelective(ScdaBefyearTwodept record);

    int updateByPrimaryKey(ScdaBefyearTwodept record);
}