package com.kk.Java8Example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDublicateString {

	public static void main(String[] args) {
		String []str= {"kaushal","Puja","Dipak","Rakesh","Puja","kaushal"};
		
		
		List<String> list=Arrays.asList(str);
		List<String> uniList= list.stream().distinct().collect(Collectors.toList());
		uniList.forEach(a->System.out.println(a));
		Map<String,Integer> map=new HashMap<>();
		list.forEach(l->
			map.merge(l, 1, Integer::sum)
		);
		map.forEach((k,v)->System.out.println("Key   :"+k+"    Value  :"+v));
		System.out.println("-----------------------------------------");
		Map<String,Integer> newMap=list.stream().collect(Collectors.toMap(a->a,v->1,Integer::sum));
	
		newMap.forEach((k,v)->System.out.println("Key   :"+k+"    Value  :"+v));
	}
	
	
}
