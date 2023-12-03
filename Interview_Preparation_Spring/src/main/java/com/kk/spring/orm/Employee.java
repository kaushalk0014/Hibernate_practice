package com.kk.spring.orm;

import org.hibernate.annotations.Entity;

@Entity
public class Employee {
	private Long emplId;
	private String name;
	private String mobileNo;
	private String panNo;
	private String salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String mobileNo) {
		this.name = name;
		this.mobileNo = mobileNo;
	}
	public Employee(String name, String mobileNo, String panNo, String salary) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.panNo = panNo;
		this.salary = salary;
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

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}
