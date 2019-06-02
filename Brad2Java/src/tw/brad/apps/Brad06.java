package tw.brad.apps;

import tw.brad.myjava.TWId;

public class Brad06 {

	public static void main(String[] args) {
		if (TWId.checkId("A123456789")) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}

}
