package tw.brad.myjava;

public class Brad20 {

	public static void main(String[] args) {
		// 1 + 2 + 3 + ... + n = ?
		// 0 + 1 = 1
		// 1 + 2 = 3
		// 3 + 3 = 6
		// 6 + 4 = 10
		int n = 9762, i = 1, sum = 0;
		while (i<=n) {
			sum += i++;
		}
		System.out.printf("1+2+......+ %d = %d\n", n, sum);
		System.out.println("---");
		
		n = 9762; i = 1; sum = 0;
		for (;i<=n;) {
			sum += i++;
		}
		System.out.printf("1+2+......+ %d = %d\n", n, sum);
		
		
 	}

}
