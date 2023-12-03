package com.kk.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomeSort {

	public static void main(String[] args) {
		new CustomeSort().sortJava7();
		new CustomeSort().sortJava8();
	}

	void sortJava7() {
		List<Employee> names1 = new ArrayList<Employee>();
		names1.add(new Employee("kaushal", 11));
		names1.add(new Employee("Suresh", 11));
		names1.add(new Employee("Naresh", 11));
		names1.add(new Employee("Akarsh", 11));
		names1.add(new Employee("Kalpesh", 11));

		Collections.sort(names1, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
			}
		});
		System.out.println(names1);

	}

	void sortJava8() {
		List<Employee> names1 = new ArrayList<Employee>();
		names1.add(new Employee("Kaushal", 11));
		names1.add(new Employee("Suresh", 11));
		names1.add(new Employee("Naresh", 11));
		names1.add(new Employee("Akarsh", 11));
		names1.add(new Employee("Kalpesh", 11));

		Collections.sort(names1,(s1,s2)->s1.getName().compareTo(s2.getName()));
		
		System.out.println(names1);
	}
}
