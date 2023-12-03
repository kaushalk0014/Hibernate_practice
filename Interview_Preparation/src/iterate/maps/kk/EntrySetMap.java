package iterate.maps.kk;

import java.util.HashMap;
import java.util.Map;

public class EntrySetMap {

	public static void main(String[] args) {
		Map<Integer, String> students = new HashMap<>();
		students.put(1, "Anamika");
		students.put(2, "Bhaskar");
		students.put(3, "Rahul");

		students.entrySet().stream().forEach((e) -> {
			System.out.println("Key : " + e.getKey() + " value : " + e.getValue());
		});
	}
}
