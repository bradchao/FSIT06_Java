package tw.brad.apps;

import java.net.InetAddress;

public class Brad36 {
	public static void main(String[] args) {
		try {
			InetAddress[] ips = InetAddress.getAllByName("254.0.0.127");
			for (InetAddress ip :ips) {
				System.out.println(ip.getHostAddress());
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
