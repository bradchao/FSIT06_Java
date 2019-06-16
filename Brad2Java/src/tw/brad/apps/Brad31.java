package tw.brad.apps;

import java.io.FileReader;

public class Brad31 {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("dir1/brad.txt");
			int ret;
			while (	(ret = reader.read()) != -1) {
				System.out.println((char)ret);
			}
			reader.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
}
