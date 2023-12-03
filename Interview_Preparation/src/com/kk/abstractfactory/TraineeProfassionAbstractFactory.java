package com.kk.abstractfactory;

public class TraineeProfassionAbstractFactory extends AbstractFactoty{

	@Override
	Profession getProfaction(String typeOfProfession) {
		if (typeOfProfession == null) {
			return null;
		} else if (typeOfProfession.equals("Doctor")) {
			return new TraineeDoctor();
		} else if (typeOfProfession.equals("Engineer")) {
			return new TraineeEngineer();
		} else if (typeOfProfession.equals("Teacher")) {
			return new TraineeTeacher();
		}
		return null;
	}
}
