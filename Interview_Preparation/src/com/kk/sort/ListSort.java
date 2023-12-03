package com.kk.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
	
		new ListSort().sortJava7();
		new ListSort().sortJava8();
	}

	
	void sortJava7() {
		List<String> names1 = new ArrayList<String>();
		names1.add("Mahesh ");
		names1.add("Suresh ");
		names1.add("Ramesh ");
		names1.add("Naresh ");
		names1.add("Akarsh ");
		names1.add("Kalpesh ");
		Collections.sort(names1);
		System.out.println("-------sortJava7-------");
		System.out.println(names1);
	}

	void sortJava8() {
		List<String> names1 = new ArrayList<String>();
		names1.add("Mahesh ");
		names1.add("Suresh ");
		names1.add("Ramesh ");
		names1.add("Naresh ");
		names1.add("Akarsh ");
		names1.add("Kalpesh ");
		System.out.println("-------sortJava8-------");
		Collections.sort(names1,(s1,s2)->s1.compareTo(s2));
		System.out.println(names1);
	}
}
