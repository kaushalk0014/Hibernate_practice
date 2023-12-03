package com.kk.interview;


public class CustomeAnnotaion {

	@MyAnnotation
	String username;
	
	public static void main(String[] args) {
		CustomeAnnotaion annotaion=new CustomeAnnotaion();
		System.out.println(annotaion.username);
	}
}

