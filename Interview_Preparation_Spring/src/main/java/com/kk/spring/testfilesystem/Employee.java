package com.kk.spring.testfilesystem;

import java.io.Serializable;

public class Employee implements Serializable{
	private String name;
	private String mobileNo;
	private String salary;

	public Employee(String name, String mobileNo) {
		this.name = name;
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	
	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", mobileNo=" + mobileNo + "]";
	}

}
