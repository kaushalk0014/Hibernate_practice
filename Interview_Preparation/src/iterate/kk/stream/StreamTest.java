package iterate.kk.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest {

	public static void main(String... strings) {
		List<Integer> list = Arrays.asList(1, 22, 15, 23, 45, 44);
		list.stream().filter(x -> x > 23).forEach(p -> System.out.println(p));
		System.out.println("---------------------------------------------");
		int a = list.stream().filter(x -> x > 23).mapToInt(y -> y).sum();
		System.out.println(a);
		System.out.println("---------------------------------------------");
		int b = list.stream().filter(x -> x > 23).mapToInt(y -> y * y).sum();
		System.out.println(b);

		List<String> string = new ArrayList<>();
		string.add("kaushal");
		string.add("Aarsh");
		string.add("puja");
		string.add("Sujata");
		
		//string.stream().filter(s->s.toUpperCase()).forEach();
	}
}
