package com.kk.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountString {

	void countStringNum(String str) {
		Map<Character,Integer> map=new HashMap<>();
		char[] ch=str.toCharArray();
		for (Character c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c,1);
			}
		}
		Set<Character> setResult=map.keySet();
		for (Character character : setResult) {
			if(map.get(character)>1) {
				System.out.println(character+"       :"+map.get(character));
			}
		}
	 
	}
	public static void main(String[] args) {
		new CountString().countStringNum("kaushal");
	}
}
