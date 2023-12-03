package com.kk.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomeSort2 {
	
	public static void main(String[] args) {
		List<Customer> list = new ArrayList<Customer>();
		list.add(new Customer("kaushal", 11));
		list.add(new Customer("Suresh", 11));
		list.add(new Customer("Naresh", 11));
		list.add(new Customer("Akarsh", 11));
		list.add(new Customer("Kalpesh", 11));
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}
	 
}
