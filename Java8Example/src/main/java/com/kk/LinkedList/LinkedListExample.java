package com.kk.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(12);
		list.add(34);
		list.add(55);
		list.add(33);
		list.add(76);
		list.add(23);
		
		int a=list.indexOf(55);
		System.out.println(a);
		
		ListIterator<Integer> lista=list.listIterator(a);
		LinkedList<Integer> ll1 = new LinkedList<>();
		lista.forEachRemaining(ll1::add);
		
		list.descendingIterator().forEachRemaining(ll1::add);
		
		System.out.println(ll1);
	}
}
