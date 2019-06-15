package tw.brad.apps;

public class Brad18 {
	public static void main(String[] args) {
		Brad183 obj1 = new Brad183();
		test1(obj1);
		Brad184 obj2 = new Brad184();
		test1(obj2);
	}
	static void test1(Brad181 obj) {
		obj.m1();
	}
}
interface Brad181 {
	void m1(); void m2();	
}
abstract class Brad182 implements Brad181 {
	public void m1() {}
	public void m2() {}
}
class Brad183 extends Brad182 {
	public void m1() {System.out.println("A");}
}
class Brad184 extends Brad182 {
	public void m1() {System.out.println("B");}
}
