package com.kk.interview;

public class PalindromeString {
	Boolean isPalindromeString(String str) {
		if(str==null||str.equals("")) {
			return false;
		}
		int strLength=str.length();
		for (int i = 0; i < strLength/2; i++) {
			if(str.charAt(i)!=str.charAt(strLength-i-1)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Is palindrom :   "
	+new PalindromeString().isPalindromeString("ABcBA"));
	}
}
