package com.yibo.springboothello.entity;

import java.io.Serializable;
import java.util.Date;

public class CompResult implements Serializable {
    private Long id;

    private Long schedualId;

    private Long templateContentDetailId;

    private Long templateContentId;

    private String description;

    private String compExplain;

    private String imgUrl;

    private Byte firstCompFlag;

    private String firstCompDesc;

    private Byte secondCompFlag;

    private String secondCompDesc;

    private Byte platformCompFlag;

    private String platformCompDesc;

    private Byte brandCompFlag;

    private String brandCompDesc;

    private Byte thirdPartyCompFlag;

    private String thirdPartyCompDesc;

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

    public Long getTemplateContentId() {
        return templateContentId;
    }

    public void setTemplateContentId(Long templateContentId) {
        this.templateContentId = templateContentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCompExplain() {
        return compExplain;
    }

    public void setCompExplain(String compExplain) {
        this.compExplain = compExplain == null ? null : compExplain.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Byte getFirstCompFlag() {
        return firstCompFlag;
    }

    public void setFirstCompFlag(Byte firstCompFlag) {
        this.firstCompFlag = firstCompFlag;
    }

    public String getFirstCompDesc() {
        return firstCompDesc;
    }

    public void setFirstCompDesc(String firstCompDesc) {
        this.firstCompDesc = firstCompDesc == null ? null : firstCompDesc.trim();
    }

    public Byte getSecondCompFlag() {
        return secondCompFlag;
    }

    public void setSecondCompFlag(Byte secondCompFlag) {
        this.secondCompFlag = secondCompFlag;
    }

    public String getSecondCompDesc() {
        return secondCompDesc;
    }

    public void setSecondCompDesc(String secondCompDesc) {
        this.secondCompDesc = secondCompDesc == null ? null : secondCompDesc.trim();
    }

    public Byte getPlatformCompFlag() {
        return platformCompFlag;
    }

    public void setPlatformCompFlag(Byte platformCompFlag) {
        this.platformCompFlag = platformCompFlag;
    }

    public String getPlatformCompDesc() {
        return platformCompDesc;
    }

    public void setPlatformCompDesc(String platformCompDesc) {
        this.platformCompDesc = platformCompDesc == null ? null : platformCompDesc.trim();
    }

    public Byte getBrandCompFlag() {
        return brandCompFlag;
    }

    public void setBrandCompFlag(Byte brandCompFlag) {
        this.brandCompFlag = brandCompFlag;
    }

    public String getBrandCompDesc() {
        return brandCompDesc;
    }

    public void setBrandCompDesc(String brandCompDesc) {
        this.brandCompDesc = brandCompDesc == null ? null : brandCompDesc.trim();
    }

    public Byte getThirdPartyCompFlag() {
        return thirdPartyCompFlag;
    }

    public void setThirdPartyCompFlag(Byte thirdPartyCompFlag) {
        this.thirdPartyCompFlag = thirdPartyCompFlag;
    }

    public String getThirdPartyCompDesc() {
        return thirdPartyCompDesc;
    }

    public void setThirdPartyCompDesc(String thirdPartyCompDesc) {
        this.thirdPartyCompDesc = thirdPartyCompDesc == null ? null : thirdPartyCompDesc.trim();
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
        sb.append(", templateContentId=").append(templateContentId);
        sb.append(", description=").append(description);
        sb.append(", compExplain=").append(compExplain);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", firstCompFlag=").append(firstCompFlag);
        sb.append(", firstCompDesc=").append(firstCompDesc);
        sb.append(", secondCompFlag=").append(secondCompFlag);
        sb.append(", secondCompDesc=").append(secondCompDesc);
        sb.append(", platformCompFlag=").append(platformCompFlag);
        sb.append(", platformCompDesc=").append(platformCompDesc);
        sb.append(", brandCompFlag=").append(brandCompFlag);
        sb.append(", brandCompDesc=").append(brandCompDesc);
        sb.append(", thirdPartyCompFlag=").append(thirdPartyCompFlag);
        sb.append(", thirdPartyCompDesc=").append(thirdPartyCompDesc);
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