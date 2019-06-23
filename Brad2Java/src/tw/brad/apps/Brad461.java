package tw.brad.apps;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;

public class Brad461 {
	private static ArrayList<HashMap<String,String>> data = new ArrayList();
	private static final String FIELD_ID = "ID";
	private static final String FIELD_NAME = "Name";
	private static final String FIELD_FEATURE = "Feature";
	private static final String FIELD_URL = "Column1";

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
			data.clear();
			JSONArray root = new JSONArray(json);
			for (int i=0; i<root.length(); i++) {
				JSONObject row = root.getJSONObject(i);

				HashMap<String,String> single = new HashMap<>();
				single.put(FIELD_ID, row.getString(FIELD_ID));
				single.put(FIELD_NAME, row.getString(FIELD_NAME));
				single.put(FIELD_FEATURE, row.getString(FIELD_FEATURE));
				single.put(FIELD_URL, row.getString(FIELD_URL));
				
				data.add(single);
			}
			saveDB();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	static void saveDB() {
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
			
			for (HashMap<String,String> row : data) {
				pstmt.setString(1, row.get(FIELD_ID));
				pstmt.setString(2, row.get(FIELD_NAME));
				pstmt.setString(3, row.get(FIELD_FEATURE));
				pstmt.setString(4, row.get(FIELD_URL));
				pstmt.executeUpdate();
			}
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
}
