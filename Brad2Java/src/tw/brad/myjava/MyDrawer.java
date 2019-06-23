package tw.brad.myjava;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	public MyDrawer() {
		System.out.println("MyDrawer");
		setBackground(Color.YELLOW);
		
		MyMouseListener listener = new MyMouseListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
	}

	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			System.out.println("press");
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			super.mouseReleased(e);
			System.out.println("release");
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			System.out.println("drag");
		}
		
		
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("paint");
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(2));
		
		g2d.drawLine(0, 0, 100, 100);
		
	}
	
}
