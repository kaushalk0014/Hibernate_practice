package com.kk.Java8Example;

import java.util.Arrays;
import java.util.List;

public class CustomeSortInteger {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 42, 15, 26, 35, 5, 95, 65, 24);
 
		
		for (int i = 0; i < list.size()-1 ; i++) {
			for (int j = i+1; j < list.size() ; j++) {
				if(list.get(i)>list.get(j)) {
					int temp=list.get(j);
					list.set(j, list.get(i));
					list.set(i, temp);
				}
			}
		}
		
		
		System.out.println(list);

	}

}
