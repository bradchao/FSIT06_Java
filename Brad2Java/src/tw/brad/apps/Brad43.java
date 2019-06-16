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
		String good = "http://www.bradchao.com";
		try {
			URL url = new URL("https://pdfmyurl.com/index.php?url=" + good);
			HttpURLConnection conn =  (HttpURLConnection)url.openConnection();
			conn.connect();
			
			BufferedInputStream bin = 
				new BufferedInputStream(conn.getInputStream());
			BufferedOutputStream bout = 
				new BufferedOutputStream(new FileOutputStream("dir1/brad.pdf"));
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
