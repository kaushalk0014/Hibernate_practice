package com.kk.sort;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSort {

	public static void main(String[] args) {
		Map<Integer,String> hashMap=new HashMap<>();
		hashMap.put(11, "11");hashMap.put(5, "5");
		hashMap.put(99, "99");hashMap.put(79, "79");
		
		Map<Integer,String> treeMap=new TreeMap(Collections.reverseOrder());
		treeMap.putAll(hashMap);
		
		System.out.println(hashMap);
		System.out.println(treeMap);
	}
}
