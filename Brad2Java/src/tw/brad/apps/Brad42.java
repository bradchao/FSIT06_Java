package tw.brad.apps;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad42 {

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(9487);
			Socket socket = server.accept();
			
			BufferedInputStream bin = 
				new BufferedInputStream(socket.getInputStream());
			
			BufferedOutputStream bout = 
				new BufferedOutputStream(new FileOutputStream("dir2/brad.jpg"));
			
			int len; byte[] buf = new byte[1024*4096];
			while ( (len = bin.read(buf)) != -1) {
				bout.write(buf, 0, len);
			}
			
			bout.flush();
			bout.close();
			
			bin.close();
			
			server.close();
			System.out.println("receive ok");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
