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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RedPacketKeyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table red_packet_key
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table red_packet_key
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table red_packet_key
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table red_packet_key
     *
     * @mbg.generated
     */
    public RedPacketKeyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table red_packet_key
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table red_packet_key
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table red_packet_key
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table red_packet_key
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table red_packet_key
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table red_packet_key
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table red_packet_key
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
     * This method corresponds to the database table red_packet_key
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
     * This method corresponds to the database table red_packet_key
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table red_packet_key
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
     * This class corresponds to the database table red_packet_key
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

        public Criteria andRedPacketNoIsNull() {
            addCriterion("red_packet_no is null");
            return (Criteria) this;
        }

        public Criteria andRedPacketNoIsNotNull() {
            addCriterion("red_packet_no is not null");
            return (Criteria) this;
        }

        public Criteria andRedPacketNoEqualTo(String value) {
            addCriterion("red_packet_no =", value, "redPacketNo");
            return (Criteria) this;
        }

        public Criteria andRedPacketNoNotEqualTo(String value) {
            addCriterion("red_packet_no <>", value, "redPacketNo");
            return (Criteria) this;
        }

        public Criteria andRedPacketNoGreaterThan(String value) {
            addCriterion("red_packet_no >", value, "redPacketNo");
            return (Criteria) this;
        }

        public Criteria andRedPacketNoGreaterThanOrEqualTo(String value) {
            addCriterion("red_packet_no >=", value, "redPacketNo");
            return (Criteria) this;
        }

        public Criteria andRedPacketNoLessThan(String value) {
            addCriterion("red_packet_no <", value, "redPacketNo");
            return (Criteria) this;
        }

        public Criteria andRedPacketNoLessThanOrEqualTo(String value) {
            addCriterion("red_packet_no <=", value, "redPacketNo");
            return (Criteria) this;
        }

        public Criteria andRedPacketNoLike(String value) {
            addCriterion("red_packet_no like", value, "redPacketNo");
            return (Criteria) this;
        }

        public Criteria andRedPacketNoNotLike(String value) {
            addCriterion("red_packet_no not like", value, "redPacketNo");
            return (Criteria) this;
        }

        public Criteria andRedPacketNoIn(List<String> values) {
            addCriterion("red_packet_no in", values, "redPacketNo");
            return (Criteria) this;
        }

        public Criteria andRedPacketNoNotIn(List<String> values) {
            addCriterion("red_packet_no not in", values, "redPacketNo");
            return (Criteria) this;
        }

        public Criteria andRedPacketNoBetween(String value1, String value2) {
            addCriterion("red_packet_no between", value1, value2, "redPacketNo");
            return (Criteria) this;
        }

        public Criteria andRedPacketNoNotBetween(String value1, String value2) {
            addCriterion("red_packet_no not between", value1, value2, "redPacketNo");
            return (Criteria) this;
        }

        public Criteria andIsVaildIsNull() {
            addCriterion("is_vaild is null");
            return (Criteria) this;
        }

        public Criteria andIsVaildIsNotNull() {
            addCriterion("is_vaild is not null");
            return (Criteria) this;
        }

        public Criteria andIsVaildEqualTo(String value) {
            addCriterion("is_vaild =", value, "isVaild");
            return (Criteria) this;
        }

        public Criteria andIsVaildNotEqualTo(String value) {
            addCriterion("is_vaild <>", value, "isVaild");
            return (Criteria) this;
        }

        public Criteria andIsVaildGreaterThan(String value) {
            addCriterion("is_vaild >", value, "isVaild");
            return (Criteria) this;
        }

        public Criteria andIsVaildGreaterThanOrEqualTo(String value) {
            addCriterion("is_vaild >=", value, "isVaild");
            return (Criteria) this;
        }

        public Criteria andIsVaildLessThan(String value) {
            addCriterion("is_vaild <", value, "isVaild");
            return (Criteria) this;
        }

        public Criteria andIsVaildLessThanOrEqualTo(String value) {
            addCriterion("is_vaild <=", value, "isVaild");
            return (Criteria) this;
        }

        public Criteria andIsVaildLike(String value) {
            addCriterion("is_vaild like", value, "isVaild");
            return (Criteria) this;
        }

        public Criteria andIsVaildNotLike(String value) {
            addCriterion("is_vaild not like", value, "isVaild");
            return (Criteria) this;
        }

        public Criteria andIsVaildIn(List<String> values) {
            addCriterion("is_vaild in", values, "isVaild");
            return (Criteria) this;
        }

        public Criteria andIsVaildNotIn(List<String> values) {
            addCriterion("is_vaild not in", values, "isVaild");
            return (Criteria) this;
        }

        public Criteria andIsVaildBetween(String value1, String value2) {
            addCriterion("is_vaild between", value1, value2, "isVaild");
            return (Criteria) this;
        }

        public Criteria andIsVaildNotBetween(String value1, String value2) {
            addCriterion("is_vaild not between", value1, value2, "isVaild");
            return (Criteria) this;
        }

        public Criteria andPacketKeyIsNull() {
            addCriterion("packet_key is null");
            return (Criteria) this;
        }

        public Criteria andPacketKeyIsNotNull() {
            addCriterion("packet_key is not null");
            return (Criteria) this;
        }

        public Criteria andPacketKeyEqualTo(String value) {
            addCriterion("packet_key =", value, "packetKey");
            return (Criteria) this;
        }

        public Criteria andPacketKeyNotEqualTo(String value) {
            addCriterion("packet_key <>", value, "packetKey");
            return (Criteria) this;
        }

        public Criteria andPacketKeyGreaterThan(String value) {
            addCriterion("packet_key >", value, "packetKey");
            return (Criteria) this;
        }

        public Criteria andPacketKeyGreaterThanOrEqualTo(String value) {
            addCriterion("packet_key >=", value, "packetKey");
            return (Criteria) this;
        }

        public Criteria andPacketKeyLessThan(String value) {
            addCriterion("packet_key <", value, "packetKey");
            return (Criteria) this;
        }

        public Criteria andPacketKeyLessThanOrEqualTo(String value) {
            addCriterion("packet_key <=", value, "packetKey");
            return (Criteria) this;
        }

        public Criteria andPacketKeyLike(String value) {
            addCriterion("packet_key like", value, "packetKey");
            return (Criteria) this;
        }

        public Criteria andPacketKeyNotLike(String value) {
            addCriterion("packet_key not like", value, "packetKey");
            return (Criteria) this;
        }

        public Criteria andPacketKeyIn(List<String> values) {
            addCriterion("packet_key in", values, "packetKey");
            return (Criteria) this;
        }

        public Criteria andPacketKeyNotIn(List<String> values) {
            addCriterion("packet_key not in", values, "packetKey");
            return (Criteria) this;
        }

        public Criteria andPacketKeyBetween(String value1, String value2) {
            addCriterion("packet_key between", value1, value2, "packetKey");
            return (Criteria) this;
        }

        public Criteria andPacketKeyNotBetween(String value1, String value2) {
            addCriterion("packet_key not between", value1, value2, "packetKey");
            return (Criteria) this;
        }

        public Criteria andTokenIdIsNull() {
            addCriterion("token_id is null");
            return (Criteria) this;
        }

        public Criteria andTokenIdIsNotNull() {
            addCriterion("token_id is not null");
            return (Criteria) this;
        }

        public Criteria andTokenIdEqualTo(Long value) {
            addCriterion("token_id =", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotEqualTo(Long value) {
            addCriterion("token_id <>", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdGreaterThan(Long value) {
            addCriterion("token_id >", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdGreaterThanOrEqualTo(Long value) {
            addCriterion("token_id >=", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLessThan(Long value) {
            addCriterion("token_id <", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLessThanOrEqualTo(Long value) {
            addCriterion("token_id <=", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdIn(List<Long> values) {
            addCriterion("token_id in", values, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotIn(List<Long> values) {
            addCriterion("token_id not in", values, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdBetween(Long value1, Long value2) {
            addCriterion("token_id between", value1, value2, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotBetween(Long value1, Long value2) {
            addCriterion("token_id not between", value1, value2, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenValueIsNull() {
            addCriterion("token_value is null");
            return (Criteria) this;
        }

        public Criteria andTokenValueIsNotNull() {
            addCriterion("token_value is not null");
            return (Criteria) this;
        }

        public Criteria andTokenValueEqualTo(String value) {
            addCriterion("token_value =", value, "tokenValue");
            return (Criteria) this;
        }

        public Criteria andTokenValueNotEqualTo(String value) {
            addCriterion("token_value <>", value, "tokenValue");
            return (Criteria) this;
        }

        public Criteria andTokenValueGreaterThan(String value) {
            addCriterion("token_value >", value, "tokenValue");
            return (Criteria) this;
        }

        public Criteria andTokenValueGreaterThanOrEqualTo(String value) {
            addCriterion("token_value >=", value, "tokenValue");
            return (Criteria) this;
        }

        public Criteria andTokenValueLessThan(String value) {
            addCriterion("token_value <", value, "tokenValue");
            return (Criteria) this;
        }

        public Criteria andTokenValueLessThanOrEqualTo(String value) {
            addCriterion("token_value <=", value, "tokenValue");
            return (Criteria) this;
        }

        public Criteria andTokenValueLike(String value) {
            addCriterion("token_value like", value, "tokenValue");
            return (Criteria) this;
        }

        public Criteria andTokenValueNotLike(String value) {
            addCriterion("token_value not like", value, "tokenValue");
            return (Criteria) this;
        }

        public Criteria andTokenValueIn(List<String> values) {
            addCriterion("token_value in", values, "tokenValue");
            return (Criteria) this;
        }

        public Criteria andTokenValueNotIn(List<String> values) {
            addCriterion("token_value not in", values, "tokenValue");
            return (Criteria) this;
        }

        public Criteria andTokenValueBetween(String value1, String value2) {
            addCriterion("token_value between", value1, value2, "tokenValue");
            return (Criteria) this;
        }

        public Criteria andTokenValueNotBetween(String value1, String value2) {
            addCriterion("token_value not between", value1, value2, "tokenValue");
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
     * This class corresponds to the database table red_packet_key
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
     * This class corresponds to the database table red_packet_key
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