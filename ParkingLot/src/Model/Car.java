package Model;

public class Car extends Vehicle {

	public Car(String c) {
		super(c);
	}
	
	public String getColor() {
		return super.getColor();
	}
	
	public void setColor(String c) {
		super.setColor(c);
	}
	
	@Override
	public void print() {
		System.out.println("Car has color: "+ this.getColor());
	}
}
