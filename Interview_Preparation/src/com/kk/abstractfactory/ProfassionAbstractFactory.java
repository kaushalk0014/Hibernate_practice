package com.kk.abstractfactory;

public class ProfassionAbstractFactory extends AbstractFactoty {

	@Override
	Profession getProfaction(String typeOfProfession) {
		if (typeOfProfession == null) {
			return null;
		} else if (typeOfProfession.equals("Doctor")) {
			return new Doctor();
		} else if (typeOfProfession.equals("Engineer")) {
			return new Engineer();
		} else if (typeOfProfession.equals("Teacher")) {
			return new Teacher();
		}
		return null;
	}

}
