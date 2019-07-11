package com.pccw.framework.domain.purchasecontrol;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScdaPdrAndPprExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScdaPdrAndPprExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPdrPprNumberIsNull() {
            addCriterion("PDR_PPR_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPdrPprNumberIsNotNull() {
            addCriterion("PDR_PPR_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPdrPprNumberEqualTo(String value) {
            addCriterion("PDR_PPR_NUMBER =", value, "pdrPprNumber");
            return (Criteria) this;
        }

        public Criteria andPdrPprNumberNotEqualTo(String value) {
            addCriterion("PDR_PPR_NUMBER <>", value, "pdrPprNumber");
            return (Criteria) this;
        }

        public Criteria andPdrPprNumberGreaterThan(String value) {
            addCriterion("PDR_PPR_NUMBER >", value, "pdrPprNumber");
            return (Criteria) this;
        }

        public Criteria andPdrPprNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PDR_PPR_NUMBER >=", value, "pdrPprNumber");
            return (Criteria) this;
        }

        public Criteria andPdrPprNumberLessThan(String value) {
            addCriterion("PDR_PPR_NUMBER <", value, "pdrPprNumber");
            return (Criteria) this;
        }

        public Criteria andPdrPprNumberLessThanOrEqualTo(String value) {
            addCriterion("PDR_PPR_NUMBER <=", value, "pdrPprNumber");
            return (Criteria) this;
        }

        public Criteria andPdrPprNumberLike(String value) {
            addCriterion("PDR_PPR_NUMBER like", value, "pdrPprNumber");
            return (Criteria) this;
        }

        public Criteria andPdrPprNumberNotLike(String value) {
            addCriterion("PDR_PPR_NUMBER not like", value, "pdrPprNumber");
            return (Criteria) this;
        }

        public Criteria andPdrPprNumberIn(List<String> values) {
            addCriterion("PDR_PPR_NUMBER in", values, "pdrPprNumber");
            return (Criteria) this;
        }

        public Criteria andPdrPprNumberNotIn(List<String> values) {
            addCriterion("PDR_PPR_NUMBER not in", values, "pdrPprNumber");
            return (Criteria) this;
        }

        public Criteria andPdrPprNumberBetween(String value1, String value2) {
            addCriterion("PDR_PPR_NUMBER between", value1, value2, "pdrPprNumber");
            return (Criteria) this;
        }

        public Criteria andPdrPprNumberNotBetween(String value1, String value2) {
            addCriterion("PDR_PPR_NUMBER not between", value1, value2, "pdrPprNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultIdIsNull() {
            addCriterion("PURCHASE_RESULT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultIdIsNotNull() {
            addCriterion("PURCHASE_RESULT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultIdEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_RESULT_ID =", value, "purchaseResultId");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultIdNotEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_RESULT_ID <>", value, "purchaseResultId");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultIdGreaterThan(BigDecimal value) {
            addCriterion("PURCHASE_RESULT_ID >", value, "purchaseResultId");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_RESULT_ID >=", value, "purchaseResultId");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultIdLessThan(BigDecimal value) {
            addCriterion("PURCHASE_RESULT_ID <", value, "purchaseResultId");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_RESULT_ID <=", value, "purchaseResultId");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultIdIn(List<BigDecimal> values) {
            addCriterion("PURCHASE_RESULT_ID in", values, "purchaseResultId");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultIdNotIn(List<BigDecimal> values) {
            addCriterion("PURCHASE_RESULT_ID not in", values, "purchaseResultId");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASE_RESULT_ID between", value1, value2, "purchaseResultId");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASE_RESULT_ID not between", value1, value2, "purchaseResultId");
            return (Criteria) this;
        }

        public Criteria andPurchaseSchemeNumberIsNull() {
            addCriterion("PURCHASE_SCHEME_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseSchemeNumberIsNotNull() {
            addCriterion("PURCHASE_SCHEME_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseSchemeNumberEqualTo(String value) {
            addCriterion("PURCHASE_SCHEME_NUMBER =", value, "purchaseSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseSchemeNumberNotEqualTo(String value) {
            addCriterion("PURCHASE_SCHEME_NUMBER <>", value, "purchaseSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseSchemeNumberGreaterThan(String value) {
            addCriterion("PURCHASE_SCHEME_NUMBER >", value, "purchaseSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseSchemeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_SCHEME_NUMBER >=", value, "purchaseSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseSchemeNumberLessThan(String value) {
            addCriterion("PURCHASE_SCHEME_NUMBER <", value, "purchaseSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseSchemeNumberLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_SCHEME_NUMBER <=", value, "purchaseSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseSchemeNumberLike(String value) {
            addCriterion("PURCHASE_SCHEME_NUMBER like", value, "purchaseSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseSchemeNumberNotLike(String value) {
            addCriterion("PURCHASE_SCHEME_NUMBER not like", value, "purchaseSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseSchemeNumberIn(List<String> values) {
            addCriterion("PURCHASE_SCHEME_NUMBER in", values, "purchaseSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseSchemeNumberNotIn(List<String> values) {
            addCriterion("PURCHASE_SCHEME_NUMBER not in", values, "purchaseSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseSchemeNumberBetween(String value1, String value2) {
            addCriterion("PURCHASE_SCHEME_NUMBER between", value1, value2, "purchaseSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseSchemeNumberNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_SCHEME_NUMBER not between", value1, value2, "purchaseSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("DEPARTMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("DEPARTMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("DEPARTMENT_NAME >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("DEPARTMENT_NAME <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("DEPARTMENT_NAME like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("DEPARTMENT_NAME not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("DEPARTMENT_NAME in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("DEPARTMENT_NAME not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_NAME between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_NAME not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeCodeIsNull() {
            addCriterion("PURCHASE_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeCodeIsNotNull() {
            addCriterion("PURCHASE_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeCodeEqualTo(String value) {
            addCriterion("PURCHASE_TYPE_CODE =", value, "purchaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeCodeNotEqualTo(String value) {
            addCriterion("PURCHASE_TYPE_CODE <>", value, "purchaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeCodeGreaterThan(String value) {
            addCriterion("PURCHASE_TYPE_CODE >", value, "purchaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_TYPE_CODE >=", value, "purchaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeCodeLessThan(String value) {
            addCriterion("PURCHASE_TYPE_CODE <", value, "purchaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_TYPE_CODE <=", value, "purchaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeCodeLike(String value) {
            addCriterion("PURCHASE_TYPE_CODE like", value, "purchaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeCodeNotLike(String value) {
            addCriterion("PURCHASE_TYPE_CODE not like", value, "purchaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeCodeIn(List<String> values) {
            addCriterion("PURCHASE_TYPE_CODE in", values, "purchaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeCodeNotIn(List<String> values) {
            addCriterion("PURCHASE_TYPE_CODE not in", values, "purchaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeCodeBetween(String value1, String value2) {
            addCriterion("PURCHASE_TYPE_CODE between", value1, value2, "purchaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeCodeNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_TYPE_CODE not between", value1, value2, "purchaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultConfirmDateIsNull() {
            addCriterion("PURCHASE_RESULT_CONFIRM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultConfirmDateIsNotNull() {
            addCriterion("PURCHASE_RESULT_CONFIRM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultConfirmDateEqualTo(Date value) {
            addCriterionForJDBCDate("PURCHASE_RESULT_CONFIRM_DATE =", value, "purchaseResultConfirmDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultConfirmDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PURCHASE_RESULT_CONFIRM_DATE <>", value, "purchaseResultConfirmDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultConfirmDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PURCHASE_RESULT_CONFIRM_DATE >", value, "purchaseResultConfirmDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultConfirmDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PURCHASE_RESULT_CONFIRM_DATE >=", value, "purchaseResultConfirmDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultConfirmDateLessThan(Date value) {
            addCriterionForJDBCDate("PURCHASE_RESULT_CONFIRM_DATE <", value, "purchaseResultConfirmDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultConfirmDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PURCHASE_RESULT_CONFIRM_DATE <=", value, "purchaseResultConfirmDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultConfirmDateIn(List<Date> values) {
            addCriterionForJDBCDate("PURCHASE_RESULT_CONFIRM_DATE in", values, "purchaseResultConfirmDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultConfirmDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PURCHASE_RESULT_CONFIRM_DATE not in", values, "purchaseResultConfirmDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultConfirmDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PURCHASE_RESULT_CONFIRM_DATE between", value1, value2, "purchaseResultConfirmDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseResultConfirmDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PURCHASE_RESULT_CONFIRM_DATE not between", value1, value2, "purchaseResultConfirmDate");
            return (Criteria) this;
        }

        public Criteria andStatusLookupCodeIsNull() {
            addCriterion("STATUS_LOOKUP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andStatusLookupCodeIsNotNull() {
            addCriterion("STATUS_LOOKUP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andStatusLookupCodeEqualTo(String value) {
            addCriterion("STATUS_LOOKUP_CODE =", value, "statusLookupCode");
            return (Criteria) this;
        }

        public Criteria andStatusLookupCodeNotEqualTo(String value) {
            addCriterion("STATUS_LOOKUP_CODE <>", value, "statusLookupCode");
            return (Criteria) this;
        }

        public Criteria andStatusLookupCodeGreaterThan(String value) {
            addCriterion("STATUS_LOOKUP_CODE >", value, "statusLookupCode");
            return (Criteria) this;
        }

        public Criteria andStatusLookupCodeGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS_LOOKUP_CODE >=", value, "statusLookupCode");
            return (Criteria) this;
        }

        public Criteria andStatusLookupCodeLessThan(String value) {
            addCriterion("STATUS_LOOKUP_CODE <", value, "statusLookupCode");
            return (Criteria) this;
        }

        public Criteria andStatusLookupCodeLessThanOrEqualTo(String value) {
            addCriterion("STATUS_LOOKUP_CODE <=", value, "statusLookupCode");
            return (Criteria) this;
        }

        public Criteria andStatusLookupCodeLike(String value) {
            addCriterion("STATUS_LOOKUP_CODE like", value, "statusLookupCode");
            return (Criteria) this;
        }

        public Criteria andStatusLookupCodeNotLike(String value) {
            addCriterion("STATUS_LOOKUP_CODE not like", value, "statusLookupCode");
            return (Criteria) this;
        }

        public Criteria andStatusLookupCodeIn(List<String> values) {
            addCriterion("STATUS_LOOKUP_CODE in", values, "statusLookupCode");
            return (Criteria) this;
        }

        public Criteria andStatusLookupCodeNotIn(List<String> values) {
            addCriterion("STATUS_LOOKUP_CODE not in", values, "statusLookupCode");
            return (Criteria) this;
        }

        public Criteria andStatusLookupCodeBetween(String value1, String value2) {
            addCriterion("STATUS_LOOKUP_CODE between", value1, value2, "statusLookupCode");
            return (Criteria) this;
        }

        public Criteria andStatusLookupCodeNotBetween(String value1, String value2) {
            addCriterion("STATUS_LOOKUP_CODE not between", value1, value2, "statusLookupCode");
            return (Criteria) this;
        }

        public Criteria andDateCompletedIsNull() {
            addCriterion("DATE_COMPLETED is null");
            return (Criteria) this;
        }

        public Criteria andDateCompletedIsNotNull() {
            addCriterion("DATE_COMPLETED is not null");
            return (Criteria) this;
        }

        public Criteria andDateCompletedEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_COMPLETED =", value, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedNotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_COMPLETED <>", value, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedGreaterThan(Date value) {
            addCriterionForJDBCDate("DATE_COMPLETED >", value, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_COMPLETED >=", value, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedLessThan(Date value) {
            addCriterionForJDBCDate("DATE_COMPLETED <", value, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_COMPLETED <=", value, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_COMPLETED in", values, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedNotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_COMPLETED not in", values, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_COMPLETED between", value1, value2, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_COMPLETED not between", value1, value2, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andPdrPprCreationDateIsNull() {
            addCriterion("PDR_PPR_CREATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPdrPprCreationDateIsNotNull() {
            addCriterion("PDR_PPR_CREATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPdrPprCreationDateEqualTo(Date value) {
            addCriterionForJDBCDate("PDR_PPR_CREATION_DATE =", value, "pdrPprCreationDate");
            return (Criteria) this;
        }

        public Criteria andPdrPprCreationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PDR_PPR_CREATION_DATE <>", value, "pdrPprCreationDate");
            return (Criteria) this;
        }

        public Criteria andPdrPprCreationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PDR_PPR_CREATION_DATE >", value, "pdrPprCreationDate");
            return (Criteria) this;
        }

        public Criteria andPdrPprCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PDR_PPR_CREATION_DATE >=", value, "pdrPprCreationDate");
            return (Criteria) this;
        }

        public Criteria andPdrPprCreationDateLessThan(Date value) {
            addCriterionForJDBCDate("PDR_PPR_CREATION_DATE <", value, "pdrPprCreationDate");
            return (Criteria) this;
        }

        public Criteria andPdrPprCreationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PDR_PPR_CREATION_DATE <=", value, "pdrPprCreationDate");
            return (Criteria) this;
        }

        public Criteria andPdrPprCreationDateIn(List<Date> values) {
            addCriterionForJDBCDate("PDR_PPR_CREATION_DATE in", values, "pdrPprCreationDate");
            return (Criteria) this;
        }

        public Criteria andPdrPprCreationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PDR_PPR_CREATION_DATE not in", values, "pdrPprCreationDate");
            return (Criteria) this;
        }

        public Criteria andPdrPprCreationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PDR_PPR_CREATION_DATE between", value1, value2, "pdrPprCreationDate");
            return (Criteria) this;
        }

        public Criteria andPdrPprCreationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PDR_PPR_CREATION_DATE not between", value1, value2, "pdrPprCreationDate");
            return (Criteria) this;
        }

        public Criteria andContractAmountIsNull() {
            addCriterion("CONTRACT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andContractAmountIsNotNull() {
            addCriterion("CONTRACT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andContractAmountEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_AMOUNT =", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountNotEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_AMOUNT <>", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountGreaterThan(BigDecimal value) {
            addCriterion("CONTRACT_AMOUNT >", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_AMOUNT >=", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountLessThan(BigDecimal value) {
            addCriterion("CONTRACT_AMOUNT <", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_AMOUNT <=", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountIn(List<BigDecimal> values) {
            addCriterion("CONTRACT_AMOUNT in", values, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountNotIn(List<BigDecimal> values) {
            addCriterion("CONTRACT_AMOUNT not in", values, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACT_AMOUNT between", value1, value2, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACT_AMOUNT not between", value1, value2, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("TAX_RATE is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("TAX_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(BigDecimal value) {
            addCriterion("TAX_RATE >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(BigDecimal value) {
            addCriterion("TAX_RATE <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<BigDecimal> values) {
            addCriterion("TAX_RATE in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<BigDecimal> values) {
            addCriterion("TAX_RATE not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_RATE between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_RATE not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxCodeIsNull() {
            addCriterion("TAX_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTaxCodeIsNotNull() {
            addCriterion("TAX_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxCodeEqualTo(String value) {
            addCriterion("TAX_CODE =", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeNotEqualTo(String value) {
            addCriterion("TAX_CODE <>", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeGreaterThan(String value) {
            addCriterion("TAX_CODE >", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_CODE >=", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeLessThan(String value) {
            addCriterion("TAX_CODE <", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeLessThanOrEqualTo(String value) {
            addCriterion("TAX_CODE <=", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeLike(String value) {
            addCriterion("TAX_CODE like", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeNotLike(String value) {
            addCriterion("TAX_CODE not like", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeIn(List<String> values) {
            addCriterion("TAX_CODE in", values, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeNotIn(List<String> values) {
            addCriterion("TAX_CODE not in", values, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeBetween(String value1, String value2) {
            addCriterion("TAX_CODE between", value1, value2, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeNotBetween(String value1, String value2) {
            addCriterion("TAX_CODE not between", value1, value2, "taxCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetIsNull() {
            addCriterion("PURCHASE_BUDGET is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetIsNotNull() {
            addCriterion("PURCHASE_BUDGET is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_BUDGET =", value, "purchaseBudget");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetNotEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_BUDGET <>", value, "purchaseBudget");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetGreaterThan(BigDecimal value) {
            addCriterion("PURCHASE_BUDGET >", value, "purchaseBudget");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_BUDGET >=", value, "purchaseBudget");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetLessThan(BigDecimal value) {
            addCriterion("PURCHASE_BUDGET <", value, "purchaseBudget");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_BUDGET <=", value, "purchaseBudget");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetIn(List<BigDecimal> values) {
            addCriterion("PURCHASE_BUDGET in", values, "purchaseBudget");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetNotIn(List<BigDecimal> values) {
            addCriterion("PURCHASE_BUDGET not in", values, "purchaseBudget");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASE_BUDGET between", value1, value2, "purchaseBudget");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASE_BUDGET not between", value1, value2, "purchaseBudget");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetTaxIsNull() {
            addCriterion("PURCHASE_BUDGET_TAX is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetTaxIsNotNull() {
            addCriterion("PURCHASE_BUDGET_TAX is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetTaxEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_BUDGET_TAX =", value, "purchaseBudgetTax");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetTaxNotEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_BUDGET_TAX <>", value, "purchaseBudgetTax");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetTaxGreaterThan(BigDecimal value) {
            addCriterion("PURCHASE_BUDGET_TAX >", value, "purchaseBudgetTax");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_BUDGET_TAX >=", value, "purchaseBudgetTax");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetTaxLessThan(BigDecimal value) {
            addCriterion("PURCHASE_BUDGET_TAX <", value, "purchaseBudgetTax");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_BUDGET_TAX <=", value, "purchaseBudgetTax");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetTaxIn(List<BigDecimal> values) {
            addCriterion("PURCHASE_BUDGET_TAX in", values, "purchaseBudgetTax");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetTaxNotIn(List<BigDecimal> values) {
            addCriterion("PURCHASE_BUDGET_TAX not in", values, "purchaseBudgetTax");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASE_BUDGET_TAX between", value1, value2, "purchaseBudgetTax");
            return (Criteria) this;
        }

        public Criteria andPurchaseBudgetTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASE_BUDGET_TAX not between", value1, value2, "purchaseBudgetTax");
            return (Criteria) this;
        }

        public Criteria andEstimatedInvestmentIsNull() {
            addCriterion("ESTIMATED_INVESTMENT is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedInvestmentIsNotNull() {
            addCriterion("ESTIMATED_INVESTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedInvestmentEqualTo(BigDecimal value) {
            addCriterion("ESTIMATED_INVESTMENT =", value, "estimatedInvestment");
            return (Criteria) this;
        }

        public Criteria andEstimatedInvestmentNotEqualTo(BigDecimal value) {
            addCriterion("ESTIMATED_INVESTMENT <>", value, "estimatedInvestment");
            return (Criteria) this;
        }

        public Criteria andEstimatedInvestmentGreaterThan(BigDecimal value) {
            addCriterion("ESTIMATED_INVESTMENT >", value, "estimatedInvestment");
            return (Criteria) this;
        }

        public Criteria andEstimatedInvestmentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ESTIMATED_INVESTMENT >=", value, "estimatedInvestment");
            return (Criteria) this;
        }

        public Criteria andEstimatedInvestmentLessThan(BigDecimal value) {
            addCriterion("ESTIMATED_INVESTMENT <", value, "estimatedInvestment");
            return (Criteria) this;
        }

        public Criteria andEstimatedInvestmentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ESTIMATED_INVESTMENT <=", value, "estimatedInvestment");
            return (Criteria) this;
        }

        public Criteria andEstimatedInvestmentIn(List<BigDecimal> values) {
            addCriterion("ESTIMATED_INVESTMENT in", values, "estimatedInvestment");
            return (Criteria) this;
        }

        public Criteria andEstimatedInvestmentNotIn(List<BigDecimal> values) {
            addCriterion("ESTIMATED_INVESTMENT not in", values, "estimatedInvestment");
            return (Criteria) this;
        }

        public Criteria andEstimatedInvestmentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ESTIMATED_INVESTMENT between", value1, value2, "estimatedInvestment");
            return (Criteria) this;
        }

        public Criteria andEstimatedInvestmentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ESTIMATED_INVESTMENT not between", value1, value2, "estimatedInvestment");
            return (Criteria) this;
        }

        public Criteria andPurchaseContentIsNull() {
            addCriterion("PURCHASE_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseContentIsNotNull() {
            addCriterion("PURCHASE_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseContentEqualTo(String value) {
            addCriterion("PURCHASE_CONTENT =", value, "purchaseContent");
            return (Criteria) this;
        }

        public Criteria andPurchaseContentNotEqualTo(String value) {
            addCriterion("PURCHASE_CONTENT <>", value, "purchaseContent");
            return (Criteria) this;
        }

        public Criteria andPurchaseContentGreaterThan(String value) {
            addCriterion("PURCHASE_CONTENT >", value, "purchaseContent");
            return (Criteria) this;
        }

        public Criteria andPurchaseContentGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_CONTENT >=", value, "purchaseContent");
            return (Criteria) this;
        }

        public Criteria andPurchaseContentLessThan(String value) {
            addCriterion("PURCHASE_CONTENT <", value, "purchaseContent");
            return (Criteria) this;
        }

        public Criteria andPurchaseContentLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_CONTENT <=", value, "purchaseContent");
            return (Criteria) this;
        }

        public Criteria andPurchaseContentLike(String value) {
            addCriterion("PURCHASE_CONTENT like", value, "purchaseContent");
            return (Criteria) this;
        }

        public Criteria andPurchaseContentNotLike(String value) {
            addCriterion("PURCHASE_CONTENT not like", value, "purchaseContent");
            return (Criteria) this;
        }

        public Criteria andPurchaseContentIn(List<String> values) {
            addCriterion("PURCHASE_CONTENT in", values, "purchaseContent");
            return (Criteria) this;
        }

        public Criteria andPurchaseContentNotIn(List<String> values) {
            addCriterion("PURCHASE_CONTENT not in", values, "purchaseContent");
            return (Criteria) this;
        }

        public Criteria andPurchaseContentBetween(String value1, String value2) {
            addCriterion("PURCHASE_CONTENT between", value1, value2, "purchaseContent");
            return (Criteria) this;
        }

        public Criteria andPurchaseContentNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_CONTENT not between", value1, value2, "purchaseContent");
            return (Criteria) this;
        }

        public Criteria andEsNumberIsNull() {
            addCriterion("ES_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andEsNumberIsNotNull() {
            addCriterion("ES_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andEsNumberEqualTo(String value) {
            addCriterion("ES_NUMBER =", value, "esNumber");
            return (Criteria) this;
        }

        public Criteria andEsNumberNotEqualTo(String value) {
            addCriterion("ES_NUMBER <>", value, "esNumber");
            return (Criteria) this;
        }

        public Criteria andEsNumberGreaterThan(String value) {
            addCriterion("ES_NUMBER >", value, "esNumber");
            return (Criteria) this;
        }

        public Criteria andEsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ES_NUMBER >=", value, "esNumber");
            return (Criteria) this;
        }

        public Criteria andEsNumberLessThan(String value) {
            addCriterion("ES_NUMBER <", value, "esNumber");
            return (Criteria) this;
        }

        public Criteria andEsNumberLessThanOrEqualTo(String value) {
            addCriterion("ES_NUMBER <=", value, "esNumber");
            return (Criteria) this;
        }

        public Criteria andEsNumberLike(String value) {
            addCriterion("ES_NUMBER like", value, "esNumber");
            return (Criteria) this;
        }

        public Criteria andEsNumberNotLike(String value) {
            addCriterion("ES_NUMBER not like", value, "esNumber");
            return (Criteria) this;
        }

        public Criteria andEsNumberIn(List<String> values) {
            addCriterion("ES_NUMBER in", values, "esNumber");
            return (Criteria) this;
        }

        public Criteria andEsNumberNotIn(List<String> values) {
            addCriterion("ES_NUMBER not in", values, "esNumber");
            return (Criteria) this;
        }

        public Criteria andEsNumberBetween(String value1, String value2) {
            addCriterion("ES_NUMBER between", value1, value2, "esNumber");
            return (Criteria) this;
        }

        public Criteria andEsNumberNotBetween(String value1, String value2) {
            addCriterion("ES_NUMBER not between", value1, value2, "esNumber");
            return (Criteria) this;
        }

        public Criteria andEsProjectCodeIsNull() {
            addCriterion("ES_PROJECT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEsProjectCodeIsNotNull() {
            addCriterion("ES_PROJECT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEsProjectCodeEqualTo(String value) {
            addCriterion("ES_PROJECT_CODE =", value, "esProjectCode");
            return (Criteria) this;
        }

        public Criteria andEsProjectCodeNotEqualTo(String value) {
            addCriterion("ES_PROJECT_CODE <>", value, "esProjectCode");
            return (Criteria) this;
        }

        public Criteria andEsProjectCodeGreaterThan(String value) {
            addCriterion("ES_PROJECT_CODE >", value, "esProjectCode");
            return (Criteria) this;
        }

        public Criteria andEsProjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ES_PROJECT_CODE >=", value, "esProjectCode");
            return (Criteria) this;
        }

        public Criteria andEsProjectCodeLessThan(String value) {
            addCriterion("ES_PROJECT_CODE <", value, "esProjectCode");
            return (Criteria) this;
        }

        public Criteria andEsProjectCodeLessThanOrEqualTo(String value) {
            addCriterion("ES_PROJECT_CODE <=", value, "esProjectCode");
            return (Criteria) this;
        }

        public Criteria andEsProjectCodeLike(String value) {
            addCriterion("ES_PROJECT_CODE like", value, "esProjectCode");
            return (Criteria) this;
        }

        public Criteria andEsProjectCodeNotLike(String value) {
            addCriterion("ES_PROJECT_CODE not like", value, "esProjectCode");
            return (Criteria) this;
        }

        public Criteria andEsProjectCodeIn(List<String> values) {
            addCriterion("ES_PROJECT_CODE in", values, "esProjectCode");
            return (Criteria) this;
        }

        public Criteria andEsProjectCodeNotIn(List<String> values) {
            addCriterion("ES_PROJECT_CODE not in", values, "esProjectCode");
            return (Criteria) this;
        }

        public Criteria andEsProjectCodeBetween(String value1, String value2) {
            addCriterion("ES_PROJECT_CODE between", value1, value2, "esProjectCode");
            return (Criteria) this;
        }

        public Criteria andEsProjectCodeNotBetween(String value1, String value2) {
            addCriterion("ES_PROJECT_CODE not between", value1, value2, "esProjectCode");
            return (Criteria) this;
        }

        public Criteria andExpenditureTypeIsNull() {
            addCriterion("EXPENDITURE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andExpenditureTypeIsNotNull() {
            addCriterion("EXPENDITURE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andExpenditureTypeEqualTo(String value) {
            addCriterion("EXPENDITURE_TYPE =", value, "expenditureType");
            return (Criteria) this;
        }

        public Criteria andExpenditureTypeNotEqualTo(String value) {
            addCriterion("EXPENDITURE_TYPE <>", value, "expenditureType");
            return (Criteria) this;
        }

        public Criteria andExpenditureTypeGreaterThan(String value) {
            addCriterion("EXPENDITURE_TYPE >", value, "expenditureType");
            return (Criteria) this;
        }

        public Criteria andExpenditureTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EXPENDITURE_TYPE >=", value, "expenditureType");
            return (Criteria) this;
        }

        public Criteria andExpenditureTypeLessThan(String value) {
            addCriterion("EXPENDITURE_TYPE <", value, "expenditureType");
            return (Criteria) this;
        }

        public Criteria andExpenditureTypeLessThanOrEqualTo(String value) {
            addCriterion("EXPENDITURE_TYPE <=", value, "expenditureType");
            return (Criteria) this;
        }

        public Criteria andExpenditureTypeLike(String value) {
            addCriterion("EXPENDITURE_TYPE like", value, "expenditureType");
            return (Criteria) this;
        }

        public Criteria andExpenditureTypeNotLike(String value) {
            addCriterion("EXPENDITURE_TYPE not like", value, "expenditureType");
            return (Criteria) this;
        }

        public Criteria andExpenditureTypeIn(List<String> values) {
            addCriterion("EXPENDITURE_TYPE in", values, "expenditureType");
            return (Criteria) this;
        }

        public Criteria andExpenditureTypeNotIn(List<String> values) {
            addCriterion("EXPENDITURE_TYPE not in", values, "expenditureType");
            return (Criteria) this;
        }

        public Criteria andExpenditureTypeBetween(String value1, String value2) {
            addCriterion("EXPENDITURE_TYPE between", value1, value2, "expenditureType");
            return (Criteria) this;
        }

        public Criteria andExpenditureTypeNotBetween(String value1, String value2) {
            addCriterion("EXPENDITURE_TYPE not between", value1, value2, "expenditureType");
            return (Criteria) this;
        }

        public Criteria andPurchaseMethodCodeIsNull() {
            addCriterion("PURCHASE_METHOD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseMethodCodeIsNotNull() {
            addCriterion("PURCHASE_METHOD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseMethodCodeEqualTo(String value) {
            addCriterion("PURCHASE_METHOD_CODE =", value, "purchaseMethodCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseMethodCodeNotEqualTo(String value) {
            addCriterion("PURCHASE_METHOD_CODE <>", value, "purchaseMethodCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseMethodCodeGreaterThan(String value) {
            addCriterion("PURCHASE_METHOD_CODE >", value, "purchaseMethodCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseMethodCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_METHOD_CODE >=", value, "purchaseMethodCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseMethodCodeLessThan(String value) {
            addCriterion("PURCHASE_METHOD_CODE <", value, "purchaseMethodCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseMethodCodeLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_METHOD_CODE <=", value, "purchaseMethodCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseMethodCodeLike(String value) {
            addCriterion("PURCHASE_METHOD_CODE like", value, "purchaseMethodCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseMethodCodeNotLike(String value) {
            addCriterion("PURCHASE_METHOD_CODE not like", value, "purchaseMethodCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseMethodCodeIn(List<String> values) {
            addCriterion("PURCHASE_METHOD_CODE in", values, "purchaseMethodCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseMethodCodeNotIn(List<String> values) {
            addCriterion("PURCHASE_METHOD_CODE not in", values, "purchaseMethodCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseMethodCodeBetween(String value1, String value2) {
            addCriterion("PURCHASE_METHOD_CODE between", value1, value2, "purchaseMethodCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseMethodCodeNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_METHOD_CODE not between", value1, value2, "purchaseMethodCode");
            return (Criteria) this;
        }

        public Criteria andUniqueSourceSceneCodeIsNull() {
            addCriterion("UNIQUE_SOURCE_SCENE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUniqueSourceSceneCodeIsNotNull() {
            addCriterion("UNIQUE_SOURCE_SCENE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueSourceSceneCodeEqualTo(String value) {
            addCriterion("UNIQUE_SOURCE_SCENE_CODE =", value, "uniqueSourceSceneCode");
            return (Criteria) this;
        }

        public Criteria andUniqueSourceSceneCodeNotEqualTo(String value) {
            addCriterion("UNIQUE_SOURCE_SCENE_CODE <>", value, "uniqueSourceSceneCode");
            return (Criteria) this;
        }

        public Criteria andUniqueSourceSceneCodeGreaterThan(String value) {
            addCriterion("UNIQUE_SOURCE_SCENE_CODE >", value, "uniqueSourceSceneCode");
            return (Criteria) this;
        }

        public Criteria andUniqueSourceSceneCodeGreaterThanOrEqualTo(String value) {
            addCriterion("UNIQUE_SOURCE_SCENE_CODE >=", value, "uniqueSourceSceneCode");
            return (Criteria) this;
        }

        public Criteria andUniqueSourceSceneCodeLessThan(String value) {
            addCriterion("UNIQUE_SOURCE_SCENE_CODE <", value, "uniqueSourceSceneCode");
            return (Criteria) this;
        }

        public Criteria andUniqueSourceSceneCodeLessThanOrEqualTo(String value) {
            addCriterion("UNIQUE_SOURCE_SCENE_CODE <=", value, "uniqueSourceSceneCode");
            return (Criteria) this;
        }

        public Criteria andUniqueSourceSceneCodeLike(String value) {
            addCriterion("UNIQUE_SOURCE_SCENE_CODE like", value, "uniqueSourceSceneCode");
            return (Criteria) this;
        }

        public Criteria andUniqueSourceSceneCodeNotLike(String value) {
            addCriterion("UNIQUE_SOURCE_SCENE_CODE not like", value, "uniqueSourceSceneCode");
            return (Criteria) this;
        }

        public Criteria andUniqueSourceSceneCodeIn(List<String> values) {
            addCriterion("UNIQUE_SOURCE_SCENE_CODE in", values, "uniqueSourceSceneCode");
            return (Criteria) this;
        }

        public Criteria andUniqueSourceSceneCodeNotIn(List<String> values) {
            addCriterion("UNIQUE_SOURCE_SCENE_CODE not in", values, "uniqueSourceSceneCode");
            return (Criteria) this;
        }

        public Criteria andUniqueSourceSceneCodeBetween(String value1, String value2) {
            addCriterion("UNIQUE_SOURCE_SCENE_CODE between", value1, value2, "uniqueSourceSceneCode");
            return (Criteria) this;
        }

        public Criteria andUniqueSourceSceneCodeNotBetween(String value1, String value2) {
            addCriterion("UNIQUE_SOURCE_SCENE_CODE not between", value1, value2, "uniqueSourceSceneCode");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonCodeIsNull() {
            addCriterion("APPLICATION_REASON_CODE is null");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonCodeIsNotNull() {
            addCriterion("APPLICATION_REASON_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonCodeEqualTo(String value) {
            addCriterion("APPLICATION_REASON_CODE =", value, "applicationReasonCode");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonCodeNotEqualTo(String value) {
            addCriterion("APPLICATION_REASON_CODE <>", value, "applicationReasonCode");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonCodeGreaterThan(String value) {
            addCriterion("APPLICATION_REASON_CODE >", value, "applicationReasonCode");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonCodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_REASON_CODE >=", value, "applicationReasonCode");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonCodeLessThan(String value) {
            addCriterion("APPLICATION_REASON_CODE <", value, "applicationReasonCode");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonCodeLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_REASON_CODE <=", value, "applicationReasonCode");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonCodeLike(String value) {
            addCriterion("APPLICATION_REASON_CODE like", value, "applicationReasonCode");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonCodeNotLike(String value) {
            addCriterion("APPLICATION_REASON_CODE not like", value, "applicationReasonCode");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonCodeIn(List<String> values) {
            addCriterion("APPLICATION_REASON_CODE in", values, "applicationReasonCode");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonCodeNotIn(List<String> values) {
            addCriterion("APPLICATION_REASON_CODE not in", values, "applicationReasonCode");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonCodeBetween(String value1, String value2) {
            addCriterion("APPLICATION_REASON_CODE between", value1, value2, "applicationReasonCode");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonCodeNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_REASON_CODE not between", value1, value2, "applicationReasonCode");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonIsNull() {
            addCriterion("APPLICATION_REASON is null");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonIsNotNull() {
            addCriterion("APPLICATION_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonEqualTo(String value) {
            addCriterion("APPLICATION_REASON =", value, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonNotEqualTo(String value) {
            addCriterion("APPLICATION_REASON <>", value, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonGreaterThan(String value) {
            addCriterion("APPLICATION_REASON >", value, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_REASON >=", value, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonLessThan(String value) {
            addCriterion("APPLICATION_REASON <", value, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_REASON <=", value, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonLike(String value) {
            addCriterion("APPLICATION_REASON like", value, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonNotLike(String value) {
            addCriterion("APPLICATION_REASON not like", value, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonIn(List<String> values) {
            addCriterion("APPLICATION_REASON in", values, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonNotIn(List<String> values) {
            addCriterion("APPLICATION_REASON not in", values, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonBetween(String value1, String value2) {
            addCriterion("APPLICATION_REASON between", value1, value2, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_REASON not between", value1, value2, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("CREATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("CREATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATION_DATE =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATION_DATE <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATION_DATE >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATION_DATE >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterionForJDBCDate("CREATION_DATE <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATION_DATE <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATION_DATE in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATION_DATE not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATION_DATE between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATION_DATE not between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("CREATED_BY like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("CREATED_BY not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("LAST_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("LAST_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_UPDATE_DATE =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_UPDATE_DATE in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_UPDATE_DATE not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_UPDATE_DATE between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_UPDATE_DATE not between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIsNull() {
            addCriterion("LAST_UPDATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIsNotNull() {
            addCriterion("LAST_UPDATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByEqualTo(String value) {
            addCriterion("LAST_UPDATED_BY =", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotEqualTo(String value) {
            addCriterion("LAST_UPDATED_BY <>", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByGreaterThan(String value) {
            addCriterion("LAST_UPDATED_BY >", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATED_BY >=", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByLessThan(String value) {
            addCriterion("LAST_UPDATED_BY <", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATED_BY <=", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByLike(String value) {
            addCriterion("LAST_UPDATED_BY like", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotLike(String value) {
            addCriterion("LAST_UPDATED_BY not like", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIn(List<String> values) {
            addCriterion("LAST_UPDATED_BY in", values, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotIn(List<String> values) {
            addCriterion("LAST_UPDATED_BY not in", values, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByBetween(String value1, String value2) {
            addCriterion("LAST_UPDATED_BY between", value1, value2, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotBetween(String value1, String value2) {
            addCriterion("LAST_UPDATED_BY not between", value1, value2, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andEnableFlagIsNull() {
            addCriterion("ENABLE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andEnableFlagIsNotNull() {
            addCriterion("ENABLE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andEnableFlagEqualTo(String value) {
            addCriterion("ENABLE_FLAG =", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotEqualTo(String value) {
            addCriterion("ENABLE_FLAG <>", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagGreaterThan(String value) {
            addCriterion("ENABLE_FLAG >", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLE_FLAG >=", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagLessThan(String value) {
            addCriterion("ENABLE_FLAG <", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagLessThanOrEqualTo(String value) {
            addCriterion("ENABLE_FLAG <=", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagLike(String value) {
            addCriterion("ENABLE_FLAG like", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotLike(String value) {
            addCriterion("ENABLE_FLAG not like", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagIn(List<String> values) {
            addCriterion("ENABLE_FLAG in", values, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotIn(List<String> values) {
            addCriterion("ENABLE_FLAG not in", values, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagBetween(String value1, String value2) {
            addCriterion("ENABLE_FLAG between", value1, value2, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotBetween(String value1, String value2) {
            addCriterion("ENABLE_FLAG not between", value1, value2, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andAttribute1IsNull() {
            addCriterion("ATTRIBUTE1 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute1IsNotNull() {
            addCriterion("ATTRIBUTE1 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute1EqualTo(String value) {
            addCriterion("ATTRIBUTE1 =", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotEqualTo(String value) {
            addCriterion("ATTRIBUTE1 <>", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1GreaterThan(String value) {
            addCriterion("ATTRIBUTE1 >", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE1 >=", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1LessThan(String value) {
            addCriterion("ATTRIBUTE1 <", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE1 <=", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1Like(String value) {
            addCriterion("ATTRIBUTE1 like", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotLike(String value) {
            addCriterion("ATTRIBUTE1 not like", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1In(List<String> values) {
            addCriterion("ATTRIBUTE1 in", values, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotIn(List<String> values) {
            addCriterion("ATTRIBUTE1 not in", values, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1Between(String value1, String value2) {
            addCriterion("ATTRIBUTE1 between", value1, value2, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE1 not between", value1, value2, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute2IsNull() {
            addCriterion("ATTRIBUTE2 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute2IsNotNull() {
            addCriterion("ATTRIBUTE2 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute2EqualTo(String value) {
            addCriterion("ATTRIBUTE2 =", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotEqualTo(String value) {
            addCriterion("ATTRIBUTE2 <>", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2GreaterThan(String value) {
            addCriterion("ATTRIBUTE2 >", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE2 >=", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2LessThan(String value) {
            addCriterion("ATTRIBUTE2 <", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE2 <=", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2Like(String value) {
            addCriterion("ATTRIBUTE2 like", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotLike(String value) {
            addCriterion("ATTRIBUTE2 not like", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2In(List<String> values) {
            addCriterion("ATTRIBUTE2 in", values, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotIn(List<String> values) {
            addCriterion("ATTRIBUTE2 not in", values, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2Between(String value1, String value2) {
            addCriterion("ATTRIBUTE2 between", value1, value2, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE2 not between", value1, value2, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNull() {
            addCriterion("ATTRIBUTE3 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNotNull() {
            addCriterion("ATTRIBUTE3 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute3EqualTo(String value) {
            addCriterion("ATTRIBUTE3 =", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotEqualTo(String value) {
            addCriterion("ATTRIBUTE3 <>", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThan(String value) {
            addCriterion("ATTRIBUTE3 >", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE3 >=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThan(String value) {
            addCriterion("ATTRIBUTE3 <", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE3 <=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Like(String value) {
            addCriterion("ATTRIBUTE3 like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotLike(String value) {
            addCriterion("ATTRIBUTE3 not like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3In(List<String> values) {
            addCriterion("ATTRIBUTE3 in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotIn(List<String> values) {
            addCriterion("ATTRIBUTE3 not in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Between(String value1, String value2) {
            addCriterion("ATTRIBUTE3 between", value1, value2, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE3 not between", value1, value2, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute4IsNull() {
            addCriterion("ATTRIBUTE4 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute4IsNotNull() {
            addCriterion("ATTRIBUTE4 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute4EqualTo(String value) {
            addCriterion("ATTRIBUTE4 =", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotEqualTo(String value) {
            addCriterion("ATTRIBUTE4 <>", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4GreaterThan(String value) {
            addCriterion("ATTRIBUTE4 >", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE4 >=", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4LessThan(String value) {
            addCriterion("ATTRIBUTE4 <", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE4 <=", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4Like(String value) {
            addCriterion("ATTRIBUTE4 like", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotLike(String value) {
            addCriterion("ATTRIBUTE4 not like", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4In(List<String> values) {
            addCriterion("ATTRIBUTE4 in", values, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotIn(List<String> values) {
            addCriterion("ATTRIBUTE4 not in", values, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4Between(String value1, String value2) {
            addCriterion("ATTRIBUTE4 between", value1, value2, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE4 not between", value1, value2, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute5IsNull() {
            addCriterion("ATTRIBUTE5 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute5IsNotNull() {
            addCriterion("ATTRIBUTE5 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute5EqualTo(String value) {
            addCriterion("ATTRIBUTE5 =", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotEqualTo(String value) {
            addCriterion("ATTRIBUTE5 <>", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5GreaterThan(String value) {
            addCriterion("ATTRIBUTE5 >", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE5 >=", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5LessThan(String value) {
            addCriterion("ATTRIBUTE5 <", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE5 <=", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5Like(String value) {
            addCriterion("ATTRIBUTE5 like", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotLike(String value) {
            addCriterion("ATTRIBUTE5 not like", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5In(List<String> values) {
            addCriterion("ATTRIBUTE5 in", values, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotIn(List<String> values) {
            addCriterion("ATTRIBUTE5 not in", values, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5Between(String value1, String value2) {
            addCriterion("ATTRIBUTE5 between", value1, value2, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE5 not between", value1, value2, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute6IsNull() {
            addCriterion("ATTRIBUTE6 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute6IsNotNull() {
            addCriterion("ATTRIBUTE6 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute6EqualTo(String value) {
            addCriterion("ATTRIBUTE6 =", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotEqualTo(String value) {
            addCriterion("ATTRIBUTE6 <>", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6GreaterThan(String value) {
            addCriterion("ATTRIBUTE6 >", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE6 >=", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6LessThan(String value) {
            addCriterion("ATTRIBUTE6 <", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE6 <=", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6Like(String value) {
            addCriterion("ATTRIBUTE6 like", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotLike(String value) {
            addCriterion("ATTRIBUTE6 not like", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6In(List<String> values) {
            addCriterion("ATTRIBUTE6 in", values, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotIn(List<String> values) {
            addCriterion("ATTRIBUTE6 not in", values, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6Between(String value1, String value2) {
            addCriterion("ATTRIBUTE6 between", value1, value2, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE6 not between", value1, value2, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute7IsNull() {
            addCriterion("ATTRIBUTE7 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute7IsNotNull() {
            addCriterion("ATTRIBUTE7 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute7EqualTo(String value) {
            addCriterion("ATTRIBUTE7 =", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotEqualTo(String value) {
            addCriterion("ATTRIBUTE7 <>", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7GreaterThan(String value) {
            addCriterion("ATTRIBUTE7 >", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE7 >=", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7LessThan(String value) {
            addCriterion("ATTRIBUTE7 <", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE7 <=", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7Like(String value) {
            addCriterion("ATTRIBUTE7 like", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotLike(String value) {
            addCriterion("ATTRIBUTE7 not like", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7In(List<String> values) {
            addCriterion("ATTRIBUTE7 in", values, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotIn(List<String> values) {
            addCriterion("ATTRIBUTE7 not in", values, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7Between(String value1, String value2) {
            addCriterion("ATTRIBUTE7 between", value1, value2, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE7 not between", value1, value2, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute8IsNull() {
            addCriterion("ATTRIBUTE8 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute8IsNotNull() {
            addCriterion("ATTRIBUTE8 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute8EqualTo(String value) {
            addCriterion("ATTRIBUTE8 =", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotEqualTo(String value) {
            addCriterion("ATTRIBUTE8 <>", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8GreaterThan(String value) {
            addCriterion("ATTRIBUTE8 >", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE8 >=", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8LessThan(String value) {
            addCriterion("ATTRIBUTE8 <", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE8 <=", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8Like(String value) {
            addCriterion("ATTRIBUTE8 like", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotLike(String value) {
            addCriterion("ATTRIBUTE8 not like", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8In(List<String> values) {
            addCriterion("ATTRIBUTE8 in", values, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotIn(List<String> values) {
            addCriterion("ATTRIBUTE8 not in", values, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8Between(String value1, String value2) {
            addCriterion("ATTRIBUTE8 between", value1, value2, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE8 not between", value1, value2, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute9IsNull() {
            addCriterion("ATTRIBUTE9 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute9IsNotNull() {
            addCriterion("ATTRIBUTE9 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute9EqualTo(String value) {
            addCriterion("ATTRIBUTE9 =", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotEqualTo(String value) {
            addCriterion("ATTRIBUTE9 <>", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9GreaterThan(String value) {
            addCriterion("ATTRIBUTE9 >", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE9 >=", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9LessThan(String value) {
            addCriterion("ATTRIBUTE9 <", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE9 <=", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9Like(String value) {
            addCriterion("ATTRIBUTE9 like", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotLike(String value) {
            addCriterion("ATTRIBUTE9 not like", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9In(List<String> values) {
            addCriterion("ATTRIBUTE9 in", values, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotIn(List<String> values) {
            addCriterion("ATTRIBUTE9 not in", values, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9Between(String value1, String value2) {
            addCriterion("ATTRIBUTE9 between", value1, value2, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE9 not between", value1, value2, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute10IsNull() {
            addCriterion("ATTRIBUTE10 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute10IsNotNull() {
            addCriterion("ATTRIBUTE10 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute10EqualTo(String value) {
            addCriterion("ATTRIBUTE10 =", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotEqualTo(String value) {
            addCriterion("ATTRIBUTE10 <>", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10GreaterThan(String value) {
            addCriterion("ATTRIBUTE10 >", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE10 >=", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10LessThan(String value) {
            addCriterion("ATTRIBUTE10 <", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE10 <=", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10Like(String value) {
            addCriterion("ATTRIBUTE10 like", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotLike(String value) {
            addCriterion("ATTRIBUTE10 not like", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10In(List<String> values) {
            addCriterion("ATTRIBUTE10 in", values, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotIn(List<String> values) {
            addCriterion("ATTRIBUTE10 not in", values, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10Between(String value1, String value2) {
            addCriterion("ATTRIBUTE10 between", value1, value2, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE10 not between", value1, value2, "attribute10");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}