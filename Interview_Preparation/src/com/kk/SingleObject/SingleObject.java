package com.kk.SingleObject;

import java.io.Serializable;

public class SingleObject implements Serializable {

	private static SingleObject singleObject=new SingleObject();
	
	private SingleObject() {
		 if (singleObject != null)
		        throw new IllegalStateException("Only one instance may be created");
		    System.out.println("Object is created.");
	}
	
	public static SingleObject getMyInstance() {
		return singleObject;
	}
	
	protected  void readResolve() {
		getMyInstance();
	}
}
