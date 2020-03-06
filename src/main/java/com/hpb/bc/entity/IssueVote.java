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

package com.hpb.bc.entity;

import java.math.BigDecimal;
import java.util.Date;

public class IssueVote extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote.issue_no
     *
     * @mbg.generated
     */
    private String issueNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote.vote_status
     *
     * @mbg.generated
     */
    private String voteStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote.name_zh
     *
     * @mbg.generated
     */
    private String nameZh;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote.name_en
     *
     * @mbg.generated
     */
    private String nameEn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote.desc_zh
     *
     * @mbg.generated
     */
    private String descZh;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote.desc_en
     *
     * @mbg.generated
     */
    private String descEn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote.value1_zh
     *
     * @mbg.generated
     */
    private String value1Zh;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote.value2_zh
     *
     * @mbg.generated
     */
    private String value2Zh;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote.value1_en
     *
     * @mbg.generated
     */
    private String value1En;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote.value2_en
     *
     * @mbg.generated
     */
    private String value2En;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote.floor_num
     *
     * @mbg.generated
     */
    private BigDecimal floorNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote.begin_time
     *
     * @mbg.generated
     */
    private Date beginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote.is_vaild
     *
     * @mbg.generated
     */
    private String isVaild;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote.gmt_modify
     *
     * @mbg.generated
     */
    private Date gmtModify;

    private long countDownTime;

    private String value1Rate;
    private String value2Rate;
    private String value1Num;
    private String value2Num;

    public String getValue1Rate() {
        return value1Rate;
    }

    public void setValue1Rate(String value1Rate) {
        this.value1Rate = value1Rate;
    }

    public String getValue2Rate() {
        return value2Rate;
    }

    public void setValue2Rate(String value2Rate) {
        this.value2Rate = value2Rate;
    }

    public String getValue1Num() {
        return value1Num;
    }

    public void setValue1Num(String value1Num) {
        this.value1Num = value1Num;
    }

    public String getValue2Num() {
        return value2Num;
    }

    public void setValue2Num(String value2Num) {
        this.value2Num = value2Num;
    }

    public long getCountDownTime() {
        return countDownTime;
    }

    public void setCountDownTime(long countDownTime) {
        this.countDownTime = countDownTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote.id
     *
     * @return the value of issue_vote.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote.id
     *
     * @param id the value for issue_vote.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote.issue_no
     *
     * @return the value of issue_vote.issue_no
     *
     * @mbg.generated
     */
    public String getIssueNo() {
        return issueNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote.issue_no
     *
     * @param issueNo the value for issue_vote.issue_no
     *
     * @mbg.generated
     */
    public void setIssueNo(String issueNo) {
        this.issueNo = issueNo == null ? null : issueNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote.vote_status
     *
     * @return the value of issue_vote.vote_status
     *
     * @mbg.generated
     */
    public String getVoteStatus() {
        return voteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote.vote_status
     *
     * @param voteStatus the value for issue_vote.vote_status
     *
     * @mbg.generated
     */
    public void setVoteStatus(String voteStatus) {
        this.voteStatus = voteStatus == null ? null : voteStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote.name_zh
     *
     * @return the value of issue_vote.name_zh
     *
     * @mbg.generated
     */
    public String getNameZh() {
        return nameZh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote.name_zh
     *
     * @param nameZh the value for issue_vote.name_zh
     *
     * @mbg.generated
     */
    public void setNameZh(String nameZh) {
        this.nameZh = nameZh == null ? null : nameZh.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote.name_en
     *
     * @return the value of issue_vote.name_en
     *
     * @mbg.generated
     */
    public String getNameEn() {
        return nameEn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote.name_en
     *
     * @param nameEn the value for issue_vote.name_en
     *
     * @mbg.generated
     */
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote.desc_zh
     *
     * @return the value of issue_vote.desc_zh
     *
     * @mbg.generated
     */
    public String getDescZh() {
        return descZh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote.desc_zh
     *
     * @param descZh the value for issue_vote.desc_zh
     *
     * @mbg.generated
     */
    public void setDescZh(String descZh) {
        this.descZh = descZh == null ? null : descZh.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote.desc_en
     *
     * @return the value of issue_vote.desc_en
     *
     * @mbg.generated
     */
    public String getDescEn() {
        return descEn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote.desc_en
     *
     * @param descEn the value for issue_vote.desc_en
     *
     * @mbg.generated
     */
    public void setDescEn(String descEn) {
        this.descEn = descEn == null ? null : descEn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote.value1_zh
     *
     * @return the value of issue_vote.value1_zh
     *
     * @mbg.generated
     */
    public String getValue1Zh() {
        return value1Zh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote.value1_zh
     *
     * @param value1Zh the value for issue_vote.value1_zh
     *
     * @mbg.generated
     */
    public void setValue1Zh(String value1Zh) {
        this.value1Zh = value1Zh == null ? null : value1Zh.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote.value2_zh
     *
     * @return the value of issue_vote.value2_zh
     *
     * @mbg.generated
     */
    public String getValue2Zh() {
        return value2Zh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote.value2_zh
     *
     * @param value2Zh the value for issue_vote.value2_zh
     *
     * @mbg.generated
     */
    public void setValue2Zh(String value2Zh) {
        this.value2Zh = value2Zh == null ? null : value2Zh.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote.value1_en
     *
     * @return the value of issue_vote.value1_en
     *
     * @mbg.generated
     */
    public String getValue1En() {
        return value1En;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote.value1_en
     *
     * @param value1En the value for issue_vote.value1_en
     *
     * @mbg.generated
     */
    public void setValue1En(String value1En) {
        this.value1En = value1En == null ? null : value1En.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote.value2_en
     *
     * @return the value of issue_vote.value2_en
     *
     * @mbg.generated
     */
    public String getValue2En() {
        return value2En;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote.value2_en
     *
     * @param value2En the value for issue_vote.value2_en
     *
     * @mbg.generated
     */
    public void setValue2En(String value2En) {
        this.value2En = value2En == null ? null : value2En.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote.floor_num
     *
     * @return the value of issue_vote.floor_num
     *
     * @mbg.generated
     */
    public BigDecimal getFloorNum() {
        return floorNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote.floor_num
     *
     * @param floorNum the value for issue_vote.floor_num
     *
     * @mbg.generated
     */
    public void setFloorNum(BigDecimal floorNum) {
        this.floorNum = floorNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote.begin_time
     *
     * @return the value of issue_vote.begin_time
     *
     * @mbg.generated
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote.begin_time
     *
     * @param beginTime the value for issue_vote.begin_time
     *
     * @mbg.generated
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote.end_time
     *
     * @return the value of issue_vote.end_time
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote.end_time
     *
     * @param endTime the value for issue_vote.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote.is_vaild
     *
     * @return the value of issue_vote.is_vaild
     *
     * @mbg.generated
     */
    public String getIsVaild() {
        return isVaild;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote.is_vaild
     *
     * @param isVaild the value for issue_vote.is_vaild
     *
     * @mbg.generated
     */
    public void setIsVaild(String isVaild) {
        this.isVaild = isVaild == null ? null : isVaild.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote.gmt_create
     *
     * @return the value of issue_vote.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote.gmt_create
     *
     * @param gmtCreate the value for issue_vote.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote.gmt_modify
     *
     * @return the value of issue_vote.gmt_modify
     *
     * @mbg.generated
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote.gmt_modify
     *
     * @param gmtModify the value for issue_vote.gmt_modify
     *
     * @mbg.generated
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        IssueVote other = (IssueVote) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIssueNo() == null ? other.getIssueNo() == null : this.getIssueNo().equals(other.getIssueNo()))
            && (this.getVoteStatus() == null ? other.getVoteStatus() == null : this.getVoteStatus().equals(other.getVoteStatus()))
            && (this.getNameZh() == null ? other.getNameZh() == null : this.getNameZh().equals(other.getNameZh()))
            && (this.getNameEn() == null ? other.getNameEn() == null : this.getNameEn().equals(other.getNameEn()))
            && (this.getDescZh() == null ? other.getDescZh() == null : this.getDescZh().equals(other.getDescZh()))
            && (this.getDescEn() == null ? other.getDescEn() == null : this.getDescEn().equals(other.getDescEn()))
            && (this.getValue1Zh() == null ? other.getValue1Zh() == null : this.getValue1Zh().equals(other.getValue1Zh()))
            && (this.getValue2Zh() == null ? other.getValue2Zh() == null : this.getValue2Zh().equals(other.getValue2Zh()))
            && (this.getValue1En() == null ? other.getValue1En() == null : this.getValue1En().equals(other.getValue1En()))
            && (this.getValue2En() == null ? other.getValue2En() == null : this.getValue2En().equals(other.getValue2En()))
            && (this.getFloorNum() == null ? other.getFloorNum() == null : this.getFloorNum().equals(other.getFloorNum()))
            && (this.getBeginTime() == null ? other.getBeginTime() == null : this.getBeginTime().equals(other.getBeginTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getIsVaild() == null ? other.getIsVaild() == null : this.getIsVaild().equals(other.getIsVaild()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModify() == null ? other.getGmtModify() == null : this.getGmtModify().equals(other.getGmtModify()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIssueNo() == null) ? 0 : getIssueNo().hashCode());
        result = prime * result + ((getVoteStatus() == null) ? 0 : getVoteStatus().hashCode());
        result = prime * result + ((getNameZh() == null) ? 0 : getNameZh().hashCode());
        result = prime * result + ((getNameEn() == null) ? 0 : getNameEn().hashCode());
        result = prime * result + ((getDescZh() == null) ? 0 : getDescZh().hashCode());
        result = prime * result + ((getDescEn() == null) ? 0 : getDescEn().hashCode());
        result = prime * result + ((getValue1Zh() == null) ? 0 : getValue1Zh().hashCode());
        result = prime * result + ((getValue2Zh() == null) ? 0 : getValue2Zh().hashCode());
        result = prime * result + ((getValue1En() == null) ? 0 : getValue1En().hashCode());
        result = prime * result + ((getValue2En() == null) ? 0 : getValue2En().hashCode());
        result = prime * result + ((getFloorNum() == null) ? 0 : getFloorNum().hashCode());
        result = prime * result + ((getBeginTime() == null) ? 0 : getBeginTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getIsVaild() == null) ? 0 : getIsVaild().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModify() == null) ? 0 : getGmtModify().hashCode());
        return result;
    }
}