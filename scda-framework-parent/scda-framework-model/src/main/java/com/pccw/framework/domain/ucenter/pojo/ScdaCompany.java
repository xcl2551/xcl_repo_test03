package com.pccw.framework.domain.ucenter.pojo;

import lombok.Data;
import lombok.ToString;
import java.io.Serializable;

/**
 * @Author: xcl
 * @Date: 2019-3-5 21:20
 * @Version 1.0
 */

@Data
@ToString
public class ScdaCompany implements Serializable {

    private String id;
    private String name;
    private String logo;
    private String intro;
    private String email;
    private String mobile;
    private String linkname;
    private String identitypic;
    private String worktype;
    private String businesspic;
    private String status;

}
