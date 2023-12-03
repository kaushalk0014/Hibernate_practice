package com.kk.interview;

import java.nio.charset.StandardCharsets;

public class ByteArrayToString {

	public static void main(String[] args) {
		byte[] byteArray= {'K','A','U','S','H','A','L'};
		byte[] arr= {75, 65, 85, 83, 72, 65, 76};
		
		String str = new String(byteArray);
		String str1 = new String(arr);

		String str2	 = new String(byteArray, StandardCharsets.UTF_8);
		String str3 = new String(arr, 0, 3, StandardCharsets.UTF_8);
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
