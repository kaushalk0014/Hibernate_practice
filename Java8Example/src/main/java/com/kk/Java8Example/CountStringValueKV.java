package com.kk.Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountStringValueKV {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Kaushal","Puja","Kaushal","Mohan","Sohan","Mohan"
				,"Puja");
		
		
		Map<String,Long> map=list.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
	
		map.forEach((k,v)->System.out.println("Key  "+k+"   Value "+v));
	
	}
}
