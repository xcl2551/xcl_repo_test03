package com.pccw.framework.domain.ucenter.pojo;

/**
 * @Author: xcl
 * @Date: 2019-3-5 21:23
 * @Version 1.0
 */

import lombok.Data;
import lombok.ToString;
import java.io.Serializable;
@Data
@ToString
public class ScdaCompanyUserAuth  implements Serializable {

    private String id;

    private String companyId;

    private String userId;

}
