package tw.brad.myjava;

public class Scooter extends Bike {
	private boolean light;
	
	public Scooter() {
		super(4);
	}
	
	public boolean isLight() {return light;}
	public void switchLight() {light = !light;}
	
	public void upSpeed() {
		speed = speed<1 ? 1 : speed*2.4;
	}
}
