package tw.brad.myjava;

public class Brad11 {

	public static void main(String[] args) {
		int month = (int)(Math.random()*12+1);
		int days;
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				days = 31;
				break;
			case 4: case 6: case 9: case 11:
				days = 30;
				break;
			case 2:
				days = 28;
				break;
			default:
				days = -1;
				break;
		}
		System.out.printf("%d月有%d天", month, days);
	}

}

class Brad111 {
	
}


