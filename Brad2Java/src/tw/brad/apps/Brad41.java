package tw.brad.apps;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Brad41 {
	public static void main(String[] args) {
		try {
			File file = new File("dir1/coffee2.jpg");
			BufferedInputStream bin = 
				new BufferedInputStream(new FileInputStream(file));
			byte[] buf = new byte[(int)file.length()];
			bin.read(buf);
			bin.close();
			
			Socket socket = new Socket(InetAddress.getByName(""), 9487);
			BufferedOutputStream bout = 
					new BufferedOutputStream(socket.getOutputStream());
			bout.write(buf);
			bout.flush();
			bout.close();
			socket.close();
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		
		
	}
}
