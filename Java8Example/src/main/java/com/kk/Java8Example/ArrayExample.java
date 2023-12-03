package com.kk.Java8Example;

import java.util.Scanner;

public class ArrayExample {
	private static int countNumFinger(int num) {
		
		num = num % 5; 
		if (num == 1) 
			return num; 
		if (num == 5) 
			return num; 
		if (num == 0 || num == 2) 
			return 2; 
		if (num == 3 || num == 7) 
			return 3; 
		if (num == 4 ||num == 6) 
			return 4; 
		return 0;
	}
	public static void main(String[] args) {
		
		int cc=ArrayExample.countNumFinger(15);
		System.out.println(cc);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter size:");
		 
		Employee1 emp[]=new Employee1[10];
		for (int i = 0; i < emp.length; i++) {
			Employee1 oo=emp[i];
			oo=new Employee1(1110);
			System.out.println(oo);
		}
		
	}
}

/**
 * @author kaushal
 *
 */
class Employee1{
	private Integer id;

	public Employee1(Integer in){
		this.id=in;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
