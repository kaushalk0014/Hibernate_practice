package iterate.set.kk;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("ss");
		//System.out.println(set);
		
		Map<String,String> map=new HashMap<>();
		map.put("AA", "Kaushal");
		map.put("AA", "Test");
		//System.out.println(map);
		map.forEach((key,value)->{
			System.out.println(key);
			System.out.println(value);
		});
		
		
	}
}
