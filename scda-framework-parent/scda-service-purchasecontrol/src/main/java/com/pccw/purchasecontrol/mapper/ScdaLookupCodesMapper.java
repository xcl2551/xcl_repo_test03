package com.pccw.purchasecontrol.mapper;

import com.pccw.framework.domain.purchasecontrol.ScdaLookupCodes;
import com.pccw.framework.domain.purchasecontrol.ScdaLookupCodesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScdaLookupCodesMapper {
    int countByExample(ScdaLookupCodesExample example);

    int deleteByExample(ScdaLookupCodesExample example);

    int deleteByPrimaryKey(String lookupCodeId);

    int insert(ScdaLookupCodes record);

    int insertSelective(ScdaLookupCodes record);

    List<ScdaLookupCodes> selectByExample(ScdaLookupCodesExample example);

    ScdaLookupCodes selectByPrimaryKey(String lookupCodeId);

    int updateByExampleSelective(@Param("record") ScdaLookupCodes record, @Param("example") ScdaLookupCodesExample example);

    int updateByExample(@Param("record") ScdaLookupCodes record, @Param("example") ScdaLookupCodesExample example);

    int updateByPrimaryKeySelective(ScdaLookupCodes record);

    int updateByPrimaryKey(ScdaLookupCodes record);
}