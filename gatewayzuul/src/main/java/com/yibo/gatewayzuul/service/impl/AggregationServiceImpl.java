package com.yibo.gatewayzuul.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yibo.gatewayzuul.service.AggregationService;
import com.yibo.springboothello.entity.SysUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rx.Observable;

import javax.annotation.Resource;

@Service("aggregationService")
public class AggregationServiceImpl implements AggregationService {
    @Resource
    private RestTemplate restTemplate;
    private static final Logger LOGGER= LoggerFactory.getLogger(AggregationServiceImpl.class);

    @HystrixCommand(fallbackMethod = "fallback")
    @Override
    public Observable<SysUser> getUserById(Long id) {
        return Observable.create(observer -> {
            SysUser user = restTemplate.getForObject("http://hello-service/users/{id}", SysUser.class, id);
            LOGGER.info("用户："+user.toString());
            observer.onNext(user);
            observer.onCompleted();
        });
    }

    @HystrixCommand(fallbackMethod = "fallback")
    @Override
    public Observable<SysUser> getRibbonUserById(Long id) {
        return Observable.create(observer -> {
            SysUser sysUser = restTemplate.getForObject("http://ribbon-consumer/users/{id}", SysUser.class, id);
            LOGGER.info("用户："+sysUser.toString());
            observer.onNext(sysUser);
            observer.onCompleted();
        });
    }

    @Override
    public SysUser fallback(Long id) {
        SysUser user = new SysUser();
        user.setId(-1L);
        return user;
    }
}