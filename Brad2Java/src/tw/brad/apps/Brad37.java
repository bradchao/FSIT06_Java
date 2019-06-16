package tw.brad.apps;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Brad37 {
	public static void main(String[] args) {
		String data = "Hello, World";
		byte[] buf = data.getBytes();
		
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(
					buf, buf.length, 
					InetAddress.getByName("10.0.105.255"), 
					8888);
			socket.send(packet);
			socket.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
}
