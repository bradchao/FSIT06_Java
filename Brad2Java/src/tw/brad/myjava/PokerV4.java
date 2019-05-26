package tw.brad.myjava;

import java.util.Collections;
import java.util.LinkedList;

public class PokerV4 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		LinkedList<Integer> poker = new LinkedList<>();		
		for (int i=0; i<52; i++) poker.add(i);
		Collections.shuffle(poker);
		Object[] p = poker.toArray();
		for (Object v : p) {
			System.out.println(v);
		}
		System.out.println("---");
		System.out.println(System.currentTimeMillis()-start);
		
	}

}
