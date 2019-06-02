package tw.brad.myjava;

public class TWId {
	private String id;
	private static String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
	
	public TWId() {
		this((int)(Math.random()*2) == 0);
	}
	public TWId(boolean isMale) {
		this(isMale, (int)(Math.random()*26));
	}
	public TWId(int area) {
		this((int)(Math.random()*2) == 0,area);
	}
	public TWId(boolean isMale, int area) {
		String temp = letters.substring(area, area+1);
		temp += isMale?"1":"2";
		for (int i=0; i<7; i++) temp += (int)(Math.random()*10);
		for (int i=0; i<10; i++) {
			if (checkId(temp + i)) {
				id = temp + i;
				break;
			}
		}
	}
	
	private TWId(String id) {
		this.id = id;
	}

	public static TWId createTWId(String id) {
		TWId temp = null;
		if (checkId(id)) {
			temp = new TWId(id); 
		}
		return temp;
	}
	
	
	public static boolean checkId(String id) {
		boolean ret = false;
		if (id.matches("[A-Z][12][0-9]{8}")) {
			
			char c0 = id.charAt(0);
			int n12 = letters.indexOf(c0)+10;
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			int n3 = Integer.parseInt(id.substring(1, 2));
			int n4 = Integer.parseInt(id.substring(2, 3));
			int n5 = Integer.parseInt(id.substring(3, 4));
			int n6 = Integer.parseInt(id.substring(4, 5));
			int n7 = Integer.parseInt(id.substring(5, 6));
			int n8 = Integer.parseInt(id.substring(6, 7));
			int n9 = Integer.parseInt(id.substring(7, 8));
			int n10 = Integer.parseInt(id.substring(8, 9));
			int n11 = Integer.parseInt(id.substring(9, 10));
		
			int sum = n1*1 + n2*9 + n3*8 + n4*7 + n5*6 + n6*5 +
					n7*4 + n8*3 + n9*2 + n10*1 + n11*1;
			//System.out.println(sum);
			ret = sum % 10 == 0;
		}
		
		return ret;
	}
	
	public String getId() {
		return id;
	}
}
