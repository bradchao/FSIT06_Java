package tw.brad.apps;

public class Brad07 {

	public static void main(String[] args) {
		String str1 = "A";
		String str2 = str1.concat("B");
		System.out.println(str1);
		System.out.println(str2);
		String str3 = "Hello, World";
		byte[] buf = str3.getBytes();
		for (byte v : buf) {
			System.out.println((char)v);
		}
		System.out.println("---");
		String str4 = str3.replace('o', '8');
		System.out.println(str3);
		System.out.println(str4);
		
		
	}

}
