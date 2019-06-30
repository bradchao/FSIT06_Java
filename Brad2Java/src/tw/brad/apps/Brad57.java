package tw.brad.apps;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Brad57 {
	
	public static void main(String[] args) {
		try(
			FileInputStream fin = 
				new FileInputStream("");
			InputStreamReader ir = 
				new InputStreamReader(fin);
			BufferedReader br = 
				new BufferedReader(ir)) {
			
			
			//close();
		}catch(Exception e) {
			
		}
		
		String connString= "", sql = "";
		try(Connection conn = DriverManager.getConnection(connString);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			
			
		}catch(Exception e) {
			
		}
		
		
	}

}
