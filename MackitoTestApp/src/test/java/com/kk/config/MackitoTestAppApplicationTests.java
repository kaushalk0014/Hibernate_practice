package com.kk.config;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.assertj.core.internal.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.kk.test.dao.MockitoRepository;
import com.kk.test.entity.BankDO;
import com.kk.test.service.MockitService;
import com.kk.test.service.MockitoUitl;

@SpringBootTest
class MackitoTestAppApplicationTests {

	@MockBean
	private MockitoRepository mockitoRepository;

	@MockBean
	private MockitoUitl mockitoUitl;

	@Autowired
	private MockitService mockitService;

	@Test
	void contextLoads() {
		Mockito.when(mockitoRepository.getById(1L)).thenReturn(new BankDO());
		Long s = 1L;
		BankDO bankDO = mockitService.getById(s);
		assertNotNull(bankDO);
	}

	//@Test
	void testMockitoUtil() {
		Mockito.when(mockitoUitl.getIFCCode("ABC")).thenReturn(new BankDO());

		BankDO bankDO = mockitService.getIFCCode("ABC");
		assertNotNull(bankDO);
	}

}
