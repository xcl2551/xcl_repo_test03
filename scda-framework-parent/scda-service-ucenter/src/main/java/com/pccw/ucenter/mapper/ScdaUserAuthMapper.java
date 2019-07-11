package com.pccw.ucenter.mapper;

import com.pccw.framework.domain.ucenter.pojo.ScdaUserAuth;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator.
 */
@Mapper
public interface ScdaUserAuthMapper  {
    //根据账号查询用户信息
    ScdaUserAuth findByUsername(String username);


/*    //添加一个
    void saveUserAuth(ScdaUserAuth ScdaUserAuth)  ;


    //发现全部
    List<ScdaUserAuth> findAll();*/
}
