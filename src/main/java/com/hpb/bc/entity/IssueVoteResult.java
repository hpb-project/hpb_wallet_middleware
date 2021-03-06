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

public class IssueVoteResult extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote_result.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote_result.issue_no
     *
     * @mbg.generated
     */
    private String issueNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote_result.option_key
     *
     * @mbg.generated
     */
    private String optionKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote_result.option_value
     *
     * @mbg.generated
     */
    private String optionValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote_result.vote_num
     *
     * @mbg.generated
     */
    private BigDecimal voteNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote_result.vote_ratio
     *
     * @mbg.generated
     */
    private BigDecimal voteRatio;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote_result.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issue_vote_result.gmt_modify
     *
     * @mbg.generated
     */
    private Date gmtModify;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote_result.id
     *
     * @return the value of issue_vote_result.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote_result.id
     *
     * @param id the value for issue_vote_result.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote_result.issue_no
     *
     * @return the value of issue_vote_result.issue_no
     *
     * @mbg.generated
     */
    public String getIssueNo() {
        return issueNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote_result.issue_no
     *
     * @param issueNo the value for issue_vote_result.issue_no
     *
     * @mbg.generated
     */
    public void setIssueNo(String issueNo) {
        this.issueNo = issueNo == null ? null : issueNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote_result.option_key
     *
     * @return the value of issue_vote_result.option_key
     *
     * @mbg.generated
     */
    public String getOptionKey() {
        return optionKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote_result.option_key
     *
     * @param optionKey the value for issue_vote_result.option_key
     *
     * @mbg.generated
     */
    public void setOptionKey(String optionKey) {
        this.optionKey = optionKey == null ? null : optionKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote_result.option_value
     *
     * @return the value of issue_vote_result.option_value
     *
     * @mbg.generated
     */
    public String getOptionValue() {
        return optionValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote_result.option_value
     *
     * @param optionValue the value for issue_vote_result.option_value
     *
     * @mbg.generated
     */
    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue == null ? null : optionValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote_result.vote_num
     *
     * @return the value of issue_vote_result.vote_num
     *
     * @mbg.generated
     */
    public BigDecimal getVoteNum() {
        return voteNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote_result.vote_num
     *
     * @param voteNum the value for issue_vote_result.vote_num
     *
     * @mbg.generated
     */
    public void setVoteNum(BigDecimal voteNum) {
        this.voteNum = voteNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote_result.vote_ratio
     *
     * @return the value of issue_vote_result.vote_ratio
     *
     * @mbg.generated
     */
    public BigDecimal getVoteRatio() {
        return voteRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote_result.vote_ratio
     *
     * @param voteRatio the value for issue_vote_result.vote_ratio
     *
     * @mbg.generated
     */
    public void setVoteRatio(BigDecimal voteRatio) {
        this.voteRatio = voteRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote_result.gmt_create
     *
     * @return the value of issue_vote_result.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote_result.gmt_create
     *
     * @param gmtCreate the value for issue_vote_result.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issue_vote_result.gmt_modify
     *
     * @return the value of issue_vote_result.gmt_modify
     *
     * @mbg.generated
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issue_vote_result.gmt_modify
     *
     * @param gmtModify the value for issue_vote_result.gmt_modify
     *
     * @mbg.generated
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
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
        IssueVoteResult other = (IssueVoteResult) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIssueNo() == null ? other.getIssueNo() == null : this.getIssueNo().equals(other.getIssueNo()))
            && (this.getOptionKey() == null ? other.getOptionKey() == null : this.getOptionKey().equals(other.getOptionKey()))
            && (this.getOptionValue() == null ? other.getOptionValue() == null : this.getOptionValue().equals(other.getOptionValue()))
            && (this.getVoteNum() == null ? other.getVoteNum() == null : this.getVoteNum().equals(other.getVoteNum()))
            && (this.getVoteRatio() == null ? other.getVoteRatio() == null : this.getVoteRatio().equals(other.getVoteRatio()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModify() == null ? other.getGmtModify() == null : this.getGmtModify().equals(other.getGmtModify()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIssueNo() == null) ? 0 : getIssueNo().hashCode());
        result = prime * result + ((getOptionKey() == null) ? 0 : getOptionKey().hashCode());
        result = prime * result + ((getOptionValue() == null) ? 0 : getOptionValue().hashCode());
        result = prime * result + ((getVoteNum() == null) ? 0 : getVoteNum().hashCode());
        result = prime * result + ((getVoteRatio() == null) ? 0 : getVoteRatio().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModify() == null) ? 0 : getGmtModify().hashCode());
        return result;
    }
}