package com.pccw.framework.domain.purchasecontrol;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScdaDeptPurDemandandpreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScdaDeptPurDemandandpreExample() {
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

        public Criteria andDpdIdIsNull() {
            addCriterion("DPD_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpdIdIsNotNull() {
            addCriterion("DPD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpdIdEqualTo(String value) {
            addCriterion("DPD_ID =", value, "dpdId");
            return (Criteria) this;
        }

        public Criteria andDpdIdNotEqualTo(String value) {
            addCriterion("DPD_ID <>", value, "dpdId");
            return (Criteria) this;
        }

        public Criteria andDpdIdGreaterThan(String value) {
            addCriterion("DPD_ID >", value, "dpdId");
            return (Criteria) this;
        }

        public Criteria andDpdIdGreaterThanOrEqualTo(String value) {
            addCriterion("DPD_ID >=", value, "dpdId");
            return (Criteria) this;
        }

        public Criteria andDpdIdLessThan(String value) {
            addCriterion("DPD_ID <", value, "dpdId");
            return (Criteria) this;
        }

        public Criteria andDpdIdLessThanOrEqualTo(String value) {
            addCriterion("DPD_ID <=", value, "dpdId");
            return (Criteria) this;
        }

        public Criteria andDpdIdLike(String value) {
            addCriterion("DPD_ID like", value, "dpdId");
            return (Criteria) this;
        }

        public Criteria andDpdIdNotLike(String value) {
            addCriterion("DPD_ID not like", value, "dpdId");
            return (Criteria) this;
        }

        public Criteria andDpdIdIn(List<String> values) {
            addCriterion("DPD_ID in", values, "dpdId");
            return (Criteria) this;
        }

        public Criteria andDpdIdNotIn(List<String> values) {
            addCriterion("DPD_ID not in", values, "dpdId");
            return (Criteria) this;
        }

        public Criteria andDpdIdBetween(String value1, String value2) {
            addCriterion("DPD_ID between", value1, value2, "dpdId");
            return (Criteria) this;
        }

        public Criteria andDpdIdNotBetween(String value1, String value2) {
            addCriterion("DPD_ID not between", value1, value2, "dpdId");
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

        public Criteria andYearTwodeptTotalIsNull() {
            addCriterion("YEAR_TWODEPT_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andYearTwodeptTotalIsNotNull() {
            addCriterion("YEAR_TWODEPT_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andYearTwodeptTotalEqualTo(String value) {
            addCriterion("YEAR_TWODEPT_TOTAL =", value, "yearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andYearTwodeptTotalNotEqualTo(String value) {
            addCriterion("YEAR_TWODEPT_TOTAL <>", value, "yearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andYearTwodeptTotalGreaterThan(String value) {
            addCriterion("YEAR_TWODEPT_TOTAL >", value, "yearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andYearTwodeptTotalGreaterThanOrEqualTo(String value) {
            addCriterion("YEAR_TWODEPT_TOTAL >=", value, "yearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andYearTwodeptTotalLessThan(String value) {
            addCriterion("YEAR_TWODEPT_TOTAL <", value, "yearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andYearTwodeptTotalLessThanOrEqualTo(String value) {
            addCriterion("YEAR_TWODEPT_TOTAL <=", value, "yearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andYearTwodeptTotalLike(String value) {
            addCriterion("YEAR_TWODEPT_TOTAL like", value, "yearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andYearTwodeptTotalNotLike(String value) {
            addCriterion("YEAR_TWODEPT_TOTAL not like", value, "yearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andYearTwodeptTotalIn(List<String> values) {
            addCriterion("YEAR_TWODEPT_TOTAL in", values, "yearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andYearTwodeptTotalNotIn(List<String> values) {
            addCriterion("YEAR_TWODEPT_TOTAL not in", values, "yearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andYearTwodeptTotalBetween(String value1, String value2) {
            addCriterion("YEAR_TWODEPT_TOTAL between", value1, value2, "yearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andYearTwodeptTotalNotBetween(String value1, String value2) {
            addCriterion("YEAR_TWODEPT_TOTAL not between", value1, value2, "yearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andBefyearTwodeptTotalIsNull() {
            addCriterion("BEFYEAR_TWODEPT_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andBefyearTwodeptTotalIsNotNull() {
            addCriterion("BEFYEAR_TWODEPT_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andBefyearTwodeptTotalEqualTo(String value) {
            addCriterion("BEFYEAR_TWODEPT_TOTAL =", value, "befyearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andBefyearTwodeptTotalNotEqualTo(String value) {
            addCriterion("BEFYEAR_TWODEPT_TOTAL <>", value, "befyearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andBefyearTwodeptTotalGreaterThan(String value) {
            addCriterion("BEFYEAR_TWODEPT_TOTAL >", value, "befyearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andBefyearTwodeptTotalGreaterThanOrEqualTo(String value) {
            addCriterion("BEFYEAR_TWODEPT_TOTAL >=", value, "befyearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andBefyearTwodeptTotalLessThan(String value) {
            addCriterion("BEFYEAR_TWODEPT_TOTAL <", value, "befyearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andBefyearTwodeptTotalLessThanOrEqualTo(String value) {
            addCriterion("BEFYEAR_TWODEPT_TOTAL <=", value, "befyearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andBefyearTwodeptTotalLike(String value) {
            addCriterion("BEFYEAR_TWODEPT_TOTAL like", value, "befyearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andBefyearTwodeptTotalNotLike(String value) {
            addCriterion("BEFYEAR_TWODEPT_TOTAL not like", value, "befyearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andBefyearTwodeptTotalIn(List<String> values) {
            addCriterion("BEFYEAR_TWODEPT_TOTAL in", values, "befyearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andBefyearTwodeptTotalNotIn(List<String> values) {
            addCriterion("BEFYEAR_TWODEPT_TOTAL not in", values, "befyearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andBefyearTwodeptTotalBetween(String value1, String value2) {
            addCriterion("BEFYEAR_TWODEPT_TOTAL between", value1, value2, "befyearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andBefyearTwodeptTotalNotBetween(String value1, String value2) {
            addCriterion("BEFYEAR_TWODEPT_TOTAL not between", value1, value2, "befyearTwodeptTotal");
            return (Criteria) this;
        }

        public Criteria andYealNetworkTotalIsNull() {
            addCriterion("YEAL_NETWORK_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andYealNetworkTotalIsNotNull() {
            addCriterion("YEAL_NETWORK_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andYealNetworkTotalEqualTo(String value) {
            addCriterion("YEAL_NETWORK_TOTAL =", value, "yealNetworkTotal");
            return (Criteria) this;
        }

        public Criteria andYealNetworkTotalNotEqualTo(String value) {
            addCriterion("YEAL_NETWORK_TOTAL <>", value, "yealNetworkTotal");
            return (Criteria) this;
        }

        public Criteria andYealNetworkTotalGreaterThan(String value) {
            addCriterion("YEAL_NETWORK_TOTAL >", value, "yealNetworkTotal");
            return (Criteria) this;
        }

        public Criteria andYealNetworkTotalGreaterThanOrEqualTo(String value) {
            addCriterion("YEAL_NETWORK_TOTAL >=", value, "yealNetworkTotal");
            return (Criteria) this;
        }

        public Criteria andYealNetworkTotalLessThan(String value) {
            addCriterion("YEAL_NETWORK_TOTAL <", value, "yealNetworkTotal");
            return (Criteria) this;
        }

        public Criteria andYealNetworkTotalLessThanOrEqualTo(String value) {
            addCriterion("YEAL_NETWORK_TOTAL <=", value, "yealNetworkTotal");
            return (Criteria) this;
        }

        public Criteria andYealNetworkTotalLike(String value) {
            addCriterion("YEAL_NETWORK_TOTAL like", value, "yealNetworkTotal");
            return (Criteria) this;
        }

        public Criteria andYealNetworkTotalNotLike(String value) {
            addCriterion("YEAL_NETWORK_TOTAL not like", value, "yealNetworkTotal");
            return (Criteria) this;
        }

        public Criteria andYealNetworkTotalIn(List<String> values) {
            addCriterion("YEAL_NETWORK_TOTAL in", values, "yealNetworkTotal");
            return (Criteria) this;
        }

        public Criteria andYealNetworkTotalNotIn(List<String> values) {
            addCriterion("YEAL_NETWORK_TOTAL not in", values, "yealNetworkTotal");
            return (Criteria) this;
        }

        public Criteria andYealNetworkTotalBetween(String value1, String value2) {
            addCriterion("YEAL_NETWORK_TOTAL between", value1, value2, "yealNetworkTotal");
            return (Criteria) this;
        }

        public Criteria andYealNetworkTotalNotBetween(String value1, String value2) {
            addCriterion("YEAL_NETWORK_TOTAL not between", value1, value2, "yealNetworkTotal");
            return (Criteria) this;
        }

        public Criteria andYealNetworkCompletedIsNull() {
            addCriterion("YEAL_NETWORK_COMPLETED is null");
            return (Criteria) this;
        }

        public Criteria andYealNetworkCompletedIsNotNull() {
            addCriterion("YEAL_NETWORK_COMPLETED is not null");
            return (Criteria) this;
        }

        public Criteria andYealNetworkCompletedEqualTo(String value) {
            addCriterion("YEAL_NETWORK_COMPLETED =", value, "yealNetworkCompleted");
            return (Criteria) this;
        }

        public Criteria andYealNetworkCompletedNotEqualTo(String value) {
            addCriterion("YEAL_NETWORK_COMPLETED <>", value, "yealNetworkCompleted");
            return (Criteria) this;
        }

        public Criteria andYealNetworkCompletedGreaterThan(String value) {
            addCriterion("YEAL_NETWORK_COMPLETED >", value, "yealNetworkCompleted");
            return (Criteria) this;
        }

        public Criteria andYealNetworkCompletedGreaterThanOrEqualTo(String value) {
            addCriterion("YEAL_NETWORK_COMPLETED >=", value, "yealNetworkCompleted");
            return (Criteria) this;
        }

        public Criteria andYealNetworkCompletedLessThan(String value) {
            addCriterion("YEAL_NETWORK_COMPLETED <", value, "yealNetworkCompleted");
            return (Criteria) this;
        }

        public Criteria andYealNetworkCompletedLessThanOrEqualTo(String value) {
            addCriterion("YEAL_NETWORK_COMPLETED <=", value, "yealNetworkCompleted");
            return (Criteria) this;
        }

        public Criteria andYealNetworkCompletedLike(String value) {
            addCriterion("YEAL_NETWORK_COMPLETED like", value, "yealNetworkCompleted");
            return (Criteria) this;
        }

        public Criteria andYealNetworkCompletedNotLike(String value) {
            addCriterion("YEAL_NETWORK_COMPLETED not like", value, "yealNetworkCompleted");
            return (Criteria) this;
        }

        public Criteria andYealNetworkCompletedIn(List<String> values) {
            addCriterion("YEAL_NETWORK_COMPLETED in", values, "yealNetworkCompleted");
            return (Criteria) this;
        }

        public Criteria andYealNetworkCompletedNotIn(List<String> values) {
            addCriterion("YEAL_NETWORK_COMPLETED not in", values, "yealNetworkCompleted");
            return (Criteria) this;
        }

        public Criteria andYealNetworkCompletedBetween(String value1, String value2) {
            addCriterion("YEAL_NETWORK_COMPLETED between", value1, value2, "yealNetworkCompleted");
            return (Criteria) this;
        }

        public Criteria andYealNetworkCompletedNotBetween(String value1, String value2) {
            addCriterion("YEAL_NETWORK_COMPLETED not between", value1, value2, "yealNetworkCompleted");
            return (Criteria) this;
        }

        public Criteria andYealNetworkPercentageIsNull() {
            addCriterion("YEAL_NETWORK_PERCENTAGE is null");
            return (Criteria) this;
        }

        public Criteria andYealNetworkPercentageIsNotNull() {
            addCriterion("YEAL_NETWORK_PERCENTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andYealNetworkPercentageEqualTo(String value) {
            addCriterion("YEAL_NETWORK_PERCENTAGE =", value, "yealNetworkPercentage");
            return (Criteria) this;
        }

        public Criteria andYealNetworkPercentageNotEqualTo(String value) {
            addCriterion("YEAL_NETWORK_PERCENTAGE <>", value, "yealNetworkPercentage");
            return (Criteria) this;
        }

        public Criteria andYealNetworkPercentageGreaterThan(String value) {
            addCriterion("YEAL_NETWORK_PERCENTAGE >", value, "yealNetworkPercentage");
            return (Criteria) this;
        }

        public Criteria andYealNetworkPercentageGreaterThanOrEqualTo(String value) {
            addCriterion("YEAL_NETWORK_PERCENTAGE >=", value, "yealNetworkPercentage");
            return (Criteria) this;
        }

        public Criteria andYealNetworkPercentageLessThan(String value) {
            addCriterion("YEAL_NETWORK_PERCENTAGE <", value, "yealNetworkPercentage");
            return (Criteria) this;
        }

        public Criteria andYealNetworkPercentageLessThanOrEqualTo(String value) {
            addCriterion("YEAL_NETWORK_PERCENTAGE <=", value, "yealNetworkPercentage");
            return (Criteria) this;
        }

        public Criteria andYealNetworkPercentageLike(String value) {
            addCriterion("YEAL_NETWORK_PERCENTAGE like", value, "yealNetworkPercentage");
            return (Criteria) this;
        }

        public Criteria andYealNetworkPercentageNotLike(String value) {
            addCriterion("YEAL_NETWORK_PERCENTAGE not like", value, "yealNetworkPercentage");
            return (Criteria) this;
        }

        public Criteria andYealNetworkPercentageIn(List<String> values) {
            addCriterion("YEAL_NETWORK_PERCENTAGE in", values, "yealNetworkPercentage");
            return (Criteria) this;
        }

        public Criteria andYealNetworkPercentageNotIn(List<String> values) {
            addCriterion("YEAL_NETWORK_PERCENTAGE not in", values, "yealNetworkPercentage");
            return (Criteria) this;
        }

        public Criteria andYealNetworkPercentageBetween(String value1, String value2) {
            addCriterion("YEAL_NETWORK_PERCENTAGE between", value1, value2, "yealNetworkPercentage");
            return (Criteria) this;
        }

        public Criteria andYealNetworkPercentageNotBetween(String value1, String value2) {
            addCriterion("YEAL_NETWORK_PERCENTAGE not between", value1, value2, "yealNetworkPercentage");
            return (Criteria) this;
        }

        public Criteria andYealGeneralTotalIsNull() {
            addCriterion("YEAL_GENERAL_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andYealGeneralTotalIsNotNull() {
            addCriterion("YEAL_GENERAL_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andYealGeneralTotalEqualTo(String value) {
            addCriterion("YEAL_GENERAL_TOTAL =", value, "yealGeneralTotal");
            return (Criteria) this;
        }

        public Criteria andYealGeneralTotalNotEqualTo(String value) {
            addCriterion("YEAL_GENERAL_TOTAL <>", value, "yealGeneralTotal");
            return (Criteria) this;
        }

        public Criteria andYealGeneralTotalGreaterThan(String value) {
            addCriterion("YEAL_GENERAL_TOTAL >", value, "yealGeneralTotal");
            return (Criteria) this;
        }

        public Criteria andYealGeneralTotalGreaterThanOrEqualTo(String value) {
            addCriterion("YEAL_GENERAL_TOTAL >=", value, "yealGeneralTotal");
            return (Criteria) this;
        }

        public Criteria andYealGeneralTotalLessThan(String value) {
            addCriterion("YEAL_GENERAL_TOTAL <", value, "yealGeneralTotal");
            return (Criteria) this;
        }

        public Criteria andYealGeneralTotalLessThanOrEqualTo(String value) {
            addCriterion("YEAL_GENERAL_TOTAL <=", value, "yealGeneralTotal");
            return (Criteria) this;
        }

        public Criteria andYealGeneralTotalLike(String value) {
            addCriterion("YEAL_GENERAL_TOTAL like", value, "yealGeneralTotal");
            return (Criteria) this;
        }

        public Criteria andYealGeneralTotalNotLike(String value) {
            addCriterion("YEAL_GENERAL_TOTAL not like", value, "yealGeneralTotal");
            return (Criteria) this;
        }

        public Criteria andYealGeneralTotalIn(List<String> values) {
            addCriterion("YEAL_GENERAL_TOTAL in", values, "yealGeneralTotal");
            return (Criteria) this;
        }

        public Criteria andYealGeneralTotalNotIn(List<String> values) {
            addCriterion("YEAL_GENERAL_TOTAL not in", values, "yealGeneralTotal");
            return (Criteria) this;
        }

        public Criteria andYealGeneralTotalBetween(String value1, String value2) {
            addCriterion("YEAL_GENERAL_TOTAL between", value1, value2, "yealGeneralTotal");
            return (Criteria) this;
        }

        public Criteria andYealGeneralTotalNotBetween(String value1, String value2) {
            addCriterion("YEAL_GENERAL_TOTAL not between", value1, value2, "yealGeneralTotal");
            return (Criteria) this;
        }

        public Criteria andYealGeneralCompletedIsNull() {
            addCriterion("YEAL_GENERAL_COMPLETED is null");
            return (Criteria) this;
        }

        public Criteria andYealGeneralCompletedIsNotNull() {
            addCriterion("YEAL_GENERAL_COMPLETED is not null");
            return (Criteria) this;
        }

        public Criteria andYealGeneralCompletedEqualTo(String value) {
            addCriterion("YEAL_GENERAL_COMPLETED =", value, "yealGeneralCompleted");
            return (Criteria) this;
        }

        public Criteria andYealGeneralCompletedNotEqualTo(String value) {
            addCriterion("YEAL_GENERAL_COMPLETED <>", value, "yealGeneralCompleted");
            return (Criteria) this;
        }

        public Criteria andYealGeneralCompletedGreaterThan(String value) {
            addCriterion("YEAL_GENERAL_COMPLETED >", value, "yealGeneralCompleted");
            return (Criteria) this;
        }

        public Criteria andYealGeneralCompletedGreaterThanOrEqualTo(String value) {
            addCriterion("YEAL_GENERAL_COMPLETED >=", value, "yealGeneralCompleted");
            return (Criteria) this;
        }

        public Criteria andYealGeneralCompletedLessThan(String value) {
            addCriterion("YEAL_GENERAL_COMPLETED <", value, "yealGeneralCompleted");
            return (Criteria) this;
        }

        public Criteria andYealGeneralCompletedLessThanOrEqualTo(String value) {
            addCriterion("YEAL_GENERAL_COMPLETED <=", value, "yealGeneralCompleted");
            return (Criteria) this;
        }

        public Criteria andYealGeneralCompletedLike(String value) {
            addCriterion("YEAL_GENERAL_COMPLETED like", value, "yealGeneralCompleted");
            return (Criteria) this;
        }

        public Criteria andYealGeneralCompletedNotLike(String value) {
            addCriterion("YEAL_GENERAL_COMPLETED not like", value, "yealGeneralCompleted");
            return (Criteria) this;
        }

        public Criteria andYealGeneralCompletedIn(List<String> values) {
            addCriterion("YEAL_GENERAL_COMPLETED in", values, "yealGeneralCompleted");
            return (Criteria) this;
        }

        public Criteria andYealGeneralCompletedNotIn(List<String> values) {
            addCriterion("YEAL_GENERAL_COMPLETED not in", values, "yealGeneralCompleted");
            return (Criteria) this;
        }

        public Criteria andYealGeneralCompletedBetween(String value1, String value2) {
            addCriterion("YEAL_GENERAL_COMPLETED between", value1, value2, "yealGeneralCompleted");
            return (Criteria) this;
        }

        public Criteria andYealGeneralCompletedNotBetween(String value1, String value2) {
            addCriterion("YEAL_GENERAL_COMPLETED not between", value1, value2, "yealGeneralCompleted");
            return (Criteria) this;
        }

        public Criteria andYealGeneralPercentageIsNull() {
            addCriterion("YEAL_GENERAL_PERCENTAGE is null");
            return (Criteria) this;
        }

        public Criteria andYealGeneralPercentageIsNotNull() {
            addCriterion("YEAL_GENERAL_PERCENTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andYealGeneralPercentageEqualTo(String value) {
            addCriterion("YEAL_GENERAL_PERCENTAGE =", value, "yealGeneralPercentage");
            return (Criteria) this;
        }

        public Criteria andYealGeneralPercentageNotEqualTo(String value) {
            addCriterion("YEAL_GENERAL_PERCENTAGE <>", value, "yealGeneralPercentage");
            return (Criteria) this;
        }

        public Criteria andYealGeneralPercentageGreaterThan(String value) {
            addCriterion("YEAL_GENERAL_PERCENTAGE >", value, "yealGeneralPercentage");
            return (Criteria) this;
        }

        public Criteria andYealGeneralPercentageGreaterThanOrEqualTo(String value) {
            addCriterion("YEAL_GENERAL_PERCENTAGE >=", value, "yealGeneralPercentage");
            return (Criteria) this;
        }

        public Criteria andYealGeneralPercentageLessThan(String value) {
            addCriterion("YEAL_GENERAL_PERCENTAGE <", value, "yealGeneralPercentage");
            return (Criteria) this;
        }

        public Criteria andYealGeneralPercentageLessThanOrEqualTo(String value) {
            addCriterion("YEAL_GENERAL_PERCENTAGE <=", value, "yealGeneralPercentage");
            return (Criteria) this;
        }

        public Criteria andYealGeneralPercentageLike(String value) {
            addCriterion("YEAL_GENERAL_PERCENTAGE like", value, "yealGeneralPercentage");
            return (Criteria) this;
        }

        public Criteria andYealGeneralPercentageNotLike(String value) {
            addCriterion("YEAL_GENERAL_PERCENTAGE not like", value, "yealGeneralPercentage");
            return (Criteria) this;
        }

        public Criteria andYealGeneralPercentageIn(List<String> values) {
            addCriterion("YEAL_GENERAL_PERCENTAGE in", values, "yealGeneralPercentage");
            return (Criteria) this;
        }

        public Criteria andYealGeneralPercentageNotIn(List<String> values) {
            addCriterion("YEAL_GENERAL_PERCENTAGE not in", values, "yealGeneralPercentage");
            return (Criteria) this;
        }

        public Criteria andYealGeneralPercentageBetween(String value1, String value2) {
            addCriterion("YEAL_GENERAL_PERCENTAGE between", value1, value2, "yealGeneralPercentage");
            return (Criteria) this;
        }

        public Criteria andYealGeneralPercentageNotBetween(String value1, String value2) {
            addCriterion("YEAL_GENERAL_PERCENTAGE not between", value1, value2, "yealGeneralPercentage");
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