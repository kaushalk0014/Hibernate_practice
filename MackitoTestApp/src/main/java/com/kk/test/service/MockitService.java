package com.kk.test.service;

import java.util.List;

import com.kk.test.entity.BankDO;

public interface MockitService {

	BankDO getById(Long id);
	
	BankDO getIFCCode(String ifcCode);

	List<BankDO> getAll();

	BankDO save(BankDO bankDO);
	

}
