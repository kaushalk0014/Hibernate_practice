package com.kk.Java.interview;

public class MainTest {
	public static void main(String[] args) {
		
	       
		Employee e1 = new Employee("John" , 30);
		Employee e2 = new Employee("Peter" , 32);
		e2.department = "Software Development";
		e1 = e2;
	 
		System.out.println(e1.name);
		System.out.println(e1.age);
	
		
		System.out.println(e1.department);
		 
        e1.department = "S2";
	 
		
		System.out.println(e2.department);
		 
    }

}

class Employee {
	public String name;
	public String department;
	public Integer age;
	public Employee(String name,Integer age) {
		 this.name=name;
		 this.age=age;
	}

}