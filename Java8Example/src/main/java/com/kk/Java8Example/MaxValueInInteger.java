package com.kk.Java8Example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class MaxValueInInteger {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,25,14,145,25,16,18,19,15);
		Integer max=list.stream().mapToInt(a->a).max().getAsInt();
		System.out.println(max);
		
		
		Optional<Integer> maxValue=list.stream().max(Integer::compare);
		
		
		System.out.println(maxValue.isPresent()?maxValue:Integer.MAX_VALUE);
		
		System.out.println(list.stream().count());
		
		
		List<Integer> newList=list.stream().filter(a->a>19).collect(Collectors.toList());
		System.out.println(newList);
		
		System.out.println("-----------------------------");
		 list.stream().distinct().forEach(System.out::println);
	}
}
