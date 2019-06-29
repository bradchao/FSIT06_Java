package tw.brad.apps;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

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
		private Timer timer;
		private int viewW, viewH, ballW, ballH;
		private BufferedImage ballImg;
		private LinkedList<BallTask> balls;
		
		MyPanel(){
			try {
				ballImg = ImageIO.read(new File("imgs/ball.png"));
				ballW = ballImg.getWidth(); ballH = ballImg.getHeight();
			} catch (IOException e) {
				System.exit(0);
			}

			balls = new LinkedList<>();
			
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					createBall(e.getX(), e.getY());
				}
			});
			
			timer = new Timer();
			timer.schedule(new RefreshView(), 0, 17);
			
		}
		
		private void createBall(int ex, int ey) {
			
		}
		
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			viewW = getWidth(); viewH = getHeight();
			Graphics2D g2d = (Graphics2D)g;
			
			
		}
		
		private class RefreshView extends TimerTask {
			@Override
			public void run() {
				repaint();
			}
		}
		
		private class BallTask extends TimerTask {
			private int x, y, dx, dy;
			BallTask(int x, int y){
				this.dx = x; this.dy = y;
				dx = dy = 4;
			}
			@Override
			public void run() {
				if (x < 0 || x + ballW > viewW) {
					dx *= -1;
				}
				if (y < 0 || y + ballH > viewH) {
					dy *= -1;
				}
				x += dx;
				y += dy;
			}
		}

		
	}
	

	public static void main(String[] args) {
		new Brad55();
	}

}
