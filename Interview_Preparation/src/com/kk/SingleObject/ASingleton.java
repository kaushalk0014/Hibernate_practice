package com.kk.SingleObject;

public class ASingleton {

	private static ASingleton instance = null;

	private ASingleton() {

	}

	public static ASingleton getMyInstance() {
		if (instance == null) {
			instance = new ASingleton();
		}
		return instance;
	}
}
