package tw.brad.myjava;

public class PokerV3 {
	public static void main(String[] args) {
		int[] poker = new int[52];	// poker[0]=0
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i=poker.length-1; i>0; i--) {
			int rand = (int)(Math.random()*(i+1));
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
		for (int v : poker) System.out.println(v);
		
		
	}
}
