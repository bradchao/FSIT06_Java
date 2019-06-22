package tw.brad.apps;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;

public class Brad46 {

	public static void main(String[] args) {
		try {
			URL url = 
				new URL(
					"http://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvAgriculturalProduce.aspx");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			BufferedReader reader = 
				new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			String line; StringBuffer sb = new StringBuffer();
			while ( (line = reader.readLine()) != null) {
				sb.append(line);
			}
			//System.out.println(sb.toString());
			reader.close();
			
			parseJSON(sb.toString());
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

	
	static void parseJSON(String json) {
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			prop.put("serverTimezone", "Asia/Taipei");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3307/cust", 
					prop);
			PreparedStatement pstmt = conn.prepareStatement(
					"INSERT INTO gift (gid,pname,feature,url) VALUES (?,?,?,?)");			
			
			JSONArray root = new JSONArray(json);
			for (int i=0; i<root.length(); i++) {
				JSONObject row = root.getJSONObject(i);

				String gid = row.getString("ID");
				String pname = row.getString("Name");
				String feature = row.getString("Feature");
				String url = row.getString("Column1");
				
				pstmt.setString(1, gid);
				pstmt.setString(2, pname);
				pstmt.setString(3, feature);
				pstmt.setString(4, url);
				pstmt.executeUpdate();
			
			}
			
			
			System.out.println("OK");
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	
	
}
