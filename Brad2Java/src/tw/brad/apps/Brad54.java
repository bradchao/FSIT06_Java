package tw.brad.apps;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Brad54 {
	public static void main(String[] args) {
		Timer timer = new Timer();
		Task1 t1 = new Task1();
		Task2 t2 = new Task2(timer);
		timer.schedule(t1, 1*1000, 1*1000);
		timer.schedule(t2, 7*1000);
		System.out.println("Main");
	}

}
class Task1 extends TimerTask {
	@Override
	public void run() {
		Calendar now = Calendar.getInstance();
		int hh = now.get(Calendar.HOUR_OF_DAY);
		int mm = now.get(Calendar.MINUTE);
		int ss = now.get(Calendar.SECOND);
		
		System.out.println("do something:" + hh + ":" + mm + ":" + ss);
	}
}
class Task2 extends TimerTask {
	private Timer timer;
	Task2(Timer timer){this.timer = timer;}
	@Override
	public void run() {
		timer.cancel();
		timer.purge();
		timer = null;
	}
}
