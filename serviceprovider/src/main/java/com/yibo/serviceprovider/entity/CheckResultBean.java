package com.yibo.serviceprovider.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class CheckResultBean implements Serializable{
    private static final long serialVersionUID = 327970889389328070L;
    private Long contentId;//contentId
    private String checkNumber;//序号
    private String checkCategory;//检查项目
    private String checkContent;//检查内容
    private BigDecimal weight;//权重
    private List<CheckResultDetailBean> checkResultDetailList;

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

    public List<CheckResultDetailBean> getCheckResultDetailList() {
        return checkResultDetailList;
    }

    public void setCheckResultDetailList(List<CheckResultDetailBean> checkResultDetailList) {
        this.checkResultDetailList = checkResultDetailList;
    }
}