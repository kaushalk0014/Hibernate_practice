package com.kk.SingleObject;

public class ASingleton2 {

	private static volatile ASingleton2 instance;
	private static Object mutex = new Object();

	private ASingleton2() {
	}

	public static ASingleton2 getInstance() {
		ASingleton2 result = instance;
		if (result == null) {
			synchronized (mutex) {
				result = instance;
				if (result == null)
					instance = result = new ASingleton2();
			}
		}
		return result;
	}

}