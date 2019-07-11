package com.pccw.purchaseexecute.mapper;

import com.pccw.framework.domain.purchaseexecute.ScdaGroupSizeBase;
import com.pccw.framework.domain.purchaseexecute.ScdaGroupSizeBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScdaGroupSizeBaseMapper {
    int countByExample(ScdaGroupSizeBaseExample example);

    int deleteByExample(ScdaGroupSizeBaseExample example);

    int deleteByPrimaryKey(String sgsbId);

    int insert(ScdaGroupSizeBase record);

    int insertSelective(ScdaGroupSizeBase record);

    List<ScdaGroupSizeBase> selectByExample(ScdaGroupSizeBaseExample example);

    ScdaGroupSizeBase selectByPrimaryKey(String sgsbId);

    int updateByExampleSelective(@Param("record") ScdaGroupSizeBase record, @Param("example") ScdaGroupSizeBaseExample example);

    int updateByExample(@Param("record") ScdaGroupSizeBase record, @Param("example") ScdaGroupSizeBaseExample example);

    int updateByPrimaryKeySelective(ScdaGroupSizeBase record);

    int updateByPrimaryKey(ScdaGroupSizeBase record);
}