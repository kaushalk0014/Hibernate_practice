package com.kk.Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrencesInList {
	
	public static void main(String[] args) {
		String []str= {"kaushal","Puja","Dipak","Rakesh","Puja","kaushal"};
		
		List<String> list=Arrays.asList(str);
		Map<String,Integer> map=list.stream().collect(Collectors.toMap(a->a,v->1,Integer::sum));
		map.forEach((k,v)->System.out.println("Key   :"+k+"   Value  :"+v));
		
		System.out.println("------------Count List of word------------------");
		
		
		Long count=list.stream().count();
		System.out.println(count);
	
	}
}
