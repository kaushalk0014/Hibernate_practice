package com.kk.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomeSort3 {
	public static void main(String[] args) {
		List<Teacher> list = new ArrayList<Teacher>();
		list.add(new Teacher("kaushal", 11));
		list.add(new Teacher("Suresh", 11));
		list.add(new Teacher("Naresh", 11));
		list.add(new Teacher("Akarsh", 11));
		list.add(new Teacher("Kalpesh", 11));
		
		Collections.sort(list,new Comparator<Teacher>() {

			@Override
			public int compare(Teacher o1, Teacher o2) {
				return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
			}
		});
		System.out.println(list);
	}
}
