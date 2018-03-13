package com.yibo.springboothello.service.impl;

import com.yibo.springboothello.dao.SysUserMapper;
import com.yibo.springboothello.entity.SysUser;
import com.yibo.springboothello.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
    @Resource
    private SysUserMapper sysUserMapper;
    @Override
    @Transactional(readOnly = true)
    public SysUser findById(Long id){
        Assert.notNull(id,"用户ID不能为空");
        SysUser sysUser=sysUserMapper.selectByPrimaryKey(id);
        Assert.notNull(sysUser,"ID为："+id+"的用户不存在");
        return sysUser;
    }
}
