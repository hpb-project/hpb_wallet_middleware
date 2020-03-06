/*
 * Copyright 2020 HPB Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hpb.bc.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IssueVoteResultExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    public IssueVoteResultExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIssueNoIsNull() {
            addCriterion("issue_no is null");
            return (Criteria) this;
        }

        public Criteria andIssueNoIsNotNull() {
            addCriterion("issue_no is not null");
            return (Criteria) this;
        }

        public Criteria andIssueNoEqualTo(String value) {
            addCriterion("issue_no =", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotEqualTo(String value) {
            addCriterion("issue_no <>", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoGreaterThan(String value) {
            addCriterion("issue_no >", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoGreaterThanOrEqualTo(String value) {
            addCriterion("issue_no >=", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoLessThan(String value) {
            addCriterion("issue_no <", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoLessThanOrEqualTo(String value) {
            addCriterion("issue_no <=", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoLike(String value) {
            addCriterion("issue_no like", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotLike(String value) {
            addCriterion("issue_no not like", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoIn(List<String> values) {
            addCriterion("issue_no in", values, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotIn(List<String> values) {
            addCriterion("issue_no not in", values, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoBetween(String value1, String value2) {
            addCriterion("issue_no between", value1, value2, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotBetween(String value1, String value2) {
            addCriterion("issue_no not between", value1, value2, "issueNo");
            return (Criteria) this;
        }

        public Criteria andOptionKeyIsNull() {
            addCriterion("option_key is null");
            return (Criteria) this;
        }

        public Criteria andOptionKeyIsNotNull() {
            addCriterion("option_key is not null");
            return (Criteria) this;
        }

        public Criteria andOptionKeyEqualTo(String value) {
            addCriterion("option_key =", value, "optionKey");
            return (Criteria) this;
        }

        public Criteria andOptionKeyNotEqualTo(String value) {
            addCriterion("option_key <>", value, "optionKey");
            return (Criteria) this;
        }

        public Criteria andOptionKeyGreaterThan(String value) {
            addCriterion("option_key >", value, "optionKey");
            return (Criteria) this;
        }

        public Criteria andOptionKeyGreaterThanOrEqualTo(String value) {
            addCriterion("option_key >=", value, "optionKey");
            return (Criteria) this;
        }

        public Criteria andOptionKeyLessThan(String value) {
            addCriterion("option_key <", value, "optionKey");
            return (Criteria) this;
        }

        public Criteria andOptionKeyLessThanOrEqualTo(String value) {
            addCriterion("option_key <=", value, "optionKey");
            return (Criteria) this;
        }

        public Criteria andOptionKeyLike(String value) {
            addCriterion("option_key like", value, "optionKey");
            return (Criteria) this;
        }

        public Criteria andOptionKeyNotLike(String value) {
            addCriterion("option_key not like", value, "optionKey");
            return (Criteria) this;
        }

        public Criteria andOptionKeyIn(List<String> values) {
            addCriterion("option_key in", values, "optionKey");
            return (Criteria) this;
        }

        public Criteria andOptionKeyNotIn(List<String> values) {
            addCriterion("option_key not in", values, "optionKey");
            return (Criteria) this;
        }

        public Criteria andOptionKeyBetween(String value1, String value2) {
            addCriterion("option_key between", value1, value2, "optionKey");
            return (Criteria) this;
        }

        public Criteria andOptionKeyNotBetween(String value1, String value2) {
            addCriterion("option_key not between", value1, value2, "optionKey");
            return (Criteria) this;
        }

        public Criteria andOptionValueIsNull() {
            addCriterion("option_value is null");
            return (Criteria) this;
        }

        public Criteria andOptionValueIsNotNull() {
            addCriterion("option_value is not null");
            return (Criteria) this;
        }

        public Criteria andOptionValueEqualTo(String value) {
            addCriterion("option_value =", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueNotEqualTo(String value) {
            addCriterion("option_value <>", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueGreaterThan(String value) {
            addCriterion("option_value >", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueGreaterThanOrEqualTo(String value) {
            addCriterion("option_value >=", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueLessThan(String value) {
            addCriterion("option_value <", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueLessThanOrEqualTo(String value) {
            addCriterion("option_value <=", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueLike(String value) {
            addCriterion("option_value like", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueNotLike(String value) {
            addCriterion("option_value not like", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueIn(List<String> values) {
            addCriterion("option_value in", values, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueNotIn(List<String> values) {
            addCriterion("option_value not in", values, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueBetween(String value1, String value2) {
            addCriterion("option_value between", value1, value2, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueNotBetween(String value1, String value2) {
            addCriterion("option_value not between", value1, value2, "optionValue");
            return (Criteria) this;
        }

        public Criteria andVoteNumIsNull() {
            addCriterion("vote_num is null");
            return (Criteria) this;
        }

        public Criteria andVoteNumIsNotNull() {
            addCriterion("vote_num is not null");
            return (Criteria) this;
        }

        public Criteria andVoteNumEqualTo(BigDecimal value) {
            addCriterion("vote_num =", value, "voteNum");
            return (Criteria) this;
        }

        public Criteria andVoteNumNotEqualTo(BigDecimal value) {
            addCriterion("vote_num <>", value, "voteNum");
            return (Criteria) this;
        }

        public Criteria andVoteNumGreaterThan(BigDecimal value) {
            addCriterion("vote_num >", value, "voteNum");
            return (Criteria) this;
        }

        public Criteria andVoteNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vote_num >=", value, "voteNum");
            return (Criteria) this;
        }

        public Criteria andVoteNumLessThan(BigDecimal value) {
            addCriterion("vote_num <", value, "voteNum");
            return (Criteria) this;
        }

        public Criteria andVoteNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vote_num <=", value, "voteNum");
            return (Criteria) this;
        }

        public Criteria andVoteNumIn(List<BigDecimal> values) {
            addCriterion("vote_num in", values, "voteNum");
            return (Criteria) this;
        }

        public Criteria andVoteNumNotIn(List<BigDecimal> values) {
            addCriterion("vote_num not in", values, "voteNum");
            return (Criteria) this;
        }

        public Criteria andVoteNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vote_num between", value1, value2, "voteNum");
            return (Criteria) this;
        }

        public Criteria andVoteNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vote_num not between", value1, value2, "voteNum");
            return (Criteria) this;
        }

        public Criteria andVoteRatioIsNull() {
            addCriterion("vote_ratio is null");
            return (Criteria) this;
        }

        public Criteria andVoteRatioIsNotNull() {
            addCriterion("vote_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andVoteRatioEqualTo(BigDecimal value) {
            addCriterion("vote_ratio =", value, "voteRatio");
            return (Criteria) this;
        }

        public Criteria andVoteRatioNotEqualTo(BigDecimal value) {
            addCriterion("vote_ratio <>", value, "voteRatio");
            return (Criteria) this;
        }

        public Criteria andVoteRatioGreaterThan(BigDecimal value) {
            addCriterion("vote_ratio >", value, "voteRatio");
            return (Criteria) this;
        }

        public Criteria andVoteRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vote_ratio >=", value, "voteRatio");
            return (Criteria) this;
        }

        public Criteria andVoteRatioLessThan(BigDecimal value) {
            addCriterion("vote_ratio <", value, "voteRatio");
            return (Criteria) this;
        }

        public Criteria andVoteRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vote_ratio <=", value, "voteRatio");
            return (Criteria) this;
        }

        public Criteria andVoteRatioIn(List<BigDecimal> values) {
            addCriterion("vote_ratio in", values, "voteRatio");
            return (Criteria) this;
        }

        public Criteria andVoteRatioNotIn(List<BigDecimal> values) {
            addCriterion("vote_ratio not in", values, "voteRatio");
            return (Criteria) this;
        }

        public Criteria andVoteRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vote_ratio between", value1, value2, "voteRatio");
            return (Criteria) this;
        }

        public Criteria andVoteRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vote_ratio not between", value1, value2, "voteRatio");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNull() {
            addCriterion("gmt_modify is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNotNull() {
            addCriterion("gmt_modify is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyEqualTo(Date value) {
            addCriterion("gmt_modify =", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotEqualTo(Date value) {
            addCriterion("gmt_modify <>", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThan(Date value) {
            addCriterion("gmt_modify >", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modify >=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThan(Date value) {
            addCriterion("gmt_modify <", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modify <=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIn(List<Date> values) {
            addCriterion("gmt_modify in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotIn(List<Date> values) {
            addCriterion("gmt_modify not in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyBetween(Date value1, Date value2) {
            addCriterion("gmt_modify between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modify not between", value1, value2, "gmtModify");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table issue_vote_result
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
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