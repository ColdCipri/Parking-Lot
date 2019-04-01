package Controller;

import java.util.Scanner;

import Model.*;
import Repository.RepoInterface;
import Repository.Repository;
import View.UI;

public class Controller {
	RepoInterface myRepo;
	
	public Controller(RepoInterface myRepo) {
		this.myRepo = myRepo;
	}
	public static void printMenu(){
		System.out.println("\n0-Exit \n");
		System.out.println("1-Print all \n");
		System.out.println("2-Filter by color red \n");
		System.out.println("3-Add item \n");
		System.out.println("4-Remove item \n");
	}
	public static String inputText() {
		Scanner input = new Scanner(System.in);
    	String str = input.nextLine();
    	return str;
	}
	
	public static String inputVehicle() {
		System.out.print("What vehicle(Car/Bike/Motorbike)? ");
		String vehicle=inputText();
		String vehicle1=vehicle.substring(0, 1).toUpperCase();
		String vehicle2=vehicle.substring(1,vehicle.length()).toLowerCase();
		vehicle=vehicle1.concat(vehicle2);
		return vehicle;
	}
	
	public static String inputColor() {
		System.out.print("What color? ");
		String color=inputText();
		String color1=color.substring(0, 1).toUpperCase();
		String color2=color.substring(1,color.length()).toLowerCase();
		color=color1.concat(color2);
		return color;
	}
	
	public static Vehicle addVehicle() {
		String vehicle=inputVehicle();
		String color=inputColor();
		
		if (vehicle.equals("Car") && !isNumeric(color)) {
			Vehicle v = new Car(color);
			return v;
		}
		else if (vehicle.equals("Bike") && !isNumeric(color)) {
			Vehicle v = new Bike(color);
			return v;
		}
		else if (vehicle.equals("Motorbike") && !isNumeric(color)) {
			Vehicle v = new Motorbike(color);
			return v;
		}
		return null;
	}
	
	public void printError(String error) {
		System.out.println("ERROR: " + error );
	}
	
	public static boolean isNumeric(String str)
	{
	    for (char c : str.toCharArray())
	    {
	        if (!Character.isDigit(c)) return false;
	    }
	    return true;
	}
}
