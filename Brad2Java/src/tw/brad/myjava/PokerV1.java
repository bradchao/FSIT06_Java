package tw.brad.myjava;

public class PokerV1 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] poker = new int[52];
		for (int i=0; i<poker.length; i++) {
			int rand = (int)(Math.random()*52);
			
			// 檢查機制
			boolean isRepeat = false;
			for (int j=0; j<i; j++) {
				if (rand == poker[j]) {
					isRepeat= true;
					break;
				}
			}
			
			if (isRepeat) {
				i--;
			}else {
				poker[i] = rand;	
				System.out.println(poker[i]);
			}
		}
		System.out.println("---");
		System.out.println(System.currentTimeMillis() - start);
	}
}
