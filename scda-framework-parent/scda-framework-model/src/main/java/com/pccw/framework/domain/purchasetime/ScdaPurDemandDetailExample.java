package com.pccw.framework.domain.purchasetime;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScdaPurDemandDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScdaPurDemandDetailExample() {
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

        public Criteria andDeadlineDateIsNull() {
            addCriterion("DEADLINE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateIsNotNull() {
            addCriterion("DEADLINE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateEqualTo(String value) {
            addCriterion("DEADLINE_DATE =", value, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateNotEqualTo(String value) {
            addCriterion("DEADLINE_DATE <>", value, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateGreaterThan(String value) {
            addCriterion("DEADLINE_DATE >", value, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateGreaterThanOrEqualTo(String value) {
            addCriterion("DEADLINE_DATE >=", value, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateLessThan(String value) {
            addCriterion("DEADLINE_DATE <", value, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateLessThanOrEqualTo(String value) {
            addCriterion("DEADLINE_DATE <=", value, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateLike(String value) {
            addCriterion("DEADLINE_DATE like", value, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateNotLike(String value) {
            addCriterion("DEADLINE_DATE not like", value, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateIn(List<String> values) {
            addCriterion("DEADLINE_DATE in", values, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateNotIn(List<String> values) {
            addCriterion("DEADLINE_DATE not in", values, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateBetween(String value1, String value2) {
            addCriterion("DEADLINE_DATE between", value1, value2, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateNotBetween(String value1, String value2) {
            addCriterion("DEADLINE_DATE not between", value1, value2, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andFullFlowGeneralPerIsNull() {
            addCriterion("FULL_FLOW_GENERAL_PER is null");
            return (Criteria) this;
        }

        public Criteria andFullFlowGeneralPerIsNotNull() {
            addCriterion("FULL_FLOW_GENERAL_PER is not null");
            return (Criteria) this;
        }

        public Criteria andFullFlowGeneralPerEqualTo(String value) {
            addCriterion("FULL_FLOW_GENERAL_PER =", value, "fullFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowGeneralPerNotEqualTo(String value) {
            addCriterion("FULL_FLOW_GENERAL_PER <>", value, "fullFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowGeneralPerGreaterThan(String value) {
            addCriterion("FULL_FLOW_GENERAL_PER >", value, "fullFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowGeneralPerGreaterThanOrEqualTo(String value) {
            addCriterion("FULL_FLOW_GENERAL_PER >=", value, "fullFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowGeneralPerLessThan(String value) {
            addCriterion("FULL_FLOW_GENERAL_PER <", value, "fullFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowGeneralPerLessThanOrEqualTo(String value) {
            addCriterion("FULL_FLOW_GENERAL_PER <=", value, "fullFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowGeneralPerLike(String value) {
            addCriterion("FULL_FLOW_GENERAL_PER like", value, "fullFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowGeneralPerNotLike(String value) {
            addCriterion("FULL_FLOW_GENERAL_PER not like", value, "fullFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowGeneralPerIn(List<String> values) {
            addCriterion("FULL_FLOW_GENERAL_PER in", values, "fullFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowGeneralPerNotIn(List<String> values) {
            addCriterion("FULL_FLOW_GENERAL_PER not in", values, "fullFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowGeneralPerBetween(String value1, String value2) {
            addCriterion("FULL_FLOW_GENERAL_PER between", value1, value2, "fullFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowGeneralPerNotBetween(String value1, String value2) {
            addCriterion("FULL_FLOW_GENERAL_PER not between", value1, value2, "fullFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowNetworkPerIsNull() {
            addCriterion("FULL_FLOW_NETWORK_PER is null");
            return (Criteria) this;
        }

        public Criteria andFullFlowNetworkPerIsNotNull() {
            addCriterion("FULL_FLOW_NETWORK_PER is not null");
            return (Criteria) this;
        }

        public Criteria andFullFlowNetworkPerEqualTo(String value) {
            addCriterion("FULL_FLOW_NETWORK_PER =", value, "fullFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowNetworkPerNotEqualTo(String value) {
            addCriterion("FULL_FLOW_NETWORK_PER <>", value, "fullFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowNetworkPerGreaterThan(String value) {
            addCriterion("FULL_FLOW_NETWORK_PER >", value, "fullFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowNetworkPerGreaterThanOrEqualTo(String value) {
            addCriterion("FULL_FLOW_NETWORK_PER >=", value, "fullFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowNetworkPerLessThan(String value) {
            addCriterion("FULL_FLOW_NETWORK_PER <", value, "fullFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowNetworkPerLessThanOrEqualTo(String value) {
            addCriterion("FULL_FLOW_NETWORK_PER <=", value, "fullFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowNetworkPerLike(String value) {
            addCriterion("FULL_FLOW_NETWORK_PER like", value, "fullFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowNetworkPerNotLike(String value) {
            addCriterion("FULL_FLOW_NETWORK_PER not like", value, "fullFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowNetworkPerIn(List<String> values) {
            addCriterion("FULL_FLOW_NETWORK_PER in", values, "fullFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowNetworkPerNotIn(List<String> values) {
            addCriterion("FULL_FLOW_NETWORK_PER not in", values, "fullFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowNetworkPerBetween(String value1, String value2) {
            addCriterion("FULL_FLOW_NETWORK_PER between", value1, value2, "fullFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowNetworkPerNotBetween(String value1, String value2) {
            addCriterion("FULL_FLOW_NETWORK_PER not between", value1, value2, "fullFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andFullFlowCurrentAveIsNull() {
            addCriterion("FULL_FLOW_CURRENT_AVE is null");
            return (Criteria) this;
        }

        public Criteria andFullFlowCurrentAveIsNotNull() {
            addCriterion("FULL_FLOW_CURRENT_AVE is not null");
            return (Criteria) this;
        }

        public Criteria andFullFlowCurrentAveEqualTo(String value) {
            addCriterion("FULL_FLOW_CURRENT_AVE =", value, "fullFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowCurrentAveNotEqualTo(String value) {
            addCriterion("FULL_FLOW_CURRENT_AVE <>", value, "fullFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowCurrentAveGreaterThan(String value) {
            addCriterion("FULL_FLOW_CURRENT_AVE >", value, "fullFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowCurrentAveGreaterThanOrEqualTo(String value) {
            addCriterion("FULL_FLOW_CURRENT_AVE >=", value, "fullFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowCurrentAveLessThan(String value) {
            addCriterion("FULL_FLOW_CURRENT_AVE <", value, "fullFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowCurrentAveLessThanOrEqualTo(String value) {
            addCriterion("FULL_FLOW_CURRENT_AVE <=", value, "fullFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowCurrentAveLike(String value) {
            addCriterion("FULL_FLOW_CURRENT_AVE like", value, "fullFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowCurrentAveNotLike(String value) {
            addCriterion("FULL_FLOW_CURRENT_AVE not like", value, "fullFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowCurrentAveIn(List<String> values) {
            addCriterion("FULL_FLOW_CURRENT_AVE in", values, "fullFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowCurrentAveNotIn(List<String> values) {
            addCriterion("FULL_FLOW_CURRENT_AVE not in", values, "fullFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowCurrentAveBetween(String value1, String value2) {
            addCriterion("FULL_FLOW_CURRENT_AVE between", value1, value2, "fullFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowCurrentAveNotBetween(String value1, String value2) {
            addCriterion("FULL_FLOW_CURRENT_AVE not between", value1, value2, "fullFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowBeforeAveIsNull() {
            addCriterion("FULL_FLOW_BEFORE_AVE is null");
            return (Criteria) this;
        }

        public Criteria andFullFlowBeforeAveIsNotNull() {
            addCriterion("FULL_FLOW_BEFORE_AVE is not null");
            return (Criteria) this;
        }

        public Criteria andFullFlowBeforeAveEqualTo(String value) {
            addCriterion("FULL_FLOW_BEFORE_AVE =", value, "fullFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowBeforeAveNotEqualTo(String value) {
            addCriterion("FULL_FLOW_BEFORE_AVE <>", value, "fullFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowBeforeAveGreaterThan(String value) {
            addCriterion("FULL_FLOW_BEFORE_AVE >", value, "fullFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowBeforeAveGreaterThanOrEqualTo(String value) {
            addCriterion("FULL_FLOW_BEFORE_AVE >=", value, "fullFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowBeforeAveLessThan(String value) {
            addCriterion("FULL_FLOW_BEFORE_AVE <", value, "fullFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowBeforeAveLessThanOrEqualTo(String value) {
            addCriterion("FULL_FLOW_BEFORE_AVE <=", value, "fullFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowBeforeAveLike(String value) {
            addCriterion("FULL_FLOW_BEFORE_AVE like", value, "fullFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowBeforeAveNotLike(String value) {
            addCriterion("FULL_FLOW_BEFORE_AVE not like", value, "fullFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowBeforeAveIn(List<String> values) {
            addCriterion("FULL_FLOW_BEFORE_AVE in", values, "fullFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowBeforeAveNotIn(List<String> values) {
            addCriterion("FULL_FLOW_BEFORE_AVE not in", values, "fullFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowBeforeAveBetween(String value1, String value2) {
            addCriterion("FULL_FLOW_BEFORE_AVE between", value1, value2, "fullFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowBeforeAveNotBetween(String value1, String value2) {
            addCriterion("FULL_FLOW_BEFORE_AVE not between", value1, value2, "fullFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowTotalAveIsNull() {
            addCriterion("FULL_FLOW_TOTAL_AVE is null");
            return (Criteria) this;
        }

        public Criteria andFullFlowTotalAveIsNotNull() {
            addCriterion("FULL_FLOW_TOTAL_AVE is not null");
            return (Criteria) this;
        }

        public Criteria andFullFlowTotalAveEqualTo(String value) {
            addCriterion("FULL_FLOW_TOTAL_AVE =", value, "fullFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowTotalAveNotEqualTo(String value) {
            addCriterion("FULL_FLOW_TOTAL_AVE <>", value, "fullFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowTotalAveGreaterThan(String value) {
            addCriterion("FULL_FLOW_TOTAL_AVE >", value, "fullFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowTotalAveGreaterThanOrEqualTo(String value) {
            addCriterion("FULL_FLOW_TOTAL_AVE >=", value, "fullFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowTotalAveLessThan(String value) {
            addCriterion("FULL_FLOW_TOTAL_AVE <", value, "fullFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowTotalAveLessThanOrEqualTo(String value) {
            addCriterion("FULL_FLOW_TOTAL_AVE <=", value, "fullFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowTotalAveLike(String value) {
            addCriterion("FULL_FLOW_TOTAL_AVE like", value, "fullFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowTotalAveNotLike(String value) {
            addCriterion("FULL_FLOW_TOTAL_AVE not like", value, "fullFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowTotalAveIn(List<String> values) {
            addCriterion("FULL_FLOW_TOTAL_AVE in", values, "fullFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowTotalAveNotIn(List<String> values) {
            addCriterion("FULL_FLOW_TOTAL_AVE not in", values, "fullFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowTotalAveBetween(String value1, String value2) {
            addCriterion("FULL_FLOW_TOTAL_AVE between", value1, value2, "fullFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andFullFlowTotalAveNotBetween(String value1, String value2) {
            addCriterion("FULL_FLOW_TOTAL_AVE not between", value1, value2, "fullFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowGeneralPerIsNull() {
            addCriterion("KEY_FLOW_GENERAL_PER is null");
            return (Criteria) this;
        }

        public Criteria andKeyFlowGeneralPerIsNotNull() {
            addCriterion("KEY_FLOW_GENERAL_PER is not null");
            return (Criteria) this;
        }

        public Criteria andKeyFlowGeneralPerEqualTo(String value) {
            addCriterion("KEY_FLOW_GENERAL_PER =", value, "keyFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowGeneralPerNotEqualTo(String value) {
            addCriterion("KEY_FLOW_GENERAL_PER <>", value, "keyFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowGeneralPerGreaterThan(String value) {
            addCriterion("KEY_FLOW_GENERAL_PER >", value, "keyFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowGeneralPerGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_FLOW_GENERAL_PER >=", value, "keyFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowGeneralPerLessThan(String value) {
            addCriterion("KEY_FLOW_GENERAL_PER <", value, "keyFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowGeneralPerLessThanOrEqualTo(String value) {
            addCriterion("KEY_FLOW_GENERAL_PER <=", value, "keyFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowGeneralPerLike(String value) {
            addCriterion("KEY_FLOW_GENERAL_PER like", value, "keyFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowGeneralPerNotLike(String value) {
            addCriterion("KEY_FLOW_GENERAL_PER not like", value, "keyFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowGeneralPerIn(List<String> values) {
            addCriterion("KEY_FLOW_GENERAL_PER in", values, "keyFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowGeneralPerNotIn(List<String> values) {
            addCriterion("KEY_FLOW_GENERAL_PER not in", values, "keyFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowGeneralPerBetween(String value1, String value2) {
            addCriterion("KEY_FLOW_GENERAL_PER between", value1, value2, "keyFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowGeneralPerNotBetween(String value1, String value2) {
            addCriterion("KEY_FLOW_GENERAL_PER not between", value1, value2, "keyFlowGeneralPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowNetworkPerIsNull() {
            addCriterion("KEY_FLOW_NETWORK_PER is null");
            return (Criteria) this;
        }

        public Criteria andKeyFlowNetworkPerIsNotNull() {
            addCriterion("KEY_FLOW_NETWORK_PER is not null");
            return (Criteria) this;
        }

        public Criteria andKeyFlowNetworkPerEqualTo(String value) {
            addCriterion("KEY_FLOW_NETWORK_PER =", value, "keyFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowNetworkPerNotEqualTo(String value) {
            addCriterion("KEY_FLOW_NETWORK_PER <>", value, "keyFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowNetworkPerGreaterThan(String value) {
            addCriterion("KEY_FLOW_NETWORK_PER >", value, "keyFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowNetworkPerGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_FLOW_NETWORK_PER >=", value, "keyFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowNetworkPerLessThan(String value) {
            addCriterion("KEY_FLOW_NETWORK_PER <", value, "keyFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowNetworkPerLessThanOrEqualTo(String value) {
            addCriterion("KEY_FLOW_NETWORK_PER <=", value, "keyFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowNetworkPerLike(String value) {
            addCriterion("KEY_FLOW_NETWORK_PER like", value, "keyFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowNetworkPerNotLike(String value) {
            addCriterion("KEY_FLOW_NETWORK_PER not like", value, "keyFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowNetworkPerIn(List<String> values) {
            addCriterion("KEY_FLOW_NETWORK_PER in", values, "keyFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowNetworkPerNotIn(List<String> values) {
            addCriterion("KEY_FLOW_NETWORK_PER not in", values, "keyFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowNetworkPerBetween(String value1, String value2) {
            addCriterion("KEY_FLOW_NETWORK_PER between", value1, value2, "keyFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowNetworkPerNotBetween(String value1, String value2) {
            addCriterion("KEY_FLOW_NETWORK_PER not between", value1, value2, "keyFlowNetworkPer");
            return (Criteria) this;
        }

        public Criteria andKeyFlowCurrentAveIsNull() {
            addCriterion("KEY_FLOW_CURRENT_AVE is null");
            return (Criteria) this;
        }

        public Criteria andKeyFlowCurrentAveIsNotNull() {
            addCriterion("KEY_FLOW_CURRENT_AVE is not null");
            return (Criteria) this;
        }

        public Criteria andKeyFlowCurrentAveEqualTo(String value) {
            addCriterion("KEY_FLOW_CURRENT_AVE =", value, "keyFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowCurrentAveNotEqualTo(String value) {
            addCriterion("KEY_FLOW_CURRENT_AVE <>", value, "keyFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowCurrentAveGreaterThan(String value) {
            addCriterion("KEY_FLOW_CURRENT_AVE >", value, "keyFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowCurrentAveGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_FLOW_CURRENT_AVE >=", value, "keyFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowCurrentAveLessThan(String value) {
            addCriterion("KEY_FLOW_CURRENT_AVE <", value, "keyFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowCurrentAveLessThanOrEqualTo(String value) {
            addCriterion("KEY_FLOW_CURRENT_AVE <=", value, "keyFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowCurrentAveLike(String value) {
            addCriterion("KEY_FLOW_CURRENT_AVE like", value, "keyFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowCurrentAveNotLike(String value) {
            addCriterion("KEY_FLOW_CURRENT_AVE not like", value, "keyFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowCurrentAveIn(List<String> values) {
            addCriterion("KEY_FLOW_CURRENT_AVE in", values, "keyFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowCurrentAveNotIn(List<String> values) {
            addCriterion("KEY_FLOW_CURRENT_AVE not in", values, "keyFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowCurrentAveBetween(String value1, String value2) {
            addCriterion("KEY_FLOW_CURRENT_AVE between", value1, value2, "keyFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowCurrentAveNotBetween(String value1, String value2) {
            addCriterion("KEY_FLOW_CURRENT_AVE not between", value1, value2, "keyFlowCurrentAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowBeforeAveIsNull() {
            addCriterion("KEY_FLOW_BEFORE_AVE is null");
            return (Criteria) this;
        }

        public Criteria andKeyFlowBeforeAveIsNotNull() {
            addCriterion("KEY_FLOW_BEFORE_AVE is not null");
            return (Criteria) this;
        }

        public Criteria andKeyFlowBeforeAveEqualTo(String value) {
            addCriterion("KEY_FLOW_BEFORE_AVE =", value, "keyFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowBeforeAveNotEqualTo(String value) {
            addCriterion("KEY_FLOW_BEFORE_AVE <>", value, "keyFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowBeforeAveGreaterThan(String value) {
            addCriterion("KEY_FLOW_BEFORE_AVE >", value, "keyFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowBeforeAveGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_FLOW_BEFORE_AVE >=", value, "keyFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowBeforeAveLessThan(String value) {
            addCriterion("KEY_FLOW_BEFORE_AVE <", value, "keyFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowBeforeAveLessThanOrEqualTo(String value) {
            addCriterion("KEY_FLOW_BEFORE_AVE <=", value, "keyFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowBeforeAveLike(String value) {
            addCriterion("KEY_FLOW_BEFORE_AVE like", value, "keyFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowBeforeAveNotLike(String value) {
            addCriterion("KEY_FLOW_BEFORE_AVE not like", value, "keyFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowBeforeAveIn(List<String> values) {
            addCriterion("KEY_FLOW_BEFORE_AVE in", values, "keyFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowBeforeAveNotIn(List<String> values) {
            addCriterion("KEY_FLOW_BEFORE_AVE not in", values, "keyFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowBeforeAveBetween(String value1, String value2) {
            addCriterion("KEY_FLOW_BEFORE_AVE between", value1, value2, "keyFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowBeforeAveNotBetween(String value1, String value2) {
            addCriterion("KEY_FLOW_BEFORE_AVE not between", value1, value2, "keyFlowBeforeAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowTotalAveIsNull() {
            addCriterion("KEY_FLOW_TOTAL_AVE is null");
            return (Criteria) this;
        }

        public Criteria andKeyFlowTotalAveIsNotNull() {
            addCriterion("KEY_FLOW_TOTAL_AVE is not null");
            return (Criteria) this;
        }

        public Criteria andKeyFlowTotalAveEqualTo(String value) {
            addCriterion("KEY_FLOW_TOTAL_AVE =", value, "keyFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowTotalAveNotEqualTo(String value) {
            addCriterion("KEY_FLOW_TOTAL_AVE <>", value, "keyFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowTotalAveGreaterThan(String value) {
            addCriterion("KEY_FLOW_TOTAL_AVE >", value, "keyFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowTotalAveGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_FLOW_TOTAL_AVE >=", value, "keyFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowTotalAveLessThan(String value) {
            addCriterion("KEY_FLOW_TOTAL_AVE <", value, "keyFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowTotalAveLessThanOrEqualTo(String value) {
            addCriterion("KEY_FLOW_TOTAL_AVE <=", value, "keyFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowTotalAveLike(String value) {
            addCriterion("KEY_FLOW_TOTAL_AVE like", value, "keyFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowTotalAveNotLike(String value) {
            addCriterion("KEY_FLOW_TOTAL_AVE not like", value, "keyFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowTotalAveIn(List<String> values) {
            addCriterion("KEY_FLOW_TOTAL_AVE in", values, "keyFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowTotalAveNotIn(List<String> values) {
            addCriterion("KEY_FLOW_TOTAL_AVE not in", values, "keyFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowTotalAveBetween(String value1, String value2) {
            addCriterion("KEY_FLOW_TOTAL_AVE between", value1, value2, "keyFlowTotalAve");
            return (Criteria) this;
        }

        public Criteria andKeyFlowTotalAveNotBetween(String value1, String value2) {
            addCriterion("KEY_FLOW_TOTAL_AVE not between", value1, value2, "keyFlowTotalAve");
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