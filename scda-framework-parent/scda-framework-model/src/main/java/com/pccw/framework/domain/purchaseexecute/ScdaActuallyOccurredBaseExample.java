package com.pccw.framework.domain.purchaseexecute;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScdaActuallyOccurredBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScdaActuallyOccurredBaseExample() {
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

        public Criteria andSaobIdIsNull() {
            addCriterion("SAOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andSaobIdIsNotNull() {
            addCriterion("SAOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSaobIdEqualTo(String value) {
            addCriterion("SAOB_ID =", value, "saobId");
            return (Criteria) this;
        }

        public Criteria andSaobIdNotEqualTo(String value) {
            addCriterion("SAOB_ID <>", value, "saobId");
            return (Criteria) this;
        }

        public Criteria andSaobIdGreaterThan(String value) {
            addCriterion("SAOB_ID >", value, "saobId");
            return (Criteria) this;
        }

        public Criteria andSaobIdGreaterThanOrEqualTo(String value) {
            addCriterion("SAOB_ID >=", value, "saobId");
            return (Criteria) this;
        }

        public Criteria andSaobIdLessThan(String value) {
            addCriterion("SAOB_ID <", value, "saobId");
            return (Criteria) this;
        }

        public Criteria andSaobIdLessThanOrEqualTo(String value) {
            addCriterion("SAOB_ID <=", value, "saobId");
            return (Criteria) this;
        }

        public Criteria andSaobIdLike(String value) {
            addCriterion("SAOB_ID like", value, "saobId");
            return (Criteria) this;
        }

        public Criteria andSaobIdNotLike(String value) {
            addCriterion("SAOB_ID not like", value, "saobId");
            return (Criteria) this;
        }

        public Criteria andSaobIdIn(List<String> values) {
            addCriterion("SAOB_ID in", values, "saobId");
            return (Criteria) this;
        }

        public Criteria andSaobIdNotIn(List<String> values) {
            addCriterion("SAOB_ID not in", values, "saobId");
            return (Criteria) this;
        }

        public Criteria andSaobIdBetween(String value1, String value2) {
            addCriterion("SAOB_ID between", value1, value2, "saobId");
            return (Criteria) this;
        }

        public Criteria andSaobIdNotBetween(String value1, String value2) {
            addCriterion("SAOB_ID not between", value1, value2, "saobId");
            return (Criteria) this;
        }

        public Criteria andProvincialCompanyCodeIsNull() {
            addCriterion("PROVINCIAL_COMPANY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProvincialCompanyCodeIsNotNull() {
            addCriterion("PROVINCIAL_COMPANY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvincialCompanyCodeEqualTo(String value) {
            addCriterion("PROVINCIAL_COMPANY_CODE =", value, "provincialCompanyCode");
            return (Criteria) this;
        }

        public Criteria andProvincialCompanyCodeNotEqualTo(String value) {
            addCriterion("PROVINCIAL_COMPANY_CODE <>", value, "provincialCompanyCode");
            return (Criteria) this;
        }

        public Criteria andProvincialCompanyCodeGreaterThan(String value) {
            addCriterion("PROVINCIAL_COMPANY_CODE >", value, "provincialCompanyCode");
            return (Criteria) this;
        }

        public Criteria andProvincialCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCIAL_COMPANY_CODE >=", value, "provincialCompanyCode");
            return (Criteria) this;
        }

        public Criteria andProvincialCompanyCodeLessThan(String value) {
            addCriterion("PROVINCIAL_COMPANY_CODE <", value, "provincialCompanyCode");
            return (Criteria) this;
        }

        public Criteria andProvincialCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("PROVINCIAL_COMPANY_CODE <=", value, "provincialCompanyCode");
            return (Criteria) this;
        }

        public Criteria andProvincialCompanyCodeLike(String value) {
            addCriterion("PROVINCIAL_COMPANY_CODE like", value, "provincialCompanyCode");
            return (Criteria) this;
        }

        public Criteria andProvincialCompanyCodeNotLike(String value) {
            addCriterion("PROVINCIAL_COMPANY_CODE not like", value, "provincialCompanyCode");
            return (Criteria) this;
        }

        public Criteria andProvincialCompanyCodeIn(List<String> values) {
            addCriterion("PROVINCIAL_COMPANY_CODE in", values, "provincialCompanyCode");
            return (Criteria) this;
        }

        public Criteria andProvincialCompanyCodeNotIn(List<String> values) {
            addCriterion("PROVINCIAL_COMPANY_CODE not in", values, "provincialCompanyCode");
            return (Criteria) this;
        }

        public Criteria andProvincialCompanyCodeBetween(String value1, String value2) {
            addCriterion("PROVINCIAL_COMPANY_CODE between", value1, value2, "provincialCompanyCode");
            return (Criteria) this;
        }

        public Criteria andProvincialCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("PROVINCIAL_COMPANY_CODE not between", value1, value2, "provincialCompanyCode");
            return (Criteria) this;
        }

        public Criteria andOrgIdentifyIsNull() {
            addCriterion("ORG_IDENTIFY is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdentifyIsNotNull() {
            addCriterion("ORG_IDENTIFY is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdentifyEqualTo(String value) {
            addCriterion("ORG_IDENTIFY =", value, "orgIdentify");
            return (Criteria) this;
        }

        public Criteria andOrgIdentifyNotEqualTo(String value) {
            addCriterion("ORG_IDENTIFY <>", value, "orgIdentify");
            return (Criteria) this;
        }

        public Criteria andOrgIdentifyGreaterThan(String value) {
            addCriterion("ORG_IDENTIFY >", value, "orgIdentify");
            return (Criteria) this;
        }

        public Criteria andOrgIdentifyGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_IDENTIFY >=", value, "orgIdentify");
            return (Criteria) this;
        }

        public Criteria andOrgIdentifyLessThan(String value) {
            addCriterion("ORG_IDENTIFY <", value, "orgIdentify");
            return (Criteria) this;
        }

        public Criteria andOrgIdentifyLessThanOrEqualTo(String value) {
            addCriterion("ORG_IDENTIFY <=", value, "orgIdentify");
            return (Criteria) this;
        }

        public Criteria andOrgIdentifyLike(String value) {
            addCriterion("ORG_IDENTIFY like", value, "orgIdentify");
            return (Criteria) this;
        }

        public Criteria andOrgIdentifyNotLike(String value) {
            addCriterion("ORG_IDENTIFY not like", value, "orgIdentify");
            return (Criteria) this;
        }

        public Criteria andOrgIdentifyIn(List<String> values) {
            addCriterion("ORG_IDENTIFY in", values, "orgIdentify");
            return (Criteria) this;
        }

        public Criteria andOrgIdentifyNotIn(List<String> values) {
            addCriterion("ORG_IDENTIFY not in", values, "orgIdentify");
            return (Criteria) this;
        }

        public Criteria andOrgIdentifyBetween(String value1, String value2) {
            addCriterion("ORG_IDENTIFY between", value1, value2, "orgIdentify");
            return (Criteria) this;
        }

        public Criteria andOrgIdentifyNotBetween(String value1, String value2) {
            addCriterion("ORG_IDENTIFY not between", value1, value2, "orgIdentify");
            return (Criteria) this;
        }

        public Criteria andPoTypeIsNull() {
            addCriterion("PO_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPoTypeIsNotNull() {
            addCriterion("PO_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPoTypeEqualTo(String value) {
            addCriterion("PO_TYPE =", value, "poType");
            return (Criteria) this;
        }

        public Criteria andPoTypeNotEqualTo(String value) {
            addCriterion("PO_TYPE <>", value, "poType");
            return (Criteria) this;
        }

        public Criteria andPoTypeGreaterThan(String value) {
            addCriterion("PO_TYPE >", value, "poType");
            return (Criteria) this;
        }

        public Criteria andPoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PO_TYPE >=", value, "poType");
            return (Criteria) this;
        }

        public Criteria andPoTypeLessThan(String value) {
            addCriterion("PO_TYPE <", value, "poType");
            return (Criteria) this;
        }

        public Criteria andPoTypeLessThanOrEqualTo(String value) {
            addCriterion("PO_TYPE <=", value, "poType");
            return (Criteria) this;
        }

        public Criteria andPoTypeLike(String value) {
            addCriterion("PO_TYPE like", value, "poType");
            return (Criteria) this;
        }

        public Criteria andPoTypeNotLike(String value) {
            addCriterion("PO_TYPE not like", value, "poType");
            return (Criteria) this;
        }

        public Criteria andPoTypeIn(List<String> values) {
            addCriterion("PO_TYPE in", values, "poType");
            return (Criteria) this;
        }

        public Criteria andPoTypeNotIn(List<String> values) {
            addCriterion("PO_TYPE not in", values, "poType");
            return (Criteria) this;
        }

        public Criteria andPoTypeBetween(String value1, String value2) {
            addCriterion("PO_TYPE between", value1, value2, "poType");
            return (Criteria) this;
        }

        public Criteria andPoTypeNotBetween(String value1, String value2) {
            addCriterion("PO_TYPE not between", value1, value2, "poType");
            return (Criteria) this;
        }

        public Criteria andContractDraftingDeptIsNull() {
            addCriterion("CONTRACT_DRAFTING_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andContractDraftingDeptIsNotNull() {
            addCriterion("CONTRACT_DRAFTING_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andContractDraftingDeptEqualTo(String value) {
            addCriterion("CONTRACT_DRAFTING_DEPT =", value, "contractDraftingDept");
            return (Criteria) this;
        }

        public Criteria andContractDraftingDeptNotEqualTo(String value) {
            addCriterion("CONTRACT_DRAFTING_DEPT <>", value, "contractDraftingDept");
            return (Criteria) this;
        }

        public Criteria andContractDraftingDeptGreaterThan(String value) {
            addCriterion("CONTRACT_DRAFTING_DEPT >", value, "contractDraftingDept");
            return (Criteria) this;
        }

        public Criteria andContractDraftingDeptGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_DRAFTING_DEPT >=", value, "contractDraftingDept");
            return (Criteria) this;
        }

        public Criteria andContractDraftingDeptLessThan(String value) {
            addCriterion("CONTRACT_DRAFTING_DEPT <", value, "contractDraftingDept");
            return (Criteria) this;
        }

        public Criteria andContractDraftingDeptLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_DRAFTING_DEPT <=", value, "contractDraftingDept");
            return (Criteria) this;
        }

        public Criteria andContractDraftingDeptLike(String value) {
            addCriterion("CONTRACT_DRAFTING_DEPT like", value, "contractDraftingDept");
            return (Criteria) this;
        }

        public Criteria andContractDraftingDeptNotLike(String value) {
            addCriterion("CONTRACT_DRAFTING_DEPT not like", value, "contractDraftingDept");
            return (Criteria) this;
        }

        public Criteria andContractDraftingDeptIn(List<String> values) {
            addCriterion("CONTRACT_DRAFTING_DEPT in", values, "contractDraftingDept");
            return (Criteria) this;
        }

        public Criteria andContractDraftingDeptNotIn(List<String> values) {
            addCriterion("CONTRACT_DRAFTING_DEPT not in", values, "contractDraftingDept");
            return (Criteria) this;
        }

        public Criteria andContractDraftingDeptBetween(String value1, String value2) {
            addCriterion("CONTRACT_DRAFTING_DEPT between", value1, value2, "contractDraftingDept");
            return (Criteria) this;
        }

        public Criteria andContractDraftingDeptNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_DRAFTING_DEPT not between", value1, value2, "contractDraftingDept");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountIsNull() {
            addCriterion("ORDER_TOTAL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountIsNotNull() {
            addCriterion("ORDER_TOTAL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountEqualTo(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT =", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountNotEqualTo(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT <>", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountGreaterThan(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT >", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT >=", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountLessThan(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT <", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT <=", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountIn(List<String> values) {
            addCriterion("ORDER_TOTAL_AMOUNT in", values, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountNotIn(List<String> values) {
            addCriterion("ORDER_TOTAL_AMOUNT not in", values, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountBetween(String value1, String value2) {
            addCriterion("ORDER_TOTAL_AMOUNT between", value1, value2, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountNotBetween(String value1, String value2) {
            addCriterion("ORDER_TOTAL_AMOUNT not between", value1, value2, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andContractNumberIsNull() {
            addCriterion("CONTRACT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andContractNumberIsNotNull() {
            addCriterion("CONTRACT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andContractNumberEqualTo(String value) {
            addCriterion("CONTRACT_NUMBER =", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberNotEqualTo(String value) {
            addCriterion("CONTRACT_NUMBER <>", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberGreaterThan(String value) {
            addCriterion("CONTRACT_NUMBER >", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_NUMBER >=", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberLessThan(String value) {
            addCriterion("CONTRACT_NUMBER <", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_NUMBER <=", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberLike(String value) {
            addCriterion("CONTRACT_NUMBER like", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberNotLike(String value) {
            addCriterion("CONTRACT_NUMBER not like", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberIn(List<String> values) {
            addCriterion("CONTRACT_NUMBER in", values, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberNotIn(List<String> values) {
            addCriterion("CONTRACT_NUMBER not in", values, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberBetween(String value1, String value2) {
            addCriterion("CONTRACT_NUMBER between", value1, value2, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_NUMBER not between", value1, value2, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andUnifiedSupplierCodeIsNull() {
            addCriterion("UNIFIED_SUPPLIER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUnifiedSupplierCodeIsNotNull() {
            addCriterion("UNIFIED_SUPPLIER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUnifiedSupplierCodeEqualTo(String value) {
            addCriterion("UNIFIED_SUPPLIER_CODE =", value, "unifiedSupplierCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedSupplierCodeNotEqualTo(String value) {
            addCriterion("UNIFIED_SUPPLIER_CODE <>", value, "unifiedSupplierCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedSupplierCodeGreaterThan(String value) {
            addCriterion("UNIFIED_SUPPLIER_CODE >", value, "unifiedSupplierCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedSupplierCodeGreaterThanOrEqualTo(String value) {
            addCriterion("UNIFIED_SUPPLIER_CODE >=", value, "unifiedSupplierCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedSupplierCodeLessThan(String value) {
            addCriterion("UNIFIED_SUPPLIER_CODE <", value, "unifiedSupplierCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedSupplierCodeLessThanOrEqualTo(String value) {
            addCriterion("UNIFIED_SUPPLIER_CODE <=", value, "unifiedSupplierCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedSupplierCodeLike(String value) {
            addCriterion("UNIFIED_SUPPLIER_CODE like", value, "unifiedSupplierCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedSupplierCodeNotLike(String value) {
            addCriterion("UNIFIED_SUPPLIER_CODE not like", value, "unifiedSupplierCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedSupplierCodeIn(List<String> values) {
            addCriterion("UNIFIED_SUPPLIER_CODE in", values, "unifiedSupplierCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedSupplierCodeNotIn(List<String> values) {
            addCriterion("UNIFIED_SUPPLIER_CODE not in", values, "unifiedSupplierCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedSupplierCodeBetween(String value1, String value2) {
            addCriterion("UNIFIED_SUPPLIER_CODE between", value1, value2, "unifiedSupplierCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedSupplierCodeNotBetween(String value1, String value2) {
            addCriterion("UNIFIED_SUPPLIER_CODE not between", value1, value2, "unifiedSupplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberIsNull() {
            addCriterion("SUPPLIER_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberIsNotNull() {
            addCriterion("SUPPLIER_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberEqualTo(String value) {
            addCriterion("SUPPLIER_NUMBER =", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberNotEqualTo(String value) {
            addCriterion("SUPPLIER_NUMBER <>", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberGreaterThan(String value) {
            addCriterion("SUPPLIER_NUMBER >", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NUMBER >=", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberLessThan(String value) {
            addCriterion("SUPPLIER_NUMBER <", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NUMBER <=", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberLike(String value) {
            addCriterion("SUPPLIER_NUMBER like", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberNotLike(String value) {
            addCriterion("SUPPLIER_NUMBER not like", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberIn(List<String> values) {
            addCriterion("SUPPLIER_NUMBER in", values, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberNotIn(List<String> values) {
            addCriterion("SUPPLIER_NUMBER not in", values, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NUMBER between", value1, value2, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NUMBER not between", value1, value2, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("SUPPLIER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("SUPPLIER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("SUPPLIER_NAME =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("SUPPLIER_NAME <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("SUPPLIER_NAME >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NAME >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("SUPPLIER_NAME <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NAME <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("SUPPLIER_NAME like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("SUPPLIER_NAME not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("SUPPLIER_NAME in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("SUPPLIER_NAME not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NAME between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NAME not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andHqFrameworkContractIsNull() {
            addCriterion("HQ_FRAMEWORK_CONTRACT is null");
            return (Criteria) this;
        }

        public Criteria andHqFrameworkContractIsNotNull() {
            addCriterion("HQ_FRAMEWORK_CONTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andHqFrameworkContractEqualTo(String value) {
            addCriterion("HQ_FRAMEWORK_CONTRACT =", value, "hqFrameworkContract");
            return (Criteria) this;
        }

        public Criteria andHqFrameworkContractNotEqualTo(String value) {
            addCriterion("HQ_FRAMEWORK_CONTRACT <>", value, "hqFrameworkContract");
            return (Criteria) this;
        }

        public Criteria andHqFrameworkContractGreaterThan(String value) {
            addCriterion("HQ_FRAMEWORK_CONTRACT >", value, "hqFrameworkContract");
            return (Criteria) this;
        }

        public Criteria andHqFrameworkContractGreaterThanOrEqualTo(String value) {
            addCriterion("HQ_FRAMEWORK_CONTRACT >=", value, "hqFrameworkContract");
            return (Criteria) this;
        }

        public Criteria andHqFrameworkContractLessThan(String value) {
            addCriterion("HQ_FRAMEWORK_CONTRACT <", value, "hqFrameworkContract");
            return (Criteria) this;
        }

        public Criteria andHqFrameworkContractLessThanOrEqualTo(String value) {
            addCriterion("HQ_FRAMEWORK_CONTRACT <=", value, "hqFrameworkContract");
            return (Criteria) this;
        }

        public Criteria andHqFrameworkContractLike(String value) {
            addCriterion("HQ_FRAMEWORK_CONTRACT like", value, "hqFrameworkContract");
            return (Criteria) this;
        }

        public Criteria andHqFrameworkContractNotLike(String value) {
            addCriterion("HQ_FRAMEWORK_CONTRACT not like", value, "hqFrameworkContract");
            return (Criteria) this;
        }

        public Criteria andHqFrameworkContractIn(List<String> values) {
            addCriterion("HQ_FRAMEWORK_CONTRACT in", values, "hqFrameworkContract");
            return (Criteria) this;
        }

        public Criteria andHqFrameworkContractNotIn(List<String> values) {
            addCriterion("HQ_FRAMEWORK_CONTRACT not in", values, "hqFrameworkContract");
            return (Criteria) this;
        }

        public Criteria andHqFrameworkContractBetween(String value1, String value2) {
            addCriterion("HQ_FRAMEWORK_CONTRACT between", value1, value2, "hqFrameworkContract");
            return (Criteria) this;
        }

        public Criteria andHqFrameworkContractNotBetween(String value1, String value2) {
            addCriterion("HQ_FRAMEWORK_CONTRACT not between", value1, value2, "hqFrameworkContract");
            return (Criteria) this;
        }

        public Criteria andPoHeaderIdIsNull() {
            addCriterion("PO_HEADER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPoHeaderIdIsNotNull() {
            addCriterion("PO_HEADER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPoHeaderIdEqualTo(String value) {
            addCriterion("PO_HEADER_ID =", value, "poHeaderId");
            return (Criteria) this;
        }

        public Criteria andPoHeaderIdNotEqualTo(String value) {
            addCriterion("PO_HEADER_ID <>", value, "poHeaderId");
            return (Criteria) this;
        }

        public Criteria andPoHeaderIdGreaterThan(String value) {
            addCriterion("PO_HEADER_ID >", value, "poHeaderId");
            return (Criteria) this;
        }

        public Criteria andPoHeaderIdGreaterThanOrEqualTo(String value) {
            addCriterion("PO_HEADER_ID >=", value, "poHeaderId");
            return (Criteria) this;
        }

        public Criteria andPoHeaderIdLessThan(String value) {
            addCriterion("PO_HEADER_ID <", value, "poHeaderId");
            return (Criteria) this;
        }

        public Criteria andPoHeaderIdLessThanOrEqualTo(String value) {
            addCriterion("PO_HEADER_ID <=", value, "poHeaderId");
            return (Criteria) this;
        }

        public Criteria andPoHeaderIdLike(String value) {
            addCriterion("PO_HEADER_ID like", value, "poHeaderId");
            return (Criteria) this;
        }

        public Criteria andPoHeaderIdNotLike(String value) {
            addCriterion("PO_HEADER_ID not like", value, "poHeaderId");
            return (Criteria) this;
        }

        public Criteria andPoHeaderIdIn(List<String> values) {
            addCriterion("PO_HEADER_ID in", values, "poHeaderId");
            return (Criteria) this;
        }

        public Criteria andPoHeaderIdNotIn(List<String> values) {
            addCriterion("PO_HEADER_ID not in", values, "poHeaderId");
            return (Criteria) this;
        }

        public Criteria andPoHeaderIdBetween(String value1, String value2) {
            addCriterion("PO_HEADER_ID between", value1, value2, "poHeaderId");
            return (Criteria) this;
        }

        public Criteria andPoHeaderIdNotBetween(String value1, String value2) {
            addCriterion("PO_HEADER_ID not between", value1, value2, "poHeaderId");
            return (Criteria) this;
        }

        public Criteria andSegment1IsNull() {
            addCriterion("SEGMENT1 is null");
            return (Criteria) this;
        }

        public Criteria andSegment1IsNotNull() {
            addCriterion("SEGMENT1 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment1EqualTo(String value) {
            addCriterion("SEGMENT1 =", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotEqualTo(String value) {
            addCriterion("SEGMENT1 <>", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1GreaterThan(String value) {
            addCriterion("SEGMENT1 >", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT1 >=", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1LessThan(String value) {
            addCriterion("SEGMENT1 <", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT1 <=", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1Like(String value) {
            addCriterion("SEGMENT1 like", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotLike(String value) {
            addCriterion("SEGMENT1 not like", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1In(List<String> values) {
            addCriterion("SEGMENT1 in", values, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotIn(List<String> values) {
            addCriterion("SEGMENT1 not in", values, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1Between(String value1, String value2) {
            addCriterion("SEGMENT1 between", value1, value2, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotBetween(String value1, String value2) {
            addCriterion("SEGMENT1 not between", value1, value2, "segment1");
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

        public Criteria andContractWayIsNull() {
            addCriterion("CONTRACT_WAY is null");
            return (Criteria) this;
        }

        public Criteria andContractWayIsNotNull() {
            addCriterion("CONTRACT_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andContractWayEqualTo(String value) {
            addCriterion("CONTRACT_WAY =", value, "contractWay");
            return (Criteria) this;
        }

        public Criteria andContractWayNotEqualTo(String value) {
            addCriterion("CONTRACT_WAY <>", value, "contractWay");
            return (Criteria) this;
        }

        public Criteria andContractWayGreaterThan(String value) {
            addCriterion("CONTRACT_WAY >", value, "contractWay");
            return (Criteria) this;
        }

        public Criteria andContractWayGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_WAY >=", value, "contractWay");
            return (Criteria) this;
        }

        public Criteria andContractWayLessThan(String value) {
            addCriterion("CONTRACT_WAY <", value, "contractWay");
            return (Criteria) this;
        }

        public Criteria andContractWayLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_WAY <=", value, "contractWay");
            return (Criteria) this;
        }

        public Criteria andContractWayLike(String value) {
            addCriterion("CONTRACT_WAY like", value, "contractWay");
            return (Criteria) this;
        }

        public Criteria andContractWayNotLike(String value) {
            addCriterion("CONTRACT_WAY not like", value, "contractWay");
            return (Criteria) this;
        }

        public Criteria andContractWayIn(List<String> values) {
            addCriterion("CONTRACT_WAY in", values, "contractWay");
            return (Criteria) this;
        }

        public Criteria andContractWayNotIn(List<String> values) {
            addCriterion("CONTRACT_WAY not in", values, "contractWay");
            return (Criteria) this;
        }

        public Criteria andContractWayBetween(String value1, String value2) {
            addCriterion("CONTRACT_WAY between", value1, value2, "contractWay");
            return (Criteria) this;
        }

        public Criteria andContractWayNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_WAY not between", value1, value2, "contractWay");
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

        public Criteria andBigKindIsNull() {
            addCriterion("BIG_KIND is null");
            return (Criteria) this;
        }

        public Criteria andBigKindIsNotNull() {
            addCriterion("BIG_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andBigKindEqualTo(String value) {
            addCriterion("BIG_KIND =", value, "bigKind");
            return (Criteria) this;
        }

        public Criteria andBigKindNotEqualTo(String value) {
            addCriterion("BIG_KIND <>", value, "bigKind");
            return (Criteria) this;
        }

        public Criteria andBigKindGreaterThan(String value) {
            addCriterion("BIG_KIND >", value, "bigKind");
            return (Criteria) this;
        }

        public Criteria andBigKindGreaterThanOrEqualTo(String value) {
            addCriterion("BIG_KIND >=", value, "bigKind");
            return (Criteria) this;
        }

        public Criteria andBigKindLessThan(String value) {
            addCriterion("BIG_KIND <", value, "bigKind");
            return (Criteria) this;
        }

        public Criteria andBigKindLessThanOrEqualTo(String value) {
            addCriterion("BIG_KIND <=", value, "bigKind");
            return (Criteria) this;
        }

        public Criteria andBigKindLike(String value) {
            addCriterion("BIG_KIND like", value, "bigKind");
            return (Criteria) this;
        }

        public Criteria andBigKindNotLike(String value) {
            addCriterion("BIG_KIND not like", value, "bigKind");
            return (Criteria) this;
        }

        public Criteria andBigKindIn(List<String> values) {
            addCriterion("BIG_KIND in", values, "bigKind");
            return (Criteria) this;
        }

        public Criteria andBigKindNotIn(List<String> values) {
            addCriterion("BIG_KIND not in", values, "bigKind");
            return (Criteria) this;
        }

        public Criteria andBigKindBetween(String value1, String value2) {
            addCriterion("BIG_KIND between", value1, value2, "bigKind");
            return (Criteria) this;
        }

        public Criteria andBigKindNotBetween(String value1, String value2) {
            addCriterion("BIG_KIND not between", value1, value2, "bigKind");
            return (Criteria) this;
        }

        public Criteria andCenterKindIsNull() {
            addCriterion("CENTER_KIND is null");
            return (Criteria) this;
        }

        public Criteria andCenterKindIsNotNull() {
            addCriterion("CENTER_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andCenterKindEqualTo(String value) {
            addCriterion("CENTER_KIND =", value, "centerKind");
            return (Criteria) this;
        }

        public Criteria andCenterKindNotEqualTo(String value) {
            addCriterion("CENTER_KIND <>", value, "centerKind");
            return (Criteria) this;
        }

        public Criteria andCenterKindGreaterThan(String value) {
            addCriterion("CENTER_KIND >", value, "centerKind");
            return (Criteria) this;
        }

        public Criteria andCenterKindGreaterThanOrEqualTo(String value) {
            addCriterion("CENTER_KIND >=", value, "centerKind");
            return (Criteria) this;
        }

        public Criteria andCenterKindLessThan(String value) {
            addCriterion("CENTER_KIND <", value, "centerKind");
            return (Criteria) this;
        }

        public Criteria andCenterKindLessThanOrEqualTo(String value) {
            addCriterion("CENTER_KIND <=", value, "centerKind");
            return (Criteria) this;
        }

        public Criteria andCenterKindLike(String value) {
            addCriterion("CENTER_KIND like", value, "centerKind");
            return (Criteria) this;
        }

        public Criteria andCenterKindNotLike(String value) {
            addCriterion("CENTER_KIND not like", value, "centerKind");
            return (Criteria) this;
        }

        public Criteria andCenterKindIn(List<String> values) {
            addCriterion("CENTER_KIND in", values, "centerKind");
            return (Criteria) this;
        }

        public Criteria andCenterKindNotIn(List<String> values) {
            addCriterion("CENTER_KIND not in", values, "centerKind");
            return (Criteria) this;
        }

        public Criteria andCenterKindBetween(String value1, String value2) {
            addCriterion("CENTER_KIND between", value1, value2, "centerKind");
            return (Criteria) this;
        }

        public Criteria andCenterKindNotBetween(String value1, String value2) {
            addCriterion("CENTER_KIND not between", value1, value2, "centerKind");
            return (Criteria) this;
        }

        public Criteria andSmallKindIsNull() {
            addCriterion("SMALL_KIND is null");
            return (Criteria) this;
        }

        public Criteria andSmallKindIsNotNull() {
            addCriterion("SMALL_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andSmallKindEqualTo(String value) {
            addCriterion("SMALL_KIND =", value, "smallKind");
            return (Criteria) this;
        }

        public Criteria andSmallKindNotEqualTo(String value) {
            addCriterion("SMALL_KIND <>", value, "smallKind");
            return (Criteria) this;
        }

        public Criteria andSmallKindGreaterThan(String value) {
            addCriterion("SMALL_KIND >", value, "smallKind");
            return (Criteria) this;
        }

        public Criteria andSmallKindGreaterThanOrEqualTo(String value) {
            addCriterion("SMALL_KIND >=", value, "smallKind");
            return (Criteria) this;
        }

        public Criteria andSmallKindLessThan(String value) {
            addCriterion("SMALL_KIND <", value, "smallKind");
            return (Criteria) this;
        }

        public Criteria andSmallKindLessThanOrEqualTo(String value) {
            addCriterion("SMALL_KIND <=", value, "smallKind");
            return (Criteria) this;
        }

        public Criteria andSmallKindLike(String value) {
            addCriterion("SMALL_KIND like", value, "smallKind");
            return (Criteria) this;
        }

        public Criteria andSmallKindNotLike(String value) {
            addCriterion("SMALL_KIND not like", value, "smallKind");
            return (Criteria) this;
        }

        public Criteria andSmallKindIn(List<String> values) {
            addCriterion("SMALL_KIND in", values, "smallKind");
            return (Criteria) this;
        }

        public Criteria andSmallKindNotIn(List<String> values) {
            addCriterion("SMALL_KIND not in", values, "smallKind");
            return (Criteria) this;
        }

        public Criteria andSmallKindBetween(String value1, String value2) {
            addCriterion("SMALL_KIND between", value1, value2, "smallKind");
            return (Criteria) this;
        }

        public Criteria andSmallKindNotBetween(String value1, String value2) {
            addCriterion("SMALL_KIND not between", value1, value2, "smallKind");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andIsEliminationIsNull() {
            addCriterion("IS_ELIMINATION is null");
            return (Criteria) this;
        }

        public Criteria andIsEliminationIsNotNull() {
            addCriterion("IS_ELIMINATION is not null");
            return (Criteria) this;
        }

        public Criteria andIsEliminationEqualTo(String value) {
            addCriterion("IS_ELIMINATION =", value, "isElimination");
            return (Criteria) this;
        }

        public Criteria andIsEliminationNotEqualTo(String value) {
            addCriterion("IS_ELIMINATION <>", value, "isElimination");
            return (Criteria) this;
        }

        public Criteria andIsEliminationGreaterThan(String value) {
            addCriterion("IS_ELIMINATION >", value, "isElimination");
            return (Criteria) this;
        }

        public Criteria andIsEliminationGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ELIMINATION >=", value, "isElimination");
            return (Criteria) this;
        }

        public Criteria andIsEliminationLessThan(String value) {
            addCriterion("IS_ELIMINATION <", value, "isElimination");
            return (Criteria) this;
        }

        public Criteria andIsEliminationLessThanOrEqualTo(String value) {
            addCriterion("IS_ELIMINATION <=", value, "isElimination");
            return (Criteria) this;
        }

        public Criteria andIsEliminationLike(String value) {
            addCriterion("IS_ELIMINATION like", value, "isElimination");
            return (Criteria) this;
        }

        public Criteria andIsEliminationNotLike(String value) {
            addCriterion("IS_ELIMINATION not like", value, "isElimination");
            return (Criteria) this;
        }

        public Criteria andIsEliminationIn(List<String> values) {
            addCriterion("IS_ELIMINATION in", values, "isElimination");
            return (Criteria) this;
        }

        public Criteria andIsEliminationNotIn(List<String> values) {
            addCriterion("IS_ELIMINATION not in", values, "isElimination");
            return (Criteria) this;
        }

        public Criteria andIsEliminationBetween(String value1, String value2) {
            addCriterion("IS_ELIMINATION between", value1, value2, "isElimination");
            return (Criteria) this;
        }

        public Criteria andIsEliminationNotBetween(String value1, String value2) {
            addCriterion("IS_ELIMINATION not between", value1, value2, "isElimination");
            return (Criteria) this;
        }

        public Criteria andIsBlocEliminationIsNull() {
            addCriterion("IS_BLOC_ELIMINATION is null");
            return (Criteria) this;
        }

        public Criteria andIsBlocEliminationIsNotNull() {
            addCriterion("IS_BLOC_ELIMINATION is not null");
            return (Criteria) this;
        }

        public Criteria andIsBlocEliminationEqualTo(String value) {
            addCriterion("IS_BLOC_ELIMINATION =", value, "isBlocElimination");
            return (Criteria) this;
        }

        public Criteria andIsBlocEliminationNotEqualTo(String value) {
            addCriterion("IS_BLOC_ELIMINATION <>", value, "isBlocElimination");
            return (Criteria) this;
        }

        public Criteria andIsBlocEliminationGreaterThan(String value) {
            addCriterion("IS_BLOC_ELIMINATION >", value, "isBlocElimination");
            return (Criteria) this;
        }

        public Criteria andIsBlocEliminationGreaterThanOrEqualTo(String value) {
            addCriterion("IS_BLOC_ELIMINATION >=", value, "isBlocElimination");
            return (Criteria) this;
        }

        public Criteria andIsBlocEliminationLessThan(String value) {
            addCriterion("IS_BLOC_ELIMINATION <", value, "isBlocElimination");
            return (Criteria) this;
        }

        public Criteria andIsBlocEliminationLessThanOrEqualTo(String value) {
            addCriterion("IS_BLOC_ELIMINATION <=", value, "isBlocElimination");
            return (Criteria) this;
        }

        public Criteria andIsBlocEliminationLike(String value) {
            addCriterion("IS_BLOC_ELIMINATION like", value, "isBlocElimination");
            return (Criteria) this;
        }

        public Criteria andIsBlocEliminationNotLike(String value) {
            addCriterion("IS_BLOC_ELIMINATION not like", value, "isBlocElimination");
            return (Criteria) this;
        }

        public Criteria andIsBlocEliminationIn(List<String> values) {
            addCriterion("IS_BLOC_ELIMINATION in", values, "isBlocElimination");
            return (Criteria) this;
        }

        public Criteria andIsBlocEliminationNotIn(List<String> values) {
            addCriterion("IS_BLOC_ELIMINATION not in", values, "isBlocElimination");
            return (Criteria) this;
        }

        public Criteria andIsBlocEliminationBetween(String value1, String value2) {
            addCriterion("IS_BLOC_ELIMINATION between", value1, value2, "isBlocElimination");
            return (Criteria) this;
        }

        public Criteria andIsBlocEliminationNotBetween(String value1, String value2) {
            addCriterion("IS_BLOC_ELIMINATION not between", value1, value2, "isBlocElimination");
            return (Criteria) this;
        }

        public Criteria andExplainIsNull() {
            addCriterion("EXPLAIN is null");
            return (Criteria) this;
        }

        public Criteria andExplainIsNotNull() {
            addCriterion("EXPLAIN is not null");
            return (Criteria) this;
        }

        public Criteria andExplainEqualTo(String value) {
            addCriterion("EXPLAIN =", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotEqualTo(String value) {
            addCriterion("EXPLAIN <>", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainGreaterThan(String value) {
            addCriterion("EXPLAIN >", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainGreaterThanOrEqualTo(String value) {
            addCriterion("EXPLAIN >=", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLessThan(String value) {
            addCriterion("EXPLAIN <", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLessThanOrEqualTo(String value) {
            addCriterion("EXPLAIN <=", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLike(String value) {
            addCriterion("EXPLAIN like", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotLike(String value) {
            addCriterion("EXPLAIN not like", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainIn(List<String> values) {
            addCriterion("EXPLAIN in", values, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotIn(List<String> values) {
            addCriterion("EXPLAIN not in", values, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainBetween(String value1, String value2) {
            addCriterion("EXPLAIN between", value1, value2, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotBetween(String value1, String value2) {
            addCriterion("EXPLAIN not between", value1, value2, "explain");
            return (Criteria) this;
        }

        public Criteria andSaobCreationDateIsNull() {
            addCriterion("SAOB_CREATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSaobCreationDateIsNotNull() {
            addCriterion("SAOB_CREATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSaobCreationDateEqualTo(Date value) {
            addCriterionForJDBCDate("SAOB_CREATION_DATE =", value, "saobCreationDate");
            return (Criteria) this;
        }

        public Criteria andSaobCreationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SAOB_CREATION_DATE <>", value, "saobCreationDate");
            return (Criteria) this;
        }

        public Criteria andSaobCreationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("SAOB_CREATION_DATE >", value, "saobCreationDate");
            return (Criteria) this;
        }

        public Criteria andSaobCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SAOB_CREATION_DATE >=", value, "saobCreationDate");
            return (Criteria) this;
        }

        public Criteria andSaobCreationDateLessThan(Date value) {
            addCriterionForJDBCDate("SAOB_CREATION_DATE <", value, "saobCreationDate");
            return (Criteria) this;
        }

        public Criteria andSaobCreationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SAOB_CREATION_DATE <=", value, "saobCreationDate");
            return (Criteria) this;
        }

        public Criteria andSaobCreationDateIn(List<Date> values) {
            addCriterionForJDBCDate("SAOB_CREATION_DATE in", values, "saobCreationDate");
            return (Criteria) this;
        }

        public Criteria andSaobCreationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SAOB_CREATION_DATE not in", values, "saobCreationDate");
            return (Criteria) this;
        }

        public Criteria andSaobCreationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SAOB_CREATION_DATE between", value1, value2, "saobCreationDate");
            return (Criteria) this;
        }

        public Criteria andSaobCreationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SAOB_CREATION_DATE not between", value1, value2, "saobCreationDate");
            return (Criteria) this;
        }

        public Criteria andSaobCreatedByIsNull() {
            addCriterion("SAOB_CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andSaobCreatedByIsNotNull() {
            addCriterion("SAOB_CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andSaobCreatedByEqualTo(String value) {
            addCriterion("SAOB_CREATED_BY =", value, "saobCreatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobCreatedByNotEqualTo(String value) {
            addCriterion("SAOB_CREATED_BY <>", value, "saobCreatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobCreatedByGreaterThan(String value) {
            addCriterion("SAOB_CREATED_BY >", value, "saobCreatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("SAOB_CREATED_BY >=", value, "saobCreatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobCreatedByLessThan(String value) {
            addCriterion("SAOB_CREATED_BY <", value, "saobCreatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobCreatedByLessThanOrEqualTo(String value) {
            addCriterion("SAOB_CREATED_BY <=", value, "saobCreatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobCreatedByLike(String value) {
            addCriterion("SAOB_CREATED_BY like", value, "saobCreatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobCreatedByNotLike(String value) {
            addCriterion("SAOB_CREATED_BY not like", value, "saobCreatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobCreatedByIn(List<String> values) {
            addCriterion("SAOB_CREATED_BY in", values, "saobCreatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobCreatedByNotIn(List<String> values) {
            addCriterion("SAOB_CREATED_BY not in", values, "saobCreatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobCreatedByBetween(String value1, String value2) {
            addCriterion("SAOB_CREATED_BY between", value1, value2, "saobCreatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobCreatedByNotBetween(String value1, String value2) {
            addCriterion("SAOB_CREATED_BY not between", value1, value2, "saobCreatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdateDateIsNull() {
            addCriterion("SAOB_LAST_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdateDateIsNotNull() {
            addCriterion("SAOB_LAST_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("SAOB_LAST_UPDATE_DATE =", value, "saobLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SAOB_LAST_UPDATE_DATE <>", value, "saobLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("SAOB_LAST_UPDATE_DATE >", value, "saobLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SAOB_LAST_UPDATE_DATE >=", value, "saobLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("SAOB_LAST_UPDATE_DATE <", value, "saobLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SAOB_LAST_UPDATE_DATE <=", value, "saobLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("SAOB_LAST_UPDATE_DATE in", values, "saobLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SAOB_LAST_UPDATE_DATE not in", values, "saobLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SAOB_LAST_UPDATE_DATE between", value1, value2, "saobLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SAOB_LAST_UPDATE_DATE not between", value1, value2, "saobLastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdatedByIsNull() {
            addCriterion("SAOB_LAST_UPDATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdatedByIsNotNull() {
            addCriterion("SAOB_LAST_UPDATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdatedByEqualTo(String value) {
            addCriterion("SAOB_LAST_UPDATED_BY =", value, "saobLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdatedByNotEqualTo(String value) {
            addCriterion("SAOB_LAST_UPDATED_BY <>", value, "saobLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdatedByGreaterThan(String value) {
            addCriterion("SAOB_LAST_UPDATED_BY >", value, "saobLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("SAOB_LAST_UPDATED_BY >=", value, "saobLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdatedByLessThan(String value) {
            addCriterion("SAOB_LAST_UPDATED_BY <", value, "saobLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("SAOB_LAST_UPDATED_BY <=", value, "saobLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdatedByLike(String value) {
            addCriterion("SAOB_LAST_UPDATED_BY like", value, "saobLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdatedByNotLike(String value) {
            addCriterion("SAOB_LAST_UPDATED_BY not like", value, "saobLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdatedByIn(List<String> values) {
            addCriterion("SAOB_LAST_UPDATED_BY in", values, "saobLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdatedByNotIn(List<String> values) {
            addCriterion("SAOB_LAST_UPDATED_BY not in", values, "saobLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdatedByBetween(String value1, String value2) {
            addCriterion("SAOB_LAST_UPDATED_BY between", value1, value2, "saobLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobLastUpdatedByNotBetween(String value1, String value2) {
            addCriterion("SAOB_LAST_UPDATED_BY not between", value1, value2, "saobLastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andSaobEnableFlagIsNull() {
            addCriterion("SAOB_ENABLE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSaobEnableFlagIsNotNull() {
            addCriterion("SAOB_ENABLE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSaobEnableFlagEqualTo(String value) {
            addCriterion("SAOB_ENABLE_FLAG =", value, "saobEnableFlag");
            return (Criteria) this;
        }

        public Criteria andSaobEnableFlagNotEqualTo(String value) {
            addCriterion("SAOB_ENABLE_FLAG <>", value, "saobEnableFlag");
            return (Criteria) this;
        }

        public Criteria andSaobEnableFlagGreaterThan(String value) {
            addCriterion("SAOB_ENABLE_FLAG >", value, "saobEnableFlag");
            return (Criteria) this;
        }

        public Criteria andSaobEnableFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SAOB_ENABLE_FLAG >=", value, "saobEnableFlag");
            return (Criteria) this;
        }

        public Criteria andSaobEnableFlagLessThan(String value) {
            addCriterion("SAOB_ENABLE_FLAG <", value, "saobEnableFlag");
            return (Criteria) this;
        }

        public Criteria andSaobEnableFlagLessThanOrEqualTo(String value) {
            addCriterion("SAOB_ENABLE_FLAG <=", value, "saobEnableFlag");
            return (Criteria) this;
        }

        public Criteria andSaobEnableFlagLike(String value) {
            addCriterion("SAOB_ENABLE_FLAG like", value, "saobEnableFlag");
            return (Criteria) this;
        }

        public Criteria andSaobEnableFlagNotLike(String value) {
            addCriterion("SAOB_ENABLE_FLAG not like", value, "saobEnableFlag");
            return (Criteria) this;
        }

        public Criteria andSaobEnableFlagIn(List<String> values) {
            addCriterion("SAOB_ENABLE_FLAG in", values, "saobEnableFlag");
            return (Criteria) this;
        }

        public Criteria andSaobEnableFlagNotIn(List<String> values) {
            addCriterion("SAOB_ENABLE_FLAG not in", values, "saobEnableFlag");
            return (Criteria) this;
        }

        public Criteria andSaobEnableFlagBetween(String value1, String value2) {
            addCriterion("SAOB_ENABLE_FLAG between", value1, value2, "saobEnableFlag");
            return (Criteria) this;
        }

        public Criteria andSaobEnableFlagNotBetween(String value1, String value2) {
            addCriterion("SAOB_ENABLE_FLAG not between", value1, value2, "saobEnableFlag");
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