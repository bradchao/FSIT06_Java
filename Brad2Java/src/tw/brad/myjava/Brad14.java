package tw.brad.myjava;

public class Brad14 {

	public static void main(String[] args) {
		int value = 17;
		boolean isPrime = true;
		
		for (int i = 2; i<value; i++) {
			if (value % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
