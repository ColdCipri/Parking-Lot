package Model;

public class Bike extends Vehicle {

	public Bike(String c) {
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
		System.out.println("Bike has color: "+ this.getColor());
	}
}
