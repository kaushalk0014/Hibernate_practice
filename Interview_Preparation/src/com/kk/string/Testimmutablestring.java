package com.kk.string;

public class Testimmutablestring {

	public static void main(String[] args) {
		String k="kaushal";
		k.concat("kumar");
		String ss=k.concat("kumar");
		
		 
		System.out.println(k);
		System.out.println(ss);
		StringBuffer buffer=new StringBuffer("kaushal");
		buffer.insert(1, true);
		System.out.println(buffer);
		
		StringBuffer bufferCapacity=new StringBuffer();
		System.out.println("Capacity 1: "+bufferCapacity.capacity());
		bufferCapacity.append("kumar");
		System.out.println("Capacity 2: "+bufferCapacity.capacity());
		bufferCapacity.append("java is my favourite language"); 
		System.out.println("Capacity 3: "+bufferCapacity.capacity());
	
	}
}
