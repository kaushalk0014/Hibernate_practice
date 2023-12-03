package com.kk.SingleObject;

public class SingleObjectTest {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(SingleObject.getMyInstance().hashCode());
		Class clas = Class.forName("com.kk.SingleObject.SingleObject");

		System.out.println(clas.hashCode());
	}
}
