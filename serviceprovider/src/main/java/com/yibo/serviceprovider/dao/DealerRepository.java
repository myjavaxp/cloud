package com.yibo.serviceprovider.dao;

import com.yibo.serviceprovider.entity.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealerRepository extends JpaRepository<Dealer,Long> {
}