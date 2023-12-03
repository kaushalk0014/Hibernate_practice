package com.kk.SecondHibernateExampleXML;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestApp {
		
	
	public String listMethos(	) {
		List<String> list=new ArrayList<>(Arrays.asList("aa", "bbb", "cat", "dog", "def"));
		StringBuffer buffer=new StringBuffer();
		list.forEach(a->{
			if(a.contains("a")||a.contains("d")){
				buffer.append(a);
			}
		});
		return buffer.toString();
	}
	
	@Test
	public void mainTest() {
		TestApp test=new TestApp();
		assertEquals("aa",test.listMethos() );
	}
}
