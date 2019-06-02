package tw.brad.apps;

public class Brad10 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = sb.append("Hello,World");
		System.out.println(sb == sb2);
		sb.append("123")
		.append("OK")
		.replace(0, 3, "Brad");
		
		System.out.println(sb);
		
		
	}
}
