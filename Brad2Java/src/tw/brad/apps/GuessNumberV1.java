package tw.brad.apps;

import javax.swing.JOptionPane;

public class GuessNumberV1 {
	public static void main(String[] args) {
		int nd = 4;
		// 1. create answer
		String answer = createAnswer(nd);
		//System.out.println(answer);
		
		// 2. user
		boolean isWinner = false;
		for (int i=0; i<10; i++) {
			String guess = JOptionPane.showInputDialog("輸入數字");
			if (guess != null) {
				String result = checkAB(answer, guess);
				JOptionPane.showMessageDialog(null, result);
				if (result.equals(nd + "A0B")) {
					isWinner = true;
					break;
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, isWinner?"Winner":"Loser:"+answer);
		
	}
	
	static String createAnswer(int d) {
		int[] poker = new int[10];	// poker[0]=0
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i=poker.length-1; i>0; i--) {
			int rand = (int)(Math.random()*(i+1));
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<d; i++) {
			sb.append(poker[i]);
		}
		return sb.toString();
	}
	
	static String checkAB(String a, String g) {
		int A, B; A = B = 0;
		
		for (int i=0; i<g.length(); i++) {
			if (g.charAt(i) == a.charAt(i)) {
				A++;
			}else if (a.indexOf(g.charAt(i)) >= 0) {
				B++;
			}
		}
		
		return A +"A" + B + "B";
	}
	
}
