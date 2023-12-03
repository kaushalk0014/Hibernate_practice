package com.kk.reveseword;

import java.util.Scanner;

public class ReveseWord {
	
	public static void main(String[] args) {
		System.out.println("Reverse word");
		String reverseWord="";
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter word");
		String word=s.nextLine();
		String wordArr[]=word.split("\\s");
		
		for (String string : wordArr) {
			StringBuffer buffer=new StringBuffer(string);
			buffer.reverse();
			reverseWord+=buffer.toString()+" ";
		}
		
		
		System.out.println("ReverseWord   "+reverseWord);
		
		
	}
}
