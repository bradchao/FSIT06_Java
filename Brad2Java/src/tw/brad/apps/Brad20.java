package tw.brad.apps;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Brad20 extends JFrame implements ActionListener{
	private JButton b1, b2, b3;
	private JTextArea textArea;
	
	public Brad20() {
		super("Window Test");
		
		setLayout(new BorderLayout());

		JPanel top = new JPanel(new FlowLayout());
		b1 = new JButton("B1111");
		b2 = new JButton("B2222");
		b3 = new JButton("B3333");
		top.add(b1);top.add(b2);top.add(b3);
		
		add(top, BorderLayout.NORTH);
		
		textArea = new JTextArea();
		add(textArea, BorderLayout.CENTER);
		
		MyListener listener = new MyListener(b1, b2, b3);
		
		b1.addActionListener(this); b1.addActionListener(listener);
		//b2.addActionListener(this);
		//b3.addActionListener(this);
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doB2();
			}
		});
		
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("B3");
			}
			
			
			
		});
		
		
		MyMouseListener mouseListener = new MyMouseListener();
		textArea.addMouseListener(mouseListener);
		textArea.addMouseMotionListener(mouseListener);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void doB2() {
		System.out.println("B2");
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == b1) {
			System.out.println("I am B1");
		}else if (e.getSource() == b2) {
			System.out.println("I am B2");
		}else if (e.getSource() == b3) {
			System.out.println("I am B3");
		}
		
		System.out.println("OK2:" + e.getActionCommand());
	}
	
	public static void main(String[] args) {
		new Brad20();
	}

}

class MyListener implements ActionListener {
	private JButton b1, b2, b3;
	public MyListener(JButton b1, JButton b2, JButton b3) {
		this.b1 = b1; this.b2 = b2; this.b3 = b3;
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK:" + e.getActionCommand());
		if (e.getSource() == b1) {
			System.out.println("ur B1");
		}else if (e.getSource() == b2) {
			System.out.println("ur B2");
		}else if (e.getSource() == b3) {
			System.out.println("ur B3");
		}
	}
}

class MyMouseListener extends MouseAdapter {
	@Override
	public void mousePressed(MouseEvent e) {
		//super.mousePressed(e);
		System.out.println("mouse press");
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		//super.mouseDragged(e);
		System.out.println("mouse drag");
	}
}


