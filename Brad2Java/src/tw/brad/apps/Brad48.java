package tw.brad.apps;

import java.util.TreeSet;

public class Brad48 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		while (set.size()<6) {
			int rand = (int)(Math.random()*49+1);
			set.add(rand);
		}
		System.out.println(set.toString());
		
		for (Integer i : set) {
			System.out.println(i);
		}
		
		
	}

}
