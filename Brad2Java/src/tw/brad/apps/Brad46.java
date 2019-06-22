package tw.brad.apps;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

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
			JSONArray root = new JSONArray(json);
			for (int i=0; i<root.length(); i++) {
				JSONObject row = root.getJSONObject(i);

				String pname = row.getString("Name");
				System.out.println(pname);
			
			
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	
	
}
