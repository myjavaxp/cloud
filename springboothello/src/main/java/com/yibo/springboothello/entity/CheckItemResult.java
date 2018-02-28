package com.yibo.springboothello.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CheckItemResult implements Serializable {
    private Long id;

    private Long schedualId;

    private Long templateContentId;

    private Byte isInvolve;

    private Byte checkResult;

    private String imgUrl;

    private String firstAppSug;

    private String secondAppSug;

    private String platformAppSug;

    private BigDecimal score;

    private Byte isNoCheck;

    private String description;

    private String dealerComp;

    private BigDecimal rsscAvgScore;

    private BigDecimal countryAvgScore;

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

    public Long getTemplateContentId() {
        return templateContentId;
    }

    public void setTemplateContentId(Long templateContentId) {
        this.templateContentId = templateContentId;
    }

    public Byte getIsInvolve() {
        return isInvolve;
    }

    public void setIsInvolve(Byte isInvolve) {
        this.isInvolve = isInvolve;
    }

    public Byte getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(Byte checkResult) {
        this.checkResult = checkResult;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getFirstAppSug() {
        return firstAppSug;
    }

    public void setFirstAppSug(String firstAppSug) {
        this.firstAppSug = firstAppSug == null ? null : firstAppSug.trim();
    }

    public String getSecondAppSug() {
        return secondAppSug;
    }

    public void setSecondAppSug(String secondAppSug) {
        this.secondAppSug = secondAppSug == null ? null : secondAppSug.trim();
    }

    public String getPlatformAppSug() {
        return platformAppSug;
    }

    public void setPlatformAppSug(String platformAppSug) {
        this.platformAppSug = platformAppSug == null ? null : platformAppSug.trim();
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Byte getIsNoCheck() {
        return isNoCheck;
    }

    public void setIsNoCheck(Byte isNoCheck) {
        this.isNoCheck = isNoCheck;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDealerComp() {
        return dealerComp;
    }

    public void setDealerComp(String dealerComp) {
        this.dealerComp = dealerComp == null ? null : dealerComp.trim();
    }

    public BigDecimal getRsscAvgScore() {
        return rsscAvgScore;
    }

    public void setRsscAvgScore(BigDecimal rsscAvgScore) {
        this.rsscAvgScore = rsscAvgScore;
    }

    public BigDecimal getCountryAvgScore() {
        return countryAvgScore;
    }

    public void setCountryAvgScore(BigDecimal countryAvgScore) {
        this.countryAvgScore = countryAvgScore;
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
        sb.append(", templateContentId=").append(templateContentId);
        sb.append(", isInvolve=").append(isInvolve);
        sb.append(", checkResult=").append(checkResult);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", firstAppSug=").append(firstAppSug);
        sb.append(", secondAppSug=").append(secondAppSug);
        sb.append(", platformAppSug=").append(platformAppSug);
        sb.append(", score=").append(score);
        sb.append(", isNoCheck=").append(isNoCheck);
        sb.append(", description=").append(description);
        sb.append(", dealerComp=").append(dealerComp);
        sb.append(", rsscAvgScore=").append(rsscAvgScore);
        sb.append(", countryAvgScore=").append(countryAvgScore);
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