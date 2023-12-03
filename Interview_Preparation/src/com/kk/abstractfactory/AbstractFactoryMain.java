package com.kk.abstractfactory;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		AbstractFactoty abstractFactoty=AbstractFactoryProduce.getProfession(true);
		Profession profession=abstractFactoty.getProfaction("Doctor");
		profession.print();
	}
}
