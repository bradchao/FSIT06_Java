package tw.brad.apps;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class MyClock extends JLabel {
	private Timer timer;
	private int i;
	
	public MyClock() {
		timer = new Timer();
		timer.schedule(new MyTask(), 0, 1*1000);
	}
	
	private class MyTask extends TimerTask {
		@Override
		public void run() {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			String nowString = sdf.format(new Date());
			setText(nowString);
		}
	}
	
}
