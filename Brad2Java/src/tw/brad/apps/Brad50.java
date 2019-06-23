package tw.brad.apps;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Brad50 extends JFrame{
	public Brad50() {
		
		JMenuBar jmb = new JMenuBar();
		JMenu menu1 = new JMenu("menu1");
		jmb.add(menu1);
		JMenu menu2 = new JMenu("menu2");
		jmb.add(menu2);
		
		JMenuItem item1 = new JMenuItem("item1");
		menu1.add(item1);
		
		setJMenuBar(jmb);

		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
		
	public static void main(String[] args) {
		new Brad50();
	}

}
