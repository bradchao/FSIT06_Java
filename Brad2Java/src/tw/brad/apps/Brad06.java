package tw.brad.apps;

import tw.brad.myjava.TWId;

public class Brad06 {

	public static void main(String[] args) {
		TWId id1 = new TWId();
		TWId id2 = new TWId(false);
		TWId id3 = new TWId(4);
		TWId id4 = new TWId(true, 17);
		TWId id5 = TWId.createTWId("Y120239848");
		
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		
		if (id5 != null) {
			System.out.println(id5.getId());	
		}else {
			System.out.println("xxx");
		}
		
		
//		if (TWId.checkId("A123456789")) {
//			System.out.println("OK");
//		}else {
//			System.out.println("XX");
//		}
	}

}
