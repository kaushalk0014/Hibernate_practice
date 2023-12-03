package com.kk.test.service;

import org.springframework.stereotype.Component;

import com.kk.test.entity.BankDO;

@Component
public class MockitoUitl {

	public BankDO getIFCCode(String ifcCode) {
		System.out.println("==========MockitoUitl getIFCCode=========");
		if(ifcCode!=null) {
			return new BankDO();
		}
		return null;
		
	}

}
