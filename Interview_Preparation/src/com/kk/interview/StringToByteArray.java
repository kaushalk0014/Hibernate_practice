package com.kk.interview;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringToByteArray {

	public static void main(String[] args) {
		String name="KAUSHAL";
		byte[] byteArr = name.getBytes(StandardCharsets.UTF_8);
		byte[] arr=name.getBytes();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr);
		System.out.println(Arrays.toString(byteArr));
	}
}
