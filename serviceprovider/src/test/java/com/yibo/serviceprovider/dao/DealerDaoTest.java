package com.yibo.serviceprovider.dao;

import com.yibo.serviceprovider.entity.Dealer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DealerDaoTest {
    @Resource
    private DealerDao dealerDao;
    @Resource
    private ScoreEntityDao scoreEntityDao;

    @Test
    public void testDealer() {
        List<Dealer> dealerList = dealerDao.findByProvinceContainingAndCityContaining("黑", "哈");
        dealerList.forEach(System.out::println);
        System.out.println("------");
        dealerDao.findByIdLessThan(100L).forEach(System.out::println);
    }

    @Test
    public void testScore() {
        scoreEntityDao.getScoreDetail(1L, 1L).forEach(System.out::println);
    }
}