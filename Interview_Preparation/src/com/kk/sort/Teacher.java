package com.kk.sort;

import java.util.Comparator;

public class Teacher {
	private String name;
	private Integer age;

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

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}
}
