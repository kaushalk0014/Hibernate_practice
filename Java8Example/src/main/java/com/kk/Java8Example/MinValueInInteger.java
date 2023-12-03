package com.kk.Java8Example;

import java.util.Arrays;
import java.util.List;

public class MinValueInInteger {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(125,142,15,24,2,36,58,97,58,5,8,58,68,55);
		
			Integer min=list.stream().mapToInt(a->a).min().getAsInt();
			System.out.println(min);
	}
}
