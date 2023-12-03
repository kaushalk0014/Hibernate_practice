package com.kk.string.sort;

import java.util.Arrays;

public class StringSort3 {

	public static void main(String[] args) {
		String str[] = {"ab","gh","df","bd"};
		Arrays.sort(str,(String o1,String o2)->{
			return o1.compareTo(o2);
		});
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
	}
}
