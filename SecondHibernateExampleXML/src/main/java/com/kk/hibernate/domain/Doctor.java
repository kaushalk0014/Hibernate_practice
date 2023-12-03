package com.kk.hibernate.domain;

public class Doctor {

	private Integer docId;
	private String name;
	private String salary;

	public Doctor() {
		System.out.println("--------------Doctor------------------");
	}

	public Doctor(Integer docId, String name, String salary) {
		super();
		this.docId = docId;
		this.name = name;
		this.salary = salary;
	}

	public Integer getDocId() {
		return docId;
	}

	public void setDocId(Integer docId) {
		this.docId = docId;
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

}
