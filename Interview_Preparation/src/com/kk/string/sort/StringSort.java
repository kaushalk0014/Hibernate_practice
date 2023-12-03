package com.kk.string.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StringSort {

	public static void main(String[] args) {
		String [] str= {"ab","ef","dr"};
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		Comparator<String> comparator=new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		
		Collections.sort(Arrays.asList(str),comparator);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
