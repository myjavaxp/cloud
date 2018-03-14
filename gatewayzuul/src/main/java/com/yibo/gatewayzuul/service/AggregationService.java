package com.yibo.gatewayzuul.service;

import com.yibo.springboothello.entity.SysUser;
import rx.Observable;

public interface AggregationService {
    Observable<SysUser> getUserById(Long id);

    Observable<SysUser> getRibbonUserById(Long id);

    SysUser fallback(Long id);
}