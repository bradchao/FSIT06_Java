package tw.brad.apps;

public class Brad59 {

	public static void main(String[] args) {
		String str1 = "Brad";
		
		Class c1 = str1.getClass();
		System.out.println(c1.toString());
		System.out.println(c1.getName());
		
		Class c2 = String.class;
		System.out.println(c2.getName());
		
		try {
			CTest1 obj1 = newObj(CTest2.class);
			obj1.m1();
			((CTest2)obj1).m1();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	static CTest1 newObj(Class c) throws Exception {
		CTest1 ret = null;
		
		
		
		ret = (CTest1)c.newInstance();
		return ret;
	}

}
class CTest1 {
	void m1() {System.out.println("CTest1:m1()");}
}
class CTest2 extends CTest1 {
	void m1() {System.out.println("CTest2:m1()");}
}
