package tw.brad.myjava;

public class Bike {
	protected double speed;	// Field
	
	public void upSpeed(){
		speed = speed<1 ? 1 : speed*1.2;
	}
	public void downSpeed() {
		speed = speed<1 ? 0 : speed*0.7;
	}
	public double getSpeed() {
		return speed;
	}
}
