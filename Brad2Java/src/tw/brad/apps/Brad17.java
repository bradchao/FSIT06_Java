package tw.brad.apps;

public class Brad17 {

	public static void main(String[] args) {
		Brad171 obj1 = new Brad172();
		obj1.m1(); obj1.m2();
		Brad173 obj2 = new Brad172();
		obj2.m3(); obj2.m4();
		
	}

}
interface Brad171 {
	void m1();	// abstract public
	void m2();
}
class Brad172 implements Brad171, Brad173 {
	public void m1() {}
	public void m2() {}
	public void m3() {}
	public void m4() {}
}
interface Brad173 {
	void m3();	// abstract public
	void m4();
}
