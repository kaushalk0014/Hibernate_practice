package com.kk.string;

public class ReverseEachWord {
	
	public static String reverseEachWord(String str) {
		StringBuffer reverseWord=new StringBuffer();
		
		String strArr[]=str.split("\\s");
		for (String string : strArr) {
			StringBuffer buffer=new StringBuffer(string+" ");
			reverseWord.append(buffer.reverse());
		}
		
		return reverseWord.toString();
	}
	
	public static void main(String[] args) {
		String word=ReverseEachWord.reverseEachWord("kaushal kumar");
		System.out.println("Reverse Word:  "+word);
	}
}
