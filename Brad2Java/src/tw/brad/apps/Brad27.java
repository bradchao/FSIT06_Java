package tw.brad.apps;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad27 {

	public static void main(String[] args) {

		// 1. input -> output
		long start = System.currentTimeMillis();
		try {
			FileInputStream fin = 
					new FileInputStream("dir1/coffee2.jpg");
			FileOutputStream fout = 
					new FileOutputStream("dir2/coffee2.jpg");
			int b;
			while ( (b = fin.read()) != -1) {
				fout.write(b);
			}
			
			fout.flush();
			fout.close();
			fin.close();
			System.out.println("finish");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis() - start);
		
	}

}
