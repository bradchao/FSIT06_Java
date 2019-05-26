package tw.brad.myjava;

public class Brad10 {

	public static void main(String[] args) {
		byte a = 11;
		final byte b = 8;
		// byte, short, int, char, String, enum
		switch (a) {
			default:
				System.out.println("D");			
			case 1:
				System.out.println("A");
				break;
			case b + 2:
				System.out.println("B");
				//break;
			case 100:
				System.out.println("C");
				break;

		}
		
		System.out.println("OK");
		
		
	}

}
