package com.yibo.serviceprovider.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class ScoreEntity implements Serializable {
    private static final long serialVersionUID = -4060892437167563781L;
    private String category;
    private Long contentId;//contentId
    private String checkNumber;//序号
    private String checkCategory;//检查项目
    private String checkContent;//检查内容
    private BigDecimal weight;//权重
    private String criterion;//未达到原因
    private Byte checkResult;//判断结果
    private String description;//描述
    private String imgUrl;//图片路径
    private String detailNumber;//明细编号
    private Long compId;//明细项对应的申述记录

    public ScoreEntity() {
    }

    public ScoreEntity(String category, Long contentId, String checkNumber, String checkCategory, String checkContent, BigDecimal weight, String criterion, Byte checkResult, String description, String imgUrl, String detailNumber, Long compId) {
        this.category = category;
        this.contentId = contentId;
        this.checkNumber = checkNumber;
        this.checkCategory = checkCategory;
        this.checkContent = checkContent;
        this.weight = weight;
        this.criterion = criterion;
        this.checkResult = checkResult;
        this.description = description;
        this.imgUrl = imgUrl;
        this.detailNumber = detailNumber;
        this.compId = compId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getCheckCategory() {
        return checkCategory;
    }

    public void setCheckCategory(String checkCategory) {
        this.checkCategory = checkCategory;
    }

    public String getCheckContent() {
        return checkContent;
    }

    public void setCheckContent(String checkContent) {
        this.checkContent = checkContent;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
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