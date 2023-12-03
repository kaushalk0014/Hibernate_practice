package com.kk.removedublicate;

public class Customer implements Comparable<Customer>{
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
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}
	@Override
	public int compareTo(Customer o) {
		 
		return this.name.toUpperCase().compareTo(o.getName().toUpperCase());
	}
	
}
