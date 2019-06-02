package tw.brad.apps;

import javax.swing.JFrame;

public class Brad15 extends JFrame{
	public Brad15() {
		super("偶的視窗");
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Brad15();
	}

}
