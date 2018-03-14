package com.yibo.gatewayzuul.controller;

import com.google.common.collect.Maps;
import com.yibo.gatewayzuul.service.AggregationService;
import com.yibo.springboothello.entity.SysUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import rx.Observable;
import rx.Observer;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
public class AggregationController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AggregationController.class);
    @Resource
    private AggregationService aggregationService;

    @GetMapping("/aggregate/{id}")
    public DeferredResult<HashMap<String, SysUser>> aggregate(@PathVariable Long id) {
        Observable<HashMap<String, SysUser>> result = aggregateObservable(id);
        return toDeferredResult(result);
    }

    private Observable<HashMap<String, SysUser>> aggregateObservable(Long id) {
        return Observable.zip(
                aggregationService.getUserById(id),
                aggregationService.getRibbonUserById(id),
                (user, ribbonUser) -> {
                    HashMap<String, SysUser> map = Maps.newHashMap();
                    map.put("user", user);
                    map.put("ribbonUser", ribbonUser);
                    return map;
                }
        );
    }

    private DeferredResult<HashMap<String, SysUser>> toDeferredResult(Observable<HashMap<String, SysUser>> details) {
        DeferredResult<HashMap<String, SysUser>> result = new DeferredResult<>();
        details.subscribe(new Observer<HashMap<String, SysUser>>() {

            @Override
            public void onCompleted() {
                LOGGER.info("完成...");
            }

            @Override
            public void onError(Throwable e) {
                LOGGER.error("发生错误...", e);
            }

            @Override
            public void onNext(HashMap<String, SysUser> ribbonDetails) {
                result.setResult(ribbonDetails);
            }
        });
        return result;
    }
}