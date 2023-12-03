package com.kk.interview;

public class StringSubsequence {

	public static void main(String[] args) {
		String str = "www.journaldev.com";
		System.out.println("substring  " + (str.substring(4, 14) ));
		System.out.println("SubSequence " + str.subSequence(4, 14));
		System.out.println("substring == subSequence ? " + 
		(str.substring(4, 14) == str.subSequence(4, 14)));
	}
}
