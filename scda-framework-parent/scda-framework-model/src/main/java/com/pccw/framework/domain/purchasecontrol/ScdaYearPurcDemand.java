package com.pccw.framework.domain.purchasecontrol;

import java.io.Serializable;
import java.util.Date;

public class ScdaYearPurcDemand implements Serializable {
    private String ypdId;

    private String deadlineDate;

    private String yearTotalCompletedPdr;

    private String totalUncompletedPdr;

    private String yearTotalPdr;

    private String yearPdrPercentage;

    private String yearSinglePercentage;

    private String yearOpenPercentage;

    private Date creationDate;

    private String createdBy;

    private Date lastUpdateDate;

    private String lastUpdatedBy;

    private String enableFlag;

    private String attribute1;

    private String attribute2;

    private String attribute3;

    private String attribute4;

    private String attribute5;

    private String attribute6;

    private String attribute7;

    private String attribute8;

    private String attribute9;

    private String attribute10;

    public String getYpdId() {
        return ypdId;
    }

    public void setYpdId(String ypdId) {
        this.ypdId = ypdId == null ? null : ypdId.trim();
    }

    public String getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate == null ? null : deadlineDate.trim();
    }

    public String getYearTotalCompletedPdr() {
        return yearTotalCompletedPdr;
    }

    public void setYearTotalCompletedPdr(String yearTotalCompletedPdr) {
        this.yearTotalCompletedPdr = yearTotalCompletedPdr == null ? null : yearTotalCompletedPdr.trim();
    }

    public String getTotalUncompletedPdr() {
        return totalUncompletedPdr;
    }

    public void setTotalUncompletedPdr(String totalUncompletedPdr) {
        this.totalUncompletedPdr = totalUncompletedPdr == null ? null : totalUncompletedPdr.trim();
    }

    public String getYearTotalPdr() {
        return yearTotalPdr;
    }

    public void setYearTotalPdr(String yearTotalPdr) {
        this.yearTotalPdr = yearTotalPdr == null ? null : yearTotalPdr.trim();
    }

    public String getYearPdrPercentage() {
        return yearPdrPercentage;
    }

    public void setYearPdrPercentage(String yearPdrPercentage) {
        this.yearPdrPercentage = yearPdrPercentage == null ? null : yearPdrPercentage.trim();
    }

    public String getYearSinglePercentage() {
        return yearSinglePercentage;
    }

    public void setYearSinglePercentage(String yearSinglePercentage) {
        this.yearSinglePercentage = yearSinglePercentage == null ? null : yearSinglePercentage.trim();
    }

    public String getYearOpenPercentage() {
        return yearOpenPercentage;
    }

    public void setYearOpenPercentage(String yearOpenPercentage) {
        this.yearOpenPercentage = yearOpenPercentage == null ? null : yearOpenPercentage.trim();
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy == null ? null : lastUpdatedBy.trim();
    }

    public String getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag == null ? null : enableFlag.trim();
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1 == null ? null : attribute1.trim();
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2 == null ? null : attribute2.trim();
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3 == null ? null : attribute3.trim();
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4 == null ? null : attribute4.trim();
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5 == null ? null : attribute5.trim();
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6 == null ? null : attribute6.trim();
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7 == null ? null : attribute7.trim();
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8 == null ? null : attribute8.trim();
    }

    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9 == null ? null : attribute9.trim();
    }

    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10 == null ? null : attribute10.trim();
    }
}