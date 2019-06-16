package tw.brad.apps;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Brad43 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://s.yimg.com/ny/api/res/1.2/b3hGcD4V3bHtWSVaVWraYQ--~A/YXBwaWQ9aGlnaGxhbmRlcjtzbT0xO3c9MTI4MDtoPTk2MA--/http://media.zenfs.com/zh-Hant-TW/homerun/ftvn.com.tw/4fd52b3f14bd9e1b7305baa04c843bae");
			HttpURLConnection conn =  (HttpURLConnection)url.openConnection();
			conn.connect();
			
			BufferedInputStream bin = 
				new BufferedInputStream(conn.getInputStream());
			BufferedOutputStream bout = 
				new BufferedOutputStream(new FileOutputStream("dir1/yahoo.jpg"));
			int len; byte[] buf = new byte[4096];
			while ( (len = bin.read(buf)) != -1) {
				bout.write(buf, 0, len);
			}
			bout.flush();
			bout.close();
			bin.close();
			
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
