package tw.brad.apps;

public class Brad11 {

	public static void main(String[] args) {
		System.out.println(Brad112.a);
		Brad112 obj1 = new Brad112();
		Brad112 obj2 = new Brad112();
	}
}
class Brad111{
	Brad111(){
		this(2);
		System.out.println("Brad111()");
	}
	Brad111(int a){
		this(3,4);
		System.out.println("Brad111(int)");
	}
	Brad111(int a, int b){
		System.out.println("Brad111(int, int)");
	}
	{
		System.out.println("Brad111{*}");
	}
	static {
		System.out.println("static Brad111{*}");
	}
}
class Brad112 extends Brad111 {
	static int a;
	int b;
	Brad112(){
		a++;
		System.out.println("Brad112()");
	}
	{
		System.out.println("Brad112{*}:" + b);
	}
	static {
		System.out.println("static Brad112{*}");
	}
}


