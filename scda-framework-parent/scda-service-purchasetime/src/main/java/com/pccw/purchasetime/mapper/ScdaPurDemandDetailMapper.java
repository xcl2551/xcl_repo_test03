package com.pccw.purchasetime.mapper;

import com.pccw.framework.domain.purchasetime.ScdaPurDemandDetail;
import com.pccw.framework.domain.purchasetime.ScdaPurDemandDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScdaPurDemandDetailMapper {
    int countByExample(ScdaPurDemandDetailExample example);

    int deleteByExample(ScdaPurDemandDetailExample example);

    int deleteByPrimaryKey(String keyId);

    int insert(ScdaPurDemandDetail record);

    int insertSelective(ScdaPurDemandDetail record);

    List<ScdaPurDemandDetail> selectByExample(ScdaPurDemandDetailExample example);

    ScdaPurDemandDetail selectByPrimaryKey(String keyId);

    int updateByExampleSelective(@Param("record") ScdaPurDemandDetail record, @Param("example") ScdaPurDemandDetailExample example);

    int updateByExample(@Param("record") ScdaPurDemandDetail record, @Param("example") ScdaPurDemandDetailExample example);

    int updateByPrimaryKeySelective(ScdaPurDemandDetail record);

    int updateByPrimaryKey(ScdaPurDemandDetail record);
}