package com.kk.Java8Example.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CustomeMapValueSort {

	public static void main(String[] args) {
		Map<Integer,Employee> map=new HashMap<>();
		map.put(102,new Employee(102, "Kaushal", "SE", 6000));
		map.put(105,new Employee(105, "Rakesh", "DM", 3000));
		map.put(101,new Employee(101, "Mohan", "PM", 7000));
		map.put(106,new Employee(106, "Pankaj", "BA", 4000));
		map.put(104,new Employee(104, "Kaushal", "Civil", 8000));
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator
				.comparing(Employee::getSalary))).forEach(System.out::println);
		
		System.out.println("**********************************************");
		
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(
				Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary).reversed()))
		.forEach(System.out::println);;
		
	}
}
