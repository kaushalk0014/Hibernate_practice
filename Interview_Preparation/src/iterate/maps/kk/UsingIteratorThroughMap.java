package iterate.maps.kk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class UsingIteratorThroughMap {
	public static void main(String[] args) {

		Map<Integer, String> Students = new HashMap<>();
		Students.put(1, "Anamika");
		Students.put(2, "Bob");
		Students.put(3, "Mary");
		Students.forEach((id,name)->{
			System.out.println("id  :"+id+"  Name  :"+name);
		});
		System.out.println("---------------------------");
		Iterator<Map.Entry<Integer, String>> map=Students.entrySet().iterator();
		
		while (map.hasNext()) {
			Map.Entry<Integer, String> entry=map.next();
			System.out.println("id :  "+entry.getKey() +"  value  :"+entry.getValue());
			
		}
	}
}
