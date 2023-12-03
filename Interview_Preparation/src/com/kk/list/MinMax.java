package com.kk.list;

import java.util.ArrayList;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(92);	list.add(1);
		list.add(72);	list.add(52);
		list.add(62);		
		
		int min=list.get(0);
		int max=list.get(0);
		int avg=list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if(list.get(i)>max) {
				max=list.get(i);
			}
			if(list.get(i)<min) {
				min=list.get(i);
			}
			avg+=list.get(i);
		}
		
		System.out.println("MAX  :"+max);
		System.out.println("Min  :"+min);
		System.out.println("Avg  :"+(avg/list.size()));
	}
}
