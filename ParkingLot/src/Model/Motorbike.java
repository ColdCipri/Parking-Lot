package Model;

public class Motorbike extends Vehicle {

	public Motorbike(String c) {
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
		System.out.println("Motorbike has color: "+ this.getColor());
	}
}
