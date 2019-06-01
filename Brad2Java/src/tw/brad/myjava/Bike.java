package tw.brad.myjava;

public class Bike extends Object{
	// has-a member成員: obj.member
	protected double speed;	// Field
	
	// 建構式 constructor
	// 初始化
	public Bike(int a) {
		speed = a;
		System.out.println("Bike()");
	}
	
	// method方法
	public void Bike() {}
	public void upSpeed(){
		int a = 10;
		speed = speed<1 ? 1 : speed*1.2;
	}
	public void downSpeed() {
		speed = speed<1 ? 0 : speed*0.7;
	}
	public double getSpeed() {
		return speed;
	}
}
