package iterate.maps.kk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FinalCountWords {

	public static void test11() {
		String str = "This this is is done by Saket Saket";
		String[] strArr = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < strArr.length; i++) {
			if (map.containsKey(strArr[i])) {
				map.put(strArr[i], map.get(strArr[i]) + 1);
			} else {
				map.put(strArr[i], 1);
			}
		}

		System.out.println(map);

	}

	public static void test() {
		Arrays.asList(1, 2, 4, 2, 4, 6, 7, 9, 1, 2);
		Integer inArr[] = { 1, 2, 4, 2, 4, 6, 7, 9, 1, 2 };

		Map<Integer, Integer> map = new HashMap();
		for (int i = 0; i < inArr.length; i++) {
			if (map.containsKey(inArr[i])) {
				map.put(inArr[i], map.get(inArr[i]) + 1);
			} else {
				map.put(inArr[i], 1);
			}
		}

		map.forEach((a, b) -> {
			System.out.println(a + "  " + b);
		});

		System.out.println("-------------------------------------");
	}

	public static void test1() {
		System.out.println("----------start---------------------------");
		List<String> list = new ArrayList<>(Arrays.asList("aa", "bbb", "cat", "dog", "def"));
		List<String> filterList = list.stream().filter(a -> (a.startsWith("a") || a.startsWith("d")))
				.collect(Collectors.toList());

		filterList.stream().forEach(s -> System.out.println(s));
		System.out.println("----------end---------------------------");
	}

	public static void test2() {
		System.out.println("----==========================---");
		List<String> stringList = new ArrayList<>();
		stringList.add("ank");
		stringList.add("sam");
		stringList.add("ank");
		stringList.add("neh");
		stringList.add("ank");
		List<String> sortedList = stringList.stream().distinct().collect(Collectors.toList());
		sortedList.stream().forEach(s -> System.out.println(s));
	}

	public static void sortUsing8() {
		System.out.println("----=======test3()===================---");
		List<Employee> stringList = new ArrayList<Employee>();
		stringList.add(new Employee(101, "Puja"));
		stringList.add(new Employee(201, "Kaushal"));
		stringList.add(new Employee(101, "Puja"));
		stringList.add(new Employee(106, "Rahul"));
		stringList.add(new Employee(109, "Rohan"));
		Set<Employee> sortData=stringList.stream()
        .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Employee::getId))));
		sortData.forEach(aa->System.out.println(aa));
	}
	
	public static void test4() {
		System.out.println("----=======test3()===================---");
		List<Employee> stringList = new ArrayList<Employee>();
		stringList.add(new Employee(101, "Puja"));
		stringList.add(new Employee(201, "Kaushal"));
		stringList.add(new Employee(101, "Puja"));
		stringList.add(new Employee(106, "Rahul"));
		stringList.add(new Employee(109, "Rohan"));
		Set<Employee> set=new HashSet<Employee>(stringList);
		set.forEach(emp->
			System.out.println(emp)
		);
	}
	
	
	public static void test5() {
		System.out.println("----=======test3()===================---");
		List<Employee> stringList = new ArrayList<Employee>();
		stringList.add(new Employee(101, "Puja"));
		stringList.add(new Employee(201, "Kaushal"));
		stringList.add(new Employee(101, "Puja"));
		stringList.add(new Employee(106, "Rahul"));
		stringList.add(new Employee(109, "Rohan"));
		 
		Map<Integer,Employee> map=new HashMap<>();
		for(Employee emp:stringList) {
			map.put(emp.getId(), emp);
		}
		
		map.forEach((a,b)->{
			System.out.println(a  +"     "+b);
		});
	}
	
	public static void ListToMap() {
		System.out.println("----=======ListToMap()===================---");
		List<Employee> stringList = new ArrayList<Employee>();
		//stringList.add(new Employee(101, "Puja"));
		stringList.add(new Employee(201, "Kaushal"));
		stringList.add(new Employee(101, "Puja"));
		stringList.add(new Employee(106, "Rahul"));
		stringList.add(new Employee(109, "Rohan"));
		Map<Integer,Employee> map=stringList.stream().collect(Collectors.toMap(Employee::getId,  Function.identity()));
		map.forEach((a,b)->{
			System.out.println(a  +"     "+b);
		});
	}
	
	public static void sotrUsing8() {
		System.out.println("----=======sotrUsing8()===================---");
		List<Integer> list=Arrays.asList(1, 2, 4, 2, 4, 6, 7, 9, 1, 2);
		List<Integer> listSort=list.stream().sorted().collect(Collectors.toList());
		listSort.forEach(num->System.out.println(num));
	}
	
	public static void sotrUsing8ReverseOrder() {
		System.out.println("----=======sotrUsing8ReverseOrder()===================---");
		List<Integer> list=Arrays.asList(1, 2, 4, 2, 4, 6, 7, 9, 1, 2);
		List<Integer> listSort=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		listSort.forEach(num->System.out.println(num));
	}
	public static void sotrUsing8CustomeObject() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "Puja"));
		list.add(new Employee(201, "Kaushal"));
		list.add(new Employee(101, "Puja"));
		list.add(new Employee(106, "Rahul"));
		list.add(new Employee(109, "Rohan"));
		
		List<Employee> sortedList=list.stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toList());
		
		sortedList.stream().forEach(a->System.out.println(a));
		
	}
	
	public static void sortedListUsingIf() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "Puja"));
		list.add(new Employee(201, "Kaushal"));
		list.add(new Employee(101, "Puja"));
		list.add(new Employee(106, "Rahul"));
		list.add(new Employee(109, "Rohan"));
		
		list.stream().sorted((o1,o2)->{
			if(o1.getId()==o2.getId()) {
				//return o1.getName().compareTo(o2.getName());
				 return 0;
			}else if(o1.getId()==o2.getId()) {
				   return 1;
			}else {
				   return -1;
			}
		}).collect(Collectors.toList());
		list.stream().forEach(a->System.out.println(a));
	}
	
	public static void main(String[] args) {
		sotrUsing8CustomeObject();
	}

}
