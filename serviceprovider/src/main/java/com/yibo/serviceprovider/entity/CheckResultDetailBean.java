package com.yibo.serviceprovider.entity;

import java.io.Serializable;

public class CheckResultDetailBean implements Serializable {
    private static final long serialVersionUID = -3086165751326162990L;
    private Long detailId;//隐藏项，最小子项ID
    private String criterion;//未达到原因
    private Byte checkResult;//判断结果
    private String description;//描述
    private String imgUrl;//图片路径
    private String detailNumber;//明细编号
    private Long compId;//明细项对应的申述记录

    public Long getDetailId() {
        return detailId;
    }

    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    public String getCriterion() {
        return criterion;
    }

    public void setCriterion(String criterion) {
        this.criterion = criterion;
    }

    public Byte getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(Byte checkResult) {
        this.checkResult = checkResult;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDetailNumber() {
        return detailNumber;
    }

    public void setDetailNumber(String detailNumber) {
        this.detailNumber = detailNumber;
    }

    public Long getCompId() {
        return compId;
    }

    public void setCompId(Long compId) {
        this.compId = compId;
    }
}