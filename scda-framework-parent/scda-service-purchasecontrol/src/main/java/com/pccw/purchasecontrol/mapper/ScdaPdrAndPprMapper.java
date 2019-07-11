package com.pccw.purchasecontrol.mapper;

import com.pccw.framework.domain.purchasecontrol.ScdaPdrAndPpr;
import com.pccw.framework.domain.purchasecontrol.ScdaPdrAndPprExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScdaPdrAndPprMapper {
    int countByExample(ScdaPdrAndPprExample example);

    int deleteByExample(ScdaPdrAndPprExample example);

    int deleteByPrimaryKey(String pdrPprNumber);

    int insert(ScdaPdrAndPpr record);

    int insertSelective(ScdaPdrAndPpr record);

    List<ScdaPdrAndPpr> selectByExample(ScdaPdrAndPprExample example);

    ScdaPdrAndPpr selectByPrimaryKey(String pdrPprNumber);

    int updateByExampleSelective(@Param("record") ScdaPdrAndPpr record, @Param("example") ScdaPdrAndPprExample example);

    int updateByExample(@Param("record") ScdaPdrAndPpr record, @Param("example") ScdaPdrAndPprExample example);

    int updateByPrimaryKeySelective(ScdaPdrAndPpr record);

    int updateByPrimaryKey(ScdaPdrAndPpr record);
}