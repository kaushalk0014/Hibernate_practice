package com.kk.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kk.test.entity.BankDO;

@Repository
public interface MockitoRepository extends JpaRepository<BankDO, Long>{

}
