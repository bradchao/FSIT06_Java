package tw.brad.myjava;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	private LinkedList<LinkedList<Point>> lines, recycler;
	private Color color;
	
	public MyDrawer() {
		System.out.println("MyDrawer");
		setBackground(Color.YELLOW);
		
		MyMouseListener listener = new MyMouseListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		
		lines = new LinkedList<>();
		recycler = new LinkedList<>();
		color = Color.BLUE;
	}

	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			Point point = new Point(e.getX(), e.getY());
			LinkedList<Point> line = new LinkedList<>();
			line.add(point);
			lines.add(line);
			recycler.clear();
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			Point point = new Point(e.getX(), e.getY());
			lines.getLast().add(point);
			repaint();
		}
	}

	public void clear() {
		lines.clear();
		repaint();
	}
	public void undo() throws Exception {
		if (lines.size()>0) {
			recycler.add(lines.removeLast());
			repaint();
		}else {
			throw new Exception();
		}
	}
	
	public void redo() {
		if (recycler.size()>0) {
			lines.add(recycler.removeLast());
			repaint();
		}
	}
	
	public void saveJPEG(File file) throws Exception {
		BufferedImage image = new BufferedImage(
				getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = image.createGraphics();
		paint(g2);
		ImageIO.write(image, "jpeg", file);
	}
	
	public void saveObject(File file) throws Exception {
		ObjectOutputStream oout = 
			new ObjectOutputStream(
				new FileOutputStream(file));
		oout.writeObject(lines);
		oout.flush();
		oout.close();
	}

	public void loadObject(File file) throws Exception {
		ObjectInputStream oin = 
			new ObjectInputStream(new FileInputStream(file));
		Object obj = oin.readObject();
		if (obj instanceof LinkedList) {
			lines = (LinkedList<LinkedList<Point>>)obj;
			recycler.clear();
			repaint();
		}
		oin.close();
	}
	
	
	public class Point implements Serializable {
		int x, y;
		Point(int x, int y){this.x = x; this.y = y;}
	}
	
	public Color getColor() {return color;}
	public void changeColor(Color color) {
		this.color = color;
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("paint");
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(color);
		g2d.setStroke(new BasicStroke(2));

		for (LinkedList<Point> line : lines) {
			for (int i=1; i<line.size(); i++) {
				Point p0 = line.get(i-1);
				Point p1 = line.get(i);
				g2d.drawLine(p0.x, p0.y, p1.x, p1.y);
			}
		}
		
	}
	
}
