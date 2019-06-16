package tw.brad.apps;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Brad39 {
	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket(
					InetAddress.getByName("10.0.105.82"), 7777);
			socket.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
}
