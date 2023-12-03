package com.kk.Java8Example;

public class StringEvenWord {

	public static void main(String[] args) {
		String santance="hello how are you Puja  ASDF66 ASD4 ASD ASDF5";
		
		String strArr[]=santance.split(" ");
		String result=null;
		for (int i = 0; i < strArr.length-1; i++) {
				int temp=0;
				if(strArr[i].length()%2==0) {
					if(temp>strArr[i+1].length()) {
						temp=strArr[i].length();
						result=strArr[i];
					}else {
						
					}
				}
		}
		
		System.out.println(result);
	}
}
