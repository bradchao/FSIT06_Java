package tw.brad.myjava;

public class Brad06 {

	public static void main(String[] args) {
		byte var1 = 10;
		long var2 = 3;
		// byte, short, char, int => int + long => long
		// float => float + double => double
		long var3 = var1 + var2;
		System.out.println(var3);
		
		var1 = 125;
		byte var4 = var1++;
		System.out.println(var1);
		var1++;
		System.out.println(var1);
		var1++;
		System.out.println(var1);
		var1--;
		System.out.println(var1);
		var1 = 125;
		var1 += 3;
		System.out.println(var1);
		var1 = 10; byte var6 = 3;
		int var5 = (int)(var1 / 3f);
		System.out.println(var5);
		
		int var7 = 3, var8 = 2;
		int var9 = var7 ^ var8;
		// 3 => 11; 2 => 10
		System.out.println(var9);
		
		int a  =0, b = 0;
		System.out.println(a / b);
		
		
	}

}
