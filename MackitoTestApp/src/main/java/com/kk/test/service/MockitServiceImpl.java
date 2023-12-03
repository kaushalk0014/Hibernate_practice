package com.kk.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kk.test.dao.MockitoRepository;
import com.kk.test.entity.BankDO;

@Service
public class MockitServiceImpl implements MockitService {

	@Autowired(required = true)
	private MockitoRepository mockitoDAO;

	@Autowired(required = true)
	private MockitoUitl mockitoUitl;

	@Override
	public BankDO getById(Long id) {
		try {
			if (id != null) {
				BankDO bank = mockitoDAO.getById(id);
				return bank;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public BankDO getIFCCode(String ifcCode) {
		System.out.println("==========Service getIFCCode=========");
		try {
			if (ifcCode != null) {
				return mockitoUitl.getIFCCode(ifcCode);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<BankDO> getAll() {
		try {
			return mockitoDAO.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public BankDO save(BankDO bankDO) {
		try {
			return mockitoDAO.save(bankDO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
