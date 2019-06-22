package tw.brad.apps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Brad45 {

	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			prop.put("serverTimezone", "Asia/Taipei");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3307/cust", 
					prop);
			
			PreparedStatement pstmt = conn.prepareStatement(
					"INSERT INTO brad (cname,tel,birthday) VALUES (?,?,?)");
			for (int i=0; i<10; i++) {
				pstmt.setString(1, "Alen" + (int)(Math.random()*100));
				pstmt.setString(2, "222");
				pstmt.setString(3, "1909-09-08");
				pstmt.executeUpdate();
			}
			
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
