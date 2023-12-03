package com.kk.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class ArraysExample {

	public static void main(String[] args) {
		String str="India is my contry";
		char []strArr=str.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<strArr.length-1;i++){
			 	map.merge(strArr[i],1,Integer::sum);
		}
		
		 map.forEach((k,v)->System.out.println("Key  : "+k +"   Value  : "+  v));
	
	}
		 
}
