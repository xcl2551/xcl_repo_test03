package com.pccw.purchasetime.mapper;

import com.pccw.framework.domain.purchasetime.ScdaPurTimeSummary;
import com.pccw.framework.domain.purchasetime.ScdaPurTimeSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScdaPurTimeSummaryMapper {
    int countByExample(ScdaPurTimeSummaryExample example);

    int deleteByExample(ScdaPurTimeSummaryExample example);

    int deleteByPrimaryKey(String keyId);

    int insert(ScdaPurTimeSummary record);

    int insertSelective(ScdaPurTimeSummary record);

    List<ScdaPurTimeSummary> selectByExample(ScdaPurTimeSummaryExample example);

    ScdaPurTimeSummary selectByPrimaryKey(String keyId);

    int updateByExampleSelective(@Param("record") ScdaPurTimeSummary record, @Param("example") ScdaPurTimeSummaryExample example);

    int updateByExample(@Param("record") ScdaPurTimeSummary record, @Param("example") ScdaPurTimeSummaryExample example);

    int updateByPrimaryKeySelective(ScdaPurTimeSummary record);

    int updateByPrimaryKey(ScdaPurTimeSummary record);
}