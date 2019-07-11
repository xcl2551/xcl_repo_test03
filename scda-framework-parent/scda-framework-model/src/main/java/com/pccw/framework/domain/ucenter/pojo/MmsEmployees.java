package com.pccw.framework.domain.ucenter.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @Author: xcl
 * @Date: 2019-5-9 10:45
 * @Version 1.0
 */
@ToString
@Data
public class MmsEmployees {
    private Integer  employeeid       ;//NUMBER(30) not null,
    private String  employeenumber   ;//VARCHAR2(75),
    private String  employeename     ;//VARCHAR2(75),
    private String  emailaddress     ;//VARCHAR2(75),
    private String  tel              ;//VARCHAR2(75),
    private String  nickname         ;//VARCHAR2(75),
    private String  userid           ;//NUMBER,
    private String  attribute1       ;//NUMBER,
    private String  attribute2       ;//VARCHAR2(240),
    private String  attribute3       ;//VARCHAR2(240),
    private String  attribute4       ;//VARCHAR2(240),
    private String  attribute5       ;//VARCHAR2(240),
    private String  attribute6       ;//VARCHAR2(240),
    private String  attribute7       ;//VARCHAR2(240),
    private String  attribute8       ;//VARCHAR2(240),
    private String  attribute9       ;//VARCHAR2(240),
    private String  attribute10      ;//VARCHAR2(240),
    private String  attribute11      ;//NUMBER,
    private String  attribute12      ;//NUMBER,
    private String  attribute13      ;//NUMBER,
    private String  attribute14      ;//NUMBER,
    private String  attribute15      ;//NUMBER,
    private String  createdBy        ;//VARCHAR2(75),
    private Date    creationDate     ;//DATE,
    private String  lastUpdatedBy    ;//VARCHAR2(75),
    private Date    lastUpdateDate   ;//DATE,
    private String  screenname       ;//VARCHAR2(75)

}
