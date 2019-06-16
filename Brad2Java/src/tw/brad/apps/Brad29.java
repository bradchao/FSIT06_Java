package tw.brad.apps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad29 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			File source = new File("dir1/coffee2.jpg");
			FileInputStream fin = new FileInputStream(source);
			byte[] buf = new byte[(int)source.length()];
			fin.read(buf);
			fin.close();
			System.out.println("read finish");
			
			FileOutputStream fout = new FileOutputStream("dir2/coffee2.jpg");
			fout.write(buf);
			fout.flush();
			fout.close();
			System.out.println("write finish");
		}catch(Exception e) {
			System.out.println(e.toString());
		}

		System.out.println(System.currentTimeMillis() - start);
		
	}

}
