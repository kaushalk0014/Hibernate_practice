package com.kk.Java8Example.flatterMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyDB {
    public static List<Customer> getAll(){
    	return Stream.of(
    			new Customer(101, "kaushal", "kaushal@gmail.com", Arrays.asList("4257854258","7584512569")),
    			new Customer(105, "Rakesh", "Rakesh@gmail.com", Arrays.asList("7957854258","8884512569")),
    			new Customer(105, "Dinesh", "Dinesh@gmail.com", Arrays.asList("7857854258","8584512569")),
    			new Customer(105, "Rohan", "Rohan@gmail.com", Arrays.asList("9657854258","7584512569")),
    			new Customer(108, "Roshan", "Roshan@gmail.com", Arrays.asList("4557854258","7284512569"))   				
    		).collect(Collectors.toList());
    }
}
