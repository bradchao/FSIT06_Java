package tw.brad.apps;
public class Brad13 {
	public static void main(String[] args) {
		Brad131 obj1 = new Brad131();
		Brad132 obj2 = new Brad132();
		Brad131 obj3 = new Brad133();
		Brad133 obj4 = (Brad133)obj3;
		//Brad132 obj4 = new Brad131();
		obj2.m3();
		obj3.m1();
		System.out.println("---");
		test(obj1);
		test(obj2);
		test(obj3);
		
		//obj4.m
		
	}
	
	static void test(Brad131 obj) {
		obj.m1();
	}
}
class Brad131 {
	byte m1() {System.out.println("Brad131:m1()"); return (byte)1;}
	void m2() {System.out.println("Brad131:m2()");}
}
class Brad132 extends Brad131 {
	byte m1() {
		//super.m2();
		System.out.println("Brad132:m1()");
		return 1;
	}
	void m3() {	System.out.println("Brad132:m3()");}
}
class Brad133 extends Brad131 {
	byte m1() {System.out.println("Brad133:m1()");return 1;}
	void m4() {	System.out.println("Brad133:m4()");}
}
