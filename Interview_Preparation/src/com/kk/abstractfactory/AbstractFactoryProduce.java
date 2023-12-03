package com.kk.abstractfactory;

public class AbstractFactoryProduce {

	public static AbstractFactoty getProfession(boolean isTrainee) {
		if (isTrainee) {
			return new TraineeProfassionAbstractFactory();
		} else {
			return new ProfassionAbstractFactory();
		}
	}
}
