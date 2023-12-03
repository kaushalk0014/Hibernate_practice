package com.kk.Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountIntegerValueKV {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(15,55,66,22,55,66,33,88,95,65,244,55,66,225,22);
		Map<Integer,Long> newMap=list.stream().collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));
			
		newMap.forEach((k,v)->System.out.println("Key  "+k+"  Value  :"+ v));
		
		
		
	}
}
