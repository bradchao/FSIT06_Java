package tw.brad.apps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Brad44 {

	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://localhost:3307/cust"+
//					"?user=root&password=root&serverTimezone=Asia/Taipei");

//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://localhost:3307/cust?serverTimezone=Asia/Taipei", 
//					"root", "root");

			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			prop.put("serverTimezone", "Asia/Taipei");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3307/cust", 
					prop);
			
			
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(
				"INSERT INTO brad (cname,tel,birthday) VALUES ('Eric','9487945','1996-04-05')");
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM brad");
			
			while (rs.next()) {
				String id = rs.getString("id");
				String cname = rs.getString("cname");
				String tel = rs.getString("tel");
				String birthday = rs.getString("birthday");
				System.out.println(id + ":" + cname + ":" + tel + ":" + birthday);
			}
			
			
			
			
			
			
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
