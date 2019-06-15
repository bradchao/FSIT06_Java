package tw.brad.apps;

public class Brad16 {

	public static void main(String[] args) {
		//Brad161 obj1 = new Brad161();
		Brad162 obj2 = new Brad162();
		Brad163 obj3 = new Brad163(2);
		obj2.m1(); obj2.m2(); obj2.m3();
		obj3.m1(); obj3.m2(); obj3.m3();
		Brad161 obj12 = new Brad162();
		obj12.m1(); obj12.m2();
		Brad161 obj13 = new Brad163(3);
		obj13.m1(); obj13.m2();
	}

}

abstract class Brad161 {
	Brad161(int a){}
	void m1() {System.out.println("Brad161:m1()");}
	abstract void m2();
}
class Brad162 extends Brad161 {
	Brad162(){super(1);}
	void m2() {System.out.println("Brad162:m2()");}
	void m3() {System.out.println("Brad162:m3()");}
}
class Brad163 extends Brad161 {
	Brad163(int a){super(2);}
	void m2() {System.out.println("Brad163:m2()");}
	void m3() {System.out.println("Brad163:m3()");}
}

abstract class Brad164 {
	void m4() {}
	void m5() {}
}
