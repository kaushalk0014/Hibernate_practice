package com.kk.comparetwolist;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestApp {
		
	public static void main(String[] args) {
		List<Employee11> employees=Arrays.asList(new Employee11(101, "Kaushal")
				,new Employee11(102, "Rohan"),new Employee11(105, "Dinesh"));
		
		Map<Integer,Employee11> map=employees.stream().collect(Collectors.toMap(Employee11::getId, Function.identity()));
	
		map.forEach((k,v)->System.out.println("Key= "+ k+"   Value="+  v));
	}
	
}


class Employee11{
	
	private Integer id;
	private String name;
	
	public Employee11() {
		 
	}
	public Employee11(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
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
	
	
	
}