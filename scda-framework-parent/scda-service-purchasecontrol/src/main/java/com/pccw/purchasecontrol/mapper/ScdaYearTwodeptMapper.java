package com.pccw.purchasecontrol.mapper;

import com.pccw.framework.domain.purchasecontrol.ScdaYearTwodept;
import com.pccw.framework.domain.purchasecontrol.ScdaYearTwodeptExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScdaYearTwodeptMapper {
    int countByExample(ScdaYearTwodeptExample example);

    int deleteByExample(ScdaYearTwodeptExample example);

    int deleteByPrimaryKey(String ytId);

    int insert(ScdaYearTwodept record);

    int insertSelective(ScdaYearTwodept record);

    List<ScdaYearTwodept> selectByExample(ScdaYearTwodeptExample example);

    ScdaYearTwodept selectByPrimaryKey(String ytId);

    int updateByExampleSelective(@Param("record") ScdaYearTwodept record, @Param("example") ScdaYearTwodeptExample example);

    int updateByExample(@Param("record") ScdaYearTwodept record, @Param("example") ScdaYearTwodeptExample example);

    int updateByPrimaryKeySelective(ScdaYearTwodept record);

    int updateByPrimaryKey(ScdaYearTwodept record);
}