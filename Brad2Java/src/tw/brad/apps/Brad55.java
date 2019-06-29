package tw.brad.apps;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Brad55 extends JFrame {
	private MyPanel myPanel;
	
	public Brad55() {
		setLayout(new BorderLayout());
	
		myPanel = new MyPanel();
		add(myPanel, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class MyPanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D)g;
			
			BufferedImage bimg;
			try {
				bimg = ImageIO.read(new File("imgs/ball.png"));
				g2d.drawImage(bimg, 100, 100, null);
			} catch (IOException e) {
			}
		}
	}
	

	public static void main(String[] args) {
		new Brad55();
	}

}
