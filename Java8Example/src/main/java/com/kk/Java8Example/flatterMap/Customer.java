package com.kk.Java8Example.flatterMap;

import java.util.List;

public class Customer {

	private Integer id;
	private String name;
	private String email;
	private List<String> mpbile;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getMpbile() {
		return mpbile;
	}

	public void setMpbile(List<String> mpbile) {
		this.mpbile = mpbile;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer id, String name, String email, List<String> mpbile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mpbile = mpbile;
	}

}
