package com.kk.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student(101, "Puja"));
		list.add(new Student(106, "Puja"));
		list.add(new Student(104, "Puja"));
		list.add(new Student(103, "Puja"));
		list.add(new Student(102, "Puja"));
		
		
		Comparator<Student> newList=new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getStdId()-o1.getStdId();
			}
		};
		Collections.sort(list,newList);
		list.forEach(l->{
			System.out.println(l.getStdId());
		});
	}
}
