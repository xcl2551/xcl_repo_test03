package com.pccw.purchasetime.mapper;

import com.pccw.framework.domain.purchasetime.ScdaSchResAppTimeSum;
import com.pccw.framework.domain.purchasetime.ScdaSchResAppTimeSumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScdaSchResAppTimeSumMapper {
    int countByExample(ScdaSchResAppTimeSumExample example);

    int deleteByExample(ScdaSchResAppTimeSumExample example);

    int deleteByPrimaryKey(String keyId);

    int insert(ScdaSchResAppTimeSum record);

    int insertSelective(ScdaSchResAppTimeSum record);

    List<ScdaSchResAppTimeSum> selectByExample(ScdaSchResAppTimeSumExample example);

    ScdaSchResAppTimeSum selectByPrimaryKey(String keyId);

    int updateByExampleSelective(@Param("record") ScdaSchResAppTimeSum record, @Param("example") ScdaSchResAppTimeSumExample example);

    int updateByExample(@Param("record") ScdaSchResAppTimeSum record, @Param("example") ScdaSchResAppTimeSumExample example);

    int updateByPrimaryKeySelective(ScdaSchResAppTimeSum record);

    int updateByPrimaryKey(ScdaSchResAppTimeSum record);
}