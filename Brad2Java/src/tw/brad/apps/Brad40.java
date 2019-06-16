package tw.brad.apps;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad40 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			Socket socket = server.accept();
			server.close();
			System.out.println("Server OK");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
