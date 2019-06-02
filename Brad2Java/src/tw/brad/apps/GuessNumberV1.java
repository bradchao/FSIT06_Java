package tw.brad.apps;

import javax.swing.JOptionPane;

public class GuessNumberV1 {
	public static void main(String[] args) {
		// 1. create answer
		String answer = createAnswer();
		
		// 2. user
		boolean isWinner = false;
		for (int i=0; i<3; i++) {
			String guess = JOptionPane.showInputDialog("輸入數字");
			String result = checkAB(answer, guess);
			JOptionPane.showMessageDialog(null, result);
			if (result.equals("3A0B")) {
				isWinner = true;
			}
		}
		
		JOptionPane.showMessageDialog(null, isWinner?"Winner":"Loser");
		
	}
	
	static String createAnswer() {
		return "217";
	}
	
	static String checkAB(String a, String g) {
		return "1A2B";
	}
	
}
