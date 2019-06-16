package tw.brad.apps;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad35 {
	public static void main(String[] args) {
		Brad353 obj = new Brad353();
		try {
			ObjectOutputStream oout = 
				new ObjectOutputStream(
					new FileOutputStream("dir1/test.object"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("----");
		try {
			ObjectInputStream oin = 
				new ObjectInputStream(
						new FileInputStream("dir1/test.object"));
			Object obj2 = oin.readObject();
			oin.close();
			System.out.println("OK2");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
	}
}
class Brad351 {
	Brad351(){
		System.out.println("Brad351()");
	}
}
class Brad352 extends Brad351  {
	Brad352(){
		System.out.println("Brad352()");
	}
}
class Brad353 extends Brad352 implements Serializable{
	int a;
	Brad354 obj = null;
	Brad353(){
		System.out.println("Brad353()");
		a = 10; 
		obj = new Brad354();
	}
}
class Brad354 implements Serializable {
	Brad354(){
		System.out.println("Brad354()");
	}
}
