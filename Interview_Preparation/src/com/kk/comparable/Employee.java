package com.kk.comparable;

public class Employee implements Comparable<Employee> {

	private Integer empId;
	private String name;
	private String salary;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		return this.empId-o.getEmpId();
	}

	public Employee(Integer empId, String name, String salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
}
