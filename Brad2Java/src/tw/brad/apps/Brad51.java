package tw.brad.apps;

import java.util.HashMap;
import java.util.Map;

public class Brad51 {
	public static void main(String[] args) {
		Map<String,Object> person = new HashMap();
		person.put("name", "Brad");
		person.put("age", 18);
		person.put("gender", true);
		
		System.out.println(person.get("name"));
		System.out.println(person.size());
		person.put("age", 20);
		System.out.println(person.get("age"));
		
		HashMap<String,Integer> point = new HashMap<>();
		point.put("x", 123);
		point.put("y", 321);
		
		
		
		
		
		
		
	}
}
