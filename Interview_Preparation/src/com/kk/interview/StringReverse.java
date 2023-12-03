package com.kk.interview;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner  scn=new Scanner(System.in);
		System.out.println("Enter your String : ");
		String str=scn.nextLine();
		
		for (int i = str.length()-1;i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
