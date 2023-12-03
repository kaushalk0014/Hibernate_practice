package com.kk.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
 
	
	public int abca(int a,int b) {
		return 0;
	}
	public long abca(float a,float b) {
		return 0l;
	}
	public static void main(String[] args) {
		String name="kaushal";
		
		char chr[]=name.toCharArray();
		
		for (int i = 0; i < chr.length; i++) {
			for (int j = i+1; j < chr.length; j++) {
				if(chr[i]==chr[j]) {
					System.out.println("Duplicate Char: "+chr[i]);
					break;
				}
			}
		}
		
		Map<Character,Integer> map=new HashMap<>();
		for (int i = 0; i < chr.length; i++) {
			if(map.containsKey(chr[i])){
				map.put(chr[i], map.get(chr[i])+1);
			}else {
				map.put(chr[i],1);
			}
		}
		System.out.println(map);
		
		
	}
}
