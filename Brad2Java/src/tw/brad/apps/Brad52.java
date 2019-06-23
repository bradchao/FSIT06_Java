package tw.brad.apps;

public class Brad52 {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();
		t1.start();
		t2.start();
		System.out.println("OK");
		
	}

}

class Thread1 extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			}catch(InterruptedException ie) {
				
			}
		}
	}
}
