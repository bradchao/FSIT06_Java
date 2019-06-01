package tw.brad.apps;

import tw.brad.myjava.*;

public class Brad01 {
	public static void main(String[] args) {
		Bike b1 = new Bike(2);
		Scooter s1 = new Scooter();
		System.out.println(s1.getSpeed());
		s1.upSpeed();s1.upSpeed();
		System.out.println(s1.getSpeed());
		b1.upSpeed(); b1.upSpeed();
		
		System.out.println(b1.getSpeed());
		
		//s1.speed = 100;
	}
}
