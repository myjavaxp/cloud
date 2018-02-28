package com.yibo.springboothello.dao;

import com.yibo.springboothello.entity.TemplateContentDetail;

public interface TemplateContentDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TemplateContentDetail record);

    int insertSelective(TemplateContentDetail record);

    TemplateContentDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TemplateContentDetail record);

    int updateByPrimaryKey(TemplateContentDetail record);
}