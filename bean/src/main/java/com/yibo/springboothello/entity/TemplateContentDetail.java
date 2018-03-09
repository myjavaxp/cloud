package com.yibo.springboothello.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TemplateContentDetail implements Serializable {
    private Long id;

    private Long templateContentId;

    private String number;

    private String criterion;

    private Byte isImportant;

    private Byte splitScore;

    private BigDecimal score;

    private Byte sort;

    private Byte status;

    private String createUser;

    private Date createTime;

    private String lastUpdateUser;

    private Date lastUpdateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTemplateContentId() {
        return templateContentId;
    }

    public void setTemplateContentId(Long templateContentId) {
        this.templateContentId = templateContentId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getCriterion() {
        return criterion;
    }

    public void setCriterion(String criterion) {
        this.criterion = criterion == null ? null : criterion.trim();
    }

    public Byte getIsImportant() {
        return isImportant;
    }

    public void setIsImportant(Byte isImportant) {
        this.isImportant = isImportant;
    }

    public Byte getSplitScore() {
        return splitScore;
    }

    public void setSplitScore(Byte splitScore) {
        this.splitScore = splitScore;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Byte getSort() {
        return sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser == null ? null : lastUpdateUser.trim();
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", templateContentId=").append(templateContentId);
        sb.append(", number=").append(number);
        sb.append(", criterion=").append(criterion);
        sb.append(", isImportant=").append(isImportant);
        sb.append(", splitScore=").append(splitScore);
        sb.append(", score=").append(score);
        sb.append(", sort=").append(sort);
        sb.append(", status=").append(status);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateUser=").append(lastUpdateUser);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}