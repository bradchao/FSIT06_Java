package tw.brad.myjava;

public class Brad17 {

	public static void main(String[] args) {
		int[] p = new int[6];	// p[0] =0, p[1] = 0,... p[5] = 0
		
		for (int i = 0; i< 100000; i++) {
			int point = (int)(Math.random()*9);	// 0 - 8 => 6,7,8
			p[point>=6?point-3:point]++;
		}
		for(int i = 0; i<p.length; i++) {
			System.out.printf("%d點出現%d次\n", i+1, p[i]);
		}
	}

}
