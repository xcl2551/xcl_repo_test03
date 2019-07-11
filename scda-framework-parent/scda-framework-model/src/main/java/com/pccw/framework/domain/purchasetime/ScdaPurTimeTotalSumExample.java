package com.pccw.framework.domain.purchasetime;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScdaPurTimeTotalSumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScdaPurTimeTotalSumExample() {
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

        public Criteria andProOverallAfterLineIsNull() {
            addCriterion("PRO_OVERALL_AFTER_LINE is null");
            return (Criteria) this;
        }

        public Criteria andProOverallAfterLineIsNotNull() {
            addCriterion("PRO_OVERALL_AFTER_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andProOverallAfterLineEqualTo(String value) {
            addCriterion("PRO_OVERALL_AFTER_LINE =", value, "proOverallAfterLine");
            return (Criteria) this;
        }

        public Criteria andProOverallAfterLineNotEqualTo(String value) {
            addCriterion("PRO_OVERALL_AFTER_LINE <>", value, "proOverallAfterLine");
            return (Criteria) this;
        }

        public Criteria andProOverallAfterLineGreaterThan(String value) {
            addCriterion("PRO_OVERALL_AFTER_LINE >", value, "proOverallAfterLine");
            return (Criteria) this;
        }

        public Criteria andProOverallAfterLineGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_OVERALL_AFTER_LINE >=", value, "proOverallAfterLine");
            return (Criteria) this;
        }

        public Criteria andProOverallAfterLineLessThan(String value) {
            addCriterion("PRO_OVERALL_AFTER_LINE <", value, "proOverallAfterLine");
            return (Criteria) this;
        }

        public Criteria andProOverallAfterLineLessThanOrEqualTo(String value) {
            addCriterion("PRO_OVERALL_AFTER_LINE <=", value, "proOverallAfterLine");
            return (Criteria) this;
        }

        public Criteria andProOverallAfterLineLike(String value) {
            addCriterion("PRO_OVERALL_AFTER_LINE like", value, "proOverallAfterLine");
            return (Criteria) this;
        }

        public Criteria andProOverallAfterLineNotLike(String value) {
            addCriterion("PRO_OVERALL_AFTER_LINE not like", value, "proOverallAfterLine");
            return (Criteria) this;
        }

        public Criteria andProOverallAfterLineIn(List<String> values) {
            addCriterion("PRO_OVERALL_AFTER_LINE in", values, "proOverallAfterLine");
            return (Criteria) this;
        }

        public Criteria andProOverallAfterLineNotIn(List<String> values) {
            addCriterion("PRO_OVERALL_AFTER_LINE not in", values, "proOverallAfterLine");
            return (Criteria) this;
        }

        public Criteria andProOverallAfterLineBetween(String value1, String value2) {
            addCriterion("PRO_OVERALL_AFTER_LINE between", value1, value2, "proOverallAfterLine");
            return (Criteria) this;
        }

        public Criteria andProOverallAfterLineNotBetween(String value1, String value2) {
            addCriterion("PRO_OVERALL_AFTER_LINE not between", value1, value2, "proOverallAfterLine");
            return (Criteria) this;
        }

        public Criteria andProOverallBeforeLineIsNull() {
            addCriterion("PRO_OVERALL_BEFORE_LINE is null");
            return (Criteria) this;
        }

        public Criteria andProOverallBeforeLineIsNotNull() {
            addCriterion("PRO_OVERALL_BEFORE_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andProOverallBeforeLineEqualTo(String value) {
            addCriterion("PRO_OVERALL_BEFORE_LINE =", value, "proOverallBeforeLine");
            return (Criteria) this;
        }

        public Criteria andProOverallBeforeLineNotEqualTo(String value) {
            addCriterion("PRO_OVERALL_BEFORE_LINE <>", value, "proOverallBeforeLine");
            return (Criteria) this;
        }

        public Criteria andProOverallBeforeLineGreaterThan(String value) {
            addCriterion("PRO_OVERALL_BEFORE_LINE >", value, "proOverallBeforeLine");
            return (Criteria) this;
        }

        public Criteria andProOverallBeforeLineGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_OVERALL_BEFORE_LINE >=", value, "proOverallBeforeLine");
            return (Criteria) this;
        }

        public Criteria andProOverallBeforeLineLessThan(String value) {
            addCriterion("PRO_OVERALL_BEFORE_LINE <", value, "proOverallBeforeLine");
            return (Criteria) this;
        }

        public Criteria andProOverallBeforeLineLessThanOrEqualTo(String value) {
            addCriterion("PRO_OVERALL_BEFORE_LINE <=", value, "proOverallBeforeLine");
            return (Criteria) this;
        }

        public Criteria andProOverallBeforeLineLike(String value) {
            addCriterion("PRO_OVERALL_BEFORE_LINE like", value, "proOverallBeforeLine");
            return (Criteria) this;
        }

        public Criteria andProOverallBeforeLineNotLike(String value) {
            addCriterion("PRO_OVERALL_BEFORE_LINE not like", value, "proOverallBeforeLine");
            return (Criteria) this;
        }

        public Criteria andProOverallBeforeLineIn(List<String> values) {
            addCriterion("PRO_OVERALL_BEFORE_LINE in", values, "proOverallBeforeLine");
            return (Criteria) this;
        }

        public Criteria andProOverallBeforeLineNotIn(List<String> values) {
            addCriterion("PRO_OVERALL_BEFORE_LINE not in", values, "proOverallBeforeLine");
            return (Criteria) this;
        }

        public Criteria andProOverallBeforeLineBetween(String value1, String value2) {
            addCriterion("PRO_OVERALL_BEFORE_LINE between", value1, value2, "proOverallBeforeLine");
            return (Criteria) this;
        }

        public Criteria andProOverallBeforeLineNotBetween(String value1, String value2) {
            addCriterion("PRO_OVERALL_BEFORE_LINE not between", value1, value2, "proOverallBeforeLine");
            return (Criteria) this;
        }

        public Criteria andStageOverallLineIsNull() {
            addCriterion("STAGE_OVERALL_LINE is null");
            return (Criteria) this;
        }

        public Criteria andStageOverallLineIsNotNull() {
            addCriterion("STAGE_OVERALL_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andStageOverallLineEqualTo(String value) {
            addCriterion("STAGE_OVERALL_LINE =", value, "stageOverallLine");
            return (Criteria) this;
        }

        public Criteria andStageOverallLineNotEqualTo(String value) {
            addCriterion("STAGE_OVERALL_LINE <>", value, "stageOverallLine");
            return (Criteria) this;
        }

        public Criteria andStageOverallLineGreaterThan(String value) {
            addCriterion("STAGE_OVERALL_LINE >", value, "stageOverallLine");
            return (Criteria) this;
        }

        public Criteria andStageOverallLineGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE_OVERALL_LINE >=", value, "stageOverallLine");
            return (Criteria) this;
        }

        public Criteria andStageOverallLineLessThan(String value) {
            addCriterion("STAGE_OVERALL_LINE <", value, "stageOverallLine");
            return (Criteria) this;
        }

        public Criteria andStageOverallLineLessThanOrEqualTo(String value) {
            addCriterion("STAGE_OVERALL_LINE <=", value, "stageOverallLine");
            return (Criteria) this;
        }

        public Criteria andStageOverallLineLike(String value) {
            addCriterion("STAGE_OVERALL_LINE like", value, "stageOverallLine");
            return (Criteria) this;
        }

        public Criteria andStageOverallLineNotLike(String value) {
            addCriterion("STAGE_OVERALL_LINE not like", value, "stageOverallLine");
            return (Criteria) this;
        }

        public Criteria andStageOverallLineIn(List<String> values) {
            addCriterion("STAGE_OVERALL_LINE in", values, "stageOverallLine");
            return (Criteria) this;
        }

        public Criteria andStageOverallLineNotIn(List<String> values) {
            addCriterion("STAGE_OVERALL_LINE not in", values, "stageOverallLine");
            return (Criteria) this;
        }

        public Criteria andStageOverallLineBetween(String value1, String value2) {
            addCriterion("STAGE_OVERALL_LINE between", value1, value2, "stageOverallLine");
            return (Criteria) this;
        }

        public Criteria andStageOverallLineNotBetween(String value1, String value2) {
            addCriterion("STAGE_OVERALL_LINE not between", value1, value2, "stageOverallLine");
            return (Criteria) this;
        }

        public Criteria andStageOverallDemandArrIsNull() {
            addCriterion("STAGE_OVERALL_DEMAND_ARR is null");
            return (Criteria) this;
        }

        public Criteria andStageOverallDemandArrIsNotNull() {
            addCriterion("STAGE_OVERALL_DEMAND_ARR is not null");
            return (Criteria) this;
        }

        public Criteria andStageOverallDemandArrEqualTo(String value) {
            addCriterion("STAGE_OVERALL_DEMAND_ARR =", value, "stageOverallDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallDemandArrNotEqualTo(String value) {
            addCriterion("STAGE_OVERALL_DEMAND_ARR <>", value, "stageOverallDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallDemandArrGreaterThan(String value) {
            addCriterion("STAGE_OVERALL_DEMAND_ARR >", value, "stageOverallDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallDemandArrGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE_OVERALL_DEMAND_ARR >=", value, "stageOverallDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallDemandArrLessThan(String value) {
            addCriterion("STAGE_OVERALL_DEMAND_ARR <", value, "stageOverallDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallDemandArrLessThanOrEqualTo(String value) {
            addCriterion("STAGE_OVERALL_DEMAND_ARR <=", value, "stageOverallDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallDemandArrLike(String value) {
            addCriterion("STAGE_OVERALL_DEMAND_ARR like", value, "stageOverallDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallDemandArrNotLike(String value) {
            addCriterion("STAGE_OVERALL_DEMAND_ARR not like", value, "stageOverallDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallDemandArrIn(List<String> values) {
            addCriterion("STAGE_OVERALL_DEMAND_ARR in", values, "stageOverallDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallDemandArrNotIn(List<String> values) {
            addCriterion("STAGE_OVERALL_DEMAND_ARR not in", values, "stageOverallDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallDemandArrBetween(String value1, String value2) {
            addCriterion("STAGE_OVERALL_DEMAND_ARR between", value1, value2, "stageOverallDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallDemandArrNotBetween(String value1, String value2) {
            addCriterion("STAGE_OVERALL_DEMAND_ARR not between", value1, value2, "stageOverallDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallSchemeArrIsNull() {
            addCriterion("STAGE_OVERALL_SCHEME_ARR is null");
            return (Criteria) this;
        }

        public Criteria andStageOverallSchemeArrIsNotNull() {
            addCriterion("STAGE_OVERALL_SCHEME_ARR is not null");
            return (Criteria) this;
        }

        public Criteria andStageOverallSchemeArrEqualTo(String value) {
            addCriterion("STAGE_OVERALL_SCHEME_ARR =", value, "stageOverallSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallSchemeArrNotEqualTo(String value) {
            addCriterion("STAGE_OVERALL_SCHEME_ARR <>", value, "stageOverallSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallSchemeArrGreaterThan(String value) {
            addCriterion("STAGE_OVERALL_SCHEME_ARR >", value, "stageOverallSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallSchemeArrGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE_OVERALL_SCHEME_ARR >=", value, "stageOverallSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallSchemeArrLessThan(String value) {
            addCriterion("STAGE_OVERALL_SCHEME_ARR <", value, "stageOverallSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallSchemeArrLessThanOrEqualTo(String value) {
            addCriterion("STAGE_OVERALL_SCHEME_ARR <=", value, "stageOverallSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallSchemeArrLike(String value) {
            addCriterion("STAGE_OVERALL_SCHEME_ARR like", value, "stageOverallSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallSchemeArrNotLike(String value) {
            addCriterion("STAGE_OVERALL_SCHEME_ARR not like", value, "stageOverallSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallSchemeArrIn(List<String> values) {
            addCriterion("STAGE_OVERALL_SCHEME_ARR in", values, "stageOverallSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallSchemeArrNotIn(List<String> values) {
            addCriterion("STAGE_OVERALL_SCHEME_ARR not in", values, "stageOverallSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallSchemeArrBetween(String value1, String value2) {
            addCriterion("STAGE_OVERALL_SCHEME_ARR between", value1, value2, "stageOverallSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallSchemeArrNotBetween(String value1, String value2) {
            addCriterion("STAGE_OVERALL_SCHEME_ARR not between", value1, value2, "stageOverallSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallEsArrIsNull() {
            addCriterion("STAGE_OVERALL_ES_ARR is null");
            return (Criteria) this;
        }

        public Criteria andStageOverallEsArrIsNotNull() {
            addCriterion("STAGE_OVERALL_ES_ARR is not null");
            return (Criteria) this;
        }

        public Criteria andStageOverallEsArrEqualTo(String value) {
            addCriterion("STAGE_OVERALL_ES_ARR =", value, "stageOverallEsArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallEsArrNotEqualTo(String value) {
            addCriterion("STAGE_OVERALL_ES_ARR <>", value, "stageOverallEsArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallEsArrGreaterThan(String value) {
            addCriterion("STAGE_OVERALL_ES_ARR >", value, "stageOverallEsArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallEsArrGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE_OVERALL_ES_ARR >=", value, "stageOverallEsArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallEsArrLessThan(String value) {
            addCriterion("STAGE_OVERALL_ES_ARR <", value, "stageOverallEsArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallEsArrLessThanOrEqualTo(String value) {
            addCriterion("STAGE_OVERALL_ES_ARR <=", value, "stageOverallEsArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallEsArrLike(String value) {
            addCriterion("STAGE_OVERALL_ES_ARR like", value, "stageOverallEsArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallEsArrNotLike(String value) {
            addCriterion("STAGE_OVERALL_ES_ARR not like", value, "stageOverallEsArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallEsArrIn(List<String> values) {
            addCriterion("STAGE_OVERALL_ES_ARR in", values, "stageOverallEsArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallEsArrNotIn(List<String> values) {
            addCriterion("STAGE_OVERALL_ES_ARR not in", values, "stageOverallEsArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallEsArrBetween(String value1, String value2) {
            addCriterion("STAGE_OVERALL_ES_ARR between", value1, value2, "stageOverallEsArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallEsArrNotBetween(String value1, String value2) {
            addCriterion("STAGE_OVERALL_ES_ARR not between", value1, value2, "stageOverallEsArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallResultArrIsNull() {
            addCriterion("STAGE_OVERALL_RESULT_ARR is null");
            return (Criteria) this;
        }

        public Criteria andStageOverallResultArrIsNotNull() {
            addCriterion("STAGE_OVERALL_RESULT_ARR is not null");
            return (Criteria) this;
        }

        public Criteria andStageOverallResultArrEqualTo(String value) {
            addCriterion("STAGE_OVERALL_RESULT_ARR =", value, "stageOverallResultArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallResultArrNotEqualTo(String value) {
            addCriterion("STAGE_OVERALL_RESULT_ARR <>", value, "stageOverallResultArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallResultArrGreaterThan(String value) {
            addCriterion("STAGE_OVERALL_RESULT_ARR >", value, "stageOverallResultArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallResultArrGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE_OVERALL_RESULT_ARR >=", value, "stageOverallResultArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallResultArrLessThan(String value) {
            addCriterion("STAGE_OVERALL_RESULT_ARR <", value, "stageOverallResultArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallResultArrLessThanOrEqualTo(String value) {
            addCriterion("STAGE_OVERALL_RESULT_ARR <=", value, "stageOverallResultArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallResultArrLike(String value) {
            addCriterion("STAGE_OVERALL_RESULT_ARR like", value, "stageOverallResultArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallResultArrNotLike(String value) {
            addCriterion("STAGE_OVERALL_RESULT_ARR not like", value, "stageOverallResultArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallResultArrIn(List<String> values) {
            addCriterion("STAGE_OVERALL_RESULT_ARR in", values, "stageOverallResultArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallResultArrNotIn(List<String> values) {
            addCriterion("STAGE_OVERALL_RESULT_ARR not in", values, "stageOverallResultArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallResultArrBetween(String value1, String value2) {
            addCriterion("STAGE_OVERALL_RESULT_ARR between", value1, value2, "stageOverallResultArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallResultArrNotBetween(String value1, String value2) {
            addCriterion("STAGE_OVERALL_RESULT_ARR not between", value1, value2, "stageOverallResultArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallContractArrIsNull() {
            addCriterion("STAGE_OVERALL_CONTRACT_ARR is null");
            return (Criteria) this;
        }

        public Criteria andStageOverallContractArrIsNotNull() {
            addCriterion("STAGE_OVERALL_CONTRACT_ARR is not null");
            return (Criteria) this;
        }

        public Criteria andStageOverallContractArrEqualTo(String value) {
            addCriterion("STAGE_OVERALL_CONTRACT_ARR =", value, "stageOverallContractArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallContractArrNotEqualTo(String value) {
            addCriterion("STAGE_OVERALL_CONTRACT_ARR <>", value, "stageOverallContractArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallContractArrGreaterThan(String value) {
            addCriterion("STAGE_OVERALL_CONTRACT_ARR >", value, "stageOverallContractArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallContractArrGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE_OVERALL_CONTRACT_ARR >=", value, "stageOverallContractArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallContractArrLessThan(String value) {
            addCriterion("STAGE_OVERALL_CONTRACT_ARR <", value, "stageOverallContractArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallContractArrLessThanOrEqualTo(String value) {
            addCriterion("STAGE_OVERALL_CONTRACT_ARR <=", value, "stageOverallContractArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallContractArrLike(String value) {
            addCriterion("STAGE_OVERALL_CONTRACT_ARR like", value, "stageOverallContractArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallContractArrNotLike(String value) {
            addCriterion("STAGE_OVERALL_CONTRACT_ARR not like", value, "stageOverallContractArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallContractArrIn(List<String> values) {
            addCriterion("STAGE_OVERALL_CONTRACT_ARR in", values, "stageOverallContractArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallContractArrNotIn(List<String> values) {
            addCriterion("STAGE_OVERALL_CONTRACT_ARR not in", values, "stageOverallContractArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallContractArrBetween(String value1, String value2) {
            addCriterion("STAGE_OVERALL_CONTRACT_ARR between", value1, value2, "stageOverallContractArr");
            return (Criteria) this;
        }

        public Criteria andStageOverallContractArrNotBetween(String value1, String value2) {
            addCriterion("STAGE_OVERALL_CONTRACT_ARR not between", value1, value2, "stageOverallContractArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralLineIsNull() {
            addCriterion("STAGE_GENERAL_LINE is null");
            return (Criteria) this;
        }

        public Criteria andStageGeneralLineIsNotNull() {
            addCriterion("STAGE_GENERAL_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andStageGeneralLineEqualTo(String value) {
            addCriterion("STAGE_GENERAL_LINE =", value, "stageGeneralLine");
            return (Criteria) this;
        }

        public Criteria andStageGeneralLineNotEqualTo(String value) {
            addCriterion("STAGE_GENERAL_LINE <>", value, "stageGeneralLine");
            return (Criteria) this;
        }

        public Criteria andStageGeneralLineGreaterThan(String value) {
            addCriterion("STAGE_GENERAL_LINE >", value, "stageGeneralLine");
            return (Criteria) this;
        }

        public Criteria andStageGeneralLineGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE_GENERAL_LINE >=", value, "stageGeneralLine");
            return (Criteria) this;
        }

        public Criteria andStageGeneralLineLessThan(String value) {
            addCriterion("STAGE_GENERAL_LINE <", value, "stageGeneralLine");
            return (Criteria) this;
        }

        public Criteria andStageGeneralLineLessThanOrEqualTo(String value) {
            addCriterion("STAGE_GENERAL_LINE <=", value, "stageGeneralLine");
            return (Criteria) this;
        }

        public Criteria andStageGeneralLineLike(String value) {
            addCriterion("STAGE_GENERAL_LINE like", value, "stageGeneralLine");
            return (Criteria) this;
        }

        public Criteria andStageGeneralLineNotLike(String value) {
            addCriterion("STAGE_GENERAL_LINE not like", value, "stageGeneralLine");
            return (Criteria) this;
        }

        public Criteria andStageGeneralLineIn(List<String> values) {
            addCriterion("STAGE_GENERAL_LINE in", values, "stageGeneralLine");
            return (Criteria) this;
        }

        public Criteria andStageGeneralLineNotIn(List<String> values) {
            addCriterion("STAGE_GENERAL_LINE not in", values, "stageGeneralLine");
            return (Criteria) this;
        }

        public Criteria andStageGeneralLineBetween(String value1, String value2) {
            addCriterion("STAGE_GENERAL_LINE between", value1, value2, "stageGeneralLine");
            return (Criteria) this;
        }

        public Criteria andStageGeneralLineNotBetween(String value1, String value2) {
            addCriterion("STAGE_GENERAL_LINE not between", value1, value2, "stageGeneralLine");
            return (Criteria) this;
        }

        public Criteria andStageGeneralDemandArrIsNull() {
            addCriterion("STAGE_GENERAL_DEMAND_ARR is null");
            return (Criteria) this;
        }

        public Criteria andStageGeneralDemandArrIsNotNull() {
            addCriterion("STAGE_GENERAL_DEMAND_ARR is not null");
            return (Criteria) this;
        }

        public Criteria andStageGeneralDemandArrEqualTo(String value) {
            addCriterion("STAGE_GENERAL_DEMAND_ARR =", value, "stageGeneralDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralDemandArrNotEqualTo(String value) {
            addCriterion("STAGE_GENERAL_DEMAND_ARR <>", value, "stageGeneralDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralDemandArrGreaterThan(String value) {
            addCriterion("STAGE_GENERAL_DEMAND_ARR >", value, "stageGeneralDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralDemandArrGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE_GENERAL_DEMAND_ARR >=", value, "stageGeneralDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralDemandArrLessThan(String value) {
            addCriterion("STAGE_GENERAL_DEMAND_ARR <", value, "stageGeneralDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralDemandArrLessThanOrEqualTo(String value) {
            addCriterion("STAGE_GENERAL_DEMAND_ARR <=", value, "stageGeneralDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralDemandArrLike(String value) {
            addCriterion("STAGE_GENERAL_DEMAND_ARR like", value, "stageGeneralDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralDemandArrNotLike(String value) {
            addCriterion("STAGE_GENERAL_DEMAND_ARR not like", value, "stageGeneralDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralDemandArrIn(List<String> values) {
            addCriterion("STAGE_GENERAL_DEMAND_ARR in", values, "stageGeneralDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralDemandArrNotIn(List<String> values) {
            addCriterion("STAGE_GENERAL_DEMAND_ARR not in", values, "stageGeneralDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralDemandArrBetween(String value1, String value2) {
            addCriterion("STAGE_GENERAL_DEMAND_ARR between", value1, value2, "stageGeneralDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralDemandArrNotBetween(String value1, String value2) {
            addCriterion("STAGE_GENERAL_DEMAND_ARR not between", value1, value2, "stageGeneralDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralSchemeArrIsNull() {
            addCriterion("STAGE_GENERAL_SCHEME_ARR is null");
            return (Criteria) this;
        }

        public Criteria andStageGeneralSchemeArrIsNotNull() {
            addCriterion("STAGE_GENERAL_SCHEME_ARR is not null");
            return (Criteria) this;
        }

        public Criteria andStageGeneralSchemeArrEqualTo(String value) {
            addCriterion("STAGE_GENERAL_SCHEME_ARR =", value, "stageGeneralSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralSchemeArrNotEqualTo(String value) {
            addCriterion("STAGE_GENERAL_SCHEME_ARR <>", value, "stageGeneralSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralSchemeArrGreaterThan(String value) {
            addCriterion("STAGE_GENERAL_SCHEME_ARR >", value, "stageGeneralSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralSchemeArrGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE_GENERAL_SCHEME_ARR >=", value, "stageGeneralSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralSchemeArrLessThan(String value) {
            addCriterion("STAGE_GENERAL_SCHEME_ARR <", value, "stageGeneralSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralSchemeArrLessThanOrEqualTo(String value) {
            addCriterion("STAGE_GENERAL_SCHEME_ARR <=", value, "stageGeneralSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralSchemeArrLike(String value) {
            addCriterion("STAGE_GENERAL_SCHEME_ARR like", value, "stageGeneralSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralSchemeArrNotLike(String value) {
            addCriterion("STAGE_GENERAL_SCHEME_ARR not like", value, "stageGeneralSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralSchemeArrIn(List<String> values) {
            addCriterion("STAGE_GENERAL_SCHEME_ARR in", values, "stageGeneralSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralSchemeArrNotIn(List<String> values) {
            addCriterion("STAGE_GENERAL_SCHEME_ARR not in", values, "stageGeneralSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralSchemeArrBetween(String value1, String value2) {
            addCriterion("STAGE_GENERAL_SCHEME_ARR between", value1, value2, "stageGeneralSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralSchemeArrNotBetween(String value1, String value2) {
            addCriterion("STAGE_GENERAL_SCHEME_ARR not between", value1, value2, "stageGeneralSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralEsArrIsNull() {
            addCriterion("STAGE_GENERAL_ES_ARR is null");
            return (Criteria) this;
        }

        public Criteria andStageGeneralEsArrIsNotNull() {
            addCriterion("STAGE_GENERAL_ES_ARR is not null");
            return (Criteria) this;
        }

        public Criteria andStageGeneralEsArrEqualTo(String value) {
            addCriterion("STAGE_GENERAL_ES_ARR =", value, "stageGeneralEsArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralEsArrNotEqualTo(String value) {
            addCriterion("STAGE_GENERAL_ES_ARR <>", value, "stageGeneralEsArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralEsArrGreaterThan(String value) {
            addCriterion("STAGE_GENERAL_ES_ARR >", value, "stageGeneralEsArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralEsArrGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE_GENERAL_ES_ARR >=", value, "stageGeneralEsArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralEsArrLessThan(String value) {
            addCriterion("STAGE_GENERAL_ES_ARR <", value, "stageGeneralEsArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralEsArrLessThanOrEqualTo(String value) {
            addCriterion("STAGE_GENERAL_ES_ARR <=", value, "stageGeneralEsArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralEsArrLike(String value) {
            addCriterion("STAGE_GENERAL_ES_ARR like", value, "stageGeneralEsArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralEsArrNotLike(String value) {
            addCriterion("STAGE_GENERAL_ES_ARR not like", value, "stageGeneralEsArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralEsArrIn(List<String> values) {
            addCriterion("STAGE_GENERAL_ES_ARR in", values, "stageGeneralEsArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralEsArrNotIn(List<String> values) {
            addCriterion("STAGE_GENERAL_ES_ARR not in", values, "stageGeneralEsArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralEsArrBetween(String value1, String value2) {
            addCriterion("STAGE_GENERAL_ES_ARR between", value1, value2, "stageGeneralEsArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralEsArrNotBetween(String value1, String value2) {
            addCriterion("STAGE_GENERAL_ES_ARR not between", value1, value2, "stageGeneralEsArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralResultArrIsNull() {
            addCriterion("STAGE_GENERAL_RESULT_ARR is null");
            return (Criteria) this;
        }

        public Criteria andStageGeneralResultArrIsNotNull() {
            addCriterion("STAGE_GENERAL_RESULT_ARR is not null");
            return (Criteria) this;
        }

        public Criteria andStageGeneralResultArrEqualTo(String value) {
            addCriterion("STAGE_GENERAL_RESULT_ARR =", value, "stageGeneralResultArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralResultArrNotEqualTo(String value) {
            addCriterion("STAGE_GENERAL_RESULT_ARR <>", value, "stageGeneralResultArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralResultArrGreaterThan(String value) {
            addCriterion("STAGE_GENERAL_RESULT_ARR >", value, "stageGeneralResultArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralResultArrGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE_GENERAL_RESULT_ARR >=", value, "stageGeneralResultArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralResultArrLessThan(String value) {
            addCriterion("STAGE_GENERAL_RESULT_ARR <", value, "stageGeneralResultArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralResultArrLessThanOrEqualTo(String value) {
            addCriterion("STAGE_GENERAL_RESULT_ARR <=", value, "stageGeneralResultArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralResultArrLike(String value) {
            addCriterion("STAGE_GENERAL_RESULT_ARR like", value, "stageGeneralResultArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralResultArrNotLike(String value) {
            addCriterion("STAGE_GENERAL_RESULT_ARR not like", value, "stageGeneralResultArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralResultArrIn(List<String> values) {
            addCriterion("STAGE_GENERAL_RESULT_ARR in", values, "stageGeneralResultArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralResultArrNotIn(List<String> values) {
            addCriterion("STAGE_GENERAL_RESULT_ARR not in", values, "stageGeneralResultArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralResultArrBetween(String value1, String value2) {
            addCriterion("STAGE_GENERAL_RESULT_ARR between", value1, value2, "stageGeneralResultArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralResultArrNotBetween(String value1, String value2) {
            addCriterion("STAGE_GENERAL_RESULT_ARR not between", value1, value2, "stageGeneralResultArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralContractArrIsNull() {
            addCriterion("STAGE_GENERAL_CONTRACT_ARR is null");
            return (Criteria) this;
        }

        public Criteria andStageGeneralContractArrIsNotNull() {
            addCriterion("STAGE_GENERAL_CONTRACT_ARR is not null");
            return (Criteria) this;
        }

        public Criteria andStageGeneralContractArrEqualTo(String value) {
            addCriterion("STAGE_GENERAL_CONTRACT_ARR =", value, "stageGeneralContractArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralContractArrNotEqualTo(String value) {
            addCriterion("STAGE_GENERAL_CONTRACT_ARR <>", value, "stageGeneralContractArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralContractArrGreaterThan(String value) {
            addCriterion("STAGE_GENERAL_CONTRACT_ARR >", value, "stageGeneralContractArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralContractArrGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE_GENERAL_CONTRACT_ARR >=", value, "stageGeneralContractArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralContractArrLessThan(String value) {
            addCriterion("STAGE_GENERAL_CONTRACT_ARR <", value, "stageGeneralContractArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralContractArrLessThanOrEqualTo(String value) {
            addCriterion("STAGE_GENERAL_CONTRACT_ARR <=", value, "stageGeneralContractArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralContractArrLike(String value) {
            addCriterion("STAGE_GENERAL_CONTRACT_ARR like", value, "stageGeneralContractArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralContractArrNotLike(String value) {
            addCriterion("STAGE_GENERAL_CONTRACT_ARR not like", value, "stageGeneralContractArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralContractArrIn(List<String> values) {
            addCriterion("STAGE_GENERAL_CONTRACT_ARR in", values, "stageGeneralContractArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralContractArrNotIn(List<String> values) {
            addCriterion("STAGE_GENERAL_CONTRACT_ARR not in", values, "stageGeneralContractArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralContractArrBetween(String value1, String value2) {
            addCriterion("STAGE_GENERAL_CONTRACT_ARR between", value1, value2, "stageGeneralContractArr");
            return (Criteria) this;
        }

        public Criteria andStageGeneralContractArrNotBetween(String value1, String value2) {
            addCriterion("STAGE_GENERAL_CONTRACT_ARR not between", value1, value2, "stageGeneralContractArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkLineIsNull() {
            addCriterion("STAGE_NETWORK_LINE is null");
            return (Criteria) this;
        }

        public Criteria andStageNetworkLineIsNotNull() {
            addCriterion("STAGE_NETWORK_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andStageNetworkLineEqualTo(String value) {
            addCriterion("STAGE_NETWORK_LINE =", value, "stageNetworkLine");
            return (Criteria) this;
        }

        public Criteria andStageNetworkLineNotEqualTo(String value) {
            addCriterion("STAGE_NETWORK_LINE <>", value, "stageNetworkLine");
            return (Criteria) this;
        }

        public Criteria andStageNetworkLineGreaterThan(String value) {
            addCriterion("STAGE_NETWORK_LINE >", value, "stageNetworkLine");
            return (Criteria) this;
        }

        public Criteria andStageNetworkLineGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE_NETWORK_LINE >=", value, "stageNetworkLine");
            return (Criteria) this;
        }

        public Criteria andStageNetworkLineLessThan(String value) {
            addCriterion("STAGE_NETWORK_LINE <", value, "stageNetworkLine");
            return (Criteria) this;
        }

        public Criteria andStageNetworkLineLessThanOrEqualTo(String value) {
            addCriterion("STAGE_NETWORK_LINE <=", value, "stageNetworkLine");
            return (Criteria) this;
        }

        public Criteria andStageNetworkLineLike(String value) {
            addCriterion("STAGE_NETWORK_LINE like", value, "stageNetworkLine");
            return (Criteria) this;
        }

        public Criteria andStageNetworkLineNotLike(String value) {
            addCriterion("STAGE_NETWORK_LINE not like", value, "stageNetworkLine");
            return (Criteria) this;
        }

        public Criteria andStageNetworkLineIn(List<String> values) {
            addCriterion("STAGE_NETWORK_LINE in", values, "stageNetworkLine");
            return (Criteria) this;
        }

        public Criteria andStageNetworkLineNotIn(List<String> values) {
            addCriterion("STAGE_NETWORK_LINE not in", values, "stageNetworkLine");
            return (Criteria) this;
        }

        public Criteria andStageNetworkLineBetween(String value1, String value2) {
            addCriterion("STAGE_NETWORK_LINE between", value1, value2, "stageNetworkLine");
            return (Criteria) this;
        }

        public Criteria andStageNetworkLineNotBetween(String value1, String value2) {
            addCriterion("STAGE_NETWORK_LINE not between", value1, value2, "stageNetworkLine");
            return (Criteria) this;
        }

        public Criteria andStageNetworkDemandArrIsNull() {
            addCriterion("STAGE_NETWORK_DEMAND_ARR is null");
            return (Criteria) this;
        }

        public Criteria andStageNetworkDemandArrIsNotNull() {
            addCriterion("STAGE_NETWORK_DEMAND_ARR is not null");
            return (Criteria) this;
        }

        public Criteria andStageNetworkDemandArrEqualTo(String value) {
            addCriterion("STAGE_NETWORK_DEMAND_ARR =", value, "stageNetworkDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkDemandArrNotEqualTo(String value) {
            addCriterion("STAGE_NETWORK_DEMAND_ARR <>", value, "stageNetworkDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkDemandArrGreaterThan(String value) {
            addCriterion("STAGE_NETWORK_DEMAND_ARR >", value, "stageNetworkDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkDemandArrGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE_NETWORK_DEMAND_ARR >=", value, "stageNetworkDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkDemandArrLessThan(String value) {
            addCriterion("STAGE_NETWORK_DEMAND_ARR <", value, "stageNetworkDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkDemandArrLessThanOrEqualTo(String value) {
            addCriterion("STAGE_NETWORK_DEMAND_ARR <=", value, "stageNetworkDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkDemandArrLike(String value) {
            addCriterion("STAGE_NETWORK_DEMAND_ARR like", value, "stageNetworkDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkDemandArrNotLike(String value) {
            addCriterion("STAGE_NETWORK_DEMAND_ARR not like", value, "stageNetworkDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkDemandArrIn(List<String> values) {
            addCriterion("STAGE_NETWORK_DEMAND_ARR in", values, "stageNetworkDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkDemandArrNotIn(List<String> values) {
            addCriterion("STAGE_NETWORK_DEMAND_ARR not in", values, "stageNetworkDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkDemandArrBetween(String value1, String value2) {
            addCriterion("STAGE_NETWORK_DEMAND_ARR between", value1, value2, "stageNetworkDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkDemandArrNotBetween(String value1, String value2) {
            addCriterion("STAGE_NETWORK_DEMAND_ARR not between", value1, value2, "stageNetworkDemandArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkSchemeArrIsNull() {
            addCriterion("STAGE_NETWORK_SCHEME_ARR is null");
            return (Criteria) this;
        }

        public Criteria andStageNetworkSchemeArrIsNotNull() {
            addCriterion("STAGE_NETWORK_SCHEME_ARR is not null");
            return (Criteria) this;
        }

        public Criteria andStageNetworkSchemeArrEqualTo(String value) {
            addCriterion("STAGE_NETWORK_SCHEME_ARR =", value, "stageNetworkSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkSchemeArrNotEqualTo(String value) {
            addCriterion("STAGE_NETWORK_SCHEME_ARR <>", value, "stageNetworkSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkSchemeArrGreaterThan(String value) {
            addCriterion("STAGE_NETWORK_SCHEME_ARR >", value, "stageNetworkSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkSchemeArrGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE_NETWORK_SCHEME_ARR >=", value, "stageNetworkSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkSchemeArrLessThan(String value) {
            addCriterion("STAGE_NETWORK_SCHEME_ARR <", value, "stageNetworkSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkSchemeArrLessThanOrEqualTo(String value) {
            addCriterion("STAGE_NETWORK_SCHEME_ARR <=", value, "stageNetworkSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkSchemeArrLike(String value) {
            addCriterion("STAGE_NETWORK_SCHEME_ARR like", value, "stageNetworkSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkSchemeArrNotLike(String value) {
            addCriterion("STAGE_NETWORK_SCHEME_ARR not like", value, "stageNetworkSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkSchemeArrIn(List<String> values) {
            addCriterion("STAGE_NETWORK_SCHEME_ARR in", values, "stageNetworkSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkSchemeArrNotIn(List<String> values) {
            addCriterion("STAGE_NETWORK_SCHEME_ARR not in", values, "stageNetworkSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkSchemeArrBetween(String value1, String value2) {
            addCriterion("STAGE_NETWORK_SCHEME_ARR between", value1, value2, "stageNetworkSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkSchemeArrNotBetween(String value1, String value2) {
            addCriterion("STAGE_NETWORK_SCHEME_ARR not between", value1, value2, "stageNetworkSchemeArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkEsArrIsNull() {
            addCriterion("STAGE_NETWORK_ES_ARR is null");
            return (Criteria) this;
        }

        public Criteria andStageNetworkEsArrIsNotNull() {
            addCriterion("STAGE_NETWORK_ES_ARR is not null");
            return (Criteria) this;
        }

        public Criteria andStageNetworkEsArrEqualTo(String value) {
            addCriterion("STAGE_NETWORK_ES_ARR =", value, "stageNetworkEsArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkEsArrNotEqualTo(String value) {
            addCriterion("STAGE_NETWORK_ES_ARR <>", value, "stageNetworkEsArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkEsArrGreaterThan(String value) {
            addCriterion("STAGE_NETWORK_ES_ARR >", value, "stageNetworkEsArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkEsArrGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE_NETWORK_ES_ARR >=", value, "stageNetworkEsArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkEsArrLessThan(String value) {
            addCriterion("STAGE_NETWORK_ES_ARR <", value, "stageNetworkEsArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkEsArrLessThanOrEqualTo(String value) {
            addCriterion("STAGE_NETWORK_ES_ARR <=", value, "stageNetworkEsArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkEsArrLike(String value) {
            addCriterion("STAGE_NETWORK_ES_ARR like", value, "stageNetworkEsArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkEsArrNotLike(String value) {
            addCriterion("STAGE_NETWORK_ES_ARR not like", value, "stageNetworkEsArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkEsArrIn(List<String> values) {
            addCriterion("STAGE_NETWORK_ES_ARR in", values, "stageNetworkEsArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkEsArrNotIn(List<String> values) {
            addCriterion("STAGE_NETWORK_ES_ARR not in", values, "stageNetworkEsArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkEsArrBetween(String value1, String value2) {
            addCriterion("STAGE_NETWORK_ES_ARR between", value1, value2, "stageNetworkEsArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkEsArrNotBetween(String value1, String value2) {
            addCriterion("STAGE_NETWORK_ES_ARR not between", value1, value2, "stageNetworkEsArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkResultArrIsNull() {
            addCriterion("STAGE_NETWORK_RESULT_ARR is null");
            return (Criteria) this;
        }

        public Criteria andStageNetworkResultArrIsNotNull() {
            addCriterion("STAGE_NETWORK_RESULT_ARR is not null");
            return (Criteria) this;
        }

        public Criteria andStageNetworkResultArrEqualTo(String value) {
            addCriterion("STAGE_NETWORK_RESULT_ARR =", value, "stageNetworkResultArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkResultArrNotEqualTo(String value) {
            addCriterion("STAGE_NETWORK_RESULT_ARR <>", value, "stageNetworkResultArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkResultArrGreaterThan(String value) {
            addCriterion("STAGE_NETWORK_RESULT_ARR >", value, "stageNetworkResultArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkResultArrGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE_NETWORK_RESULT_ARR >=", value, "stageNetworkResultArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkResultArrLessThan(String value) {
            addCriterion("STAGE_NETWORK_RESULT_ARR <", value, "stageNetworkResultArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkResultArrLessThanOrEqualTo(String value) {
            addCriterion("STAGE_NETWORK_RESULT_ARR <=", value, "stageNetworkResultArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkResultArrLike(String value) {
            addCriterion("STAGE_NETWORK_RESULT_ARR like", value, "stageNetworkResultArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkResultArrNotLike(String value) {
            addCriterion("STAGE_NETWORK_RESULT_ARR not like", value, "stageNetworkResultArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkResultArrIn(List<String> values) {
            addCriterion("STAGE_NETWORK_RESULT_ARR in", values, "stageNetworkResultArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkResultArrNotIn(List<String> values) {
            addCriterion("STAGE_NETWORK_RESULT_ARR not in", values, "stageNetworkResultArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkResultArrBetween(String value1, String value2) {
            addCriterion("STAGE_NETWORK_RESULT_ARR between", value1, value2, "stageNetworkResultArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkResultArrNotBetween(String value1, String value2) {
            addCriterion("STAGE_NETWORK_RESULT_ARR not between", value1, value2, "stageNetworkResultArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkContractArrIsNull() {
            addCriterion("STAGE_NETWORK_CONTRACT_ARR is null");
            return (Criteria) this;
        }

        public Criteria andStageNetworkContractArrIsNotNull() {
            addCriterion("STAGE_NETWORK_CONTRACT_ARR is not null");
            return (Criteria) this;
        }

        public Criteria andStageNetworkContractArrEqualTo(String value) {
            addCriterion("STAGE_NETWORK_CONTRACT_ARR =", value, "stageNetworkContractArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkContractArrNotEqualTo(String value) {
            addCriterion("STAGE_NETWORK_CONTRACT_ARR <>", value, "stageNetworkContractArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkContractArrGreaterThan(String value) {
            addCriterion("STAGE_NETWORK_CONTRACT_ARR >", value, "stageNetworkContractArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkContractArrGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE_NETWORK_CONTRACT_ARR >=", value, "stageNetworkContractArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkContractArrLessThan(String value) {
            addCriterion("STAGE_NETWORK_CONTRACT_ARR <", value, "stageNetworkContractArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkContractArrLessThanOrEqualTo(String value) {
            addCriterion("STAGE_NETWORK_CONTRACT_ARR <=", value, "stageNetworkContractArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkContractArrLike(String value) {
            addCriterion("STAGE_NETWORK_CONTRACT_ARR like", value, "stageNetworkContractArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkContractArrNotLike(String value) {
            addCriterion("STAGE_NETWORK_CONTRACT_ARR not like", value, "stageNetworkContractArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkContractArrIn(List<String> values) {
            addCriterion("STAGE_NETWORK_CONTRACT_ARR in", values, "stageNetworkContractArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkContractArrNotIn(List<String> values) {
            addCriterion("STAGE_NETWORK_CONTRACT_ARR not in", values, "stageNetworkContractArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkContractArrBetween(String value1, String value2) {
            addCriterion("STAGE_NETWORK_CONTRACT_ARR between", value1, value2, "stageNetworkContractArr");
            return (Criteria) this;
        }

        public Criteria andStageNetworkContractArrNotBetween(String value1, String value2) {
            addCriterion("STAGE_NETWORK_CONTRACT_ARR not between", value1, value2, "stageNetworkContractArr");
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