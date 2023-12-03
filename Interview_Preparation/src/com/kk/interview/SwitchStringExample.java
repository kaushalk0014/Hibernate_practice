package com.kk.interview;

public class SwitchStringExample {

	void printColorUsingIf(String color) {
		if ("red".equals(color)) {
			System.out.println("RED");
		} else if ("green".equals(color)) {
			System.out.println("GREEN");
		} else if ("blue".equals(color)) {
			System.out.println("BLUE");
		}
	}

	void printColorUsingSwitch(String color) {
		if(color==null||color.equals(""))
			return;
		switch (color) {
		case "red":
			System.out.println("RED");
			break;
		case "green":
			System.out.println("GREEN");
			break;
		case "blue":
			System.out.println("BLUE");
			break;
		default:
			System.out.println("INVALID COLOR CODE");
		}
	}
	public static void main(String[] args) {
		SwitchStringExample printColorUsingIf =new SwitchStringExample();
		printColorUsingIf.printColorUsingIf("green");
		printColorUsingIf.printColorUsingSwitch("");
	}
}
