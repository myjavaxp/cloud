package com.yibo.springboothello.dao;

import com.yibo.springboothello.entity.TemplateContent;

public interface TemplateContentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TemplateContent record);

    int insertSelective(TemplateContent record);

    TemplateContent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TemplateContent record);

    int updateByPrimaryKey(TemplateContent record);
}