package com.kk.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SortCustomeMap {
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(108, "Puja", "800000"));
		emp.add(new Employee(105, "Arti", "500000"));
		emp.add(new Employee(106, "Priyanka", "600000"));
		emp.add(new Employee(102, "Kunal", "900000"));
		emp.add(new Employee(104, "Akash", "700000"));
		emp.add(new Employee(103, "Sujata", "200000"));

		Map<Object, Employee> map = emp.stream().collect(Collectors.toMap(e -> e.getId(), Function.identity()));
		map.forEach((k, v) -> System.out.println("Key  " + k + "   Value  :" + v));

		Map<Integer, Employee> empMap = new HashMap<>();
		System.out.println("-------------------------------------------");
		empMap.put(108,new Employee(108, "Puja", "800000"));
		empMap.put(108,new Employee(110, "Puja", "80000"));
		empMap.put(105,new Employee(105, "Arti", "500000"));
		empMap.put(106,new Employee(106, "Priyanka", "600000"));
		empMap.put(102,new Employee(102, "Kunal", "900000"));
		empMap.put(104,new Employee(104, "Akash", "700000"));
		empMap.put(103,new Employee(103, "Sujata", "200000"));
		
		Map<Integer, Employee> result = empMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		result.forEach((k,v)->System.out.println(" Key : "+k+"  Value  :"+v));

		Map<Integer, Employee>  newResult=
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
				(oldValue,n)->oldValue,LinkedHashMap::new));
		
		
		
		
		List<Employee> mapToList = new ArrayList( empMap.values());
		
		Collections.sort(mapToList,Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
		
		mapToList.forEach(a->System.out.println(a.getId()));
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		mapToList.stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toList());
		
		String str="system";
		
		str.chars().boxed()
		.collect(Collectors.toMap(k->Character.valueOf((char)k.intValue()),
				v->1,Integer::sum));
		
		
		
	
	
	}
}


