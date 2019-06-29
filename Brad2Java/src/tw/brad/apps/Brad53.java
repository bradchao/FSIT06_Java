package tw.brad.apps;

public class Brad53 {

	public static void main(String[] args) {
		Brad531 obj1 = new Brad531();
		Brad532 obj2 = new Brad532();
		//obj1.setDaemon(true);
		obj1.name = "A";
		obj1.b532 = obj2;
		obj2.name = "B";
		
		obj1.start();
		obj2.start();
		
		System.out.println("main ok");
		
		new Thread() {
			public void run() {
				for (int i=0; i<10; i++) {
					System.out.println(i);
					
					if (i == 7) {
						obj1.interrupt();
					}
					
					try {
						Thread.sleep(500);
					}catch(Exception e) {
						
					}
				}
			};
		}.start();
		
		
	}

}
class Brad531 extends Thread {
	String name;
	Brad532 b532 = null;
	@Override
	public void run() {
		for (int i=0; i< 20; i++) {
			System.out.println(name + ":" + i);
			
			try {
				if (i == 10) {
					b532.join(3*1000);
				}else {
					Thread.sleep(500);
				}
			}catch(Exception e) {
				break;
			}
		}
	}
}
class Brad532 extends Thread {
	String name;
	@Override
	public void run() {
		for (int i=0; i< 20; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
}




