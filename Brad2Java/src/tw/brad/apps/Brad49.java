package tw.brad.apps;
import java.util.LinkedList;

public class Brad49 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		list.add(0,"Brad");	// 0
		list.add(0,"Tony");	// 1
		list.add(0,"John");	// 2
		list.add(0,"Brad");	// 3
		System.out.println(list.size());
		for (String name : list) {
			System.out.println(name);
		}
		
		
		
		
	}

}
