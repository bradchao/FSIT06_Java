package tw.brad.apps;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad28 {

	public static void main(String[] args) {

		// 1. input -> output
		long start = System.currentTimeMillis();
		try {
			FileInputStream fin = 
					new FileInputStream("dir1/coffee2.jpg");
			FileOutputStream fout = 
					new FileOutputStream("dir2/coffee2.jpg");
			int len; byte[] buf = new byte[1024*4096];
			while ( (len = fin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			
			fout.flush();
			fout.close();
			fin.close();
			System.out.println("finish2");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis() - start);
		
	}

}
