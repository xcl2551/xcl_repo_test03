package com.pccw.ucenter.mapper;

import com.pccw.framework.domain.ucenter.pojo.ScdaCompanyUserAuth;
import org.apache.ibatis.annotations.Mapper;


/**
 * Created by Administrator.
 */
@Mapper
public interface ScdaCompanyUserAuthMapper{
    //根据用户id查询该用户所属的公司id
    ScdaCompanyUserAuth findByUserId(String userId);
}
