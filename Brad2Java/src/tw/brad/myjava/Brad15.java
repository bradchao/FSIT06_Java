package tw.brad.myjava;

public class Brad15 {

	public static void main(String[] args) {
		// Array > Matrix矩陣
		// Array => Object
		int[] a;
		byte[] b = {97, 98, 99};
		System.out.println(b[0]);	// int > 0
		a =  new int[] {1,2,3,4};
		System.out.println(a.length);
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("---");
		// for-each
		for (int v : a) {
			System.out.println(v);
		}
		
		
		
	}

}
