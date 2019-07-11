package com.pccw.purchasetime.mapper;

import com.pccw.framework.domain.purchasetime.ScdaPurTimeBase;
import com.pccw.framework.domain.purchasetime.ScdaPurTimeBaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScdaPurTimeBaseMapper {
    int countByExample(ScdaPurTimeBaseExample example);

    int deleteByExample(ScdaPurTimeBaseExample example);

    int deleteByPrimaryKey(String keyId);

    int insert(ScdaPurTimeBase record);

    int insertSelective(ScdaPurTimeBase record);

    List<ScdaPurTimeBase> selectByExample(ScdaPurTimeBaseExample example);

    ScdaPurTimeBase selectByPrimaryKey(String keyId);

    int updateByExampleSelective(@Param("record") ScdaPurTimeBase record, @Param("example") ScdaPurTimeBaseExample example);

    int updateByExample(@Param("record") ScdaPurTimeBase record, @Param("example") ScdaPurTimeBaseExample example);

    int updateByPrimaryKeySelective(ScdaPurTimeBase record);

    int updateByPrimaryKey(ScdaPurTimeBase record);
}