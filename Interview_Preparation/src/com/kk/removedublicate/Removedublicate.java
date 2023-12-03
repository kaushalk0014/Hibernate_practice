package com.kk.removedublicate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.kk.sort.Customer;

public class Removedublicate {

	void test() throws IOException {
		try {
			
		}catch (Exception e) {
			throw new IOException();
		}
	}
	public static void main(String[] args) throws IOException {
		new Removedublicate().test();
		List<Customer> list = new ArrayList<Customer>();
		list.add(new Customer("kaushal", 11));
		list.add(new Customer("kaushal", 11));
		list.add(new Customer("Naresh", 11));
		list.add(new Customer("Akarsh", 11));
		list.add(new Customer("Kalpesh", 11));
		
		System.out.println("Before : "+list.size());
		Set<Customer> set=new HashSet<>(list);
		list.clear();
		list.addAll(set);
		
		System.out.println("After : "+list.size());
	}
}
