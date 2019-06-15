package tw.brad.apps;

import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.util.TooManyListenersException;

public class Brad22 {
	public static void main(String[] args) {
		int a = 10, b = 0;
		int c;
		int[] d = {1,2,3,4};
		
		try {
			c = a / b;
			System.out.println(c);
			System.out.println(d[4]);
			

		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Oops2!");
		}catch(ArithmeticException ae) {
			System.out.println("Oops1!");		}
		System.out.println("Game Over");
		
		Bird b1 = new Bird();
		try {
			b1.setLeg(10);
		}catch(CertificateExpiredException e) {
			
		}catch(CertificateException e) {
			
		}catch(Exception e) {
			
		}
		
	}
}

class Bird {
	private int leg;
	void setLeg(int n) throws CertificateException, CertificateExpiredException{
		if (n>=0 && n<=2) {
			leg = n;
		}else if (n < 0){
			throw new CertificateException();
		}else if (n > 2) {
			throw new CertificateExpiredException();
		}
	}
}


