package com.pccw.purchaseexecute.mapper;

import com.pccw.framework.domain.purchaseexecute.ScdaActuallyOccurredBase;
import com.pccw.framework.domain.purchaseexecute.ScdaActuallyOccurredBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScdaActuallyOccurredBaseMapper {
    int countByExample(ScdaActuallyOccurredBaseExample example);

    int deleteByExample(ScdaActuallyOccurredBaseExample example);

    int deleteByPrimaryKey(String saobId);

    int insert(ScdaActuallyOccurredBase record);

    int insertSelective(ScdaActuallyOccurredBase record);

    List<ScdaActuallyOccurredBase> selectByExample(ScdaActuallyOccurredBaseExample example);

    ScdaActuallyOccurredBase selectByPrimaryKey(String saobId);

    int updateByExampleSelective(@Param("record") ScdaActuallyOccurredBase record, @Param("example") ScdaActuallyOccurredBaseExample example);

    int updateByExample(@Param("record") ScdaActuallyOccurredBase record, @Param("example") ScdaActuallyOccurredBaseExample example);

    int updateByPrimaryKeySelective(ScdaActuallyOccurredBase record);

    int updateByPrimaryKey(ScdaActuallyOccurredBase record);
}