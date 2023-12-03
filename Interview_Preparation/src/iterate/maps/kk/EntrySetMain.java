package iterate.maps.kk;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetMain {

	public static void main(String[] args) {
		Map<Integer, String> students = new HashMap<>();
		students.put(1, "Anamika");
		students.put(2, "Bhaskar");
		students.put(3, "Rahul");

		Set<Entry<Integer, String>> set=students.entrySet();
		set.forEach((entry)->{
			System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
		});
		for (Map.Entry<Integer, String> entry : students.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
		}
	}
}
