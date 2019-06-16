package tw.brad.apps;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Brad32 {

	public static void main(String[] args) {
		try {
			BufferedReader br = 
				new BufferedReader(
					new InputStreamReader(
						new FileInputStream("dir1/Book1.csv")));
			String line = null;
			while ( (line = br.readLine()) != null) {
				String[] row = line.split(",");
				System.out.println("Name:" + row[0]);
				System.out.println("ID:" + row[1]);
				System.out.println("Birthday:" + row[2]);
				System.out.println("Age:" + row[3]);
				System.out.println("----");
			}
		
			br.close();
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
