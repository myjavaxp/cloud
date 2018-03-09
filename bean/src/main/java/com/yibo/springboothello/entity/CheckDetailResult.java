package com.yibo.springboothello.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CheckDetailResult implements Serializable {
    private Long id;

    private Long schedualId;

    private Long templateContentDetailId;

    private Byte checkResult;

    private BigDecimal score;

    private String imgUrl;

    private String dealerComp;

    private String description;

    private Byte isCompQual;

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

    public Long getSchedualId() {
        return schedualId;
    }

    public void setSchedualId(Long schedualId) {
        this.schedualId = schedualId;
    }

    public Long getTemplateContentDetailId() {
        return templateContentDetailId;
    }

    public void setTemplateContentDetailId(Long templateContentDetailId) {
        this.templateContentDetailId = templateContentDetailId;
    }

    public Byte getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(Byte checkResult) {
        this.checkResult = checkResult;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getDealerComp() {
        return dealerComp;
    }

    public void setDealerComp(String dealerComp) {
        this.dealerComp = dealerComp == null ? null : dealerComp.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Byte getIsCompQual() {
        return isCompQual;
    }

    public void setIsCompQual(Byte isCompQual) {
        this.isCompQual = isCompQual;
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
        sb.append(", schedualId=").append(schedualId);
        sb.append(", templateContentDetailId=").append(templateContentDetailId);
        sb.append(", checkResult=").append(checkResult);
        sb.append(", score=").append(score);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", dealerComp=").append(dealerComp);
        sb.append(", description=").append(description);
        sb.append(", isCompQual=").append(isCompQual);
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