package com.kk.comparator;

public class Student {
	private Integer stdId;
	private String name;

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(Integer stdId, String name) {
		super();
		this.stdId = stdId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + "]";
	}

}
