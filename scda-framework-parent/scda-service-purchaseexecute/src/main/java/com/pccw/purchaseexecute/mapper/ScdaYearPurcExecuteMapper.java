package com.pccw.purchaseexecute.mapper;

import com.pccw.framework.domain.purchaseexecute.ScdaYearPurcExecute;
import com.pccw.framework.domain.purchaseexecute.ScdaYearPurcExecuteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScdaYearPurcExecuteMapper {
    int countByExample(ScdaYearPurcExecuteExample example);

    int deleteByExample(ScdaYearPurcExecuteExample example);

    int deleteByPrimaryKey(String ypeId);

    int insert(ScdaYearPurcExecute record);

    int insertSelective(ScdaYearPurcExecute record);

    List<ScdaYearPurcExecute> selectByExample(ScdaYearPurcExecuteExample example);

    ScdaYearPurcExecute selectByPrimaryKey(String ypeId);

    int updateByExampleSelective(@Param("record") ScdaYearPurcExecute record, @Param("example") ScdaYearPurcExecuteExample example);

    int updateByExample(@Param("record") ScdaYearPurcExecute record, @Param("example") ScdaYearPurcExecuteExample example);

    int updateByPrimaryKeySelective(ScdaYearPurcExecute record);

    int updateByPrimaryKey(ScdaYearPurcExecute record);
}