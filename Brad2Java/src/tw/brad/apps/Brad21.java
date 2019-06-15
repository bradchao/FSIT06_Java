package tw.brad.apps;

public class Brad21 {
	public static void main(String[] args) {

		Brad211.Brad213 obj3 = new Brad211.Brad213();
		obj3.m1();
		
		Brad211 obj1 = obj3.createBrad211();
		Brad211.Brad212 obj2 = obj1.new Brad212();
		obj1.m1();
		obj2.m1();
		m1();
		
	}
	
	static void m1() {
		class Brad214 {
			void m1() {System.out.println("Brad214:m1()");}
		}
		Brad214 obj4 = new Brad214();
		obj4.m1();
	}
	
}

class Brad211 {
	private int a;
	private static int b;
	
	private Brad211() {
		
	}
	
	void m1() {
		a = 10;
		System.out.println("Brad211:m1()");
	}
	
	class Brad212 {
		void m1() {
			System.out.println(++a);
			//m1(); 	// this.m1();
			Brad211.this.m1();
			System.out.println("Brad212:m2()");
		}
	}
	
	class Brad215 extends Brad212 implements Brad216 {
		
	}
	
	interface Brad216 {
		
	}
	
	static class Brad213 {
		void m1() {
			System.out.println("Brad213:m1()" + b);
		}
		Brad211 createBrad211() {
			Brad211 obj = new Brad211();
			return obj;
		}
	}
	
}
