package com.kk.Java8Example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class SortArray {

	public static void main(String[] args) {
		int b[]={44,66,99,77,33,22,55};
		
		Arrays.sort(b);
		
		System.out.println(b[b.length-3]);
		Collections.synchronizedMap(new HashMap<>());
	}
}
