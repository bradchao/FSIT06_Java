package tw.brad.apps;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;

public class Brad34 {
	public static void main(String[] args) {
		try {
			ObjectInputStream oin = 
				new ObjectInputStream(new FileInputStream("dir1/brad.object"));
			Student ss = null;
			while (true) {
				try {
					ss = (Student)oin.readObject();
					System.out.println(ss.sum() + ";" + ss.avg());
				}catch(EOFException ee) {
					break;
				}
			}
			oin.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
