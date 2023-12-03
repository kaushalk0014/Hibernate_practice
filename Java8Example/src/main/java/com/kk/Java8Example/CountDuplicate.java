package com.kk.Java8Example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDuplicate {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Kaushal", "Puja", "Rohan", "Puja", "Sohan", "Kaushal");
		Map<String, List<String>> ewData = list.stream().collect(Collectors.groupingBy(word -> word));
		System.out.println(ewData);
		System.out.println("===============================================================\n");
		System.out.println(list.stream().collect(Collectors.counting()));
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		System.out.println(list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
		System.out.println("===============================================================\n");
		List<String> newList2= list.stream().filter(a->a.equals("Puja")).collect(Collectors.toList());
		
		System.out.println(newList2);
		System.out.println("===============================================================");
		List<Employee> employees = Arrays.asList(new Employee("Kaushal",27),
												new Employee("Puja",33),
												new Employee("Rohan",25),
												new Employee("Puja",12),
												new Employee("Puja",55),
												new Employee("Dinesh",100),
												new Employee("Sohan",16));
		
		//Collections.sort(employees,Comparator.comparing(Employee::getName).thenComparingInt(Employee::getAge));
		employees.forEach(System.out::println);
		System.out.println("=========aaaaaaaaaaaaaaaaaaa=====================================================");
		
		
		List<Employee> employeesStream=employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		employeesStream.forEach(System.out::println);
		System.out.println("=========bbbbbbbbbbbbbbbbbbb=====================================================");
		
		Map<Integer,Employee> mapEmp=employees.stream().collect(Collectors.toMap(Employee::getAge, Function.identity()));
		mapEmp.forEach((k,v)->System.out.println("key "+k+"   Value "+v));
	
		System.out.println("=====================xxxxxxxxxx==========================================");
		
		 List<Integer> listInt = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
		 
	        Optional<Integer> maxNumber = listInt.stream()
	                    .max((i, j) -> i.compareTo(j));
	 
	        System.out.println(maxNumber.get());
	        
	        
	
	}
}

class Employee {
	private String name;
	private Integer age;

	public Employee() {
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}

	public Employee(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}