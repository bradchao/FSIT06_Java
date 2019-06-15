package tw.brad.apps;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Brad25 {

	public static void main(String[] args) {
		String str = "Hello, 資策會\n";
		try {
			FileOutputStream fout = new FileOutputStream("dir1/file2", true);
			byte[] cont = {97, 98, 99, 100};
			fout.write(str.getBytes());
			fout.flush();
			fout.close();
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
