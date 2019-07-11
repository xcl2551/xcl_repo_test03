package com.pccw.framework.domain.purchasecontrol;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ScdaPdrAndPpr implements Serializable {
    private String pdrPprNumber;

    private BigDecimal purchaseResultId;

    private String purchaseSchemeNumber;

    private String departmentName;

    private String purchaseTypeCode;

    private Date purchaseResultConfirmDate;

    private String statusLookupCode;

    private Date dateCompleted;

    private Date pdrPprCreationDate;

    private BigDecimal contractAmount;

    private BigDecimal taxRate;

    private String taxCode;

    private BigDecimal purchaseBudget;

    private BigDecimal purchaseBudgetTax;

    private BigDecimal estimatedInvestment;

    private String purchaseContent;

    private String esNumber;

    private String esProjectCode;

    private String expenditureType;

    private String purchaseMethodCode;

    private String uniqueSourceSceneCode;

    private String applicationReasonCode;

    private String applicationReason;

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

    public String getPdrPprNumber() {
        return pdrPprNumber;
    }

    public void setPdrPprNumber(String pdrPprNumber) {
        this.pdrPprNumber = pdrPprNumber == null ? null : pdrPprNumber.trim();
    }

    public BigDecimal getPurchaseResultId() {
        return purchaseResultId;
    }

    public void setPurchaseResultId(BigDecimal purchaseResultId) {
        this.purchaseResultId = purchaseResultId;
    }

    public String getPurchaseSchemeNumber() {
        return purchaseSchemeNumber;
    }

    public void setPurchaseSchemeNumber(String purchaseSchemeNumber) {
        this.purchaseSchemeNumber = purchaseSchemeNumber == null ? null : purchaseSchemeNumber.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getPurchaseTypeCode() {
        return purchaseTypeCode;
    }

    public void setPurchaseTypeCode(String purchaseTypeCode) {
        this.purchaseTypeCode = purchaseTypeCode == null ? null : purchaseTypeCode.trim();
    }

    public Date getPurchaseResultConfirmDate() {
        return purchaseResultConfirmDate;
    }

    public void setPurchaseResultConfirmDate(Date purchaseResultConfirmDate) {
        this.purchaseResultConfirmDate = purchaseResultConfirmDate;
    }

    public String getStatusLookupCode() {
        return statusLookupCode;
    }

    public void setStatusLookupCode(String statusLookupCode) {
        this.statusLookupCode = statusLookupCode == null ? null : statusLookupCode.trim();
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public Date getPdrPprCreationDate() {
        return pdrPprCreationDate;
    }

    public void setPdrPprCreationDate(Date pdrPprCreationDate) {
        this.pdrPprCreationDate = pdrPprCreationDate;
    }

    public BigDecimal getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(BigDecimal contractAmount) {
        this.contractAmount = contractAmount;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode == null ? null : taxCode.trim();
    }

    public BigDecimal getPurchaseBudget() {
        return purchaseBudget;
    }

    public void setPurchaseBudget(BigDecimal purchaseBudget) {
        this.purchaseBudget = purchaseBudget;
    }

    public BigDecimal getPurchaseBudgetTax() {
        return purchaseBudgetTax;
    }

    public void setPurchaseBudgetTax(BigDecimal purchaseBudgetTax) {
        this.purchaseBudgetTax = purchaseBudgetTax;
    }

    public BigDecimal getEstimatedInvestment() {
        return estimatedInvestment;
    }

    public void setEstimatedInvestment(BigDecimal estimatedInvestment) {
        this.estimatedInvestment = estimatedInvestment;
    }

    public String getPurchaseContent() {
        return purchaseContent;
    }

    public void setPurchaseContent(String purchaseContent) {
        this.purchaseContent = purchaseContent == null ? null : purchaseContent.trim();
    }

    public String getEsNumber() {
        return esNumber;
    }

    public void setEsNumber(String esNumber) {
        this.esNumber = esNumber == null ? null : esNumber.trim();
    }

    public String getEsProjectCode() {
        return esProjectCode;
    }

    public void setEsProjectCode(String esProjectCode) {
        this.esProjectCode = esProjectCode == null ? null : esProjectCode.trim();
    }

    public String getExpenditureType() {
        return expenditureType;
    }

    public void setExpenditureType(String expenditureType) {
        this.expenditureType = expenditureType == null ? null : expenditureType.trim();
    }

    public String getPurchaseMethodCode() {
        return purchaseMethodCode;
    }

    public void setPurchaseMethodCode(String purchaseMethodCode) {
        this.purchaseMethodCode = purchaseMethodCode == null ? null : purchaseMethodCode.trim();
    }

    public String getUniqueSourceSceneCode() {
        return uniqueSourceSceneCode;
    }

    public void setUniqueSourceSceneCode(String uniqueSourceSceneCode) {
        this.uniqueSourceSceneCode = uniqueSourceSceneCode == null ? null : uniqueSourceSceneCode.trim();
    }

    public String getApplicationReasonCode() {
        return applicationReasonCode;
    }

    public void setApplicationReasonCode(String applicationReasonCode) {
        this.applicationReasonCode = applicationReasonCode == null ? null : applicationReasonCode.trim();
    }

    public String getApplicationReason() {
        return applicationReason;
    }

    public void setApplicationReason(String applicationReason) {
        this.applicationReason = applicationReason == null ? null : applicationReason.trim();
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

    @Override
    public String toString() {
        return "ScdaPdrAndPpr{" +
                "pdrPprNumber='" + pdrPprNumber + '\'' +
                ", purchaseResultId=" + purchaseResultId +
                ", purchaseSchemeNumber='" + purchaseSchemeNumber + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", purchaseTypeCode='" + purchaseTypeCode + '\'' +
                ", purchaseResultConfirmDate=" + purchaseResultConfirmDate +
                ", statusLookupCode='" + statusLookupCode + '\'' +
                ", dateCompleted=" + dateCompleted +
                ", pdrPprCreationDate=" + pdrPprCreationDate +
                ", contractAmount=" + contractAmount +
                ", taxRate=" + taxRate +
                ", taxCode='" + taxCode + '\'' +
                ", purchaseBudget=" + purchaseBudget +
                ", purchaseBudgetTax=" + purchaseBudgetTax +
                ", estimatedInvestment=" + estimatedInvestment +
                ", purchaseContent='" + purchaseContent + '\'' +
                ", esNumber='" + esNumber + '\'' +
                ", esProjectCode='" + esProjectCode + '\'' +
                ", expenditureType='" + expenditureType + '\'' +
                ", purchaseMethodCode='" + purchaseMethodCode + '\'' +
                ", uniqueSourceSceneCode='" + uniqueSourceSceneCode + '\'' +
                ", applicationReasonCode='" + applicationReasonCode + '\'' +
                ", applicationReason='" + applicationReason + '\'' +
                ", creationDate=" + creationDate +
                ", createdBy='" + createdBy + '\'' +
                ", lastUpdateDate=" + lastUpdateDate +
                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
                ", enableFlag='" + enableFlag + '\'' +
                ", attribute1='" + attribute1 + '\'' +
                ", attribute2='" + attribute2 + '\'' +
                ", attribute3='" + attribute3 + '\'' +
                ", attribute4='" + attribute4 + '\'' +
                ", attribute5='" + attribute5 + '\'' +
                ", attribute6='" + attribute6 + '\'' +
                ", attribute7='" + attribute7 + '\'' +
                ", attribute8='" + attribute8 + '\'' +
                ", attribute9='" + attribute9 + '\'' +
                ", attribute10='" + attribute10 + '\'' +
                '}';
    }
}