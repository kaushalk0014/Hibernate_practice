package com.kk.spring.immutable;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		TestClass.method();

	}

	private static void method() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number of days");
		int t = scanner.nextInt();
		if (t > 0) {
			for (int i = 0; i < t; i++) {
				System.out.println("Please enter number of subjects offered on that day");
				int subject = scanner.nextInt();
				for (int j = 0; j < subject; j++) {
					System.out.println("Please enter number of subject");
				}
			}

		}

	}

}
