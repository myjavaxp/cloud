package com.yibo.springboothello.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TemplateContentInvolve implements Serializable {
    private Long id;

    private String templateSkodaId;

    private Long templateContentId;

    private BigDecimal weight;

    private Byte isInvolve;

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

    public String getTemplateSkodaId() {
        return templateSkodaId;
    }

    public void setTemplateSkodaId(String templateSkodaId) {
        this.templateSkodaId = templateSkodaId == null ? null : templateSkodaId.trim();
    }

    public Long getTemplateContentId() {
        return templateContentId;
    }

    public void setTemplateContentId(Long templateContentId) {
        this.templateContentId = templateContentId;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Byte getIsInvolve() {
        return isInvolve;
    }

    public void setIsInvolve(Byte isInvolve) {
        this.isInvolve = isInvolve;
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
        sb.append(", templateSkodaId=").append(templateSkodaId);
        sb.append(", templateContentId=").append(templateContentId);
        sb.append(", weight=").append(weight);
        sb.append(", isInvolve=").append(isInvolve);
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