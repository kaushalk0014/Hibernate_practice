package com.kk.Java8Example;

import java.util.Arrays;
import java.util.Comparator;

public class StringArraySorting {

	public static void main(String[] args) {
		String strArr[]= {"kaushal","Puha","Mohan","Raju","Jay Praksh"};
		
		Arrays.sort(strArr,new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		});
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}
}
