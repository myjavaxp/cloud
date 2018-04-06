package com.yibo.serviceprovider.entity;

import java.io.Serializable;
import java.util.List;

public class ScoreDetailBean implements Serializable {
    private static final long serialVersionUID = -3630815353273091307L;
    private String category;
    private List<CheckResultBean> checkResultList;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<CheckResultBean> getCheckResultList() {
        return checkResultList;
    }

    public void setCheckResultList(List<CheckResultBean> checkResultList) {
        this.checkResultList = checkResultList;
    }
}