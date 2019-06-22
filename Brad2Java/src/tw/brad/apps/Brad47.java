package tw.brad.apps;

import java.util.HashSet;
import java.util.Iterator;

public class Brad47 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("Brad");
		set.add(123);	// auto-boxing => Integer Object
		set.add(12.3);
		System.out.println(set.size());
		set.add("Brad");
		set.add("Peter");
		System.out.println(set.size());
		System.out.println(set.toString());
		
		
		Iterator it =  set.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		
		
		
	}
}
