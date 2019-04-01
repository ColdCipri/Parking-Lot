package View;
import java.util.Scanner;

import Model.*;
import Repository.*;
import Controller.Controller;

public class UI {
	Scanner sc ;
	public UI() {
		sc = new Scanner(System.in);
	}
	
	public void input() {
		Repository myRepo = new Repository();
		Vehicle a1= new Car("Blue");
		Vehicle a2= new Bike("Red");
		Vehicle a3= new Motorbike("Red");
		Vehicle a4= new Car("Green");
		myRepo.addItem(a1);
		myRepo.addItem(a2);
		myRepo.addItem(a3);
		myRepo.addItem(a4);
		
		int w=0;
		while (w==0) {
			Controller.printMenu();
			Scanner input = new Scanner(System.in);
	    	System.out.print("Enter an integer: ");
	    	int choice = input.nextInt();
	    	switch (choice) {
	    	case 1 :
	    		myRepo.printItem();
	    		break;
	    	case 2 :
	    		myRepo.filterPrint("red");
	    		break;
	    	case 3:
	    		Vehicle v = Controller.addVehicle();
	    		if (v == null)
	    			System.out.println("Failed to add vehicle! No such type of vehicle!");
	    		else {
	    			myRepo.addItem(v);
	    			System.out.println("Succesfully added!");
	    		}
	    		break;
	    	case 4:
	    		myRepo.removeItem();
	    		break;
	    	default: 
	    		w = 1;
	    		break;
	    	}
		}
	}
}
