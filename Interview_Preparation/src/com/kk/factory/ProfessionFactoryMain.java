package com.kk.factory;

public class ProfessionFactoryMain {
	public static void main(String[] args) {
		ProfessionFactory factory=new ProfessionFactory();
		Profession profession=factory.getProfession("Doctor");
		profession.print();
	}
}
