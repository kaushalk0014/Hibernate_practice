package com.kk.Java8Example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListInteger {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 22, 55, 44, 66, 22, 11, 33, 55, 44);
		List<Integer> listStream = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

		Collections.sort(list);
		System.out.println("list.sort(Comparator.naturalOrder());");
		list.sort(Comparator.naturalOrder());
		list.forEach(System.out::println);
		System.out.println("stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList())");
		listStream.forEach(System.out::println);
		
		List<Integer> list2 = Arrays.asList(10, 22, 55, 44, 66, 22, 11, 33, 55, 44);
		Collections.sort(list2);
		
		System.out.println("Collections.sort(list2);");
		list2.forEach(System.out::println);

	}
}
