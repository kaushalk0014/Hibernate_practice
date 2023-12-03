package com.kk.Java8Example.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MapSort {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("Kaushal", 408);
		map.put("Vivek", 406);
		map.put("Rakesh", 305);
		map.put("Roshan", 202);
		map.put("Pankaj", 504);
		
		
		List<Entry<String,Integer>> list=new ArrayList(map.entrySet());
		Collections.sort(list,new Comparator<Entry<String,Integer>>(){
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return  o1.getKey().compareTo(o2.getKey());
			}
		});
		System.out.println(list);
		
		System.out.println("-----------------------------------");
		List<Entry<String,Integer>> list2=new ArrayList(map.entrySet());
		Collections.sort(list2,(o1,o2)->o1.getKey().compareTo(o2.getKey()) );
		System.out.println(list2);
		
		System.out.println("-----------------------------------");
		List<Entry<String,Integer>> entry=map.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.collect(Collectors.toList());
		entry.forEach(a->System.out.println("Key : "+a.getKey()+"   Value  :"+a.getValue()));
		System.out.println("*******************************************");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).
		forEach(System.out::println);
		System.out.println("*******************************************");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue());
		
		
		
	}
}
