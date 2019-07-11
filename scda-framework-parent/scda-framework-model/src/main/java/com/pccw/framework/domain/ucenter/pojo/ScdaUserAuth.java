package com.pccw.framework.domain.ucenter.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: xcl
 * @Date: 2019-3-4 20:10
 * @Version 1.0
 */
@Data
@ToString
public class ScdaUserAuth implements Serializable {


    private String id;

    private String username;

    private String password;

    private String salt;

    private String name;
    private String utype;

    private String birthday;

    private String userpic;

    private String sex;

    private String email;

    private String phone;

    private String status;

    private Date    createTime;

    private Date    updateTime;


}
