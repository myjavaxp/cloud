package com.yibo.feignmanual.feign;

import com.yibo.springboothello.entity.SysUser;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface UserFeignClient {
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    SysUser findById(@PathVariable("id") Long id);
}
