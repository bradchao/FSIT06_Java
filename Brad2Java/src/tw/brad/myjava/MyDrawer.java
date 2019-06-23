package tw.brad.myjava;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	private LinkedList<Point> line;
	
	public MyDrawer() {
		System.out.println("MyDrawer");
		setBackground(Color.YELLOW);
		
		MyMouseListener listener = new MyMouseListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		
		line = new LinkedList<>();
	}

	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			Point point = new Point(e.getX(), e.getY());
			line.add(point);
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			super.mouseReleased(e);
			Point point = new Point(e.getX(), e.getY());
			line.add(point);
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			Point point = new Point(e.getX(), e.getY());
			line.add(point);
			
			repaint();
		}
	}

	private class Point {
		int x, y;
		Point(int x, int y){this.x = x; this.y = y;}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("paint");
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(2));
		
		for (int i=1; i<line.size(); i++) {
			Point p0 = line.get(i-1);
			Point p1 = line.get(i);
			g2d.drawLine(p0.x, p0.y, p1.x, p1.y);
		}
		
	}
	
}