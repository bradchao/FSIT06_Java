package tw.brad.myjava;

public class Brad08 {

	public static void main(String[] args) {
		int year = 2019;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					// 29
				}else {
					// 28
				}
			}else {
				// 2016
				// 29
			}
		}else {
			// 28
		}
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			// 29
		}else {
			// 28
		}
		
	}

}
