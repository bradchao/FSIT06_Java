package tw.brad.apps;

import tw.brad.myjava.TWId;

public class Brad06 {

	public static void main(String[] args) {
		String a = "@123456789".substring(0, 1);
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		if (letters.contains(a)) {
			System.out.println("exist");
		}
		
		if (TWId.checkId("Brad")) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}

}
