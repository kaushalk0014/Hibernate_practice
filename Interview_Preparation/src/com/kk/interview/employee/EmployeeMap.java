package com.kk.interview.employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {
		Employee employee=new Employee(101, "kk");
		Employee employee2=new Employee(102, "kk");
		Employee employee3=new Employee(103, "kk");
		Employee employee4=new Employee(103, "kk");
		Map<Employee, String> map=new HashMap<>();
		map.put(employee, "kk");map.put(employee2, "kk");
		map.put(employee3, "kk");
		map.put(employee4, "kk");
		System.out.println(map);
	}
}
