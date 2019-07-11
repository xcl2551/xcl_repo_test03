package com.pccw.framework.domain.ucenter.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @Author: xcl
 * @Date: 2019-3-4 20:25
 * @Version 1.0
 */
@Data
@ToString
public class ScdaMenu {


    private String  id;
    private String  code;
    private String  pCode;
    private String  pId;
    private String  menuName;
    private String  scdaurl;
    private String  isMenu;
    private Integer scdalevel;
    private Integer scdasort;
    private String  status;
    private String  icon;
    private Date    createTime;
    private Date    updateTime;

}
