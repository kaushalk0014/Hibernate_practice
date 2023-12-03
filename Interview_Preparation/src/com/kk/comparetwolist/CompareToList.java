package com.kk.comparetwolist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CompareToList {
	
	public static void main(String[] args) {
		
		
		Object obj[]=  {10};
		
		System.out.append('c');
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101,"kaushal"));
		list.add(new Employee(105,"kaushal"));
		list.add(new Employee(104,"kaushal"));
		list.add(new Employee(102,"kaushal"));
		list.forEach(System.out::println);
		System.out.println("---------------------");
		List<Employee> newList=list.stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toList());
		newList.forEach(System.out::println);
		
		Map<Integer,Employee> map=list.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
		map.forEach((a,b)->System.out.println("Key= "+a+", Value="+b));
		System.out.println("---------------------");
		Map<Integer,Employee> newMap=map.entrySet().stream().filter(map1->map1.getKey()>103).
		collect(Collectors.toMap(map1->map1.getKey(),map1-> map1.getValue()));
		newMap.forEach((a,b)->System.out.println("Key= "+a+", Value="+b));
		
	
	}

}

class Employee{
	private Integer id;
	private String name;
	
	
	@Override
	public String toString() {
		return  "id="+id + ", name=" + name;
	}
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}





class A
{
    void m1()
    {
        System.out.println("In m1 A");
    }
}
class B extends A
{
    void m1()
    {
        System.out.println("In m1 B");
    }
    void m2()
    {
        System.out.println("In m2 B");
    }
}
class Test {
 
    public static void main(String[] args) {
        A a=new B();
     
    }
}
