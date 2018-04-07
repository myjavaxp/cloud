package com.yibo.springboothello.dao;

import com.yibo.springboothello.entity.TemplateSkoda;

public interface TemplateSkodaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TemplateSkoda record);

    int insertSelective(TemplateSkoda record);

    TemplateSkoda selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TemplateSkoda record);

    int updateByPrimaryKey(TemplateSkoda record);
}