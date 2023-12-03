package com.kk.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101, "Puja", "800000"));
		emp.add(new Employee(105, "Arti", "500000"));
		emp.add(new Employee(106, "Priyanka", "600000"));
		emp.add(new Employee(102, "Kunal", "900000"));
		emp.add(new Employee(104, "Akash", "700000"));
		emp.add(new Employee(103, "Sujata", "200000"));

		Collections.sort(emp);
		emp.forEach(em -> {
			System.out.println("Id :" + em.getEmpId());
		});

	}
}
