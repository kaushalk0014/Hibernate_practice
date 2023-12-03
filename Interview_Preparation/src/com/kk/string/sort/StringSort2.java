package com.kk.string.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StringSort2 {
	public static void main(String[] args) {
		String[] str = { "ab", "fd", "gr", "dh" };
		Collections.sort(Arrays.asList(str),new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
	
	for (int i = 0; i < str.length; i++) {
		System.out.println(str[i]);
	}
	
	
	}
	
	
	
}
