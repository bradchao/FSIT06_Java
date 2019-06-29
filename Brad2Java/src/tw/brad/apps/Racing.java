package tw.brad.apps;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Racing extends JFrame {
	private JButton go;
	private JLabel[] lanes = new JLabel[8];
	private Car[] cars = new Car[8];
	private int rank;
	
	public Racing() {
		super("Racing");
		setLayout(new BorderLayout());
		
		JPanel mainPanel = new JPanel(new GridLayout(9, 1));
		go = new JButton("Go!"); mainPanel.add(go);
		for (int i=0; i<lanes.length; i++) {
			lanes[i] = new JLabel((i+1) + ". ");
			mainPanel.add(lanes[i]);
		}
		add(mainPanel, BorderLayout.CENTER);
		
		JPanel rightPanel = new JPanel(new GridLayout(9, 1));
		MyClock clock = new MyClock();
		rightPanel.add(clock);
		JLabel timer1 = new JLabel("10:02:03"); rightPanel.add(timer1);
		JLabel timer2 = new JLabel("10:02:03"); rightPanel.add(timer2);
		JLabel timer3 = new JLabel("10:02:03"); rightPanel.add(timer3);
		JLabel timer4 = new JLabel("10:02:03"); rightPanel.add(timer4);
		JLabel timer5 = new JLabel("10:02:03"); rightPanel.add(timer5);
		JLabel timer6 = new JLabel("10:02:03"); rightPanel.add(timer6);
		JLabel timer7 = new JLabel("10:02:03"); rightPanel.add(timer7);
		JLabel timer8 = new JLabel("10:02:03"); rightPanel.add(timer8);
		
		add(rightPanel, BorderLayout.EAST);
		
		
		
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
