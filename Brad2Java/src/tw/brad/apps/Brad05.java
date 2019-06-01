package tw.brad.apps;

import tw.brad.myjava.Brad25;

public class Brad05 {
	public static void main(String[] args) {
		String s1 = "Brad";
		String s2 = "Brad";
		System.out.println(s1 == s2);
		String s3 = new String("Brad");
		String s4 = new String("Brad");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		int a = 10, b = 10;
		
		Brad25 obj1 = new Brad25();
		Brad25 obj2 = new Brad25();
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		
		
	}
}
