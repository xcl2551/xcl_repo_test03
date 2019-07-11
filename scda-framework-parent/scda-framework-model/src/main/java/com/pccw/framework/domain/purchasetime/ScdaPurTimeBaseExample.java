package com.pccw.framework.domain.purchasetime;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScdaPurTimeBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScdaPurTimeBaseExample() {
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

        public Criteria andKeyIdIsNull() {
            addCriterion("KEY_ID is null");
            return (Criteria) this;
        }

        public Criteria andKeyIdIsNotNull() {
            addCriterion("KEY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andKeyIdEqualTo(String value) {
            addCriterion("KEY_ID =", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotEqualTo(String value) {
            addCriterion("KEY_ID <>", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdGreaterThan(String value) {
            addCriterion("KEY_ID >", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_ID >=", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdLessThan(String value) {
            addCriterion("KEY_ID <", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdLessThanOrEqualTo(String value) {
            addCriterion("KEY_ID <=", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdLike(String value) {
            addCriterion("KEY_ID like", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotLike(String value) {
            addCriterion("KEY_ID not like", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdIn(List<String> values) {
            addCriterion("KEY_ID in", values, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotIn(List<String> values) {
            addCriterion("KEY_ID not in", values, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdBetween(String value1, String value2) {
            addCriterion("KEY_ID between", value1, value2, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotBetween(String value1, String value2) {
            addCriterion("KEY_ID not between", value1, value2, "keyId");
            return (Criteria) this;
        }

        public Criteria andPurFlowLinkIsNull() {
            addCriterion("PUR_FLOW_LINK is null");
            return (Criteria) this;
        }

        public Criteria andPurFlowLinkIsNotNull() {
            addCriterion("PUR_FLOW_LINK is not null");
            return (Criteria) this;
        }

        public Criteria andPurFlowLinkEqualTo(String value) {
            addCriterion("PUR_FLOW_LINK =", value, "purFlowLink");
            return (Criteria) this;
        }

        public Criteria andPurFlowLinkNotEqualTo(String value) {
            addCriterion("PUR_FLOW_LINK <>", value, "purFlowLink");
            return (Criteria) this;
        }

        public Criteria andPurFlowLinkGreaterThan(String value) {
            addCriterion("PUR_FLOW_LINK >", value, "purFlowLink");
            return (Criteria) this;
        }

        public Criteria andPurFlowLinkGreaterThanOrEqualTo(String value) {
            addCriterion("PUR_FLOW_LINK >=", value, "purFlowLink");
            return (Criteria) this;
        }

        public Criteria andPurFlowLinkLessThan(String value) {
            addCriterion("PUR_FLOW_LINK <", value, "purFlowLink");
            return (Criteria) this;
        }

        public Criteria andPurFlowLinkLessThanOrEqualTo(String value) {
            addCriterion("PUR_FLOW_LINK <=", value, "purFlowLink");
            return (Criteria) this;
        }

        public Criteria andPurFlowLinkLike(String value) {
            addCriterion("PUR_FLOW_LINK like", value, "purFlowLink");
            return (Criteria) this;
        }

        public Criteria andPurFlowLinkNotLike(String value) {
            addCriterion("PUR_FLOW_LINK not like", value, "purFlowLink");
            return (Criteria) this;
        }

        public Criteria andPurFlowLinkIn(List<String> values) {
            addCriterion("PUR_FLOW_LINK in", values, "purFlowLink");
            return (Criteria) this;
        }

        public Criteria andPurFlowLinkNotIn(List<String> values) {
            addCriterion("PUR_FLOW_LINK not in", values, "purFlowLink");
            return (Criteria) this;
        }

        public Criteria andPurFlowLinkBetween(String value1, String value2) {
            addCriterion("PUR_FLOW_LINK between", value1, value2, "purFlowLink");
            return (Criteria) this;
        }

        public Criteria andPurFlowLinkNotBetween(String value1, String value2) {
            addCriterion("PUR_FLOW_LINK not between", value1, value2, "purFlowLink");
            return (Criteria) this;
        }

        public Criteria andProWarnStatusIsNull() {
            addCriterion("PRO_WARN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andProWarnStatusIsNotNull() {
            addCriterion("PRO_WARN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andProWarnStatusEqualTo(String value) {
            addCriterion("PRO_WARN_STATUS =", value, "proWarnStatus");
            return (Criteria) this;
        }

        public Criteria andProWarnStatusNotEqualTo(String value) {
            addCriterion("PRO_WARN_STATUS <>", value, "proWarnStatus");
            return (Criteria) this;
        }

        public Criteria andProWarnStatusGreaterThan(String value) {
            addCriterion("PRO_WARN_STATUS >", value, "proWarnStatus");
            return (Criteria) this;
        }

        public Criteria andProWarnStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_WARN_STATUS >=", value, "proWarnStatus");
            return (Criteria) this;
        }

        public Criteria andProWarnStatusLessThan(String value) {
            addCriterion("PRO_WARN_STATUS <", value, "proWarnStatus");
            return (Criteria) this;
        }

        public Criteria andProWarnStatusLessThanOrEqualTo(String value) {
            addCriterion("PRO_WARN_STATUS <=", value, "proWarnStatus");
            return (Criteria) this;
        }

        public Criteria andProWarnStatusLike(String value) {
            addCriterion("PRO_WARN_STATUS like", value, "proWarnStatus");
            return (Criteria) this;
        }

        public Criteria andProWarnStatusNotLike(String value) {
            addCriterion("PRO_WARN_STATUS not like", value, "proWarnStatus");
            return (Criteria) this;
        }

        public Criteria andProWarnStatusIn(List<String> values) {
            addCriterion("PRO_WARN_STATUS in", values, "proWarnStatus");
            return (Criteria) this;
        }

        public Criteria andProWarnStatusNotIn(List<String> values) {
            addCriterion("PRO_WARN_STATUS not in", values, "proWarnStatus");
            return (Criteria) this;
        }

        public Criteria andProWarnStatusBetween(String value1, String value2) {
            addCriterion("PRO_WARN_STATUS between", value1, value2, "proWarnStatus");
            return (Criteria) this;
        }

        public Criteria andProWarnStatusNotBetween(String value1, String value2) {
            addCriterion("PRO_WARN_STATUS not between", value1, value2, "proWarnStatus");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryIsNull() {
            addCriterion("ATTRIBUTE_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryIsNotNull() {
            addCriterion("ATTRIBUTE_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryEqualTo(String value) {
            addCriterion("ATTRIBUTE_CATEGORY =", value, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryNotEqualTo(String value) {
            addCriterion("ATTRIBUTE_CATEGORY <>", value, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryGreaterThan(String value) {
            addCriterion("ATTRIBUTE_CATEGORY >", value, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE_CATEGORY >=", value, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryLessThan(String value) {
            addCriterion("ATTRIBUTE_CATEGORY <", value, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryLessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE_CATEGORY <=", value, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryLike(String value) {
            addCriterion("ATTRIBUTE_CATEGORY like", value, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryNotLike(String value) {
            addCriterion("ATTRIBUTE_CATEGORY not like", value, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryIn(List<String> values) {
            addCriterion("ATTRIBUTE_CATEGORY in", values, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryNotIn(List<String> values) {
            addCriterion("ATTRIBUTE_CATEGORY not in", values, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE_CATEGORY between", value1, value2, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryNotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE_CATEGORY not between", value1, value2, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andPurDemandProjectNameIsNull() {
            addCriterion("PUR_DEMAND_PROJECT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPurDemandProjectNameIsNotNull() {
            addCriterion("PUR_DEMAND_PROJECT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPurDemandProjectNameEqualTo(String value) {
            addCriterion("PUR_DEMAND_PROJECT_NAME =", value, "purDemandProjectName");
            return (Criteria) this;
        }

        public Criteria andPurDemandProjectNameNotEqualTo(String value) {
            addCriterion("PUR_DEMAND_PROJECT_NAME <>", value, "purDemandProjectName");
            return (Criteria) this;
        }

        public Criteria andPurDemandProjectNameGreaterThan(String value) {
            addCriterion("PUR_DEMAND_PROJECT_NAME >", value, "purDemandProjectName");
            return (Criteria) this;
        }

        public Criteria andPurDemandProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("PUR_DEMAND_PROJECT_NAME >=", value, "purDemandProjectName");
            return (Criteria) this;
        }

        public Criteria andPurDemandProjectNameLessThan(String value) {
            addCriterion("PUR_DEMAND_PROJECT_NAME <", value, "purDemandProjectName");
            return (Criteria) this;
        }

        public Criteria andPurDemandProjectNameLessThanOrEqualTo(String value) {
            addCriterion("PUR_DEMAND_PROJECT_NAME <=", value, "purDemandProjectName");
            return (Criteria) this;
        }

        public Criteria andPurDemandProjectNameLike(String value) {
            addCriterion("PUR_DEMAND_PROJECT_NAME like", value, "purDemandProjectName");
            return (Criteria) this;
        }

        public Criteria andPurDemandProjectNameNotLike(String value) {
            addCriterion("PUR_DEMAND_PROJECT_NAME not like", value, "purDemandProjectName");
            return (Criteria) this;
        }

        public Criteria andPurDemandProjectNameIn(List<String> values) {
            addCriterion("PUR_DEMAND_PROJECT_NAME in", values, "purDemandProjectName");
            return (Criteria) this;
        }

        public Criteria andPurDemandProjectNameNotIn(List<String> values) {
            addCriterion("PUR_DEMAND_PROJECT_NAME not in", values, "purDemandProjectName");
            return (Criteria) this;
        }

        public Criteria andPurDemandProjectNameBetween(String value1, String value2) {
            addCriterion("PUR_DEMAND_PROJECT_NAME between", value1, value2, "purDemandProjectName");
            return (Criteria) this;
        }

        public Criteria andPurDemandProjectNameNotBetween(String value1, String value2) {
            addCriterion("PUR_DEMAND_PROJECT_NAME not between", value1, value2, "purDemandProjectName");
            return (Criteria) this;
        }

        public Criteria andPurDemandNumberIsNull() {
            addCriterion("PUR_DEMAND_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPurDemandNumberIsNotNull() {
            addCriterion("PUR_DEMAND_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPurDemandNumberEqualTo(String value) {
            addCriterion("PUR_DEMAND_NUMBER =", value, "purDemandNumber");
            return (Criteria) this;
        }

        public Criteria andPurDemandNumberNotEqualTo(String value) {
            addCriterion("PUR_DEMAND_NUMBER <>", value, "purDemandNumber");
            return (Criteria) this;
        }

        public Criteria andPurDemandNumberGreaterThan(String value) {
            addCriterion("PUR_DEMAND_NUMBER >", value, "purDemandNumber");
            return (Criteria) this;
        }

        public Criteria andPurDemandNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PUR_DEMAND_NUMBER >=", value, "purDemandNumber");
            return (Criteria) this;
        }

        public Criteria andPurDemandNumberLessThan(String value) {
            addCriterion("PUR_DEMAND_NUMBER <", value, "purDemandNumber");
            return (Criteria) this;
        }

        public Criteria andPurDemandNumberLessThanOrEqualTo(String value) {
            addCriterion("PUR_DEMAND_NUMBER <=", value, "purDemandNumber");
            return (Criteria) this;
        }

        public Criteria andPurDemandNumberLike(String value) {
            addCriterion("PUR_DEMAND_NUMBER like", value, "purDemandNumber");
            return (Criteria) this;
        }

        public Criteria andPurDemandNumberNotLike(String value) {
            addCriterion("PUR_DEMAND_NUMBER not like", value, "purDemandNumber");
            return (Criteria) this;
        }

        public Criteria andPurDemandNumberIn(List<String> values) {
            addCriterion("PUR_DEMAND_NUMBER in", values, "purDemandNumber");
            return (Criteria) this;
        }

        public Criteria andPurDemandNumberNotIn(List<String> values) {
            addCriterion("PUR_DEMAND_NUMBER not in", values, "purDemandNumber");
            return (Criteria) this;
        }

        public Criteria andPurDemandNumberBetween(String value1, String value2) {
            addCriterion("PUR_DEMAND_NUMBER between", value1, value2, "purDemandNumber");
            return (Criteria) this;
        }

        public Criteria andPurDemandNumberNotBetween(String value1, String value2) {
            addCriterion("PUR_DEMAND_NUMBER not between", value1, value2, "purDemandNumber");
            return (Criteria) this;
        }

        public Criteria andEsProjectNumberIsNull() {
            addCriterion("ES_PROJECT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andEsProjectNumberIsNotNull() {
            addCriterion("ES_PROJECT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andEsProjectNumberEqualTo(String value) {
            addCriterion("ES_PROJECT_NUMBER =", value, "esProjectNumber");
            return (Criteria) this;
        }

        public Criteria andEsProjectNumberNotEqualTo(String value) {
            addCriterion("ES_PROJECT_NUMBER <>", value, "esProjectNumber");
            return (Criteria) this;
        }

        public Criteria andEsProjectNumberGreaterThan(String value) {
            addCriterion("ES_PROJECT_NUMBER >", value, "esProjectNumber");
            return (Criteria) this;
        }

        public Criteria andEsProjectNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ES_PROJECT_NUMBER >=", value, "esProjectNumber");
            return (Criteria) this;
        }

        public Criteria andEsProjectNumberLessThan(String value) {
            addCriterion("ES_PROJECT_NUMBER <", value, "esProjectNumber");
            return (Criteria) this;
        }

        public Criteria andEsProjectNumberLessThanOrEqualTo(String value) {
            addCriterion("ES_PROJECT_NUMBER <=", value, "esProjectNumber");
            return (Criteria) this;
        }

        public Criteria andEsProjectNumberLike(String value) {
            addCriterion("ES_PROJECT_NUMBER like", value, "esProjectNumber");
            return (Criteria) this;
        }

        public Criteria andEsProjectNumberNotLike(String value) {
            addCriterion("ES_PROJECT_NUMBER not like", value, "esProjectNumber");
            return (Criteria) this;
        }

        public Criteria andEsProjectNumberIn(List<String> values) {
            addCriterion("ES_PROJECT_NUMBER in", values, "esProjectNumber");
            return (Criteria) this;
        }

        public Criteria andEsProjectNumberNotIn(List<String> values) {
            addCriterion("ES_PROJECT_NUMBER not in", values, "esProjectNumber");
            return (Criteria) this;
        }

        public Criteria andEsProjectNumberBetween(String value1, String value2) {
            addCriterion("ES_PROJECT_NUMBER between", value1, value2, "esProjectNumber");
            return (Criteria) this;
        }

        public Criteria andEsProjectNumberNotBetween(String value1, String value2) {
            addCriterion("ES_PROJECT_NUMBER not between", value1, value2, "esProjectNumber");
            return (Criteria) this;
        }

        public Criteria andEsProjectNameIsNull() {
            addCriterion("ES_PROJECT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEsProjectNameIsNotNull() {
            addCriterion("ES_PROJECT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEsProjectNameEqualTo(String value) {
            addCriterion("ES_PROJECT_NAME =", value, "esProjectName");
            return (Criteria) this;
        }

        public Criteria andEsProjectNameNotEqualTo(String value) {
            addCriterion("ES_PROJECT_NAME <>", value, "esProjectName");
            return (Criteria) this;
        }

        public Criteria andEsProjectNameGreaterThan(String value) {
            addCriterion("ES_PROJECT_NAME >", value, "esProjectName");
            return (Criteria) this;
        }

        public Criteria andEsProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("ES_PROJECT_NAME >=", value, "esProjectName");
            return (Criteria) this;
        }

        public Criteria andEsProjectNameLessThan(String value) {
            addCriterion("ES_PROJECT_NAME <", value, "esProjectName");
            return (Criteria) this;
        }

        public Criteria andEsProjectNameLessThanOrEqualTo(String value) {
            addCriterion("ES_PROJECT_NAME <=", value, "esProjectName");
            return (Criteria) this;
        }

        public Criteria andEsProjectNameLike(String value) {
            addCriterion("ES_PROJECT_NAME like", value, "esProjectName");
            return (Criteria) this;
        }

        public Criteria andEsProjectNameNotLike(String value) {
            addCriterion("ES_PROJECT_NAME not like", value, "esProjectName");
            return (Criteria) this;
        }

        public Criteria andEsProjectNameIn(List<String> values) {
            addCriterion("ES_PROJECT_NAME in", values, "esProjectName");
            return (Criteria) this;
        }

        public Criteria andEsProjectNameNotIn(List<String> values) {
            addCriterion("ES_PROJECT_NAME not in", values, "esProjectName");
            return (Criteria) this;
        }

        public Criteria andEsProjectNameBetween(String value1, String value2) {
            addCriterion("ES_PROJECT_NAME between", value1, value2, "esProjectName");
            return (Criteria) this;
        }

        public Criteria andEsProjectNameNotBetween(String value1, String value2) {
            addCriterion("ES_PROJECT_NAME not between", value1, value2, "esProjectName");
            return (Criteria) this;
        }

        public Criteria andDemandDeptIsNull() {
            addCriterion("DEMAND_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andDemandDeptIsNotNull() {
            addCriterion("DEMAND_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andDemandDeptEqualTo(String value) {
            addCriterion("DEMAND_DEPT =", value, "demandDept");
            return (Criteria) this;
        }

        public Criteria andDemandDeptNotEqualTo(String value) {
            addCriterion("DEMAND_DEPT <>", value, "demandDept");
            return (Criteria) this;
        }

        public Criteria andDemandDeptGreaterThan(String value) {
            addCriterion("DEMAND_DEPT >", value, "demandDept");
            return (Criteria) this;
        }

        public Criteria andDemandDeptGreaterThanOrEqualTo(String value) {
            addCriterion("DEMAND_DEPT >=", value, "demandDept");
            return (Criteria) this;
        }

        public Criteria andDemandDeptLessThan(String value) {
            addCriterion("DEMAND_DEPT <", value, "demandDept");
            return (Criteria) this;
        }

        public Criteria andDemandDeptLessThanOrEqualTo(String value) {
            addCriterion("DEMAND_DEPT <=", value, "demandDept");
            return (Criteria) this;
        }

        public Criteria andDemandDeptLike(String value) {
            addCriterion("DEMAND_DEPT like", value, "demandDept");
            return (Criteria) this;
        }

        public Criteria andDemandDeptNotLike(String value) {
            addCriterion("DEMAND_DEPT not like", value, "demandDept");
            return (Criteria) this;
        }

        public Criteria andDemandDeptIn(List<String> values) {
            addCriterion("DEMAND_DEPT in", values, "demandDept");
            return (Criteria) this;
        }

        public Criteria andDemandDeptNotIn(List<String> values) {
            addCriterion("DEMAND_DEPT not in", values, "demandDept");
            return (Criteria) this;
        }

        public Criteria andDemandDeptBetween(String value1, String value2) {
            addCriterion("DEMAND_DEPT between", value1, value2, "demandDept");
            return (Criteria) this;
        }

        public Criteria andDemandDeptNotBetween(String value1, String value2) {
            addCriterion("DEMAND_DEPT not between", value1, value2, "demandDept");
            return (Criteria) this;
        }

        public Criteria andSchBudgetTaxNoIsNull() {
            addCriterion("SCH_BUDGET_TAX_NO is null");
            return (Criteria) this;
        }

        public Criteria andSchBudgetTaxNoIsNotNull() {
            addCriterion("SCH_BUDGET_TAX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSchBudgetTaxNoEqualTo(String value) {
            addCriterion("SCH_BUDGET_TAX_NO =", value, "schBudgetTaxNo");
            return (Criteria) this;
        }

        public Criteria andSchBudgetTaxNoNotEqualTo(String value) {
            addCriterion("SCH_BUDGET_TAX_NO <>", value, "schBudgetTaxNo");
            return (Criteria) this;
        }

        public Criteria andSchBudgetTaxNoGreaterThan(String value) {
            addCriterion("SCH_BUDGET_TAX_NO >", value, "schBudgetTaxNo");
            return (Criteria) this;
        }

        public Criteria andSchBudgetTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("SCH_BUDGET_TAX_NO >=", value, "schBudgetTaxNo");
            return (Criteria) this;
        }

        public Criteria andSchBudgetTaxNoLessThan(String value) {
            addCriterion("SCH_BUDGET_TAX_NO <", value, "schBudgetTaxNo");
            return (Criteria) this;
        }

        public Criteria andSchBudgetTaxNoLessThanOrEqualTo(String value) {
            addCriterion("SCH_BUDGET_TAX_NO <=", value, "schBudgetTaxNo");
            return (Criteria) this;
        }

        public Criteria andSchBudgetTaxNoLike(String value) {
            addCriterion("SCH_BUDGET_TAX_NO like", value, "schBudgetTaxNo");
            return (Criteria) this;
        }

        public Criteria andSchBudgetTaxNoNotLike(String value) {
            addCriterion("SCH_BUDGET_TAX_NO not like", value, "schBudgetTaxNo");
            return (Criteria) this;
        }

        public Criteria andSchBudgetTaxNoIn(List<String> values) {
            addCriterion("SCH_BUDGET_TAX_NO in", values, "schBudgetTaxNo");
            return (Criteria) this;
        }

        public Criteria andSchBudgetTaxNoNotIn(List<String> values) {
            addCriterion("SCH_BUDGET_TAX_NO not in", values, "schBudgetTaxNo");
            return (Criteria) this;
        }

        public Criteria andSchBudgetTaxNoBetween(String value1, String value2) {
            addCriterion("SCH_BUDGET_TAX_NO between", value1, value2, "schBudgetTaxNo");
            return (Criteria) this;
        }

        public Criteria andSchBudgetTaxNoNotBetween(String value1, String value2) {
            addCriterion("SCH_BUDGET_TAX_NO not between", value1, value2, "schBudgetTaxNo");
            return (Criteria) this;
        }

        public Criteria andPurCompIsNull() {
            addCriterion("PUR_COMP is null");
            return (Criteria) this;
        }

        public Criteria andPurCompIsNotNull() {
            addCriterion("PUR_COMP is not null");
            return (Criteria) this;
        }

        public Criteria andPurCompEqualTo(String value) {
            addCriterion("PUR_COMP =", value, "purComp");
            return (Criteria) this;
        }

        public Criteria andPurCompNotEqualTo(String value) {
            addCriterion("PUR_COMP <>", value, "purComp");
            return (Criteria) this;
        }

        public Criteria andPurCompGreaterThan(String value) {
            addCriterion("PUR_COMP >", value, "purComp");
            return (Criteria) this;
        }

        public Criteria andPurCompGreaterThanOrEqualTo(String value) {
            addCriterion("PUR_COMP >=", value, "purComp");
            return (Criteria) this;
        }

        public Criteria andPurCompLessThan(String value) {
            addCriterion("PUR_COMP <", value, "purComp");
            return (Criteria) this;
        }

        public Criteria andPurCompLessThanOrEqualTo(String value) {
            addCriterion("PUR_COMP <=", value, "purComp");
            return (Criteria) this;
        }

        public Criteria andPurCompLike(String value) {
            addCriterion("PUR_COMP like", value, "purComp");
            return (Criteria) this;
        }

        public Criteria andPurCompNotLike(String value) {
            addCriterion("PUR_COMP not like", value, "purComp");
            return (Criteria) this;
        }

        public Criteria andPurCompIn(List<String> values) {
            addCriterion("PUR_COMP in", values, "purComp");
            return (Criteria) this;
        }

        public Criteria andPurCompNotIn(List<String> values) {
            addCriterion("PUR_COMP not in", values, "purComp");
            return (Criteria) this;
        }

        public Criteria andPurCompBetween(String value1, String value2) {
            addCriterion("PUR_COMP between", value1, value2, "purComp");
            return (Criteria) this;
        }

        public Criteria andPurCompNotBetween(String value1, String value2) {
            addCriterion("PUR_COMP not between", value1, value2, "purComp");
            return (Criteria) this;
        }

        public Criteria andPurDeptIsNull() {
            addCriterion("PUR_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andPurDeptIsNotNull() {
            addCriterion("PUR_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andPurDeptEqualTo(String value) {
            addCriterion("PUR_DEPT =", value, "purDept");
            return (Criteria) this;
        }

        public Criteria andPurDeptNotEqualTo(String value) {
            addCriterion("PUR_DEPT <>", value, "purDept");
            return (Criteria) this;
        }

        public Criteria andPurDeptGreaterThan(String value) {
            addCriterion("PUR_DEPT >", value, "purDept");
            return (Criteria) this;
        }

        public Criteria andPurDeptGreaterThanOrEqualTo(String value) {
            addCriterion("PUR_DEPT >=", value, "purDept");
            return (Criteria) this;
        }

        public Criteria andPurDeptLessThan(String value) {
            addCriterion("PUR_DEPT <", value, "purDept");
            return (Criteria) this;
        }

        public Criteria andPurDeptLessThanOrEqualTo(String value) {
            addCriterion("PUR_DEPT <=", value, "purDept");
            return (Criteria) this;
        }

        public Criteria andPurDeptLike(String value) {
            addCriterion("PUR_DEPT like", value, "purDept");
            return (Criteria) this;
        }

        public Criteria andPurDeptNotLike(String value) {
            addCriterion("PUR_DEPT not like", value, "purDept");
            return (Criteria) this;
        }

        public Criteria andPurDeptIn(List<String> values) {
            addCriterion("PUR_DEPT in", values, "purDept");
            return (Criteria) this;
        }

        public Criteria andPurDeptNotIn(List<String> values) {
            addCriterion("PUR_DEPT not in", values, "purDept");
            return (Criteria) this;
        }

        public Criteria andPurDeptBetween(String value1, String value2) {
            addCriterion("PUR_DEPT between", value1, value2, "purDept");
            return (Criteria) this;
        }

        public Criteria andPurDeptNotBetween(String value1, String value2) {
            addCriterion("PUR_DEPT not between", value1, value2, "purDept");
            return (Criteria) this;
        }

        public Criteria andSchDecisionLevelIsNull() {
            addCriterion("SCH_DECISION_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andSchDecisionLevelIsNotNull() {
            addCriterion("SCH_DECISION_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andSchDecisionLevelEqualTo(String value) {
            addCriterion("SCH_DECISION_LEVEL =", value, "schDecisionLevel");
            return (Criteria) this;
        }

        public Criteria andSchDecisionLevelNotEqualTo(String value) {
            addCriterion("SCH_DECISION_LEVEL <>", value, "schDecisionLevel");
            return (Criteria) this;
        }

        public Criteria andSchDecisionLevelGreaterThan(String value) {
            addCriterion("SCH_DECISION_LEVEL >", value, "schDecisionLevel");
            return (Criteria) this;
        }

        public Criteria andSchDecisionLevelGreaterThanOrEqualTo(String value) {
            addCriterion("SCH_DECISION_LEVEL >=", value, "schDecisionLevel");
            return (Criteria) this;
        }

        public Criteria andSchDecisionLevelLessThan(String value) {
            addCriterion("SCH_DECISION_LEVEL <", value, "schDecisionLevel");
            return (Criteria) this;
        }

        public Criteria andSchDecisionLevelLessThanOrEqualTo(String value) {
            addCriterion("SCH_DECISION_LEVEL <=", value, "schDecisionLevel");
            return (Criteria) this;
        }

        public Criteria andSchDecisionLevelLike(String value) {
            addCriterion("SCH_DECISION_LEVEL like", value, "schDecisionLevel");
            return (Criteria) this;
        }

        public Criteria andSchDecisionLevelNotLike(String value) {
            addCriterion("SCH_DECISION_LEVEL not like", value, "schDecisionLevel");
            return (Criteria) this;
        }

        public Criteria andSchDecisionLevelIn(List<String> values) {
            addCriterion("SCH_DECISION_LEVEL in", values, "schDecisionLevel");
            return (Criteria) this;
        }

        public Criteria andSchDecisionLevelNotIn(List<String> values) {
            addCriterion("SCH_DECISION_LEVEL not in", values, "schDecisionLevel");
            return (Criteria) this;
        }

        public Criteria andSchDecisionLevelBetween(String value1, String value2) {
            addCriterion("SCH_DECISION_LEVEL between", value1, value2, "schDecisionLevel");
            return (Criteria) this;
        }

        public Criteria andSchDecisionLevelNotBetween(String value1, String value2) {
            addCriterion("SCH_DECISION_LEVEL not between", value1, value2, "schDecisionLevel");
            return (Criteria) this;
        }

        public Criteria andPurWayIsNull() {
            addCriterion("PUR_WAY is null");
            return (Criteria) this;
        }

        public Criteria andPurWayIsNotNull() {
            addCriterion("PUR_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andPurWayEqualTo(String value) {
            addCriterion("PUR_WAY =", value, "purWay");
            return (Criteria) this;
        }

        public Criteria andPurWayNotEqualTo(String value) {
            addCriterion("PUR_WAY <>", value, "purWay");
            return (Criteria) this;
        }

        public Criteria andPurWayGreaterThan(String value) {
            addCriterion("PUR_WAY >", value, "purWay");
            return (Criteria) this;
        }

        public Criteria andPurWayGreaterThanOrEqualTo(String value) {
            addCriterion("PUR_WAY >=", value, "purWay");
            return (Criteria) this;
        }

        public Criteria andPurWayLessThan(String value) {
            addCriterion("PUR_WAY <", value, "purWay");
            return (Criteria) this;
        }

        public Criteria andPurWayLessThanOrEqualTo(String value) {
            addCriterion("PUR_WAY <=", value, "purWay");
            return (Criteria) this;
        }

        public Criteria andPurWayLike(String value) {
            addCriterion("PUR_WAY like", value, "purWay");
            return (Criteria) this;
        }

        public Criteria andPurWayNotLike(String value) {
            addCriterion("PUR_WAY not like", value, "purWay");
            return (Criteria) this;
        }

        public Criteria andPurWayIn(List<String> values) {
            addCriterion("PUR_WAY in", values, "purWay");
            return (Criteria) this;
        }

        public Criteria andPurWayNotIn(List<String> values) {
            addCriterion("PUR_WAY not in", values, "purWay");
            return (Criteria) this;
        }

        public Criteria andPurWayBetween(String value1, String value2) {
            addCriterion("PUR_WAY between", value1, value2, "purWay");
            return (Criteria) this;
        }

        public Criteria andPurWayNotBetween(String value1, String value2) {
            addCriterion("PUR_WAY not between", value1, value2, "purWay");
            return (Criteria) this;
        }

        public Criteria andProTimeNaturalIsNull() {
            addCriterion("PRO_TIME_NATURAL is null");
            return (Criteria) this;
        }

        public Criteria andProTimeNaturalIsNotNull() {
            addCriterion("PRO_TIME_NATURAL is not null");
            return (Criteria) this;
        }

        public Criteria andProTimeNaturalEqualTo(String value) {
            addCriterion("PRO_TIME_NATURAL =", value, "proTimeNatural");
            return (Criteria) this;
        }

        public Criteria andProTimeNaturalNotEqualTo(String value) {
            addCriterion("PRO_TIME_NATURAL <>", value, "proTimeNatural");
            return (Criteria) this;
        }

        public Criteria andProTimeNaturalGreaterThan(String value) {
            addCriterion("PRO_TIME_NATURAL >", value, "proTimeNatural");
            return (Criteria) this;
        }

        public Criteria andProTimeNaturalGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_TIME_NATURAL >=", value, "proTimeNatural");
            return (Criteria) this;
        }

        public Criteria andProTimeNaturalLessThan(String value) {
            addCriterion("PRO_TIME_NATURAL <", value, "proTimeNatural");
            return (Criteria) this;
        }

        public Criteria andProTimeNaturalLessThanOrEqualTo(String value) {
            addCriterion("PRO_TIME_NATURAL <=", value, "proTimeNatural");
            return (Criteria) this;
        }

        public Criteria andProTimeNaturalLike(String value) {
            addCriterion("PRO_TIME_NATURAL like", value, "proTimeNatural");
            return (Criteria) this;
        }

        public Criteria andProTimeNaturalNotLike(String value) {
            addCriterion("PRO_TIME_NATURAL not like", value, "proTimeNatural");
            return (Criteria) this;
        }

        public Criteria andProTimeNaturalIn(List<String> values) {
            addCriterion("PRO_TIME_NATURAL in", values, "proTimeNatural");
            return (Criteria) this;
        }

        public Criteria andProTimeNaturalNotIn(List<String> values) {
            addCriterion("PRO_TIME_NATURAL not in", values, "proTimeNatural");
            return (Criteria) this;
        }

        public Criteria andProTimeNaturalBetween(String value1, String value2) {
            addCriterion("PRO_TIME_NATURAL between", value1, value2, "proTimeNatural");
            return (Criteria) this;
        }

        public Criteria andProTimeNaturalNotBetween(String value1, String value2) {
            addCriterion("PRO_TIME_NATURAL not between", value1, value2, "proTimeNatural");
            return (Criteria) this;
        }

        public Criteria andProTimeWorkingIsNull() {
            addCriterion("PRO_TIME_WORKING is null");
            return (Criteria) this;
        }

        public Criteria andProTimeWorkingIsNotNull() {
            addCriterion("PRO_TIME_WORKING is not null");
            return (Criteria) this;
        }

        public Criteria andProTimeWorkingEqualTo(String value) {
            addCriterion("PRO_TIME_WORKING =", value, "proTimeWorking");
            return (Criteria) this;
        }

        public Criteria andProTimeWorkingNotEqualTo(String value) {
            addCriterion("PRO_TIME_WORKING <>", value, "proTimeWorking");
            return (Criteria) this;
        }

        public Criteria andProTimeWorkingGreaterThan(String value) {
            addCriterion("PRO_TIME_WORKING >", value, "proTimeWorking");
            return (Criteria) this;
        }

        public Criteria andProTimeWorkingGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_TIME_WORKING >=", value, "proTimeWorking");
            return (Criteria) this;
        }

        public Criteria andProTimeWorkingLessThan(String value) {
            addCriterion("PRO_TIME_WORKING <", value, "proTimeWorking");
            return (Criteria) this;
        }

        public Criteria andProTimeWorkingLessThanOrEqualTo(String value) {
            addCriterion("PRO_TIME_WORKING <=", value, "proTimeWorking");
            return (Criteria) this;
        }

        public Criteria andProTimeWorkingLike(String value) {
            addCriterion("PRO_TIME_WORKING like", value, "proTimeWorking");
            return (Criteria) this;
        }

        public Criteria andProTimeWorkingNotLike(String value) {
            addCriterion("PRO_TIME_WORKING not like", value, "proTimeWorking");
            return (Criteria) this;
        }

        public Criteria andProTimeWorkingIn(List<String> values) {
            addCriterion("PRO_TIME_WORKING in", values, "proTimeWorking");
            return (Criteria) this;
        }

        public Criteria andProTimeWorkingNotIn(List<String> values) {
            addCriterion("PRO_TIME_WORKING not in", values, "proTimeWorking");
            return (Criteria) this;
        }

        public Criteria andProTimeWorkingBetween(String value1, String value2) {
            addCriterion("PRO_TIME_WORKING between", value1, value2, "proTimeWorking");
            return (Criteria) this;
        }

        public Criteria andProTimeWorkingNotBetween(String value1, String value2) {
            addCriterion("PRO_TIME_WORKING not between", value1, value2, "proTimeWorking");
            return (Criteria) this;
        }

        public Criteria andProTotalElapsedTimeIsNull() {
            addCriterion("PRO_TOTAL_ELAPSED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andProTotalElapsedTimeIsNotNull() {
            addCriterion("PRO_TOTAL_ELAPSED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andProTotalElapsedTimeEqualTo(String value) {
            addCriterion("PRO_TOTAL_ELAPSED_TIME =", value, "proTotalElapsedTime");
            return (Criteria) this;
        }

        public Criteria andProTotalElapsedTimeNotEqualTo(String value) {
            addCriterion("PRO_TOTAL_ELAPSED_TIME <>", value, "proTotalElapsedTime");
            return (Criteria) this;
        }

        public Criteria andProTotalElapsedTimeGreaterThan(String value) {
            addCriterion("PRO_TOTAL_ELAPSED_TIME >", value, "proTotalElapsedTime");
            return (Criteria) this;
        }

        public Criteria andProTotalElapsedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_TOTAL_ELAPSED_TIME >=", value, "proTotalElapsedTime");
            return (Criteria) this;
        }

        public Criteria andProTotalElapsedTimeLessThan(String value) {
            addCriterion("PRO_TOTAL_ELAPSED_TIME <", value, "proTotalElapsedTime");
            return (Criteria) this;
        }

        public Criteria andProTotalElapsedTimeLessThanOrEqualTo(String value) {
            addCriterion("PRO_TOTAL_ELAPSED_TIME <=", value, "proTotalElapsedTime");
            return (Criteria) this;
        }

        public Criteria andProTotalElapsedTimeLike(String value) {
            addCriterion("PRO_TOTAL_ELAPSED_TIME like", value, "proTotalElapsedTime");
            return (Criteria) this;
        }

        public Criteria andProTotalElapsedTimeNotLike(String value) {
            addCriterion("PRO_TOTAL_ELAPSED_TIME not like", value, "proTotalElapsedTime");
            return (Criteria) this;
        }

        public Criteria andProTotalElapsedTimeIn(List<String> values) {
            addCriterion("PRO_TOTAL_ELAPSED_TIME in", values, "proTotalElapsedTime");
            return (Criteria) this;
        }

        public Criteria andProTotalElapsedTimeNotIn(List<String> values) {
            addCriterion("PRO_TOTAL_ELAPSED_TIME not in", values, "proTotalElapsedTime");
            return (Criteria) this;
        }

        public Criteria andProTotalElapsedTimeBetween(String value1, String value2) {
            addCriterion("PRO_TOTAL_ELAPSED_TIME between", value1, value2, "proTotalElapsedTime");
            return (Criteria) this;
        }

        public Criteria andProTotalElapsedTimeNotBetween(String value1, String value2) {
            addCriterion("PRO_TOTAL_ELAPSED_TIME not between", value1, value2, "proTotalElapsedTime");
            return (Criteria) this;
        }

        public Criteria andProBefAfterTimeIsNull() {
            addCriterion("PRO_BEF_AFTER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andProBefAfterTimeIsNotNull() {
            addCriterion("PRO_BEF_AFTER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andProBefAfterTimeEqualTo(String value) {
            addCriterion("PRO_BEF_AFTER_TIME =", value, "proBefAfterTime");
            return (Criteria) this;
        }

        public Criteria andProBefAfterTimeNotEqualTo(String value) {
            addCriterion("PRO_BEF_AFTER_TIME <>", value, "proBefAfterTime");
            return (Criteria) this;
        }

        public Criteria andProBefAfterTimeGreaterThan(String value) {
            addCriterion("PRO_BEF_AFTER_TIME >", value, "proBefAfterTime");
            return (Criteria) this;
        }

        public Criteria andProBefAfterTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_BEF_AFTER_TIME >=", value, "proBefAfterTime");
            return (Criteria) this;
        }

        public Criteria andProBefAfterTimeLessThan(String value) {
            addCriterion("PRO_BEF_AFTER_TIME <", value, "proBefAfterTime");
            return (Criteria) this;
        }

        public Criteria andProBefAfterTimeLessThanOrEqualTo(String value) {
            addCriterion("PRO_BEF_AFTER_TIME <=", value, "proBefAfterTime");
            return (Criteria) this;
        }

        public Criteria andProBefAfterTimeLike(String value) {
            addCriterion("PRO_BEF_AFTER_TIME like", value, "proBefAfterTime");
            return (Criteria) this;
        }

        public Criteria andProBefAfterTimeNotLike(String value) {
            addCriterion("PRO_BEF_AFTER_TIME not like", value, "proBefAfterTime");
            return (Criteria) this;
        }

        public Criteria andProBefAfterTimeIn(List<String> values) {
            addCriterion("PRO_BEF_AFTER_TIME in", values, "proBefAfterTime");
            return (Criteria) this;
        }

        public Criteria andProBefAfterTimeNotIn(List<String> values) {
            addCriterion("PRO_BEF_AFTER_TIME not in", values, "proBefAfterTime");
            return (Criteria) this;
        }

        public Criteria andProBefAfterTimeBetween(String value1, String value2) {
            addCriterion("PRO_BEF_AFTER_TIME between", value1, value2, "proBefAfterTime");
            return (Criteria) this;
        }

        public Criteria andProBefAfterTimeNotBetween(String value1, String value2) {
            addCriterion("PRO_BEF_AFTER_TIME not between", value1, value2, "proBefAfterTime");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoTotalTimeIsNull() {
            addCriterion("DEMAND_HANGUO_TOTAL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoTotalTimeIsNotNull() {
            addCriterion("DEMAND_HANGUO_TOTAL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoTotalTimeEqualTo(String value) {
            addCriterion("DEMAND_HANGUO_TOTAL_TIME =", value, "demandHanguoTotalTime");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoTotalTimeNotEqualTo(String value) {
            addCriterion("DEMAND_HANGUO_TOTAL_TIME <>", value, "demandHanguoTotalTime");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoTotalTimeGreaterThan(String value) {
            addCriterion("DEMAND_HANGUO_TOTAL_TIME >", value, "demandHanguoTotalTime");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoTotalTimeGreaterThanOrEqualTo(String value) {
            addCriterion("DEMAND_HANGUO_TOTAL_TIME >=", value, "demandHanguoTotalTime");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoTotalTimeLessThan(String value) {
            addCriterion("DEMAND_HANGUO_TOTAL_TIME <", value, "demandHanguoTotalTime");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoTotalTimeLessThanOrEqualTo(String value) {
            addCriterion("DEMAND_HANGUO_TOTAL_TIME <=", value, "demandHanguoTotalTime");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoTotalTimeLike(String value) {
            addCriterion("DEMAND_HANGUO_TOTAL_TIME like", value, "demandHanguoTotalTime");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoTotalTimeNotLike(String value) {
            addCriterion("DEMAND_HANGUO_TOTAL_TIME not like", value, "demandHanguoTotalTime");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoTotalTimeIn(List<String> values) {
            addCriterion("DEMAND_HANGUO_TOTAL_TIME in", values, "demandHanguoTotalTime");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoTotalTimeNotIn(List<String> values) {
            addCriterion("DEMAND_HANGUO_TOTAL_TIME not in", values, "demandHanguoTotalTime");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoTotalTimeBetween(String value1, String value2) {
            addCriterion("DEMAND_HANGUO_TOTAL_TIME between", value1, value2, "demandHanguoTotalTime");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoTotalTimeNotBetween(String value1, String value2) {
            addCriterion("DEMAND_HANGUO_TOTAL_TIME not between", value1, value2, "demandHanguoTotalTime");
            return (Criteria) this;
        }

        public Criteria andPurDemandCareatDateIsNull() {
            addCriterion("PUR_DEMAND_CAREAT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPurDemandCareatDateIsNotNull() {
            addCriterion("PUR_DEMAND_CAREAT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPurDemandCareatDateEqualTo(Date value) {
            addCriterionForJDBCDate("PUR_DEMAND_CAREAT_DATE =", value, "purDemandCareatDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandCareatDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PUR_DEMAND_CAREAT_DATE <>", value, "purDemandCareatDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandCareatDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PUR_DEMAND_CAREAT_DATE >", value, "purDemandCareatDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandCareatDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PUR_DEMAND_CAREAT_DATE >=", value, "purDemandCareatDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandCareatDateLessThan(Date value) {
            addCriterionForJDBCDate("PUR_DEMAND_CAREAT_DATE <", value, "purDemandCareatDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandCareatDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PUR_DEMAND_CAREAT_DATE <=", value, "purDemandCareatDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandCareatDateIn(List<Date> values) {
            addCriterionForJDBCDate("PUR_DEMAND_CAREAT_DATE in", values, "purDemandCareatDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandCareatDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PUR_DEMAND_CAREAT_DATE not in", values, "purDemandCareatDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandCareatDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PUR_DEMAND_CAREAT_DATE between", value1, value2, "purDemandCareatDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandCareatDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PUR_DEMAND_CAREAT_DATE not between", value1, value2, "purDemandCareatDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandAllotDateIsNull() {
            addCriterion("PUR_DEMAND_ALLOT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPurDemandAllotDateIsNotNull() {
            addCriterion("PUR_DEMAND_ALLOT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPurDemandAllotDateEqualTo(Date value) {
            addCriterionForJDBCDate("PUR_DEMAND_ALLOT_DATE =", value, "purDemandAllotDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandAllotDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PUR_DEMAND_ALLOT_DATE <>", value, "purDemandAllotDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandAllotDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PUR_DEMAND_ALLOT_DATE >", value, "purDemandAllotDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandAllotDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PUR_DEMAND_ALLOT_DATE >=", value, "purDemandAllotDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandAllotDateLessThan(Date value) {
            addCriterionForJDBCDate("PUR_DEMAND_ALLOT_DATE <", value, "purDemandAllotDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandAllotDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PUR_DEMAND_ALLOT_DATE <=", value, "purDemandAllotDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandAllotDateIn(List<Date> values) {
            addCriterionForJDBCDate("PUR_DEMAND_ALLOT_DATE in", values, "purDemandAllotDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandAllotDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PUR_DEMAND_ALLOT_DATE not in", values, "purDemandAllotDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandAllotDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PUR_DEMAND_ALLOT_DATE between", value1, value2, "purDemandAllotDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandAllotDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PUR_DEMAND_ALLOT_DATE not between", value1, value2, "purDemandAllotDate");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoNumIsNull() {
            addCriterion("DEMAND_HANGUO_NUM is null");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoNumIsNotNull() {
            addCriterion("DEMAND_HANGUO_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoNumEqualTo(String value) {
            addCriterion("DEMAND_HANGUO_NUM =", value, "demandHanguoNum");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoNumNotEqualTo(String value) {
            addCriterion("DEMAND_HANGUO_NUM <>", value, "demandHanguoNum");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoNumGreaterThan(String value) {
            addCriterion("DEMAND_HANGUO_NUM >", value, "demandHanguoNum");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoNumGreaterThanOrEqualTo(String value) {
            addCriterion("DEMAND_HANGUO_NUM >=", value, "demandHanguoNum");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoNumLessThan(String value) {
            addCriterion("DEMAND_HANGUO_NUM <", value, "demandHanguoNum");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoNumLessThanOrEqualTo(String value) {
            addCriterion("DEMAND_HANGUO_NUM <=", value, "demandHanguoNum");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoNumLike(String value) {
            addCriterion("DEMAND_HANGUO_NUM like", value, "demandHanguoNum");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoNumNotLike(String value) {
            addCriterion("DEMAND_HANGUO_NUM not like", value, "demandHanguoNum");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoNumIn(List<String> values) {
            addCriterion("DEMAND_HANGUO_NUM in", values, "demandHanguoNum");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoNumNotIn(List<String> values) {
            addCriterion("DEMAND_HANGUO_NUM not in", values, "demandHanguoNum");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoNumBetween(String value1, String value2) {
            addCriterion("DEMAND_HANGUO_NUM between", value1, value2, "demandHanguoNum");
            return (Criteria) this;
        }

        public Criteria andDemandHanguoNumNotBetween(String value1, String value2) {
            addCriterion("DEMAND_HANGUO_NUM not between", value1, value2, "demandHanguoNum");
            return (Criteria) this;
        }

        public Criteria andDemandFirstHanguoStartdateIsNull() {
            addCriterion("DEMAND_FIRST_HANGUO_STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andDemandFirstHanguoStartdateIsNotNull() {
            addCriterion("DEMAND_FIRST_HANGUO_STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDemandFirstHanguoStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("DEMAND_FIRST_HANGUO_STARTDATE =", value, "demandFirstHanguoStartdate");
            return (Criteria) this;
        }

        public Criteria andDemandFirstHanguoStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DEMAND_FIRST_HANGUO_STARTDATE <>", value, "demandFirstHanguoStartdate");
            return (Criteria) this;
        }

        public Criteria andDemandFirstHanguoStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("DEMAND_FIRST_HANGUO_STARTDATE >", value, "demandFirstHanguoStartdate");
            return (Criteria) this;
        }

        public Criteria andDemandFirstHanguoStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEMAND_FIRST_HANGUO_STARTDATE >=", value, "demandFirstHanguoStartdate");
            return (Criteria) this;
        }

        public Criteria andDemandFirstHanguoStartdateLessThan(Date value) {
            addCriterionForJDBCDate("DEMAND_FIRST_HANGUO_STARTDATE <", value, "demandFirstHanguoStartdate");
            return (Criteria) this;
        }

        public Criteria andDemandFirstHanguoStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEMAND_FIRST_HANGUO_STARTDATE <=", value, "demandFirstHanguoStartdate");
            return (Criteria) this;
        }

        public Criteria andDemandFirstHanguoStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("DEMAND_FIRST_HANGUO_STARTDATE in", values, "demandFirstHanguoStartdate");
            return (Criteria) this;
        }

        public Criteria andDemandFirstHanguoStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DEMAND_FIRST_HANGUO_STARTDATE not in", values, "demandFirstHanguoStartdate");
            return (Criteria) this;
        }

        public Criteria andDemandFirstHanguoStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEMAND_FIRST_HANGUO_STARTDATE between", value1, value2, "demandFirstHanguoStartdate");
            return (Criteria) this;
        }

        public Criteria andDemandFirstHanguoStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEMAND_FIRST_HANGUO_STARTDATE not between", value1, value2, "demandFirstHanguoStartdate");
            return (Criteria) this;
        }

        public Criteria andDemandEndHanguoEnddateIsNull() {
            addCriterion("DEMAND_END_HANGUO_ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andDemandEndHanguoEnddateIsNotNull() {
            addCriterion("DEMAND_END_HANGUO_ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDemandEndHanguoEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("DEMAND_END_HANGUO_ENDDATE =", value, "demandEndHanguoEnddate");
            return (Criteria) this;
        }

        public Criteria andDemandEndHanguoEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DEMAND_END_HANGUO_ENDDATE <>", value, "demandEndHanguoEnddate");
            return (Criteria) this;
        }

        public Criteria andDemandEndHanguoEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("DEMAND_END_HANGUO_ENDDATE >", value, "demandEndHanguoEnddate");
            return (Criteria) this;
        }

        public Criteria andDemandEndHanguoEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEMAND_END_HANGUO_ENDDATE >=", value, "demandEndHanguoEnddate");
            return (Criteria) this;
        }

        public Criteria andDemandEndHanguoEnddateLessThan(Date value) {
            addCriterionForJDBCDate("DEMAND_END_HANGUO_ENDDATE <", value, "demandEndHanguoEnddate");
            return (Criteria) this;
        }

        public Criteria andDemandEndHanguoEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEMAND_END_HANGUO_ENDDATE <=", value, "demandEndHanguoEnddate");
            return (Criteria) this;
        }

        public Criteria andDemandEndHanguoEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("DEMAND_END_HANGUO_ENDDATE in", values, "demandEndHanguoEnddate");
            return (Criteria) this;
        }

        public Criteria andDemandEndHanguoEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DEMAND_END_HANGUO_ENDDATE not in", values, "demandEndHanguoEnddate");
            return (Criteria) this;
        }

        public Criteria andDemandEndHanguoEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEMAND_END_HANGUO_ENDDATE between", value1, value2, "demandEndHanguoEnddate");
            return (Criteria) this;
        }

        public Criteria andDemandEndHanguoEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEMAND_END_HANGUO_ENDDATE not between", value1, value2, "demandEndHanguoEnddate");
            return (Criteria) this;
        }

        public Criteria andSchSubmitDateIsNull() {
            addCriterion("SCH_SUBMIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSchSubmitDateIsNotNull() {
            addCriterion("SCH_SUBMIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSchSubmitDateEqualTo(Date value) {
            addCriterionForJDBCDate("SCH_SUBMIT_DATE =", value, "schSubmitDate");
            return (Criteria) this;
        }

        public Criteria andSchSubmitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SCH_SUBMIT_DATE <>", value, "schSubmitDate");
            return (Criteria) this;
        }

        public Criteria andSchSubmitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("SCH_SUBMIT_DATE >", value, "schSubmitDate");
            return (Criteria) this;
        }

        public Criteria andSchSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SCH_SUBMIT_DATE >=", value, "schSubmitDate");
            return (Criteria) this;
        }

        public Criteria andSchSubmitDateLessThan(Date value) {
            addCriterionForJDBCDate("SCH_SUBMIT_DATE <", value, "schSubmitDate");
            return (Criteria) this;
        }

        public Criteria andSchSubmitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SCH_SUBMIT_DATE <=", value, "schSubmitDate");
            return (Criteria) this;
        }

        public Criteria andSchSubmitDateIn(List<Date> values) {
            addCriterionForJDBCDate("SCH_SUBMIT_DATE in", values, "schSubmitDate");
            return (Criteria) this;
        }

        public Criteria andSchSubmitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SCH_SUBMIT_DATE not in", values, "schSubmitDate");
            return (Criteria) this;
        }

        public Criteria andSchSubmitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SCH_SUBMIT_DATE between", value1, value2, "schSubmitDate");
            return (Criteria) this;
        }

        public Criteria andSchSubmitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SCH_SUBMIT_DATE not between", value1, value2, "schSubmitDate");
            return (Criteria) this;
        }

        public Criteria andSchApprovePassDateIsNull() {
            addCriterion("SCH_APPROVE_PASS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSchApprovePassDateIsNotNull() {
            addCriterion("SCH_APPROVE_PASS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSchApprovePassDateEqualTo(Date value) {
            addCriterionForJDBCDate("SCH_APPROVE_PASS_DATE =", value, "schApprovePassDate");
            return (Criteria) this;
        }

        public Criteria andSchApprovePassDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SCH_APPROVE_PASS_DATE <>", value, "schApprovePassDate");
            return (Criteria) this;
        }

        public Criteria andSchApprovePassDateGreaterThan(Date value) {
            addCriterionForJDBCDate("SCH_APPROVE_PASS_DATE >", value, "schApprovePassDate");
            return (Criteria) this;
        }

        public Criteria andSchApprovePassDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SCH_APPROVE_PASS_DATE >=", value, "schApprovePassDate");
            return (Criteria) this;
        }

        public Criteria andSchApprovePassDateLessThan(Date value) {
            addCriterionForJDBCDate("SCH_APPROVE_PASS_DATE <", value, "schApprovePassDate");
            return (Criteria) this;
        }

        public Criteria andSchApprovePassDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SCH_APPROVE_PASS_DATE <=", value, "schApprovePassDate");
            return (Criteria) this;
        }

        public Criteria andSchApprovePassDateIn(List<Date> values) {
            addCriterionForJDBCDate("SCH_APPROVE_PASS_DATE in", values, "schApprovePassDate");
            return (Criteria) this;
        }

        public Criteria andSchApprovePassDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SCH_APPROVE_PASS_DATE not in", values, "schApprovePassDate");
            return (Criteria) this;
        }

        public Criteria andSchApprovePassDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SCH_APPROVE_PASS_DATE between", value1, value2, "schApprovePassDate");
            return (Criteria) this;
        }

        public Criteria andSchApprovePassDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SCH_APPROVE_PASS_DATE not between", value1, value2, "schApprovePassDate");
            return (Criteria) this;
        }

        public Criteria andSchEsSetDateIsNull() {
            addCriterion("SCH_ES_SET_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSchEsSetDateIsNotNull() {
            addCriterion("SCH_ES_SET_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSchEsSetDateEqualTo(Date value) {
            addCriterionForJDBCDate("SCH_ES_SET_DATE =", value, "schEsSetDate");
            return (Criteria) this;
        }

        public Criteria andSchEsSetDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SCH_ES_SET_DATE <>", value, "schEsSetDate");
            return (Criteria) this;
        }

        public Criteria andSchEsSetDateGreaterThan(Date value) {
            addCriterionForJDBCDate("SCH_ES_SET_DATE >", value, "schEsSetDate");
            return (Criteria) this;
        }

        public Criteria andSchEsSetDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SCH_ES_SET_DATE >=", value, "schEsSetDate");
            return (Criteria) this;
        }

        public Criteria andSchEsSetDateLessThan(Date value) {
            addCriterionForJDBCDate("SCH_ES_SET_DATE <", value, "schEsSetDate");
            return (Criteria) this;
        }

        public Criteria andSchEsSetDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SCH_ES_SET_DATE <=", value, "schEsSetDate");
            return (Criteria) this;
        }

        public Criteria andSchEsSetDateIn(List<Date> values) {
            addCriterionForJDBCDate("SCH_ES_SET_DATE in", values, "schEsSetDate");
            return (Criteria) this;
        }

        public Criteria andSchEsSetDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SCH_ES_SET_DATE not in", values, "schEsSetDate");
            return (Criteria) this;
        }

        public Criteria andSchEsSetDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SCH_ES_SET_DATE between", value1, value2, "schEsSetDate");
            return (Criteria) this;
        }

        public Criteria andSchEsSetDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SCH_ES_SET_DATE not between", value1, value2, "schEsSetDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateIsNull() {
            addCriterion("ANNOUNCEMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateIsNotNull() {
            addCriterion("ANNOUNCEMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateEqualTo(Date value) {
            addCriterionForJDBCDate("ANNOUNCEMENT_DATE =", value, "announcementDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ANNOUNCEMENT_DATE <>", value, "announcementDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ANNOUNCEMENT_DATE >", value, "announcementDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ANNOUNCEMENT_DATE >=", value, "announcementDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateLessThan(Date value) {
            addCriterionForJDBCDate("ANNOUNCEMENT_DATE <", value, "announcementDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ANNOUNCEMENT_DATE <=", value, "announcementDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateIn(List<Date> values) {
            addCriterionForJDBCDate("ANNOUNCEMENT_DATE in", values, "announcementDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ANNOUNCEMENT_DATE not in", values, "announcementDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ANNOUNCEMENT_DATE between", value1, value2, "announcementDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ANNOUNCEMENT_DATE not between", value1, value2, "announcementDate");
            return (Criteria) this;
        }

        public Criteria andBidDocBuyEnddateIsNull() {
            addCriterion("BID_DOC_BUY_ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andBidDocBuyEnddateIsNotNull() {
            addCriterion("BID_DOC_BUY_ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBidDocBuyEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("BID_DOC_BUY_ENDDATE =", value, "bidDocBuyEnddate");
            return (Criteria) this;
        }

        public Criteria andBidDocBuyEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BID_DOC_BUY_ENDDATE <>", value, "bidDocBuyEnddate");
            return (Criteria) this;
        }

        public Criteria andBidDocBuyEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("BID_DOC_BUY_ENDDATE >", value, "bidDocBuyEnddate");
            return (Criteria) this;
        }

        public Criteria andBidDocBuyEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BID_DOC_BUY_ENDDATE >=", value, "bidDocBuyEnddate");
            return (Criteria) this;
        }

        public Criteria andBidDocBuyEnddateLessThan(Date value) {
            addCriterionForJDBCDate("BID_DOC_BUY_ENDDATE <", value, "bidDocBuyEnddate");
            return (Criteria) this;
        }

        public Criteria andBidDocBuyEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BID_DOC_BUY_ENDDATE <=", value, "bidDocBuyEnddate");
            return (Criteria) this;
        }

        public Criteria andBidDocBuyEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("BID_DOC_BUY_ENDDATE in", values, "bidDocBuyEnddate");
            return (Criteria) this;
        }

        public Criteria andBidDocBuyEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BID_DOC_BUY_ENDDATE not in", values, "bidDocBuyEnddate");
            return (Criteria) this;
        }

        public Criteria andBidDocBuyEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BID_DOC_BUY_ENDDATE between", value1, value2, "bidDocBuyEnddate");
            return (Criteria) this;
        }

        public Criteria andBidDocBuyEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BID_DOC_BUY_ENDDATE not between", value1, value2, "bidDocBuyEnddate");
            return (Criteria) this;
        }

        public Criteria andBidReplyEndateIsNull() {
            addCriterion("BID_REPLY_ENDATE is null");
            return (Criteria) this;
        }

        public Criteria andBidReplyEndateIsNotNull() {
            addCriterion("BID_REPLY_ENDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBidReplyEndateEqualTo(Date value) {
            addCriterionForJDBCDate("BID_REPLY_ENDATE =", value, "bidReplyEndate");
            return (Criteria) this;
        }

        public Criteria andBidReplyEndateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BID_REPLY_ENDATE <>", value, "bidReplyEndate");
            return (Criteria) this;
        }

        public Criteria andBidReplyEndateGreaterThan(Date value) {
            addCriterionForJDBCDate("BID_REPLY_ENDATE >", value, "bidReplyEndate");
            return (Criteria) this;
        }

        public Criteria andBidReplyEndateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BID_REPLY_ENDATE >=", value, "bidReplyEndate");
            return (Criteria) this;
        }

        public Criteria andBidReplyEndateLessThan(Date value) {
            addCriterionForJDBCDate("BID_REPLY_ENDATE <", value, "bidReplyEndate");
            return (Criteria) this;
        }

        public Criteria andBidReplyEndateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BID_REPLY_ENDATE <=", value, "bidReplyEndate");
            return (Criteria) this;
        }

        public Criteria andBidReplyEndateIn(List<Date> values) {
            addCriterionForJDBCDate("BID_REPLY_ENDATE in", values, "bidReplyEndate");
            return (Criteria) this;
        }

        public Criteria andBidReplyEndateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BID_REPLY_ENDATE not in", values, "bidReplyEndate");
            return (Criteria) this;
        }

        public Criteria andBidReplyEndateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BID_REPLY_ENDATE between", value1, value2, "bidReplyEndate");
            return (Criteria) this;
        }

        public Criteria andBidReplyEndateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BID_REPLY_ENDATE not between", value1, value2, "bidReplyEndate");
            return (Criteria) this;
        }

        public Criteria andBidReviewEnddateIsNull() {
            addCriterion("BID_REVIEW_ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andBidReviewEnddateIsNotNull() {
            addCriterion("BID_REVIEW_ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBidReviewEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("BID_REVIEW_ENDDATE =", value, "bidReviewEnddate");
            return (Criteria) this;
        }

        public Criteria andBidReviewEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BID_REVIEW_ENDDATE <>", value, "bidReviewEnddate");
            return (Criteria) this;
        }

        public Criteria andBidReviewEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("BID_REVIEW_ENDDATE >", value, "bidReviewEnddate");
            return (Criteria) this;
        }

        public Criteria andBidReviewEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BID_REVIEW_ENDDATE >=", value, "bidReviewEnddate");
            return (Criteria) this;
        }

        public Criteria andBidReviewEnddateLessThan(Date value) {
            addCriterionForJDBCDate("BID_REVIEW_ENDDATE <", value, "bidReviewEnddate");
            return (Criteria) this;
        }

        public Criteria andBidReviewEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BID_REVIEW_ENDDATE <=", value, "bidReviewEnddate");
            return (Criteria) this;
        }

        public Criteria andBidReviewEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("BID_REVIEW_ENDDATE in", values, "bidReviewEnddate");
            return (Criteria) this;
        }

        public Criteria andBidReviewEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BID_REVIEW_ENDDATE not in", values, "bidReviewEnddate");
            return (Criteria) this;
        }

        public Criteria andBidReviewEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BID_REVIEW_ENDDATE between", value1, value2, "bidReviewEnddate");
            return (Criteria) this;
        }

        public Criteria andBidReviewEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BID_REVIEW_ENDDATE not between", value1, value2, "bidReviewEnddate");
            return (Criteria) this;
        }

        public Criteria andBidConfirmResDateIsNull() {
            addCriterion("BID_CONFIRM_RES_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBidConfirmResDateIsNotNull() {
            addCriterion("BID_CONFIRM_RES_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBidConfirmResDateEqualTo(Date value) {
            addCriterionForJDBCDate("BID_CONFIRM_RES_DATE =", value, "bidConfirmResDate");
            return (Criteria) this;
        }

        public Criteria andBidConfirmResDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BID_CONFIRM_RES_DATE <>", value, "bidConfirmResDate");
            return (Criteria) this;
        }

        public Criteria andBidConfirmResDateGreaterThan(Date value) {
            addCriterionForJDBCDate("BID_CONFIRM_RES_DATE >", value, "bidConfirmResDate");
            return (Criteria) this;
        }

        public Criteria andBidConfirmResDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BID_CONFIRM_RES_DATE >=", value, "bidConfirmResDate");
            return (Criteria) this;
        }

        public Criteria andBidConfirmResDateLessThan(Date value) {
            addCriterionForJDBCDate("BID_CONFIRM_RES_DATE <", value, "bidConfirmResDate");
            return (Criteria) this;
        }

        public Criteria andBidConfirmResDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BID_CONFIRM_RES_DATE <=", value, "bidConfirmResDate");
            return (Criteria) this;
        }

        public Criteria andBidConfirmResDateIn(List<Date> values) {
            addCriterionForJDBCDate("BID_CONFIRM_RES_DATE in", values, "bidConfirmResDate");
            return (Criteria) this;
        }

        public Criteria andBidConfirmResDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BID_CONFIRM_RES_DATE not in", values, "bidConfirmResDate");
            return (Criteria) this;
        }

        public Criteria andBidConfirmResDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BID_CONFIRM_RES_DATE between", value1, value2, "bidConfirmResDate");
            return (Criteria) this;
        }

        public Criteria andBidConfirmResDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BID_CONFIRM_RES_DATE not between", value1, value2, "bidConfirmResDate");
            return (Criteria) this;
        }

        public Criteria andPurResSubmitDateIsNull() {
            addCriterion("PUR_RES_SUBMIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPurResSubmitDateIsNotNull() {
            addCriterion("PUR_RES_SUBMIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPurResSubmitDateEqualTo(Date value) {
            addCriterionForJDBCDate("PUR_RES_SUBMIT_DATE =", value, "purResSubmitDate");
            return (Criteria) this;
        }

        public Criteria andPurResSubmitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PUR_RES_SUBMIT_DATE <>", value, "purResSubmitDate");
            return (Criteria) this;
        }

        public Criteria andPurResSubmitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PUR_RES_SUBMIT_DATE >", value, "purResSubmitDate");
            return (Criteria) this;
        }

        public Criteria andPurResSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PUR_RES_SUBMIT_DATE >=", value, "purResSubmitDate");
            return (Criteria) this;
        }

        public Criteria andPurResSubmitDateLessThan(Date value) {
            addCriterionForJDBCDate("PUR_RES_SUBMIT_DATE <", value, "purResSubmitDate");
            return (Criteria) this;
        }

        public Criteria andPurResSubmitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PUR_RES_SUBMIT_DATE <=", value, "purResSubmitDate");
            return (Criteria) this;
        }

        public Criteria andPurResSubmitDateIn(List<Date> values) {
            addCriterionForJDBCDate("PUR_RES_SUBMIT_DATE in", values, "purResSubmitDate");
            return (Criteria) this;
        }

        public Criteria andPurResSubmitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PUR_RES_SUBMIT_DATE not in", values, "purResSubmitDate");
            return (Criteria) this;
        }

        public Criteria andPurResSubmitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PUR_RES_SUBMIT_DATE between", value1, value2, "purResSubmitDate");
            return (Criteria) this;
        }

        public Criteria andPurResSubmitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PUR_RES_SUBMIT_DATE not between", value1, value2, "purResSubmitDate");
            return (Criteria) this;
        }

        public Criteria andPurResApproveDateIsNull() {
            addCriterion("PUR_RES_APPROVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPurResApproveDateIsNotNull() {
            addCriterion("PUR_RES_APPROVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPurResApproveDateEqualTo(Date value) {
            addCriterionForJDBCDate("PUR_RES_APPROVE_DATE =", value, "purResApproveDate");
            return (Criteria) this;
        }

        public Criteria andPurResApproveDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PUR_RES_APPROVE_DATE <>", value, "purResApproveDate");
            return (Criteria) this;
        }

        public Criteria andPurResApproveDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PUR_RES_APPROVE_DATE >", value, "purResApproveDate");
            return (Criteria) this;
        }

        public Criteria andPurResApproveDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PUR_RES_APPROVE_DATE >=", value, "purResApproveDate");
            return (Criteria) this;
        }

        public Criteria andPurResApproveDateLessThan(Date value) {
            addCriterionForJDBCDate("PUR_RES_APPROVE_DATE <", value, "purResApproveDate");
            return (Criteria) this;
        }

        public Criteria andPurResApproveDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PUR_RES_APPROVE_DATE <=", value, "purResApproveDate");
            return (Criteria) this;
        }

        public Criteria andPurResApproveDateIn(List<Date> values) {
            addCriterionForJDBCDate("PUR_RES_APPROVE_DATE in", values, "purResApproveDate");
            return (Criteria) this;
        }

        public Criteria andPurResApproveDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PUR_RES_APPROVE_DATE not in", values, "purResApproveDate");
            return (Criteria) this;
        }

        public Criteria andPurResApproveDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PUR_RES_APPROVE_DATE between", value1, value2, "purResApproveDate");
            return (Criteria) this;
        }

        public Criteria andPurResApproveDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PUR_RES_APPROVE_DATE not between", value1, value2, "purResApproveDate");
            return (Criteria) this;
        }

        public Criteria andEsProjectEndDateIsNull() {
            addCriterion("ES_PROJECT_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEsProjectEndDateIsNotNull() {
            addCriterion("ES_PROJECT_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEsProjectEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("ES_PROJECT_END_DATE =", value, "esProjectEndDate");
            return (Criteria) this;
        }

        public Criteria andEsProjectEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ES_PROJECT_END_DATE <>", value, "esProjectEndDate");
            return (Criteria) this;
        }

        public Criteria andEsProjectEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ES_PROJECT_END_DATE >", value, "esProjectEndDate");
            return (Criteria) this;
        }

        public Criteria andEsProjectEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ES_PROJECT_END_DATE >=", value, "esProjectEndDate");
            return (Criteria) this;
        }

        public Criteria andEsProjectEndDateLessThan(Date value) {
            addCriterionForJDBCDate("ES_PROJECT_END_DATE <", value, "esProjectEndDate");
            return (Criteria) this;
        }

        public Criteria andEsProjectEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ES_PROJECT_END_DATE <=", value, "esProjectEndDate");
            return (Criteria) this;
        }

        public Criteria andEsProjectEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("ES_PROJECT_END_DATE in", values, "esProjectEndDate");
            return (Criteria) this;
        }

        public Criteria andEsProjectEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ES_PROJECT_END_DATE not in", values, "esProjectEndDate");
            return (Criteria) this;
        }

        public Criteria andEsProjectEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ES_PROJECT_END_DATE between", value1, value2, "esProjectEndDate");
            return (Criteria) this;
        }

        public Criteria andEsProjectEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ES_PROJECT_END_DATE not between", value1, value2, "esProjectEndDate");
            return (Criteria) this;
        }

        public Criteria andIsSignFrameContractIsNull() {
            addCriterion("IS_SIGN_FRAME_CONTRACT is null");
            return (Criteria) this;
        }

        public Criteria andIsSignFrameContractIsNotNull() {
            addCriterion("IS_SIGN_FRAME_CONTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andIsSignFrameContractEqualTo(String value) {
            addCriterion("IS_SIGN_FRAME_CONTRACT =", value, "isSignFrameContract");
            return (Criteria) this;
        }

        public Criteria andIsSignFrameContractNotEqualTo(String value) {
            addCriterion("IS_SIGN_FRAME_CONTRACT <>", value, "isSignFrameContract");
            return (Criteria) this;
        }

        public Criteria andIsSignFrameContractGreaterThan(String value) {
            addCriterion("IS_SIGN_FRAME_CONTRACT >", value, "isSignFrameContract");
            return (Criteria) this;
        }

        public Criteria andIsSignFrameContractGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SIGN_FRAME_CONTRACT >=", value, "isSignFrameContract");
            return (Criteria) this;
        }

        public Criteria andIsSignFrameContractLessThan(String value) {
            addCriterion("IS_SIGN_FRAME_CONTRACT <", value, "isSignFrameContract");
            return (Criteria) this;
        }

        public Criteria andIsSignFrameContractLessThanOrEqualTo(String value) {
            addCriterion("IS_SIGN_FRAME_CONTRACT <=", value, "isSignFrameContract");
            return (Criteria) this;
        }

        public Criteria andIsSignFrameContractLike(String value) {
            addCriterion("IS_SIGN_FRAME_CONTRACT like", value, "isSignFrameContract");
            return (Criteria) this;
        }

        public Criteria andIsSignFrameContractNotLike(String value) {
            addCriterion("IS_SIGN_FRAME_CONTRACT not like", value, "isSignFrameContract");
            return (Criteria) this;
        }

        public Criteria andIsSignFrameContractIn(List<String> values) {
            addCriterion("IS_SIGN_FRAME_CONTRACT in", values, "isSignFrameContract");
            return (Criteria) this;
        }

        public Criteria andIsSignFrameContractNotIn(List<String> values) {
            addCriterion("IS_SIGN_FRAME_CONTRACT not in", values, "isSignFrameContract");
            return (Criteria) this;
        }

        public Criteria andIsSignFrameContractBetween(String value1, String value2) {
            addCriterion("IS_SIGN_FRAME_CONTRACT between", value1, value2, "isSignFrameContract");
            return (Criteria) this;
        }

        public Criteria andIsSignFrameContractNotBetween(String value1, String value2) {
            addCriterion("IS_SIGN_FRAME_CONTRACT not between", value1, value2, "isSignFrameContract");
            return (Criteria) this;
        }

        public Criteria andCmDraftDateIsNull() {
            addCriterion("CM_DRAFT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCmDraftDateIsNotNull() {
            addCriterion("CM_DRAFT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmDraftDateEqualTo(Date value) {
            addCriterionForJDBCDate("CM_DRAFT_DATE =", value, "cmDraftDate");
            return (Criteria) this;
        }

        public Criteria andCmDraftDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CM_DRAFT_DATE <>", value, "cmDraftDate");
            return (Criteria) this;
        }

        public Criteria andCmDraftDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CM_DRAFT_DATE >", value, "cmDraftDate");
            return (Criteria) this;
        }

        public Criteria andCmDraftDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CM_DRAFT_DATE >=", value, "cmDraftDate");
            return (Criteria) this;
        }

        public Criteria andCmDraftDateLessThan(Date value) {
            addCriterionForJDBCDate("CM_DRAFT_DATE <", value, "cmDraftDate");
            return (Criteria) this;
        }

        public Criteria andCmDraftDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CM_DRAFT_DATE <=", value, "cmDraftDate");
            return (Criteria) this;
        }

        public Criteria andCmDraftDateIn(List<Date> values) {
            addCriterionForJDBCDate("CM_DRAFT_DATE in", values, "cmDraftDate");
            return (Criteria) this;
        }

        public Criteria andCmDraftDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CM_DRAFT_DATE not in", values, "cmDraftDate");
            return (Criteria) this;
        }

        public Criteria andCmDraftDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CM_DRAFT_DATE between", value1, value2, "cmDraftDate");
            return (Criteria) this;
        }

        public Criteria andCmDraftDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CM_DRAFT_DATE not between", value1, value2, "cmDraftDate");
            return (Criteria) this;
        }

        public Criteria andCmCreateDateIsNull() {
            addCriterion("CM_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCmCreateDateIsNotNull() {
            addCriterion("CM_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("CM_CREATE_DATE =", value, "cmCreateDate");
            return (Criteria) this;
        }

        public Criteria andCmCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CM_CREATE_DATE <>", value, "cmCreateDate");
            return (Criteria) this;
        }

        public Criteria andCmCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CM_CREATE_DATE >", value, "cmCreateDate");
            return (Criteria) this;
        }

        public Criteria andCmCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CM_CREATE_DATE >=", value, "cmCreateDate");
            return (Criteria) this;
        }

        public Criteria andCmCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("CM_CREATE_DATE <", value, "cmCreateDate");
            return (Criteria) this;
        }

        public Criteria andCmCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CM_CREATE_DATE <=", value, "cmCreateDate");
            return (Criteria) this;
        }

        public Criteria andCmCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("CM_CREATE_DATE in", values, "cmCreateDate");
            return (Criteria) this;
        }

        public Criteria andCmCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CM_CREATE_DATE not in", values, "cmCreateDate");
            return (Criteria) this;
        }

        public Criteria andCmCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CM_CREATE_DATE between", value1, value2, "cmCreateDate");
            return (Criteria) this;
        }

        public Criteria andCmCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CM_CREATE_DATE not between", value1, value2, "cmCreateDate");
            return (Criteria) this;
        }

        public Criteria andCmApproveDateIsNull() {
            addCriterion("CM_APPROVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCmApproveDateIsNotNull() {
            addCriterion("CM_APPROVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmApproveDateEqualTo(Date value) {
            addCriterionForJDBCDate("CM_APPROVE_DATE =", value, "cmApproveDate");
            return (Criteria) this;
        }

        public Criteria andCmApproveDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CM_APPROVE_DATE <>", value, "cmApproveDate");
            return (Criteria) this;
        }

        public Criteria andCmApproveDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CM_APPROVE_DATE >", value, "cmApproveDate");
            return (Criteria) this;
        }

        public Criteria andCmApproveDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CM_APPROVE_DATE >=", value, "cmApproveDate");
            return (Criteria) this;
        }

        public Criteria andCmApproveDateLessThan(Date value) {
            addCriterionForJDBCDate("CM_APPROVE_DATE <", value, "cmApproveDate");
            return (Criteria) this;
        }

        public Criteria andCmApproveDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CM_APPROVE_DATE <=", value, "cmApproveDate");
            return (Criteria) this;
        }

        public Criteria andCmApproveDateIn(List<Date> values) {
            addCriterionForJDBCDate("CM_APPROVE_DATE in", values, "cmApproveDate");
            return (Criteria) this;
        }

        public Criteria andCmApproveDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CM_APPROVE_DATE not in", values, "cmApproveDate");
            return (Criteria) this;
        }

        public Criteria andCmApproveDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CM_APPROVE_DATE between", value1, value2, "cmApproveDate");
            return (Criteria) this;
        }

        public Criteria andCmApproveDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CM_APPROVE_DATE not between", value1, value2, "cmApproveDate");
            return (Criteria) this;
        }

        public Criteria andContractValidDateIsNull() {
            addCriterion("CONTRACT_VALID_DATE is null");
            return (Criteria) this;
        }

        public Criteria andContractValidDateIsNotNull() {
            addCriterion("CONTRACT_VALID_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andContractValidDateEqualTo(Date value) {
            addCriterionForJDBCDate("CONTRACT_VALID_DATE =", value, "contractValidDate");
            return (Criteria) this;
        }

        public Criteria andContractValidDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CONTRACT_VALID_DATE <>", value, "contractValidDate");
            return (Criteria) this;
        }

        public Criteria andContractValidDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CONTRACT_VALID_DATE >", value, "contractValidDate");
            return (Criteria) this;
        }

        public Criteria andContractValidDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CONTRACT_VALID_DATE >=", value, "contractValidDate");
            return (Criteria) this;
        }

        public Criteria andContractValidDateLessThan(Date value) {
            addCriterionForJDBCDate("CONTRACT_VALID_DATE <", value, "contractValidDate");
            return (Criteria) this;
        }

        public Criteria andContractValidDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CONTRACT_VALID_DATE <=", value, "contractValidDate");
            return (Criteria) this;
        }

        public Criteria andContractValidDateIn(List<Date> values) {
            addCriterionForJDBCDate("CONTRACT_VALID_DATE in", values, "contractValidDate");
            return (Criteria) this;
        }

        public Criteria andContractValidDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CONTRACT_VALID_DATE not in", values, "contractValidDate");
            return (Criteria) this;
        }

        public Criteria andContractValidDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CONTRACT_VALID_DATE between", value1, value2, "contractValidDate");
            return (Criteria) this;
        }

        public Criteria andContractValidDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CONTRACT_VALID_DATE not between", value1, value2, "contractValidDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateIsNull() {
            addCriterion("CM_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCmStartDateIsNotNull() {
            addCriterion("CM_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("CM_START_DATE =", value, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CM_START_DATE <>", value, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CM_START_DATE >", value, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CM_START_DATE >=", value, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateLessThan(Date value) {
            addCriterionForJDBCDate("CM_START_DATE <", value, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CM_START_DATE <=", value, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("CM_START_DATE in", values, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CM_START_DATE not in", values, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CM_START_DATE between", value1, value2, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CM_START_DATE not between", value1, value2, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateIsNull() {
            addCriterion("CM_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCmEndDateIsNotNull() {
            addCriterion("CM_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("CM_END_DATE =", value, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CM_END_DATE <>", value, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CM_END_DATE >", value, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CM_END_DATE >=", value, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateLessThan(Date value) {
            addCriterionForJDBCDate("CM_END_DATE <", value, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CM_END_DATE <=", value, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("CM_END_DATE in", values, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CM_END_DATE not in", values, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CM_END_DATE between", value1, value2, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CM_END_DATE not between", value1, value2, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andPurDemandStatusIsNull() {
            addCriterion("PUR_DEMAND_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPurDemandStatusIsNotNull() {
            addCriterion("PUR_DEMAND_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPurDemandStatusEqualTo(String value) {
            addCriterion("PUR_DEMAND_STATUS =", value, "purDemandStatus");
            return (Criteria) this;
        }

        public Criteria andPurDemandStatusNotEqualTo(String value) {
            addCriterion("PUR_DEMAND_STATUS <>", value, "purDemandStatus");
            return (Criteria) this;
        }

        public Criteria andPurDemandStatusGreaterThan(String value) {
            addCriterion("PUR_DEMAND_STATUS >", value, "purDemandStatus");
            return (Criteria) this;
        }

        public Criteria andPurDemandStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PUR_DEMAND_STATUS >=", value, "purDemandStatus");
            return (Criteria) this;
        }

        public Criteria andPurDemandStatusLessThan(String value) {
            addCriterion("PUR_DEMAND_STATUS <", value, "purDemandStatus");
            return (Criteria) this;
        }

        public Criteria andPurDemandStatusLessThanOrEqualTo(String value) {
            addCriterion("PUR_DEMAND_STATUS <=", value, "purDemandStatus");
            return (Criteria) this;
        }

        public Criteria andPurDemandStatusLike(String value) {
            addCriterion("PUR_DEMAND_STATUS like", value, "purDemandStatus");
            return (Criteria) this;
        }

        public Criteria andPurDemandStatusNotLike(String value) {
            addCriterion("PUR_DEMAND_STATUS not like", value, "purDemandStatus");
            return (Criteria) this;
        }

        public Criteria andPurDemandStatusIn(List<String> values) {
            addCriterion("PUR_DEMAND_STATUS in", values, "purDemandStatus");
            return (Criteria) this;
        }

        public Criteria andPurDemandStatusNotIn(List<String> values) {
            addCriterion("PUR_DEMAND_STATUS not in", values, "purDemandStatus");
            return (Criteria) this;
        }

        public Criteria andPurDemandStatusBetween(String value1, String value2) {
            addCriterion("PUR_DEMAND_STATUS between", value1, value2, "purDemandStatus");
            return (Criteria) this;
        }

        public Criteria andPurDemandStatusNotBetween(String value1, String value2) {
            addCriterion("PUR_DEMAND_STATUS not between", value1, value2, "purDemandStatus");
            return (Criteria) this;
        }

        public Criteria andTotalFlowLinkTimeIsNull() {
            addCriterion("TOTAL_FLOW_LINK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTotalFlowLinkTimeIsNotNull() {
            addCriterion("TOTAL_FLOW_LINK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFlowLinkTimeEqualTo(String value) {
            addCriterion("TOTAL_FLOW_LINK_TIME =", value, "totalFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andTotalFlowLinkTimeNotEqualTo(String value) {
            addCriterion("TOTAL_FLOW_LINK_TIME <>", value, "totalFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andTotalFlowLinkTimeGreaterThan(String value) {
            addCriterion("TOTAL_FLOW_LINK_TIME >", value, "totalFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andTotalFlowLinkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL_FLOW_LINK_TIME >=", value, "totalFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andTotalFlowLinkTimeLessThan(String value) {
            addCriterion("TOTAL_FLOW_LINK_TIME <", value, "totalFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andTotalFlowLinkTimeLessThanOrEqualTo(String value) {
            addCriterion("TOTAL_FLOW_LINK_TIME <=", value, "totalFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andTotalFlowLinkTimeLike(String value) {
            addCriterion("TOTAL_FLOW_LINK_TIME like", value, "totalFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andTotalFlowLinkTimeNotLike(String value) {
            addCriterion("TOTAL_FLOW_LINK_TIME not like", value, "totalFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andTotalFlowLinkTimeIn(List<String> values) {
            addCriterion("TOTAL_FLOW_LINK_TIME in", values, "totalFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andTotalFlowLinkTimeNotIn(List<String> values) {
            addCriterion("TOTAL_FLOW_LINK_TIME not in", values, "totalFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andTotalFlowLinkTimeBetween(String value1, String value2) {
            addCriterion("TOTAL_FLOW_LINK_TIME between", value1, value2, "totalFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andTotalFlowLinkTimeNotBetween(String value1, String value2) {
            addCriterion("TOTAL_FLOW_LINK_TIME not between", value1, value2, "totalFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andDemandFlowLinkTimeIsNull() {
            addCriterion("DEMAND_FLOW_LINK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDemandFlowLinkTimeIsNotNull() {
            addCriterion("DEMAND_FLOW_LINK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDemandFlowLinkTimeEqualTo(String value) {
            addCriterion("DEMAND_FLOW_LINK_TIME =", value, "demandFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andDemandFlowLinkTimeNotEqualTo(String value) {
            addCriterion("DEMAND_FLOW_LINK_TIME <>", value, "demandFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andDemandFlowLinkTimeGreaterThan(String value) {
            addCriterion("DEMAND_FLOW_LINK_TIME >", value, "demandFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andDemandFlowLinkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("DEMAND_FLOW_LINK_TIME >=", value, "demandFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andDemandFlowLinkTimeLessThan(String value) {
            addCriterion("DEMAND_FLOW_LINK_TIME <", value, "demandFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andDemandFlowLinkTimeLessThanOrEqualTo(String value) {
            addCriterion("DEMAND_FLOW_LINK_TIME <=", value, "demandFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andDemandFlowLinkTimeLike(String value) {
            addCriterion("DEMAND_FLOW_LINK_TIME like", value, "demandFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andDemandFlowLinkTimeNotLike(String value) {
            addCriterion("DEMAND_FLOW_LINK_TIME not like", value, "demandFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andDemandFlowLinkTimeIn(List<String> values) {
            addCriterion("DEMAND_FLOW_LINK_TIME in", values, "demandFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andDemandFlowLinkTimeNotIn(List<String> values) {
            addCriterion("DEMAND_FLOW_LINK_TIME not in", values, "demandFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andDemandFlowLinkTimeBetween(String value1, String value2) {
            addCriterion("DEMAND_FLOW_LINK_TIME between", value1, value2, "demandFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andDemandFlowLinkTimeNotBetween(String value1, String value2) {
            addCriterion("DEMAND_FLOW_LINK_TIME not between", value1, value2, "demandFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andSchFlowLinkTimeIsNull() {
            addCriterion("SCH_FLOW_LINK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSchFlowLinkTimeIsNotNull() {
            addCriterion("SCH_FLOW_LINK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSchFlowLinkTimeEqualTo(String value) {
            addCriterion("SCH_FLOW_LINK_TIME =", value, "schFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andSchFlowLinkTimeNotEqualTo(String value) {
            addCriterion("SCH_FLOW_LINK_TIME <>", value, "schFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andSchFlowLinkTimeGreaterThan(String value) {
            addCriterion("SCH_FLOW_LINK_TIME >", value, "schFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andSchFlowLinkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("SCH_FLOW_LINK_TIME >=", value, "schFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andSchFlowLinkTimeLessThan(String value) {
            addCriterion("SCH_FLOW_LINK_TIME <", value, "schFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andSchFlowLinkTimeLessThanOrEqualTo(String value) {
            addCriterion("SCH_FLOW_LINK_TIME <=", value, "schFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andSchFlowLinkTimeLike(String value) {
            addCriterion("SCH_FLOW_LINK_TIME like", value, "schFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andSchFlowLinkTimeNotLike(String value) {
            addCriterion("SCH_FLOW_LINK_TIME not like", value, "schFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andSchFlowLinkTimeIn(List<String> values) {
            addCriterion("SCH_FLOW_LINK_TIME in", values, "schFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andSchFlowLinkTimeNotIn(List<String> values) {
            addCriterion("SCH_FLOW_LINK_TIME not in", values, "schFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andSchFlowLinkTimeBetween(String value1, String value2) {
            addCriterion("SCH_FLOW_LINK_TIME between", value1, value2, "schFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andSchFlowLinkTimeNotBetween(String value1, String value2) {
            addCriterion("SCH_FLOW_LINK_TIME not between", value1, value2, "schFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andEsFlowLinkTimeIsNull() {
            addCriterion("ES_FLOW_LINK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEsFlowLinkTimeIsNotNull() {
            addCriterion("ES_FLOW_LINK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEsFlowLinkTimeEqualTo(String value) {
            addCriterion("ES_FLOW_LINK_TIME =", value, "esFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andEsFlowLinkTimeNotEqualTo(String value) {
            addCriterion("ES_FLOW_LINK_TIME <>", value, "esFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andEsFlowLinkTimeGreaterThan(String value) {
            addCriterion("ES_FLOW_LINK_TIME >", value, "esFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andEsFlowLinkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ES_FLOW_LINK_TIME >=", value, "esFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andEsFlowLinkTimeLessThan(String value) {
            addCriterion("ES_FLOW_LINK_TIME <", value, "esFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andEsFlowLinkTimeLessThanOrEqualTo(String value) {
            addCriterion("ES_FLOW_LINK_TIME <=", value, "esFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andEsFlowLinkTimeLike(String value) {
            addCriterion("ES_FLOW_LINK_TIME like", value, "esFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andEsFlowLinkTimeNotLike(String value) {
            addCriterion("ES_FLOW_LINK_TIME not like", value, "esFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andEsFlowLinkTimeIn(List<String> values) {
            addCriterion("ES_FLOW_LINK_TIME in", values, "esFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andEsFlowLinkTimeNotIn(List<String> values) {
            addCriterion("ES_FLOW_LINK_TIME not in", values, "esFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andEsFlowLinkTimeBetween(String value1, String value2) {
            addCriterion("ES_FLOW_LINK_TIME between", value1, value2, "esFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andEsFlowLinkTimeNotBetween(String value1, String value2) {
            addCriterion("ES_FLOW_LINK_TIME not between", value1, value2, "esFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andResultFlowLinkTimeIsNull() {
            addCriterion("RESULT_FLOW_LINK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andResultFlowLinkTimeIsNotNull() {
            addCriterion("RESULT_FLOW_LINK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andResultFlowLinkTimeEqualTo(String value) {
            addCriterion("RESULT_FLOW_LINK_TIME =", value, "resultFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andResultFlowLinkTimeNotEqualTo(String value) {
            addCriterion("RESULT_FLOW_LINK_TIME <>", value, "resultFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andResultFlowLinkTimeGreaterThan(String value) {
            addCriterion("RESULT_FLOW_LINK_TIME >", value, "resultFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andResultFlowLinkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_FLOW_LINK_TIME >=", value, "resultFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andResultFlowLinkTimeLessThan(String value) {
            addCriterion("RESULT_FLOW_LINK_TIME <", value, "resultFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andResultFlowLinkTimeLessThanOrEqualTo(String value) {
            addCriterion("RESULT_FLOW_LINK_TIME <=", value, "resultFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andResultFlowLinkTimeLike(String value) {
            addCriterion("RESULT_FLOW_LINK_TIME like", value, "resultFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andResultFlowLinkTimeNotLike(String value) {
            addCriterion("RESULT_FLOW_LINK_TIME not like", value, "resultFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andResultFlowLinkTimeIn(List<String> values) {
            addCriterion("RESULT_FLOW_LINK_TIME in", values, "resultFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andResultFlowLinkTimeNotIn(List<String> values) {
            addCriterion("RESULT_FLOW_LINK_TIME not in", values, "resultFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andResultFlowLinkTimeBetween(String value1, String value2) {
            addCriterion("RESULT_FLOW_LINK_TIME between", value1, value2, "resultFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andResultFlowLinkTimeNotBetween(String value1, String value2) {
            addCriterion("RESULT_FLOW_LINK_TIME not between", value1, value2, "resultFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andContractFlowLinkTimeIsNull() {
            addCriterion("CONTRACT_FLOW_LINK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andContractFlowLinkTimeIsNotNull() {
            addCriterion("CONTRACT_FLOW_LINK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andContractFlowLinkTimeEqualTo(String value) {
            addCriterion("CONTRACT_FLOW_LINK_TIME =", value, "contractFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andContractFlowLinkTimeNotEqualTo(String value) {
            addCriterion("CONTRACT_FLOW_LINK_TIME <>", value, "contractFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andContractFlowLinkTimeGreaterThan(String value) {
            addCriterion("CONTRACT_FLOW_LINK_TIME >", value, "contractFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andContractFlowLinkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_FLOW_LINK_TIME >=", value, "contractFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andContractFlowLinkTimeLessThan(String value) {
            addCriterion("CONTRACT_FLOW_LINK_TIME <", value, "contractFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andContractFlowLinkTimeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_FLOW_LINK_TIME <=", value, "contractFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andContractFlowLinkTimeLike(String value) {
            addCriterion("CONTRACT_FLOW_LINK_TIME like", value, "contractFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andContractFlowLinkTimeNotLike(String value) {
            addCriterion("CONTRACT_FLOW_LINK_TIME not like", value, "contractFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andContractFlowLinkTimeIn(List<String> values) {
            addCriterion("CONTRACT_FLOW_LINK_TIME in", values, "contractFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andContractFlowLinkTimeNotIn(List<String> values) {
            addCriterion("CONTRACT_FLOW_LINK_TIME not in", values, "contractFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andContractFlowLinkTimeBetween(String value1, String value2) {
            addCriterion("CONTRACT_FLOW_LINK_TIME between", value1, value2, "contractFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andContractFlowLinkTimeNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_FLOW_LINK_TIME not between", value1, value2, "contractFlowLinkTime");
            return (Criteria) this;
        }

        public Criteria andPtbCreationDateIsNull() {
            addCriterion("PTB_CREATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPtbCreationDateIsNotNull() {
            addCriterion("PTB_CREATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPtbCreationDateEqualTo(Date value) {
            addCriterionForJDBCDate("PTB_CREATION_DATE =", value, "ptbCreationDate");
            return (Criteria) this;
        }

        public Criteria andPtbCreationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PTB_CREATION_DATE <>", value, "ptbCreationDate");
            return (Criteria) this;
        }

        public Criteria andPtbCreationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PTB_CREATION_DATE >", value, "ptbCreationDate");
            return (Criteria) this;
        }

        public Criteria andPtbCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PTB_CREATION_DATE >=", value, "ptbCreationDate");
            return (Criteria) this;
        }

        public Criteria andPtbCreationDateLessThan(Date value) {
            addCriterionForJDBCDate("PTB_CREATION_DATE <", value, "ptbCreationDate");
            return (Criteria) this;
        }

        public Criteria andPtbCreationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PTB_CREATION_DATE <=", value, "ptbCreationDate");
            return (Criteria) this;
        }

        public Criteria andPtbCreationDateIn(List<Date> values) {
            addCriterionForJDBCDate("PTB_CREATION_DATE in", values, "ptbCreationDate");
            return (Criteria) this;
        }

        public Criteria andPtbCreationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PTB_CREATION_DATE not in", values, "ptbCreationDate");
            return (Criteria) this;
        }

        public Criteria andPtbCreationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PTB_CREATION_DATE between", value1, value2, "ptbCreationDate");
            return (Criteria) this;
        }

        public Criteria andPtbCreationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PTB_CREATION_DATE not between", value1, value2, "ptbCreationDate");
            return (Criteria) this;
        }

        public Criteria andPtbCreatedByIsNull() {
            addCriterion("PTB_CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andPtbCreatedByIsNotNull() {
            addCriterion("PTB_CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andPtbCreatedByEqualTo(String value) {
            addCriterion("PTB_CREATED_BY =", value, "ptbCreatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbCreatedByNotEqualTo(String value) {
            addCriterion("PTB_CREATED_BY <>", value, "ptbCreatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbCreatedByGreaterThan(String value) {
            addCriterion("PTB_CREATED_BY >", value, "ptbCreatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("PTB_CREATED_BY >=", value, "ptbCreatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbCreatedByLessThan(String value) {
            addCriterion("PTB_CREATED_BY <", value, "ptbCreatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbCreatedByLessThanOrEqualTo(String value) {
            addCriterion("PTB_CREATED_BY <=", value, "ptbCreatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbCreatedByLike(String value) {
            addCriterion("PTB_CREATED_BY like", value, "ptbCreatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbCreatedByNotLike(String value) {
            addCriterion("PTB_CREATED_BY not like", value, "ptbCreatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbCreatedByIn(List<String> values) {
            addCriterion("PTB_CREATED_BY in", values, "ptbCreatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbCreatedByNotIn(List<String> values) {
            addCriterion("PTB_CREATED_BY not in", values, "ptbCreatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbCreatedByBetween(String value1, String value2) {
            addCriterion("PTB_CREATED_BY between", value1, value2, "ptbCreatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbCreatedByNotBetween(String value1, String value2) {
            addCriterion("PTB_CREATED_BY not between", value1, value2, "ptbCreatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdateDateIsNull() {
            addCriterion("PTB_LAST_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdateDateIsNotNull() {
            addCriterion("PTB_LAST_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("PTB_LAST_UPDATE_DATE =", value, "ptbLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PTB_LAST_UPDATE_DATE <>", value, "ptbLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PTB_LAST_UPDATE_DATE >", value, "ptbLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PTB_LAST_UPDATE_DATE >=", value, "ptbLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("PTB_LAST_UPDATE_DATE <", value, "ptbLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PTB_LAST_UPDATE_DATE <=", value, "ptbLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("PTB_LAST_UPDATE_DATE in", values, "ptbLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PTB_LAST_UPDATE_DATE not in", values, "ptbLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PTB_LAST_UPDATE_DATE between", value1, value2, "ptbLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PTB_LAST_UPDATE_DATE not between", value1, value2, "ptbLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdatedByIsNull() {
            addCriterion("PTB_LAST_UPDATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdatedByIsNotNull() {
            addCriterion("PTB_LAST_UPDATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdatedByEqualTo(String value) {
            addCriterion("PTB_LAST_UPDATED_BY =", value, "ptbLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdatedByNotEqualTo(String value) {
            addCriterion("PTB_LAST_UPDATED_BY <>", value, "ptbLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdatedByGreaterThan(String value) {
            addCriterion("PTB_LAST_UPDATED_BY >", value, "ptbLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("PTB_LAST_UPDATED_BY >=", value, "ptbLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdatedByLessThan(String value) {
            addCriterion("PTB_LAST_UPDATED_BY <", value, "ptbLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("PTB_LAST_UPDATED_BY <=", value, "ptbLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdatedByLike(String value) {
            addCriterion("PTB_LAST_UPDATED_BY like", value, "ptbLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdatedByNotLike(String value) {
            addCriterion("PTB_LAST_UPDATED_BY not like", value, "ptbLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdatedByIn(List<String> values) {
            addCriterion("PTB_LAST_UPDATED_BY in", values, "ptbLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdatedByNotIn(List<String> values) {
            addCriterion("PTB_LAST_UPDATED_BY not in", values, "ptbLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdatedByBetween(String value1, String value2) {
            addCriterion("PTB_LAST_UPDATED_BY between", value1, value2, "ptbLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbLastUpdatedByNotBetween(String value1, String value2) {
            addCriterion("PTB_LAST_UPDATED_BY not between", value1, value2, "ptbLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andPtbEnableFlagIsNull() {
            addCriterion("PTB_ENABLE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPtbEnableFlagIsNotNull() {
            addCriterion("PTB_ENABLE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPtbEnableFlagEqualTo(String value) {
            addCriterion("PTB_ENABLE_FLAG =", value, "ptbEnableFlag");
            return (Criteria) this;
        }

        public Criteria andPtbEnableFlagNotEqualTo(String value) {
            addCriterion("PTB_ENABLE_FLAG <>", value, "ptbEnableFlag");
            return (Criteria) this;
        }

        public Criteria andPtbEnableFlagGreaterThan(String value) {
            addCriterion("PTB_ENABLE_FLAG >", value, "ptbEnableFlag");
            return (Criteria) this;
        }

        public Criteria andPtbEnableFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PTB_ENABLE_FLAG >=", value, "ptbEnableFlag");
            return (Criteria) this;
        }

        public Criteria andPtbEnableFlagLessThan(String value) {
            addCriterion("PTB_ENABLE_FLAG <", value, "ptbEnableFlag");
            return (Criteria) this;
        }

        public Criteria andPtbEnableFlagLessThanOrEqualTo(String value) {
            addCriterion("PTB_ENABLE_FLAG <=", value, "ptbEnableFlag");
            return (Criteria) this;
        }

        public Criteria andPtbEnableFlagLike(String value) {
            addCriterion("PTB_ENABLE_FLAG like", value, "ptbEnableFlag");
            return (Criteria) this;
        }

        public Criteria andPtbEnableFlagNotLike(String value) {
            addCriterion("PTB_ENABLE_FLAG not like", value, "ptbEnableFlag");
            return (Criteria) this;
        }

        public Criteria andPtbEnableFlagIn(List<String> values) {
            addCriterion("PTB_ENABLE_FLAG in", values, "ptbEnableFlag");
            return (Criteria) this;
        }

        public Criteria andPtbEnableFlagNotIn(List<String> values) {
            addCriterion("PTB_ENABLE_FLAG not in", values, "ptbEnableFlag");
            return (Criteria) this;
        }

        public Criteria andPtbEnableFlagBetween(String value1, String value2) {
            addCriterion("PTB_ENABLE_FLAG between", value1, value2, "ptbEnableFlag");
            return (Criteria) this;
        }

        public Criteria andPtbEnableFlagNotBetween(String value1, String value2) {
            addCriterion("PTB_ENABLE_FLAG not between", value1, value2, "ptbEnableFlag");
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