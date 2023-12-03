package com.kk.Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMin {
	public static void main(String[] args) {
		Integer intArr[]= {12,14,555,21,45,4,5,6,6,99,7,88,99};
		List<Integer> list=Arrays.asList(intArr);
		System.out.println("min "+list.stream().min(Integer::compare).get());
		System.out.println("max "+list.stream().max(Integer::compare).get());
		
		System.out.println(list.stream().mapToInt(a->a).min().getAsInt());
		System.out.println(list.stream().mapToInt(a->a).max().getAsInt());
	
	System.out.println("-----------------------------");
		Map<Integer,Long> newList=list.stream().
				collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));
		
		newList.forEach((k,v)->System.out.println("K  "+k+"    V  "+v));
	
	}

}
