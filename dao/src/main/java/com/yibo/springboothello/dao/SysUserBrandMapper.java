package com.yibo.springboothello.dao;

import com.yibo.springboothello.entity.SysUserBrand;

public interface SysUserBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserBrand record);

    int insertSelective(SysUserBrand record);

    SysUserBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUserBrand record);

    int updateByPrimaryKey(SysUserBrand record);
}