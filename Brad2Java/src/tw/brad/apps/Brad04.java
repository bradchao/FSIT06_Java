package tw.brad.apps;

import tw.brad.myjava.Brad24;

public class Brad04 {
	public static void main(String[] args) {
		String s1 = new String();
		byte[] b1 = {97, 98, 99, 100};
		String s2 = new String(b1);
		String s3 = new String(b1,1,2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		Brad24 b2 = new Brad24();
		System.out.println(b2);
	}
}
