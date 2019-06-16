package tw.brad.apps;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad33 {

	public static void main(String[] args) {
		Student s1 = new Student(90, 100, 80);
		Student s2 = new Student(40, 100, 60);
		Student s3 = new Student(70, 100, 80);
		System.out.println(s1.sum());
		System.out.println(s1.avg());
		try {
			FileOutputStream fout = new FileOutputStream("dir1/brad.object");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			oout.writeObject(s1);
			oout.writeObject(s2);
			oout.writeObject(s3);
			oout.flush();
			oout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
class Student implements Serializable {
	int ch;
	transient int math;
	int eng;
	Student(int ch, int math, int eng){this.ch=ch;this.math=math;this.eng=eng;}
	public int sum() {return ch+math+eng;}
	public double avg() {return sum()/3.0;}
}
