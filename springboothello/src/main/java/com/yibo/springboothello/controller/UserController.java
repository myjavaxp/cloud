package com.yibo.springboothello.controller;

import com.yibo.springboothello.dao.SysUserMapper;
import com.yibo.springboothello.entity.SysUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private SysUserMapper sysUserMapper;
    private static final Logger LOGGER= LoggerFactory.getLogger(UserController.class);
    @GetMapping("/{id}")
    public SysUser findById(@PathVariable("id")Long id){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(principal instanceof UserDetails){
            UserDetails user=(UserDetails)principal;
            Collection<? extends GrantedAuthority> collection = user.getAuthorities();
            collection.forEach(c->LOGGER.info("当前用户是{},角色是{}",user.getUsername(),c.getAuthority()));
        }else {
            LOGGER.info("未知用户");
        }
        return sysUserMapper.selectByPrimaryKey(id);
    }
}
