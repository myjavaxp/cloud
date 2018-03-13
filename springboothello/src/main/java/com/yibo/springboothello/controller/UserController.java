package com.yibo.springboothello.controller;

import com.yibo.springboothello.entity.SysUser;
import com.yibo.springboothello.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/users")
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping("/{id}")
    public SysUser findById(@PathVariable("id")Long id){
        return userService.findById(id);
    }
}