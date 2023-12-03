package iterate.maps.kk;

import java.util.HashMap;
import java.util.Map;

public class IterationDemo {

	public static void main(String[] args) {
		Map<String, String> xyz = new HashMap<String, String>();
		xyz.put("xyz", "Alphabet.org");
		xyz.put("Pronounce", "words.org");
		
		for (String string : xyz.keySet()) {
			System.out.println("key :"+  string);
		}
		
		for (String string : xyz.values()) {
			System.out.println("values :"+  string);
		}
	}
}
