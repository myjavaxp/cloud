package com.yibo.springboothello.service;

import com.yibo.springboothello.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void findById() {
        SysUser sysUser = userService.findById(1L);
        System.out.println(sysUser);
    }
}