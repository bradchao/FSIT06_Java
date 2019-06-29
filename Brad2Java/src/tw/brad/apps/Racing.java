package tw.brad.apps;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame {
	private JButton go;
	private JLabel[] lanes = new JLabel[8];
	private Car[] cars = new Car[8];
	private int rank;
	
	public Racing() {
		super("Racing");
		setLayout(new GridLayout(9, 1));
	
		go = new JButton("Go!"); add(go);
		for (int i=0; i<lanes.length; i++) {
			lanes[i] = new JLabel((i+1) + ". ");
			add(lanes[i]);
		}
		
		go.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
		
		System.out.println(Thread.activeCount());
		
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void go() {
		go.setEnabled(false);
//		System.out.println(Thread.activeCount());
		
//		boolean isAllDead = true;
//		for (int i=0; i<cars.length; i++) {
//			if (cars[i]!= null && cars[i].isAlive()) {
//				isAllDead = false;
//				break;
//			}
//		}
//		if (!isAllDead) return;
		
		rank = 0;
		for (int i=0; i<cars.length; i++) {
			lanes[i].setText((i+1) + ". ");
			cars[i] = new Car(i);
			cars[i].start();
		}
//		System.out.println(Thread.activeCount());
		
	}
	
	private void stopRound() {
		for(int i=0; i<cars.length; i++) {
			cars[i].interrupt();
		}
		go.setEnabled(true);
	}
	
	private class Car extends Thread {
		private int lane;
		Car(int lane){this.lane = lane;}
		@Override
		public void run() {
			for (int i=0; i<100; i++) {
				lanes[lane].setText(lanes[lane].getText() + ">");
				if (i == 99) {
					lanes[lane].setText(lanes[lane].getText() + ++rank);
					stopRound();
				}
				try {
					Thread.sleep(50 + (int)(Math.random()*200));
				}catch(Exception e) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Racing();
	}

}
