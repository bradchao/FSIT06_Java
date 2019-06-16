package tw.brad.apps;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Brad38 {

	public static void main(String[] args) {
		byte[] buf = new byte[1024];
		try {
			DatagramSocket socket = new DatagramSocket(8888);
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			System.out.println("before");
			socket.receive(packet);
			System.out.println("after");
			socket.close();
			System.out.println("receive ok");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
