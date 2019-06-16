package tw.brad.apps;

import java.io.FileWriter;

public class Brad30 {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("dir1/brad.txt");
			writer.write("大家好,我素Brad\nHello, World");
			writer.flush();
			writer.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
