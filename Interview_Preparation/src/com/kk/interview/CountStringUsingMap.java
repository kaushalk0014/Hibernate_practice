package com.kk.interview;

import java.util.HashMap;
import java.util.Map;

public class CountStringUsingMap {

	public static void main(String[] args) {
		String str="newStringnew";
		
		Map<Character,Integer> map=new HashMap<>();	
		for (Character ch : str.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}//for
		
		map.forEach((charac,num)->{
			if(map.get(charac)>1) {
				System.out.println("Char : "+charac+" Num: "+num);
			}
		});
	}
}
