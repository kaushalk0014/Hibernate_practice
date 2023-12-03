package iterate.kk.interfaces;

interface Test1 {


	static void printP() {
		System.out.println("interface Test1 ");
	}
}

interface Test2 {
	void printP();
}

interface Test3 {
	void printP();
}

public interface MultipleInterface extends Test1, Test2, Test3 {
	void printP();
}
