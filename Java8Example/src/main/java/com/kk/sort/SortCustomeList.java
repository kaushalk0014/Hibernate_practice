package com.kk.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

 

public class SortCustomeList {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101, "Puja", "800000"));
		emp.add(new Employee(105, "Arti", "500000"));
		emp.add(new Employee(106, "Priyanka", "600000"));
		emp.add(new Employee(102, "Kunal", "900000"));
		emp.add(new Employee(104, "Akash", "700000"));
		emp.add(new Employee(103, "Sujata", "200000"));
		
		
		List<Employee> newList=emp.stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toList());;
	
		newList.forEach(e->System.out.println("Id : "+e.getId()+"   Name :  "+e.getName()));
	}
}
