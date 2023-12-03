package com.kk.Java8Example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestClassApp extends Thread{

	public static void main(String[] args) {
		TestClassApp app=new TestClassApp();
		
		Thread thread=new Thread(app);
		thread.start();
	}

	/*
	 * public static synchronized void testMethod() {
	 * 
	 * }
	 */
	
	 @Override
	public void run() {
		 this.testMethod2();
	}

	public void testMethod2() {
		synchronized (this) {
			Integer intArr[] = { 12, 25, 14, 42, 45, 78, 77, 79, 46, 28, 28 };

			/*
			 * for (int i = 0; i < intArr.length; i++) { if(intArr[i]%2==0) {
			 * System.out.println("Even Number" +intArr[i]); }else {
			 * System.out.println("Odd Number" +intArr[i]); } }
			 */

			List<Integer> list = Arrays.asList(intArr);

			 
			
			Collections.sort(list,Comparator.comparingInt(null));

			System.out.println("-----------------------------------Even-------------------------");
			List<Integer> listEven = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
			listEven.forEach(ev -> System.out.println("Even Numebr :" + ev));

			System.out.println("-----------------------------------Odd-------------------------");
			List<Integer> listOdd = list.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
			listOdd.forEach(ev -> System.out.println("Odd Numebr:" + ev));
		}

	}

}
