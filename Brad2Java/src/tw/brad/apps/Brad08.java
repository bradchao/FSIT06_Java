package tw.brad.apps;

public class Brad08 {

	public static void main(String[] args) {
		String line = "1,Brad Chao,18,台中市,1999-02-01";
		String[] fields = line.split(",");
		for (String field: fields) {
			System.out.println(field);
		}
		System.out.println("---");
		String url = 
			"http://www.google.com/index.php?name=brad&gender=male";
		String[] myurl = url.split("\\?");
		String uu = myurl[0];
		System.out.println(uu);
		String[] params = myurl[1].split("&");
		for (String param : params) {
			String[] data = param.split("=");
			System.out.println(data[0] + " ==> " + data[1]);
		}
		
		
		
		
		
		
	}

}
