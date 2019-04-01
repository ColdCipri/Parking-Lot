package Model;

abstract public class Vehicle {

		protected String color;
		
		Vehicle(){
			this.color = "none";
		}
		
		Vehicle(String c){
			this.color = c;
		}
		
		public String getColor() {
			return this.color;
		}
		
		public void setColor(String c) {
			this.color = c;
		}
		
		public boolean isRed() {
			return color.toUpperCase().equals("RED");
		}
		public void print() {
			System.out.println("Vehicle has color: " + color);
		}
}
		