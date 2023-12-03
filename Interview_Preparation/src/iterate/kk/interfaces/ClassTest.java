package iterate.kk.interfaces;

public class ClassTest implements MultipleInterface {

	@Override
	public void printP() {
		System.out.println("ClassTest");

	}

	public static void main(String[] args) {
		Test2 t1 = new ClassTest();
		t1.printP();
	}

}
