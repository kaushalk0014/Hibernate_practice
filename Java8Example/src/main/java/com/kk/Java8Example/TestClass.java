package com.kk.Java8Example;

 
public class TestClass {
	
	
	 public static void recursivePrint(int num1) {
		 System.out.println(num1);
		 if(num1==0)
			 return;
		 else
			 recursivePrint(++num1);
	 }
	
	public static void main(String[] args) {
		recursivePrint(1);
	}
}
