package com.pccw.ucenter.service;

import com.pccw.framework.domain.ucenter.ext.ScdaUserAuthExt;
import com.pccw.framework.domain.ucenter.pojo.ScdaCompanyUserAuth;
import com.pccw.framework.domain.ucenter.pojo.ScdaUserAuth;
import com.pccw.ucenter.mapper.ScdaCompanyUserAuthMapper;
import com.pccw.ucenter.mapper.ScdaUserAuthMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @version 1.0
 **/
@Service
public class UserAuthService {

    @Autowired
    ScdaUserAuthMapper userAuthMapper;

    @Autowired
    ScdaCompanyUserAuthMapper companyUserAuthMapper;



    //根据账号查询xcUser信息
    public ScdaUserAuth findScdaUserAuthByUsername(String username) {
        return userAuthMapper.findByUsername(username);
    }

    //根据账号查询用户信息
    public ScdaUserAuthExt getUserAuthExt(String username) {
        //根据账号查询xcUser信息
        ScdaUserAuth scdaUserAuth = this.findScdaUserAuthByUsername(username);
        if (scdaUserAuth == null) {
            return null;
        }
        //用户id
        String userAuthId = scdaUserAuth.getId();

        //根据用户id查询用户所属公司id
        ScdaCompanyUserAuth scdaCompanyUserAuth = companyUserAuthMapper.findByUserId(userAuthId);
        //取到用户的公司id
        String companyId = null;
        if (scdaCompanyUserAuth != null) {
            companyId = scdaCompanyUserAuth.getCompanyId();
        }
        ScdaUserAuthExt scdaUserAuthExt = new ScdaUserAuthExt();
        BeanUtils.copyProperties(scdaUserAuth, scdaUserAuthExt);
        scdaUserAuthExt.setCompanyId(companyId);
        return scdaUserAuthExt;
    }

}
