package tw.brad.apps;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad40 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(80);
			Socket socket = server.accept();
			
			InetAddress urip = socket.getInetAddress();
			InputStream in = socket.getInputStream();

			int len; byte[] buf = new byte[4096];
			while ( (len = in.read(buf)) != -1) {
				System.out.println(urip.getHostAddress() + ":" +
						new String(buf,0,len));
			}
			
			in.close();
			
			
			server.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
