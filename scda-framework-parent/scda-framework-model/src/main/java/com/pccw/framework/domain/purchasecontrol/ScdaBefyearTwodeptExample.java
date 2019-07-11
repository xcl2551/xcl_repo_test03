package com.pccw.framework.domain.purchasecontrol;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScdaBefyearTwodeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScdaBefyearTwodeptExample() {
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

        public Criteria andBtIdIsNull() {
            addCriterion("BT_ID is null");
            return (Criteria) this;
        }

        public Criteria andBtIdIsNotNull() {
            addCriterion("BT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBtIdEqualTo(String value) {
            addCriterion("BT_ID =", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdNotEqualTo(String value) {
            addCriterion("BT_ID <>", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdGreaterThan(String value) {
            addCriterion("BT_ID >", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdGreaterThanOrEqualTo(String value) {
            addCriterion("BT_ID >=", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdLessThan(String value) {
            addCriterion("BT_ID <", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdLessThanOrEqualTo(String value) {
            addCriterion("BT_ID <=", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdLike(String value) {
            addCriterion("BT_ID like", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdNotLike(String value) {
            addCriterion("BT_ID not like", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdIn(List<String> values) {
            addCriterion("BT_ID in", values, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdNotIn(List<String> values) {
            addCriterion("BT_ID not in", values, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdBetween(String value1, String value2) {
            addCriterion("BT_ID between", value1, value2, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdNotBetween(String value1, String value2) {
            addCriterion("BT_ID not between", value1, value2, "btId");
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

        public Criteria andBeforeyear1IsNull() {
            addCriterion("BEFOREYEAR_1 is null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear1IsNotNull() {
            addCriterion("BEFOREYEAR_1 is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear1EqualTo(String value) {
            addCriterion("BEFOREYEAR_1 =", value, "beforeyear1");
            return (Criteria) this;
        }

        public Criteria andBeforeyear1NotEqualTo(String value) {
            addCriterion("BEFOREYEAR_1 <>", value, "beforeyear1");
            return (Criteria) this;
        }

        public Criteria andBeforeyear1GreaterThan(String value) {
            addCriterion("BEFOREYEAR_1 >", value, "beforeyear1");
            return (Criteria) this;
        }

        public Criteria andBeforeyear1GreaterThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_1 >=", value, "beforeyear1");
            return (Criteria) this;
        }

        public Criteria andBeforeyear1LessThan(String value) {
            addCriterion("BEFOREYEAR_1 <", value, "beforeyear1");
            return (Criteria) this;
        }

        public Criteria andBeforeyear1LessThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_1 <=", value, "beforeyear1");
            return (Criteria) this;
        }

        public Criteria andBeforeyear1Like(String value) {
            addCriterion("BEFOREYEAR_1 like", value, "beforeyear1");
            return (Criteria) this;
        }

        public Criteria andBeforeyear1NotLike(String value) {
            addCriterion("BEFOREYEAR_1 not like", value, "beforeyear1");
            return (Criteria) this;
        }

        public Criteria andBeforeyear1In(List<String> values) {
            addCriterion("BEFOREYEAR_1 in", values, "beforeyear1");
            return (Criteria) this;
        }

        public Criteria andBeforeyear1NotIn(List<String> values) {
            addCriterion("BEFOREYEAR_1 not in", values, "beforeyear1");
            return (Criteria) this;
        }

        public Criteria andBeforeyear1Between(String value1, String value2) {
            addCriterion("BEFOREYEAR_1 between", value1, value2, "beforeyear1");
            return (Criteria) this;
        }

        public Criteria andBeforeyear1NotBetween(String value1, String value2) {
            addCriterion("BEFOREYEAR_1 not between", value1, value2, "beforeyear1");
            return (Criteria) this;
        }

        public Criteria andBeforeyear2IsNull() {
            addCriterion("BEFOREYEAR_2 is null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear2IsNotNull() {
            addCriterion("BEFOREYEAR_2 is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear2EqualTo(String value) {
            addCriterion("BEFOREYEAR_2 =", value, "beforeyear2");
            return (Criteria) this;
        }

        public Criteria andBeforeyear2NotEqualTo(String value) {
            addCriterion("BEFOREYEAR_2 <>", value, "beforeyear2");
            return (Criteria) this;
        }

        public Criteria andBeforeyear2GreaterThan(String value) {
            addCriterion("BEFOREYEAR_2 >", value, "beforeyear2");
            return (Criteria) this;
        }

        public Criteria andBeforeyear2GreaterThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_2 >=", value, "beforeyear2");
            return (Criteria) this;
        }

        public Criteria andBeforeyear2LessThan(String value) {
            addCriterion("BEFOREYEAR_2 <", value, "beforeyear2");
            return (Criteria) this;
        }

        public Criteria andBeforeyear2LessThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_2 <=", value, "beforeyear2");
            return (Criteria) this;
        }

        public Criteria andBeforeyear2Like(String value) {
            addCriterion("BEFOREYEAR_2 like", value, "beforeyear2");
            return (Criteria) this;
        }

        public Criteria andBeforeyear2NotLike(String value) {
            addCriterion("BEFOREYEAR_2 not like", value, "beforeyear2");
            return (Criteria) this;
        }

        public Criteria andBeforeyear2In(List<String> values) {
            addCriterion("BEFOREYEAR_2 in", values, "beforeyear2");
            return (Criteria) this;
        }

        public Criteria andBeforeyear2NotIn(List<String> values) {
            addCriterion("BEFOREYEAR_2 not in", values, "beforeyear2");
            return (Criteria) this;
        }

        public Criteria andBeforeyear2Between(String value1, String value2) {
            addCriterion("BEFOREYEAR_2 between", value1, value2, "beforeyear2");
            return (Criteria) this;
        }

        public Criteria andBeforeyear2NotBetween(String value1, String value2) {
            addCriterion("BEFOREYEAR_2 not between", value1, value2, "beforeyear2");
            return (Criteria) this;
        }

        public Criteria andBeforeyear3IsNull() {
            addCriterion("BEFOREYEAR_3 is null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear3IsNotNull() {
            addCriterion("BEFOREYEAR_3 is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear3EqualTo(String value) {
            addCriterion("BEFOREYEAR_3 =", value, "beforeyear3");
            return (Criteria) this;
        }

        public Criteria andBeforeyear3NotEqualTo(String value) {
            addCriterion("BEFOREYEAR_3 <>", value, "beforeyear3");
            return (Criteria) this;
        }

        public Criteria andBeforeyear3GreaterThan(String value) {
            addCriterion("BEFOREYEAR_3 >", value, "beforeyear3");
            return (Criteria) this;
        }

        public Criteria andBeforeyear3GreaterThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_3 >=", value, "beforeyear3");
            return (Criteria) this;
        }

        public Criteria andBeforeyear3LessThan(String value) {
            addCriterion("BEFOREYEAR_3 <", value, "beforeyear3");
            return (Criteria) this;
        }

        public Criteria andBeforeyear3LessThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_3 <=", value, "beforeyear3");
            return (Criteria) this;
        }

        public Criteria andBeforeyear3Like(String value) {
            addCriterion("BEFOREYEAR_3 like", value, "beforeyear3");
            return (Criteria) this;
        }

        public Criteria andBeforeyear3NotLike(String value) {
            addCriterion("BEFOREYEAR_3 not like", value, "beforeyear3");
            return (Criteria) this;
        }

        public Criteria andBeforeyear3In(List<String> values) {
            addCriterion("BEFOREYEAR_3 in", values, "beforeyear3");
            return (Criteria) this;
        }

        public Criteria andBeforeyear3NotIn(List<String> values) {
            addCriterion("BEFOREYEAR_3 not in", values, "beforeyear3");
            return (Criteria) this;
        }

        public Criteria andBeforeyear3Between(String value1, String value2) {
            addCriterion("BEFOREYEAR_3 between", value1, value2, "beforeyear3");
            return (Criteria) this;
        }

        public Criteria andBeforeyear3NotBetween(String value1, String value2) {
            addCriterion("BEFOREYEAR_3 not between", value1, value2, "beforeyear3");
            return (Criteria) this;
        }

        public Criteria andBeforeyear4IsNull() {
            addCriterion("BEFOREYEAR_4 is null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear4IsNotNull() {
            addCriterion("BEFOREYEAR_4 is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear4EqualTo(String value) {
            addCriterion("BEFOREYEAR_4 =", value, "beforeyear4");
            return (Criteria) this;
        }

        public Criteria andBeforeyear4NotEqualTo(String value) {
            addCriterion("BEFOREYEAR_4 <>", value, "beforeyear4");
            return (Criteria) this;
        }

        public Criteria andBeforeyear4GreaterThan(String value) {
            addCriterion("BEFOREYEAR_4 >", value, "beforeyear4");
            return (Criteria) this;
        }

        public Criteria andBeforeyear4GreaterThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_4 >=", value, "beforeyear4");
            return (Criteria) this;
        }

        public Criteria andBeforeyear4LessThan(String value) {
            addCriterion("BEFOREYEAR_4 <", value, "beforeyear4");
            return (Criteria) this;
        }

        public Criteria andBeforeyear4LessThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_4 <=", value, "beforeyear4");
            return (Criteria) this;
        }

        public Criteria andBeforeyear4Like(String value) {
            addCriterion("BEFOREYEAR_4 like", value, "beforeyear4");
            return (Criteria) this;
        }

        public Criteria andBeforeyear4NotLike(String value) {
            addCriterion("BEFOREYEAR_4 not like", value, "beforeyear4");
            return (Criteria) this;
        }

        public Criteria andBeforeyear4In(List<String> values) {
            addCriterion("BEFOREYEAR_4 in", values, "beforeyear4");
            return (Criteria) this;
        }

        public Criteria andBeforeyear4NotIn(List<String> values) {
            addCriterion("BEFOREYEAR_4 not in", values, "beforeyear4");
            return (Criteria) this;
        }

        public Criteria andBeforeyear4Between(String value1, String value2) {
            addCriterion("BEFOREYEAR_4 between", value1, value2, "beforeyear4");
            return (Criteria) this;
        }

        public Criteria andBeforeyear4NotBetween(String value1, String value2) {
            addCriterion("BEFOREYEAR_4 not between", value1, value2, "beforeyear4");
            return (Criteria) this;
        }

        public Criteria andBeforeyear5IsNull() {
            addCriterion("BEFOREYEAR_5 is null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear5IsNotNull() {
            addCriterion("BEFOREYEAR_5 is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear5EqualTo(String value) {
            addCriterion("BEFOREYEAR_5 =", value, "beforeyear5");
            return (Criteria) this;
        }

        public Criteria andBeforeyear5NotEqualTo(String value) {
            addCriterion("BEFOREYEAR_5 <>", value, "beforeyear5");
            return (Criteria) this;
        }

        public Criteria andBeforeyear5GreaterThan(String value) {
            addCriterion("BEFOREYEAR_5 >", value, "beforeyear5");
            return (Criteria) this;
        }

        public Criteria andBeforeyear5GreaterThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_5 >=", value, "beforeyear5");
            return (Criteria) this;
        }

        public Criteria andBeforeyear5LessThan(String value) {
            addCriterion("BEFOREYEAR_5 <", value, "beforeyear5");
            return (Criteria) this;
        }

        public Criteria andBeforeyear5LessThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_5 <=", value, "beforeyear5");
            return (Criteria) this;
        }

        public Criteria andBeforeyear5Like(String value) {
            addCriterion("BEFOREYEAR_5 like", value, "beforeyear5");
            return (Criteria) this;
        }

        public Criteria andBeforeyear5NotLike(String value) {
            addCriterion("BEFOREYEAR_5 not like", value, "beforeyear5");
            return (Criteria) this;
        }

        public Criteria andBeforeyear5In(List<String> values) {
            addCriterion("BEFOREYEAR_5 in", values, "beforeyear5");
            return (Criteria) this;
        }

        public Criteria andBeforeyear5NotIn(List<String> values) {
            addCriterion("BEFOREYEAR_5 not in", values, "beforeyear5");
            return (Criteria) this;
        }

        public Criteria andBeforeyear5Between(String value1, String value2) {
            addCriterion("BEFOREYEAR_5 between", value1, value2, "beforeyear5");
            return (Criteria) this;
        }

        public Criteria andBeforeyear5NotBetween(String value1, String value2) {
            addCriterion("BEFOREYEAR_5 not between", value1, value2, "beforeyear5");
            return (Criteria) this;
        }

        public Criteria andBeforeyear6IsNull() {
            addCriterion("BEFOREYEAR_6 is null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear6IsNotNull() {
            addCriterion("BEFOREYEAR_6 is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear6EqualTo(String value) {
            addCriterion("BEFOREYEAR_6 =", value, "beforeyear6");
            return (Criteria) this;
        }

        public Criteria andBeforeyear6NotEqualTo(String value) {
            addCriterion("BEFOREYEAR_6 <>", value, "beforeyear6");
            return (Criteria) this;
        }

        public Criteria andBeforeyear6GreaterThan(String value) {
            addCriterion("BEFOREYEAR_6 >", value, "beforeyear6");
            return (Criteria) this;
        }

        public Criteria andBeforeyear6GreaterThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_6 >=", value, "beforeyear6");
            return (Criteria) this;
        }

        public Criteria andBeforeyear6LessThan(String value) {
            addCriterion("BEFOREYEAR_6 <", value, "beforeyear6");
            return (Criteria) this;
        }

        public Criteria andBeforeyear6LessThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_6 <=", value, "beforeyear6");
            return (Criteria) this;
        }

        public Criteria andBeforeyear6Like(String value) {
            addCriterion("BEFOREYEAR_6 like", value, "beforeyear6");
            return (Criteria) this;
        }

        public Criteria andBeforeyear6NotLike(String value) {
            addCriterion("BEFOREYEAR_6 not like", value, "beforeyear6");
            return (Criteria) this;
        }

        public Criteria andBeforeyear6In(List<String> values) {
            addCriterion("BEFOREYEAR_6 in", values, "beforeyear6");
            return (Criteria) this;
        }

        public Criteria andBeforeyear6NotIn(List<String> values) {
            addCriterion("BEFOREYEAR_6 not in", values, "beforeyear6");
            return (Criteria) this;
        }

        public Criteria andBeforeyear6Between(String value1, String value2) {
            addCriterion("BEFOREYEAR_6 between", value1, value2, "beforeyear6");
            return (Criteria) this;
        }

        public Criteria andBeforeyear6NotBetween(String value1, String value2) {
            addCriterion("BEFOREYEAR_6 not between", value1, value2, "beforeyear6");
            return (Criteria) this;
        }

        public Criteria andBeforeyear7IsNull() {
            addCriterion("BEFOREYEAR_7 is null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear7IsNotNull() {
            addCriterion("BEFOREYEAR_7 is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear7EqualTo(String value) {
            addCriterion("BEFOREYEAR_7 =", value, "beforeyear7");
            return (Criteria) this;
        }

        public Criteria andBeforeyear7NotEqualTo(String value) {
            addCriterion("BEFOREYEAR_7 <>", value, "beforeyear7");
            return (Criteria) this;
        }

        public Criteria andBeforeyear7GreaterThan(String value) {
            addCriterion("BEFOREYEAR_7 >", value, "beforeyear7");
            return (Criteria) this;
        }

        public Criteria andBeforeyear7GreaterThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_7 >=", value, "beforeyear7");
            return (Criteria) this;
        }

        public Criteria andBeforeyear7LessThan(String value) {
            addCriterion("BEFOREYEAR_7 <", value, "beforeyear7");
            return (Criteria) this;
        }

        public Criteria andBeforeyear7LessThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_7 <=", value, "beforeyear7");
            return (Criteria) this;
        }

        public Criteria andBeforeyear7Like(String value) {
            addCriterion("BEFOREYEAR_7 like", value, "beforeyear7");
            return (Criteria) this;
        }

        public Criteria andBeforeyear7NotLike(String value) {
            addCriterion("BEFOREYEAR_7 not like", value, "beforeyear7");
            return (Criteria) this;
        }

        public Criteria andBeforeyear7In(List<String> values) {
            addCriterion("BEFOREYEAR_7 in", values, "beforeyear7");
            return (Criteria) this;
        }

        public Criteria andBeforeyear7NotIn(List<String> values) {
            addCriterion("BEFOREYEAR_7 not in", values, "beforeyear7");
            return (Criteria) this;
        }

        public Criteria andBeforeyear7Between(String value1, String value2) {
            addCriterion("BEFOREYEAR_7 between", value1, value2, "beforeyear7");
            return (Criteria) this;
        }

        public Criteria andBeforeyear7NotBetween(String value1, String value2) {
            addCriterion("BEFOREYEAR_7 not between", value1, value2, "beforeyear7");
            return (Criteria) this;
        }

        public Criteria andBeforeyear8IsNull() {
            addCriterion("BEFOREYEAR_8 is null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear8IsNotNull() {
            addCriterion("BEFOREYEAR_8 is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear8EqualTo(String value) {
            addCriterion("BEFOREYEAR_8 =", value, "beforeyear8");
            return (Criteria) this;
        }

        public Criteria andBeforeyear8NotEqualTo(String value) {
            addCriterion("BEFOREYEAR_8 <>", value, "beforeyear8");
            return (Criteria) this;
        }

        public Criteria andBeforeyear8GreaterThan(String value) {
            addCriterion("BEFOREYEAR_8 >", value, "beforeyear8");
            return (Criteria) this;
        }

        public Criteria andBeforeyear8GreaterThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_8 >=", value, "beforeyear8");
            return (Criteria) this;
        }

        public Criteria andBeforeyear8LessThan(String value) {
            addCriterion("BEFOREYEAR_8 <", value, "beforeyear8");
            return (Criteria) this;
        }

        public Criteria andBeforeyear8LessThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_8 <=", value, "beforeyear8");
            return (Criteria) this;
        }

        public Criteria andBeforeyear8Like(String value) {
            addCriterion("BEFOREYEAR_8 like", value, "beforeyear8");
            return (Criteria) this;
        }

        public Criteria andBeforeyear8NotLike(String value) {
            addCriterion("BEFOREYEAR_8 not like", value, "beforeyear8");
            return (Criteria) this;
        }

        public Criteria andBeforeyear8In(List<String> values) {
            addCriterion("BEFOREYEAR_8 in", values, "beforeyear8");
            return (Criteria) this;
        }

        public Criteria andBeforeyear8NotIn(List<String> values) {
            addCriterion("BEFOREYEAR_8 not in", values, "beforeyear8");
            return (Criteria) this;
        }

        public Criteria andBeforeyear8Between(String value1, String value2) {
            addCriterion("BEFOREYEAR_8 between", value1, value2, "beforeyear8");
            return (Criteria) this;
        }

        public Criteria andBeforeyear8NotBetween(String value1, String value2) {
            addCriterion("BEFOREYEAR_8 not between", value1, value2, "beforeyear8");
            return (Criteria) this;
        }

        public Criteria andBeforeyear9IsNull() {
            addCriterion("BEFOREYEAR_9 is null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear9IsNotNull() {
            addCriterion("BEFOREYEAR_9 is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear9EqualTo(String value) {
            addCriterion("BEFOREYEAR_9 =", value, "beforeyear9");
            return (Criteria) this;
        }

        public Criteria andBeforeyear9NotEqualTo(String value) {
            addCriterion("BEFOREYEAR_9 <>", value, "beforeyear9");
            return (Criteria) this;
        }

        public Criteria andBeforeyear9GreaterThan(String value) {
            addCriterion("BEFOREYEAR_9 >", value, "beforeyear9");
            return (Criteria) this;
        }

        public Criteria andBeforeyear9GreaterThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_9 >=", value, "beforeyear9");
            return (Criteria) this;
        }

        public Criteria andBeforeyear9LessThan(String value) {
            addCriterion("BEFOREYEAR_9 <", value, "beforeyear9");
            return (Criteria) this;
        }

        public Criteria andBeforeyear9LessThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_9 <=", value, "beforeyear9");
            return (Criteria) this;
        }

        public Criteria andBeforeyear9Like(String value) {
            addCriterion("BEFOREYEAR_9 like", value, "beforeyear9");
            return (Criteria) this;
        }

        public Criteria andBeforeyear9NotLike(String value) {
            addCriterion("BEFOREYEAR_9 not like", value, "beforeyear9");
            return (Criteria) this;
        }

        public Criteria andBeforeyear9In(List<String> values) {
            addCriterion("BEFOREYEAR_9 in", values, "beforeyear9");
            return (Criteria) this;
        }

        public Criteria andBeforeyear9NotIn(List<String> values) {
            addCriterion("BEFOREYEAR_9 not in", values, "beforeyear9");
            return (Criteria) this;
        }

        public Criteria andBeforeyear9Between(String value1, String value2) {
            addCriterion("BEFOREYEAR_9 between", value1, value2, "beforeyear9");
            return (Criteria) this;
        }

        public Criteria andBeforeyear9NotBetween(String value1, String value2) {
            addCriterion("BEFOREYEAR_9 not between", value1, value2, "beforeyear9");
            return (Criteria) this;
        }

        public Criteria andBeforeyear10IsNull() {
            addCriterion("BEFOREYEAR_10 is null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear10IsNotNull() {
            addCriterion("BEFOREYEAR_10 is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear10EqualTo(String value) {
            addCriterion("BEFOREYEAR_10 =", value, "beforeyear10");
            return (Criteria) this;
        }

        public Criteria andBeforeyear10NotEqualTo(String value) {
            addCriterion("BEFOREYEAR_10 <>", value, "beforeyear10");
            return (Criteria) this;
        }

        public Criteria andBeforeyear10GreaterThan(String value) {
            addCriterion("BEFOREYEAR_10 >", value, "beforeyear10");
            return (Criteria) this;
        }

        public Criteria andBeforeyear10GreaterThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_10 >=", value, "beforeyear10");
            return (Criteria) this;
        }

        public Criteria andBeforeyear10LessThan(String value) {
            addCriterion("BEFOREYEAR_10 <", value, "beforeyear10");
            return (Criteria) this;
        }

        public Criteria andBeforeyear10LessThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_10 <=", value, "beforeyear10");
            return (Criteria) this;
        }

        public Criteria andBeforeyear10Like(String value) {
            addCriterion("BEFOREYEAR_10 like", value, "beforeyear10");
            return (Criteria) this;
        }

        public Criteria andBeforeyear10NotLike(String value) {
            addCriterion("BEFOREYEAR_10 not like", value, "beforeyear10");
            return (Criteria) this;
        }

        public Criteria andBeforeyear10In(List<String> values) {
            addCriterion("BEFOREYEAR_10 in", values, "beforeyear10");
            return (Criteria) this;
        }

        public Criteria andBeforeyear10NotIn(List<String> values) {
            addCriterion("BEFOREYEAR_10 not in", values, "beforeyear10");
            return (Criteria) this;
        }

        public Criteria andBeforeyear10Between(String value1, String value2) {
            addCriterion("BEFOREYEAR_10 between", value1, value2, "beforeyear10");
            return (Criteria) this;
        }

        public Criteria andBeforeyear10NotBetween(String value1, String value2) {
            addCriterion("BEFOREYEAR_10 not between", value1, value2, "beforeyear10");
            return (Criteria) this;
        }

        public Criteria andBeforeyear11IsNull() {
            addCriterion("BEFOREYEAR_11 is null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear11IsNotNull() {
            addCriterion("BEFOREYEAR_11 is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear11EqualTo(String value) {
            addCriterion("BEFOREYEAR_11 =", value, "beforeyear11");
            return (Criteria) this;
        }

        public Criteria andBeforeyear11NotEqualTo(String value) {
            addCriterion("BEFOREYEAR_11 <>", value, "beforeyear11");
            return (Criteria) this;
        }

        public Criteria andBeforeyear11GreaterThan(String value) {
            addCriterion("BEFOREYEAR_11 >", value, "beforeyear11");
            return (Criteria) this;
        }

        public Criteria andBeforeyear11GreaterThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_11 >=", value, "beforeyear11");
            return (Criteria) this;
        }

        public Criteria andBeforeyear11LessThan(String value) {
            addCriterion("BEFOREYEAR_11 <", value, "beforeyear11");
            return (Criteria) this;
        }

        public Criteria andBeforeyear11LessThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_11 <=", value, "beforeyear11");
            return (Criteria) this;
        }

        public Criteria andBeforeyear11Like(String value) {
            addCriterion("BEFOREYEAR_11 like", value, "beforeyear11");
            return (Criteria) this;
        }

        public Criteria andBeforeyear11NotLike(String value) {
            addCriterion("BEFOREYEAR_11 not like", value, "beforeyear11");
            return (Criteria) this;
        }

        public Criteria andBeforeyear11In(List<String> values) {
            addCriterion("BEFOREYEAR_11 in", values, "beforeyear11");
            return (Criteria) this;
        }

        public Criteria andBeforeyear11NotIn(List<String> values) {
            addCriterion("BEFOREYEAR_11 not in", values, "beforeyear11");
            return (Criteria) this;
        }

        public Criteria andBeforeyear11Between(String value1, String value2) {
            addCriterion("BEFOREYEAR_11 between", value1, value2, "beforeyear11");
            return (Criteria) this;
        }

        public Criteria andBeforeyear11NotBetween(String value1, String value2) {
            addCriterion("BEFOREYEAR_11 not between", value1, value2, "beforeyear11");
            return (Criteria) this;
        }

        public Criteria andBeforeyear12IsNull() {
            addCriterion("BEFOREYEAR_12 is null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear12IsNotNull() {
            addCriterion("BEFOREYEAR_12 is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeyear12EqualTo(String value) {
            addCriterion("BEFOREYEAR_12 =", value, "beforeyear12");
            return (Criteria) this;
        }

        public Criteria andBeforeyear12NotEqualTo(String value) {
            addCriterion("BEFOREYEAR_12 <>", value, "beforeyear12");
            return (Criteria) this;
        }

        public Criteria andBeforeyear12GreaterThan(String value) {
            addCriterion("BEFOREYEAR_12 >", value, "beforeyear12");
            return (Criteria) this;
        }

        public Criteria andBeforeyear12GreaterThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_12 >=", value, "beforeyear12");
            return (Criteria) this;
        }

        public Criteria andBeforeyear12LessThan(String value) {
            addCriterion("BEFOREYEAR_12 <", value, "beforeyear12");
            return (Criteria) this;
        }

        public Criteria andBeforeyear12LessThanOrEqualTo(String value) {
            addCriterion("BEFOREYEAR_12 <=", value, "beforeyear12");
            return (Criteria) this;
        }

        public Criteria andBeforeyear12Like(String value) {
            addCriterion("BEFOREYEAR_12 like", value, "beforeyear12");
            return (Criteria) this;
        }

        public Criteria andBeforeyear12NotLike(String value) {
            addCriterion("BEFOREYEAR_12 not like", value, "beforeyear12");
            return (Criteria) this;
        }

        public Criteria andBeforeyear12In(List<String> values) {
            addCriterion("BEFOREYEAR_12 in", values, "beforeyear12");
            return (Criteria) this;
        }

        public Criteria andBeforeyear12NotIn(List<String> values) {
            addCriterion("BEFOREYEAR_12 not in", values, "beforeyear12");
            return (Criteria) this;
        }

        public Criteria andBeforeyear12Between(String value1, String value2) {
            addCriterion("BEFOREYEAR_12 between", value1, value2, "beforeyear12");
            return (Criteria) this;
        }

        public Criteria andBeforeyear12NotBetween(String value1, String value2) {
            addCriterion("BEFOREYEAR_12 not between", value1, value2, "beforeyear12");
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