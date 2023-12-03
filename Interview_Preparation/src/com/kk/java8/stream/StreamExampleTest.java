package com.kk.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExampleTest {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			myList.add(i);
		}
		Stream<Integer> strean=myList.stream();
	 
		Stream<Integer> parallelStream=myList.parallelStream();
		Stream<Integer> highNums=null;
		//highNums=strean.filter(p->p>20).limit(9);
		//highNums=strean.filter(p->p>20).sorted();
		long count=strean.filter(p->p>20).count();
		System.out.println(count);
		highNums.forEach(p->{
			System.out.println(p);
		});
		System.out.println("parallelStream :"+parallelStream);
	}
}
