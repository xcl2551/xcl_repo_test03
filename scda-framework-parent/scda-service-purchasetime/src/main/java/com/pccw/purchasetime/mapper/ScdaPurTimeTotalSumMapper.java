package com.pccw.purchasetime.mapper;

import com.pccw.framework.domain.purchasetime.ScdaPurTimeTotalSum;
import com.pccw.framework.domain.purchasetime.ScdaPurTimeTotalSumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScdaPurTimeTotalSumMapper {
    int countByExample(ScdaPurTimeTotalSumExample example);

    int deleteByExample(ScdaPurTimeTotalSumExample example);

    int deleteByPrimaryKey(String keyId);

    int insert(ScdaPurTimeTotalSum record);

    int insertSelective(ScdaPurTimeTotalSum record);

    List<ScdaPurTimeTotalSum> selectByExample(ScdaPurTimeTotalSumExample example);

    ScdaPurTimeTotalSum selectByPrimaryKey(String keyId);

    int updateByExampleSelective(@Param("record") ScdaPurTimeTotalSum record, @Param("example") ScdaPurTimeTotalSumExample example);

    int updateByExample(@Param("record") ScdaPurTimeTotalSum record, @Param("example") ScdaPurTimeTotalSumExample example);

    int updateByPrimaryKeySelective(ScdaPurTimeTotalSum record);

    int updateByPrimaryKey(ScdaPurTimeTotalSum record);
}