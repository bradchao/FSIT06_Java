package tw.brad.apps;

public class Brad19 {

	public static void main(String[] args) {

	}
	
	static void m1(Shape s) {
		s.calArea();
	}
//	static void m1(Triangle t) {
//		
//	}

}
interface Shape {
	void calLength();
	void calArea();
}
class Triangle implements Shape {
	public void calLength() {}
	public void calArea() {}
}
class Rectangle implements Shape {
	public void calLength() {}
	public void calArea() {}
}
class Circle implements Shape {
	public void calLength() {}
	public void calArea() {}
}

