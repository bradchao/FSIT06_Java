package tw.brad.apps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Brad44 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3307/cust"+
					"?user=root&password=root&serverTimezone=Asia/Taipei");
			
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(
				"INSERT INTO brad (cname,tel,birthday) VALUES ('Brad','123','1999-01-02')");
			
			
			
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
