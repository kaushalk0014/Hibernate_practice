package com.kk.convert;

public class StringToInt {

	public static void main(String[] args) {
		myConvertStringToInt("12345");
	}

	private static void myConvertStringToInt(String string) {
		int num = 0;
		int len = string.length();

		for (int i = 0; i < len; i++) {
			num = num * 10 + ((int) string.charAt(i) - 48);
			System.out.println(((int) string.charAt(i) - 48));
		}
		System.out.println(num);
	}
}
