package com.kk.Java8Example;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	
	private Calculator calculator;
	
	@Before                                     
	public void init() {
		this.calculator=new Calculator();
	}
	
	
	@Test
	public void TestSum() {
		assertEquals("12",calculator.sum(6, 6).toString());
	}
}
