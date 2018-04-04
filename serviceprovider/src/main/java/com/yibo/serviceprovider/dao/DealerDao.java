package com.yibo.serviceprovider.dao;

import com.yibo.serviceprovider.entity.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DealerDao extends JpaRepository<Dealer, Long> {
    List<Dealer> findByProvinceContainingAndCityContaining(String province, String city);

    List<Dealer> findByIdLessThan(Long id);
}