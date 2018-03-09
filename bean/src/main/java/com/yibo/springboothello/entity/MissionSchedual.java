package com.yibo.springboothello.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MissionSchedual implements Serializable {
    private Long id;

    private Long missionId;

    private Long userId;

    private Long dealerId;

    private String description;

    private String imgUrl;

    private Date complainDate;

    private Date checkDate;

    private Byte approveStatus;

    private String firstApprSug;

    private String repeatApprSug;

    private String platformApprSug;

    private Date arriveDate;

    private Date leftDate;

    private BigDecimal score;

    private Byte complainStatus;

    private String firstCompUser;

    private Date firstCompDate;

    private String secondCompUser;

    private Date secondCompDate;

    private String platformCompUser;

    private Date platformComDate;

    private String thirdPartyCompUser;

    private Date thirdPartyCompDate;

    private String brandCompUser;

    private Date brandCompDate;

    private Byte isRelease;

    private Date releaseDate;

    private Date commitCompDeadline;

    private Date firstCompDeadline;

    private Date secondCompDeadline;

    private Byte isApprove;

    private Byte inpUnqualifiedQty;

    private Byte firstCompUnqlfQty;

    private Byte secondCompUnqlfQty;

    private Byte finalCompUnqlfQty;

    private BigDecimal rsscAvgScore;

    private BigDecimal countryAvgScore;

    private Byte isNoCheck;

    private String questionareImgUrl;

    private String reportImgUrl;

    private String accompanyImgUrl;

    private String groupPhotoImgUrl;

    private String remark;

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

    public Long getMissionId() {
        return missionId;
    }

    public void setMissionId(Long missionId) {
        this.missionId = missionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDealerId() {
        return dealerId;
    }

    public void setDealerId(Long dealerId) {
        this.dealerId = dealerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Date getComplainDate() {
        return complainDate;
    }

    public void setComplainDate(Date complainDate) {
        this.complainDate = complainDate;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public Byte getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(Byte approveStatus) {
        this.approveStatus = approveStatus;
    }

    public String getFirstApprSug() {
        return firstApprSug;
    }

    public void setFirstApprSug(String firstApprSug) {
        this.firstApprSug = firstApprSug == null ? null : firstApprSug.trim();
    }

    public String getRepeatApprSug() {
        return repeatApprSug;
    }

    public void setRepeatApprSug(String repeatApprSug) {
        this.repeatApprSug = repeatApprSug == null ? null : repeatApprSug.trim();
    }

    public String getPlatformApprSug() {
        return platformApprSug;
    }

    public void setPlatformApprSug(String platformApprSug) {
        this.platformApprSug = platformApprSug == null ? null : platformApprSug.trim();
    }

    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public Date getLeftDate() {
        return leftDate;
    }

    public void setLeftDate(Date leftDate) {
        this.leftDate = leftDate;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Byte getComplainStatus() {
        return complainStatus;
    }

    public void setComplainStatus(Byte complainStatus) {
        this.complainStatus = complainStatus;
    }

    public String getFirstCompUser() {
        return firstCompUser;
    }

    public void setFirstCompUser(String firstCompUser) {
        this.firstCompUser = firstCompUser == null ? null : firstCompUser.trim();
    }

    public Date getFirstCompDate() {
        return firstCompDate;
    }

    public void setFirstCompDate(Date firstCompDate) {
        this.firstCompDate = firstCompDate;
    }

    public String getSecondCompUser() {
        return secondCompUser;
    }

    public void setSecondCompUser(String secondCompUser) {
        this.secondCompUser = secondCompUser == null ? null : secondCompUser.trim();
    }

    public Date getSecondCompDate() {
        return secondCompDate;
    }

    public void setSecondCompDate(Date secondCompDate) {
        this.secondCompDate = secondCompDate;
    }

    public String getPlatformCompUser() {
        return platformCompUser;
    }

    public void setPlatformCompUser(String platformCompUser) {
        this.platformCompUser = platformCompUser == null ? null : platformCompUser.trim();
    }

    public Date getPlatformComDate() {
        return platformComDate;
    }

    public void setPlatformComDate(Date platformComDate) {
        this.platformComDate = platformComDate;
    }

    public String getThirdPartyCompUser() {
        return thirdPartyCompUser;
    }

    public void setThirdPartyCompUser(String thirdPartyCompUser) {
        this.thirdPartyCompUser = thirdPartyCompUser == null ? null : thirdPartyCompUser.trim();
    }

    public Date getThirdPartyCompDate() {
        return thirdPartyCompDate;
    }

    public void setThirdPartyCompDate(Date thirdPartyCompDate) {
        this.thirdPartyCompDate = thirdPartyCompDate;
    }

    public String getBrandCompUser() {
        return brandCompUser;
    }

    public void setBrandCompUser(String brandCompUser) {
        this.brandCompUser = brandCompUser == null ? null : brandCompUser.trim();
    }

    public Date getBrandCompDate() {
        return brandCompDate;
    }

    public void setBrandCompDate(Date brandCompDate) {
        this.brandCompDate = brandCompDate;
    }

    public Byte getIsRelease() {
        return isRelease;
    }

    public void setIsRelease(Byte isRelease) {
        this.isRelease = isRelease;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getCommitCompDeadline() {
        return commitCompDeadline;
    }

    public void setCommitCompDeadline(Date commitCompDeadline) {
        this.commitCompDeadline = commitCompDeadline;
    }

    public Date getFirstCompDeadline() {
        return firstCompDeadline;
    }

    public void setFirstCompDeadline(Date firstCompDeadline) {
        this.firstCompDeadline = firstCompDeadline;
    }

    public Date getSecondCompDeadline() {
        return secondCompDeadline;
    }

    public void setSecondCompDeadline(Date secondCompDeadline) {
        this.secondCompDeadline = secondCompDeadline;
    }

    public Byte getIsApprove() {
        return isApprove;
    }

    public void setIsApprove(Byte isApprove) {
        this.isApprove = isApprove;
    }

    public Byte getInpUnqualifiedQty() {
        return inpUnqualifiedQty;
    }

    public void setInpUnqualifiedQty(Byte inpUnqualifiedQty) {
        this.inpUnqualifiedQty = inpUnqualifiedQty;
    }

    public Byte getFirstCompUnqlfQty() {
        return firstCompUnqlfQty;
    }

    public void setFirstCompUnqlfQty(Byte firstCompUnqlfQty) {
        this.firstCompUnqlfQty = firstCompUnqlfQty;
    }

    public Byte getSecondCompUnqlfQty() {
        return secondCompUnqlfQty;
    }

    public void setSecondCompUnqlfQty(Byte secondCompUnqlfQty) {
        this.secondCompUnqlfQty = secondCompUnqlfQty;
    }

    public Byte getFinalCompUnqlfQty() {
        return finalCompUnqlfQty;
    }

    public void setFinalCompUnqlfQty(Byte finalCompUnqlfQty) {
        this.finalCompUnqlfQty = finalCompUnqlfQty;
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

    public Byte getIsNoCheck() {
        return isNoCheck;
    }

    public void setIsNoCheck(Byte isNoCheck) {
        this.isNoCheck = isNoCheck;
    }

    public String getQuestionareImgUrl() {
        return questionareImgUrl;
    }

    public void setQuestionareImgUrl(String questionareImgUrl) {
        this.questionareImgUrl = questionareImgUrl == null ? null : questionareImgUrl.trim();
    }

    public String getReportImgUrl() {
        return reportImgUrl;
    }

    public void setReportImgUrl(String reportImgUrl) {
        this.reportImgUrl = reportImgUrl == null ? null : reportImgUrl.trim();
    }

    public String getAccompanyImgUrl() {
        return accompanyImgUrl;
    }

    public void setAccompanyImgUrl(String accompanyImgUrl) {
        this.accompanyImgUrl = accompanyImgUrl == null ? null : accompanyImgUrl.trim();
    }

    public String getGroupPhotoImgUrl() {
        return groupPhotoImgUrl;
    }

    public void setGroupPhotoImgUrl(String groupPhotoImgUrl) {
        this.groupPhotoImgUrl = groupPhotoImgUrl == null ? null : groupPhotoImgUrl.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        sb.append(", missionId=").append(missionId);
        sb.append(", userId=").append(userId);
        sb.append(", dealerId=").append(dealerId);
        sb.append(", description=").append(description);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", complainDate=").append(complainDate);
        sb.append(", checkDate=").append(checkDate);
        sb.append(", approveStatus=").append(approveStatus);
        sb.append(", firstApprSug=").append(firstApprSug);
        sb.append(", repeatApprSug=").append(repeatApprSug);
        sb.append(", platformApprSug=").append(platformApprSug);
        sb.append(", arriveDate=").append(arriveDate);
        sb.append(", leftDate=").append(leftDate);
        sb.append(", score=").append(score);
        sb.append(", complainStatus=").append(complainStatus);
        sb.append(", firstCompUser=").append(firstCompUser);
        sb.append(", firstCompDate=").append(firstCompDate);
        sb.append(", secondCompUser=").append(secondCompUser);
        sb.append(", secondCompDate=").append(secondCompDate);
        sb.append(", platformCompUser=").append(platformCompUser);
        sb.append(", platformComDate=").append(platformComDate);
        sb.append(", thirdPartyCompUser=").append(thirdPartyCompUser);
        sb.append(", thirdPartyCompDate=").append(thirdPartyCompDate);
        sb.append(", brandCompUser=").append(brandCompUser);
        sb.append(", brandCompDate=").append(brandCompDate);
        sb.append(", isRelease=").append(isRelease);
        sb.append(", releaseDate=").append(releaseDate);
        sb.append(", commitCompDeadline=").append(commitCompDeadline);
        sb.append(", firstCompDeadline=").append(firstCompDeadline);
        sb.append(", secondCompDeadline=").append(secondCompDeadline);
        sb.append(", isApprove=").append(isApprove);
        sb.append(", inpUnqualifiedQty=").append(inpUnqualifiedQty);
        sb.append(", firstCompUnqlfQty=").append(firstCompUnqlfQty);
        sb.append(", secondCompUnqlfQty=").append(secondCompUnqlfQty);
        sb.append(", finalCompUnqlfQty=").append(finalCompUnqlfQty);
        sb.append(", rsscAvgScore=").append(rsscAvgScore);
        sb.append(", countryAvgScore=").append(countryAvgScore);
        sb.append(", isNoCheck=").append(isNoCheck);
        sb.append(", questionareImgUrl=").append(questionareImgUrl);
        sb.append(", reportImgUrl=").append(reportImgUrl);
        sb.append(", accompanyImgUrl=").append(accompanyImgUrl);
        sb.append(", groupPhotoImgUrl=").append(groupPhotoImgUrl);
        sb.append(", remark=").append(remark);
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