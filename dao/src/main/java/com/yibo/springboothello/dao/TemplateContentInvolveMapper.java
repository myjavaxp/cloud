package com.yibo.springboothello.dao;

import com.yibo.springboothello.entity.TemplateContentInvolve;

public interface TemplateContentInvolveMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TemplateContentInvolve record);

    int insertSelective(TemplateContentInvolve record);

    TemplateContentInvolve selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TemplateContentInvolve record);

    int updateByPrimaryKey(TemplateContentInvolve record);
}