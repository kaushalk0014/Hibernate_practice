package com.kk.removeduplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("aa", "bbb", "cat", "dog", "def"));

		list.forEach(a -> {
			if (a.contains("a") || a.contains("d")) {
				System.out.println(a);
			}
		});
		
		List<String> filter=list.stream().filter(na->na.startsWith("a")).collect(Collectors.toList());
		
		System.out.println(filter);
	}
}
