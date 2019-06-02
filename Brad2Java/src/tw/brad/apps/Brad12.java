package tw.brad.apps;

public class Brad12 {
	public static void main(String[] args) {
		Brad121 obj1 = new Brad121();
		obj1.m1();
		obj1.m1((byte)2);
		//obj1.m1((byte)1,(byte)2);
		String[] ns = {"Brad","Eric","Peter","Tony"};
		obj1.sayYa(1,2,ns);
		obj1.sayYa(1,2,"Brad");
		obj1.sayYa("Brad", "Tony");
		obj1.sayYa(1,2,"Brad", "Tony", "Mary","A","B","C");
	}
}
class Brad121 {
	void m1() {System.out.println("Bread121:m1()");}
	void m1(byte a){System.out.println("Bread121:m1(byte)"); }
	void m1(int a){System.out.println("Bread121:m1(int)");}
	void m1(byte a, int b) {System.out.println("Bread121:m1(byte,int)");}
	void m1(int a, byte b) {System.out.println("Bread121:m1(int,byte)");}
	//void sayYa(String name) {System.out.println("A");}
	void sayYa(String name1, String name2) {System.out.println("B");}
//	void sayYa(String[] names) {
//		for (String name : names) System.out.println("Ya, "+ name);
//	}
	void sayYa(int a, int b, String... names) {
		System.out.println("C");
	}
}
