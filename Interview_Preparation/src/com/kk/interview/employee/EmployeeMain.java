package com.kk.interview.employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee=new Employee(101, "kk");
		Employee employee2=new Employee(102, "kk");
		Employee employee3=new Employee(103, "kk");
		Employee employee4=new Employee(103, "kk");
		List<Employee> list=new ArrayList<>();	
		list.add(employee);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		Set<Employee> set=new HashSet<>(list);
		System.out.println(list.size());
		System.out.println(set.size());
		System.out.println(list);
	}
}
