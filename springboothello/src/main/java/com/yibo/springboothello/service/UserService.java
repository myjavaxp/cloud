package com.yibo.springboothello.service;

import com.yibo.springboothello.entity.SysUser;

public interface UserService {
    SysUser findById(Long id);
}
