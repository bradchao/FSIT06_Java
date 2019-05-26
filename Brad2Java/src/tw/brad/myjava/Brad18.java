package tw.brad.myjava;

public class Brad18 {

	public static void main(String[] args) {
		int[][] ary1;
		ary1 = new int[3][4];	// 3 x 4
		System.out.println(ary1[0].length);
		for (int[] sub : ary1) {
			for (int v : sub) {
				System.out.print(v + " " );
			}
			System.out.println();
		}
		System.out.println("----");
		
		int[][] ary2;
		ary2 = new int[3][];	
		ary2[0] = new int[2];
		ary2[1] = new int[3];
		ary2[2] = new int[4];
		for (int[] sub : ary2) {
			for (int v : sub) {
				System.out.print(v + " " );
			}
			System.out.println();
		}
		System.out.println("----");
		for (int i=0; i<ary2.length; i++) {
			for (int j=0; j<ary2[i].length; j++) {
				System.out.print(ary2[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
