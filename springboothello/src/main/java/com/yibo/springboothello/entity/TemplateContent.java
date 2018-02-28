package com.yibo.springboothello.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TemplateContent implements Serializable {
    private Long id;

    private Long templateId;

    private String number;

    private String checkCategory;

    private String contentNum;

    private String checkContent;

    private String itemDesc;

    private Byte isTouchUpon;

    private Byte isNoCheck;

    private Long parentId;

    private BigDecimal weight;

    private Byte isBack;

    private Byte isSplit;

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

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getCheckCategory() {
        return checkCategory;
    }

    public void setCheckCategory(String checkCategory) {
        this.checkCategory = checkCategory == null ? null : checkCategory.trim();
    }

    public String getContentNum() {
        return contentNum;
    }

    public void setContentNum(String contentNum) {
        this.contentNum = contentNum == null ? null : contentNum.trim();
    }

    public String getCheckContent() {
        return checkContent;
    }

    public void setCheckContent(String checkContent) {
        this.checkContent = checkContent == null ? null : checkContent.trim();
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
    }

    public Byte getIsTouchUpon() {
        return isTouchUpon;
    }

    public void setIsTouchUpon(Byte isTouchUpon) {
        this.isTouchUpon = isTouchUpon;
    }

    public Byte getIsNoCheck() {
        return isNoCheck;
    }

    public void setIsNoCheck(Byte isNoCheck) {
        this.isNoCheck = isNoCheck;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Byte getIsBack() {
        return isBack;
    }

    public void setIsBack(Byte isBack) {
        this.isBack = isBack;
    }

    public Byte getIsSplit() {
        return isSplit;
    }

    public void setIsSplit(Byte isSplit) {
        this.isSplit = isSplit;
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
        sb.append(", templateId=").append(templateId);
        sb.append(", number=").append(number);
        sb.append(", checkCategory=").append(checkCategory);
        sb.append(", contentNum=").append(contentNum);
        sb.append(", checkContent=").append(checkContent);
        sb.append(", itemDesc=").append(itemDesc);
        sb.append(", isTouchUpon=").append(isTouchUpon);
        sb.append(", isNoCheck=").append(isNoCheck);
        sb.append(", parentId=").append(parentId);
        sb.append(", weight=").append(weight);
        sb.append(", isBack=").append(isBack);
        sb.append(", isSplit=").append(isSplit);
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