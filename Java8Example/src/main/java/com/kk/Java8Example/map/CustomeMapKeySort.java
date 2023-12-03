package com.kk.Java8Example.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CustomeMapKeySort {

	public static void main(String[] args) {

		Map<Employee, Integer> map = new TreeMap<>(new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getId().compareTo(e2.getId());
			}
		});
		
		
		//Map<Employee, Integer> map = new TreeMap<>((e1,e2)->e1.getId().compareTo(e2.getId()));
	 
		map.put(new Employee(102, "Kaushal", "SE", 6000), 45);
		map.put(new Employee(105, "Rakesh", "DM", 3000), 45);
		map.put(new Employee(101, "Mohan", "PM", 9000), 45);
		map.put(new Employee(106, "Pankaj", "BA", 4000), 45);
		map.put(new Employee(104, "Dinesh", "Civil", 8000), 45);

		map.forEach((k, v) -> System.out.println("Key  : " + k + "    value  : " + v));
		System.out.println("***************************");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.
				comparing(Employee::getSalary))).forEach(System.out::println);
		
		System.out.println("*******************vvvvvvvvvvvvvvv********");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
		.forEach(System.out::println);
	}
}
