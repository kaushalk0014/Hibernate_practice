package com.kk.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {

		List<String> stringList = new ArrayList<>();
		stringList.add("ank");
		stringList.add("sam");
		stringList.add("az");
		stringList.add("neh");
		stringList.add("ad");

		Stream<String> ss = stringList.stream().filter((s) -> s.startsWith("a")).sorted((a, b) -> b.compareTo(a));

		ss.forEach(sss -> {
			System.out.println(sss);
		});

		Stream<Integer> stramInt = Stream.of(11, 11, 23, 25);
		Optional<Integer> intA=stramInt.reduce((i1, i2) -> i1 + i2);
		System.out.println(intA.get());

	}

}
