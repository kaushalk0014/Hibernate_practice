package com.kk.interview;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter First No.");
		int a=scn.nextInt();
		System.out.println("Enter Second No.");
		int b=scn.nextInt();
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	//30=20+10
		a=a+b;
		//20=30-10
		b=a-b;
		a=a-b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
