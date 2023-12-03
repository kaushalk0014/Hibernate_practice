package com.kk.Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEvenInteger {

	public static void main(String[] args) {
		Integer arr[]= {7,58,552,45,68,11,55,25,65,84,58,45,98,58,68,5,552};
			
		List<Integer> list=Arrays.asList(arr);
		List<Integer> evenList=list.stream().filter(a->a%2==0).collect(Collectors.toList());
		evenList.forEach(a->System.out.println(a));
		System.out.println("=============================");
		List<Integer> oddList=list.stream().filter(a->a%2!=0).collect(Collectors.toList());
		oddList.forEach(a->System.out.println(a));
	
		System.out.println("=============================");
		Map<Integer,Integer> map=list.stream().collect(Collectors.toMap(k->k, v->1,Integer::sum));
		
		map.forEach((k,v)->System.out.println("Key  :"+k+   "  Value   :"+v));
	
	}
}
