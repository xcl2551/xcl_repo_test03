package com.pccw.framework.domain.purchasetime;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScdaPurTimeSummaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScdaPurTimeSummaryExample() {
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

        public Criteria andToContractSignPerOneIsNull() {
            addCriterion("TO_CONTRACT_SIGN_PER_ONE is null");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerOneIsNotNull() {
            addCriterion("TO_CONTRACT_SIGN_PER_ONE is not null");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerOneEqualTo(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_ONE =", value, "toContractSignPerOne");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerOneNotEqualTo(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_ONE <>", value, "toContractSignPerOne");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerOneGreaterThan(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_ONE >", value, "toContractSignPerOne");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerOneGreaterThanOrEqualTo(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_ONE >=", value, "toContractSignPerOne");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerOneLessThan(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_ONE <", value, "toContractSignPerOne");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerOneLessThanOrEqualTo(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_ONE <=", value, "toContractSignPerOne");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerOneLike(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_ONE like", value, "toContractSignPerOne");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerOneNotLike(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_ONE not like", value, "toContractSignPerOne");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerOneIn(List<String> values) {
            addCriterion("TO_CONTRACT_SIGN_PER_ONE in", values, "toContractSignPerOne");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerOneNotIn(List<String> values) {
            addCriterion("TO_CONTRACT_SIGN_PER_ONE not in", values, "toContractSignPerOne");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerOneBetween(String value1, String value2) {
            addCriterion("TO_CONTRACT_SIGN_PER_ONE between", value1, value2, "toContractSignPerOne");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerOneNotBetween(String value1, String value2) {
            addCriterion("TO_CONTRACT_SIGN_PER_ONE not between", value1, value2, "toContractSignPerOne");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerTwoIsNull() {
            addCriterion("TO_CONTRACT_SIGN_PER_TWO is null");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerTwoIsNotNull() {
            addCriterion("TO_CONTRACT_SIGN_PER_TWO is not null");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerTwoEqualTo(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_TWO =", value, "toContractSignPerTwo");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerTwoNotEqualTo(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_TWO <>", value, "toContractSignPerTwo");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerTwoGreaterThan(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_TWO >", value, "toContractSignPerTwo");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerTwoGreaterThanOrEqualTo(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_TWO >=", value, "toContractSignPerTwo");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerTwoLessThan(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_TWO <", value, "toContractSignPerTwo");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerTwoLessThanOrEqualTo(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_TWO <=", value, "toContractSignPerTwo");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerTwoLike(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_TWO like", value, "toContractSignPerTwo");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerTwoNotLike(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_TWO not like", value, "toContractSignPerTwo");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerTwoIn(List<String> values) {
            addCriterion("TO_CONTRACT_SIGN_PER_TWO in", values, "toContractSignPerTwo");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerTwoNotIn(List<String> values) {
            addCriterion("TO_CONTRACT_SIGN_PER_TWO not in", values, "toContractSignPerTwo");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerTwoBetween(String value1, String value2) {
            addCriterion("TO_CONTRACT_SIGN_PER_TWO between", value1, value2, "toContractSignPerTwo");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerTwoNotBetween(String value1, String value2) {
            addCriterion("TO_CONTRACT_SIGN_PER_TWO not between", value1, value2, "toContractSignPerTwo");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerThreeIsNull() {
            addCriterion("TO_CONTRACT_SIGN_PER_THREE is null");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerThreeIsNotNull() {
            addCriterion("TO_CONTRACT_SIGN_PER_THREE is not null");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerThreeEqualTo(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_THREE =", value, "toContractSignPerThree");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerThreeNotEqualTo(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_THREE <>", value, "toContractSignPerThree");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerThreeGreaterThan(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_THREE >", value, "toContractSignPerThree");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerThreeGreaterThanOrEqualTo(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_THREE >=", value, "toContractSignPerThree");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerThreeLessThan(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_THREE <", value, "toContractSignPerThree");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerThreeLessThanOrEqualTo(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_THREE <=", value, "toContractSignPerThree");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerThreeLike(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_THREE like", value, "toContractSignPerThree");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerThreeNotLike(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_THREE not like", value, "toContractSignPerThree");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerThreeIn(List<String> values) {
            addCriterion("TO_CONTRACT_SIGN_PER_THREE in", values, "toContractSignPerThree");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerThreeNotIn(List<String> values) {
            addCriterion("TO_CONTRACT_SIGN_PER_THREE not in", values, "toContractSignPerThree");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerThreeBetween(String value1, String value2) {
            addCriterion("TO_CONTRACT_SIGN_PER_THREE between", value1, value2, "toContractSignPerThree");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerThreeNotBetween(String value1, String value2) {
            addCriterion("TO_CONTRACT_SIGN_PER_THREE not between", value1, value2, "toContractSignPerThree");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerFourIsNull() {
            addCriterion("TO_CONTRACT_SIGN_PER_FOUR is null");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerFourIsNotNull() {
            addCriterion("TO_CONTRACT_SIGN_PER_FOUR is not null");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerFourEqualTo(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_FOUR =", value, "toContractSignPerFour");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerFourNotEqualTo(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_FOUR <>", value, "toContractSignPerFour");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerFourGreaterThan(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_FOUR >", value, "toContractSignPerFour");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerFourGreaterThanOrEqualTo(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_FOUR >=", value, "toContractSignPerFour");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerFourLessThan(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_FOUR <", value, "toContractSignPerFour");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerFourLessThanOrEqualTo(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_FOUR <=", value, "toContractSignPerFour");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerFourLike(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_FOUR like", value, "toContractSignPerFour");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerFourNotLike(String value) {
            addCriterion("TO_CONTRACT_SIGN_PER_FOUR not like", value, "toContractSignPerFour");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerFourIn(List<String> values) {
            addCriterion("TO_CONTRACT_SIGN_PER_FOUR in", values, "toContractSignPerFour");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerFourNotIn(List<String> values) {
            addCriterion("TO_CONTRACT_SIGN_PER_FOUR not in", values, "toContractSignPerFour");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerFourBetween(String value1, String value2) {
            addCriterion("TO_CONTRACT_SIGN_PER_FOUR between", value1, value2, "toContractSignPerFour");
            return (Criteria) this;
        }

        public Criteria andToContractSignPerFourNotBetween(String value1, String value2) {
            addCriterion("TO_CONTRACT_SIGN_PER_FOUR not between", value1, value2, "toContractSignPerFour");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerOneIsNull() {
            addCriterion("TO_RESULT_SUBMIT_PER_ONE is null");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerOneIsNotNull() {
            addCriterion("TO_RESULT_SUBMIT_PER_ONE is not null");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerOneEqualTo(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_ONE =", value, "toResultSubmitPerOne");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerOneNotEqualTo(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_ONE <>", value, "toResultSubmitPerOne");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerOneGreaterThan(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_ONE >", value, "toResultSubmitPerOne");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerOneGreaterThanOrEqualTo(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_ONE >=", value, "toResultSubmitPerOne");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerOneLessThan(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_ONE <", value, "toResultSubmitPerOne");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerOneLessThanOrEqualTo(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_ONE <=", value, "toResultSubmitPerOne");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerOneLike(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_ONE like", value, "toResultSubmitPerOne");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerOneNotLike(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_ONE not like", value, "toResultSubmitPerOne");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerOneIn(List<String> values) {
            addCriterion("TO_RESULT_SUBMIT_PER_ONE in", values, "toResultSubmitPerOne");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerOneNotIn(List<String> values) {
            addCriterion("TO_RESULT_SUBMIT_PER_ONE not in", values, "toResultSubmitPerOne");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerOneBetween(String value1, String value2) {
            addCriterion("TO_RESULT_SUBMIT_PER_ONE between", value1, value2, "toResultSubmitPerOne");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerOneNotBetween(String value1, String value2) {
            addCriterion("TO_RESULT_SUBMIT_PER_ONE not between", value1, value2, "toResultSubmitPerOne");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerTwoIsNull() {
            addCriterion("TO_RESULT_SUBMIT_PER_TWO is null");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerTwoIsNotNull() {
            addCriterion("TO_RESULT_SUBMIT_PER_TWO is not null");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerTwoEqualTo(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_TWO =", value, "toResultSubmitPerTwo");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerTwoNotEqualTo(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_TWO <>", value, "toResultSubmitPerTwo");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerTwoGreaterThan(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_TWO >", value, "toResultSubmitPerTwo");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerTwoGreaterThanOrEqualTo(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_TWO >=", value, "toResultSubmitPerTwo");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerTwoLessThan(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_TWO <", value, "toResultSubmitPerTwo");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerTwoLessThanOrEqualTo(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_TWO <=", value, "toResultSubmitPerTwo");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerTwoLike(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_TWO like", value, "toResultSubmitPerTwo");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerTwoNotLike(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_TWO not like", value, "toResultSubmitPerTwo");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerTwoIn(List<String> values) {
            addCriterion("TO_RESULT_SUBMIT_PER_TWO in", values, "toResultSubmitPerTwo");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerTwoNotIn(List<String> values) {
            addCriterion("TO_RESULT_SUBMIT_PER_TWO not in", values, "toResultSubmitPerTwo");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerTwoBetween(String value1, String value2) {
            addCriterion("TO_RESULT_SUBMIT_PER_TWO between", value1, value2, "toResultSubmitPerTwo");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerTwoNotBetween(String value1, String value2) {
            addCriterion("TO_RESULT_SUBMIT_PER_TWO not between", value1, value2, "toResultSubmitPerTwo");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerThreeIsNull() {
            addCriterion("TO_RESULT_SUBMIT_PER_THREE is null");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerThreeIsNotNull() {
            addCriterion("TO_RESULT_SUBMIT_PER_THREE is not null");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerThreeEqualTo(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_THREE =", value, "toResultSubmitPerThree");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerThreeNotEqualTo(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_THREE <>", value, "toResultSubmitPerThree");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerThreeGreaterThan(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_THREE >", value, "toResultSubmitPerThree");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerThreeGreaterThanOrEqualTo(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_THREE >=", value, "toResultSubmitPerThree");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerThreeLessThan(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_THREE <", value, "toResultSubmitPerThree");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerThreeLessThanOrEqualTo(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_THREE <=", value, "toResultSubmitPerThree");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerThreeLike(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_THREE like", value, "toResultSubmitPerThree");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerThreeNotLike(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_THREE not like", value, "toResultSubmitPerThree");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerThreeIn(List<String> values) {
            addCriterion("TO_RESULT_SUBMIT_PER_THREE in", values, "toResultSubmitPerThree");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerThreeNotIn(List<String> values) {
            addCriterion("TO_RESULT_SUBMIT_PER_THREE not in", values, "toResultSubmitPerThree");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerThreeBetween(String value1, String value2) {
            addCriterion("TO_RESULT_SUBMIT_PER_THREE between", value1, value2, "toResultSubmitPerThree");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerThreeNotBetween(String value1, String value2) {
            addCriterion("TO_RESULT_SUBMIT_PER_THREE not between", value1, value2, "toResultSubmitPerThree");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerFourIsNull() {
            addCriterion("TO_RESULT_SUBMIT_PER_FOUR is null");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerFourIsNotNull() {
            addCriterion("TO_RESULT_SUBMIT_PER_FOUR is not null");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerFourEqualTo(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_FOUR =", value, "toResultSubmitPerFour");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerFourNotEqualTo(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_FOUR <>", value, "toResultSubmitPerFour");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerFourGreaterThan(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_FOUR >", value, "toResultSubmitPerFour");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerFourGreaterThanOrEqualTo(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_FOUR >=", value, "toResultSubmitPerFour");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerFourLessThan(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_FOUR <", value, "toResultSubmitPerFour");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerFourLessThanOrEqualTo(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_FOUR <=", value, "toResultSubmitPerFour");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerFourLike(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_FOUR like", value, "toResultSubmitPerFour");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerFourNotLike(String value) {
            addCriterion("TO_RESULT_SUBMIT_PER_FOUR not like", value, "toResultSubmitPerFour");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerFourIn(List<String> values) {
            addCriterion("TO_RESULT_SUBMIT_PER_FOUR in", values, "toResultSubmitPerFour");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerFourNotIn(List<String> values) {
            addCriterion("TO_RESULT_SUBMIT_PER_FOUR not in", values, "toResultSubmitPerFour");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerFourBetween(String value1, String value2) {
            addCriterion("TO_RESULT_SUBMIT_PER_FOUR between", value1, value2, "toResultSubmitPerFour");
            return (Criteria) this;
        }

        public Criteria andToResultSubmitPerFourNotBetween(String value1, String value2) {
            addCriterion("TO_RESULT_SUBMIT_PER_FOUR not between", value1, value2, "toResultSubmitPerFour");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateMonthIsNull() {
            addCriterion("DEADLINE_DATE_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateMonthIsNotNull() {
            addCriterion("DEADLINE_DATE_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateMonthEqualTo(String value) {
            addCriterion("DEADLINE_DATE_MONTH =", value, "deadlineDateMonth");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateMonthNotEqualTo(String value) {
            addCriterion("DEADLINE_DATE_MONTH <>", value, "deadlineDateMonth");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateMonthGreaterThan(String value) {
            addCriterion("DEADLINE_DATE_MONTH >", value, "deadlineDateMonth");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateMonthGreaterThanOrEqualTo(String value) {
            addCriterion("DEADLINE_DATE_MONTH >=", value, "deadlineDateMonth");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateMonthLessThan(String value) {
            addCriterion("DEADLINE_DATE_MONTH <", value, "deadlineDateMonth");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateMonthLessThanOrEqualTo(String value) {
            addCriterion("DEADLINE_DATE_MONTH <=", value, "deadlineDateMonth");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateMonthLike(String value) {
            addCriterion("DEADLINE_DATE_MONTH like", value, "deadlineDateMonth");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateMonthNotLike(String value) {
            addCriterion("DEADLINE_DATE_MONTH not like", value, "deadlineDateMonth");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateMonthIn(List<String> values) {
            addCriterion("DEADLINE_DATE_MONTH in", values, "deadlineDateMonth");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateMonthNotIn(List<String> values) {
            addCriterion("DEADLINE_DATE_MONTH not in", values, "deadlineDateMonth");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateMonthBetween(String value1, String value2) {
            addCriterion("DEADLINE_DATE_MONTH between", value1, value2, "deadlineDateMonth");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateMonthNotBetween(String value1, String value2) {
            addCriterion("DEADLINE_DATE_MONTH not between", value1, value2, "deadlineDateMonth");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalBefPerIsNull() {
            addCriterion("PUR_PRO_GLOBAL_BEF_PER is null");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalBefPerIsNotNull() {
            addCriterion("PUR_PRO_GLOBAL_BEF_PER is not null");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalBefPerEqualTo(String value) {
            addCriterion("PUR_PRO_GLOBAL_BEF_PER =", value, "purProGlobalBefPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalBefPerNotEqualTo(String value) {
            addCriterion("PUR_PRO_GLOBAL_BEF_PER <>", value, "purProGlobalBefPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalBefPerGreaterThan(String value) {
            addCriterion("PUR_PRO_GLOBAL_BEF_PER >", value, "purProGlobalBefPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalBefPerGreaterThanOrEqualTo(String value) {
            addCriterion("PUR_PRO_GLOBAL_BEF_PER >=", value, "purProGlobalBefPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalBefPerLessThan(String value) {
            addCriterion("PUR_PRO_GLOBAL_BEF_PER <", value, "purProGlobalBefPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalBefPerLessThanOrEqualTo(String value) {
            addCriterion("PUR_PRO_GLOBAL_BEF_PER <=", value, "purProGlobalBefPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalBefPerLike(String value) {
            addCriterion("PUR_PRO_GLOBAL_BEF_PER like", value, "purProGlobalBefPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalBefPerNotLike(String value) {
            addCriterion("PUR_PRO_GLOBAL_BEF_PER not like", value, "purProGlobalBefPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalBefPerIn(List<String> values) {
            addCriterion("PUR_PRO_GLOBAL_BEF_PER in", values, "purProGlobalBefPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalBefPerNotIn(List<String> values) {
            addCriterion("PUR_PRO_GLOBAL_BEF_PER not in", values, "purProGlobalBefPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalBefPerBetween(String value1, String value2) {
            addCriterion("PUR_PRO_GLOBAL_BEF_PER between", value1, value2, "purProGlobalBefPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalBefPerNotBetween(String value1, String value2) {
            addCriterion("PUR_PRO_GLOBAL_BEF_PER not between", value1, value2, "purProGlobalBefPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalAfterPerIsNull() {
            addCriterion("PUR_PRO_GLOBAL_AFTER_PER is null");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalAfterPerIsNotNull() {
            addCriterion("PUR_PRO_GLOBAL_AFTER_PER is not null");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalAfterPerEqualTo(String value) {
            addCriterion("PUR_PRO_GLOBAL_AFTER_PER =", value, "purProGlobalAfterPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalAfterPerNotEqualTo(String value) {
            addCriterion("PUR_PRO_GLOBAL_AFTER_PER <>", value, "purProGlobalAfterPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalAfterPerGreaterThan(String value) {
            addCriterion("PUR_PRO_GLOBAL_AFTER_PER >", value, "purProGlobalAfterPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalAfterPerGreaterThanOrEqualTo(String value) {
            addCriterion("PUR_PRO_GLOBAL_AFTER_PER >=", value, "purProGlobalAfterPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalAfterPerLessThan(String value) {
            addCriterion("PUR_PRO_GLOBAL_AFTER_PER <", value, "purProGlobalAfterPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalAfterPerLessThanOrEqualTo(String value) {
            addCriterion("PUR_PRO_GLOBAL_AFTER_PER <=", value, "purProGlobalAfterPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalAfterPerLike(String value) {
            addCriterion("PUR_PRO_GLOBAL_AFTER_PER like", value, "purProGlobalAfterPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalAfterPerNotLike(String value) {
            addCriterion("PUR_PRO_GLOBAL_AFTER_PER not like", value, "purProGlobalAfterPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalAfterPerIn(List<String> values) {
            addCriterion("PUR_PRO_GLOBAL_AFTER_PER in", values, "purProGlobalAfterPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalAfterPerNotIn(List<String> values) {
            addCriterion("PUR_PRO_GLOBAL_AFTER_PER not in", values, "purProGlobalAfterPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalAfterPerBetween(String value1, String value2) {
            addCriterion("PUR_PRO_GLOBAL_AFTER_PER between", value1, value2, "purProGlobalAfterPer");
            return (Criteria) this;
        }

        public Criteria andPurProGlobalAfterPerNotBetween(String value1, String value2) {
            addCriterion("PUR_PRO_GLOBAL_AFTER_PER not between", value1, value2, "purProGlobalAfterPer");
            return (Criteria) this;
        }

        public Criteria andCompareToUltimoIsNull() {
            addCriterion("COMPARE_TO_ULTIMO is null");
            return (Criteria) this;
        }

        public Criteria andCompareToUltimoIsNotNull() {
            addCriterion("COMPARE_TO_ULTIMO is not null");
            return (Criteria) this;
        }

        public Criteria andCompareToUltimoEqualTo(String value) {
            addCriterion("COMPARE_TO_ULTIMO =", value, "compareToUltimo");
            return (Criteria) this;
        }

        public Criteria andCompareToUltimoNotEqualTo(String value) {
            addCriterion("COMPARE_TO_ULTIMO <>", value, "compareToUltimo");
            return (Criteria) this;
        }

        public Criteria andCompareToUltimoGreaterThan(String value) {
            addCriterion("COMPARE_TO_ULTIMO >", value, "compareToUltimo");
            return (Criteria) this;
        }

        public Criteria andCompareToUltimoGreaterThanOrEqualTo(String value) {
            addCriterion("COMPARE_TO_ULTIMO >=", value, "compareToUltimo");
            return (Criteria) this;
        }

        public Criteria andCompareToUltimoLessThan(String value) {
            addCriterion("COMPARE_TO_ULTIMO <", value, "compareToUltimo");
            return (Criteria) this;
        }

        public Criteria andCompareToUltimoLessThanOrEqualTo(String value) {
            addCriterion("COMPARE_TO_ULTIMO <=", value, "compareToUltimo");
            return (Criteria) this;
        }

        public Criteria andCompareToUltimoLike(String value) {
            addCriterion("COMPARE_TO_ULTIMO like", value, "compareToUltimo");
            return (Criteria) this;
        }

        public Criteria andCompareToUltimoNotLike(String value) {
            addCriterion("COMPARE_TO_ULTIMO not like", value, "compareToUltimo");
            return (Criteria) this;
        }

        public Criteria andCompareToUltimoIn(List<String> values) {
            addCriterion("COMPARE_TO_ULTIMO in", values, "compareToUltimo");
            return (Criteria) this;
        }

        public Criteria andCompareToUltimoNotIn(List<String> values) {
            addCriterion("COMPARE_TO_ULTIMO not in", values, "compareToUltimo");
            return (Criteria) this;
        }

        public Criteria andCompareToUltimoBetween(String value1, String value2) {
            addCriterion("COMPARE_TO_ULTIMO between", value1, value2, "compareToUltimo");
            return (Criteria) this;
        }

        public Criteria andCompareToUltimoNotBetween(String value1, String value2) {
            addCriterion("COMPARE_TO_ULTIMO not between", value1, value2, "compareToUltimo");
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