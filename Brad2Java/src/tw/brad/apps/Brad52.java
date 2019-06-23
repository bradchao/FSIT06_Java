package tw.brad.apps;

public class Brad52 {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1("A");
		Thread1 t2 = new Thread1("B");
		Brad521 b1 = new Brad521("C");
		Thread t3 = new Thread(b1);
		t1.start();
		t2.start();
		t3.start();
		System.out.println("OK");
		
	}

}

class Thread1 extends Thread {
	String name;
	Thread1(String name){this.name = name;}
	@Override
	public void run() {
		super.run();
		for (int i=0; i<10; i++) {
			System.out.println(name + ":" +i);
			try {
				Thread.sleep(100);
			}catch(InterruptedException ie) {
				break;
			}
		}
	}
}

class Brad521 implements Runnable {
	String name;
	Brad521(String name){this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(name + ":" +i);
			try {
				Thread.sleep(100);
			}catch(InterruptedException ie) {
				
			}
		}
	}
}

