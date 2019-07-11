package com.pccw.framework.domain.ucenter.ext;


import com.pccw.framework.domain.ucenter.pojo.ScdaMenu;
import com.pccw.framework.domain.ucenter.pojo.ScdaUserAuth;

import java.util.List;

/**
 * @Author: xcl
 * @Date: 2019-3-4 20:23
 * @Version 1.0
 */
public class ScdaUserAuthExt extends ScdaUserAuth {

    //权限信息
    private List<ScdaMenu> permissions;

    //企业信息
    private String companyId;

    @Override
    public String toString() {
        return "ScdaUserAuthExt{" +
                "permissions=" + permissions +
                ", companyId='" + companyId + '\'' +
                '}';
    }

    public List<ScdaMenu> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<ScdaMenu> permissions) {
        this.permissions = permissions;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
