package com.yibo.serviceprovider.controller;

import com.yibo.serviceprovider.dao.DealerRepository;
import com.yibo.serviceprovider.entity.Dealer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/dealers")
public class DealerController {
    @Resource
    private DealerRepository dealerRepository;

    @GetMapping
    public List<Dealer> getDealers() {
        return dealerRepository.findAll();
    }

    @GetMapping("/{page}/{size}")
    public Page<Dealer> getDealersInPage(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        Assert.isTrue(page > -1 && size > 0, "页码信息不正确！");
        return dealerRepository.findAll(new PageRequest(page, size));
    }
}