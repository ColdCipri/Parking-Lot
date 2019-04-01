package Repository;

import java.util.ArrayList;
import java.util.Scanner;

import Model.*;

public class Repository implements RepoInterface {
	ArrayList<Vehicle> myRepo;
	public Repository() {
		myRepo = new ArrayList<>();
	}
	
	public ArrayList<Vehicle> getRepo() {
		return myRepo;
	}
	public void addItem(Vehicle e){
		if (e != null)
			this.myRepo.add(e);
		else
			throw new Error("Vehicle is null\n");
	}
	
	public void removeItem() {
		this.printItem();
		Scanner input = new Scanner(System.in);
		System.out.println("Which one do you want to remove?(insert position)");
    	int choice = input.nextInt();
    	choice--;
    	if (choice>=0 && choice<=myRepo.size())
    		this.myRepo.remove(choice);
    	else
    		System.out.println("Error! Possition inexistent!");
    		
	}
	
	public void printItem(){
		for (int i =0; i < myRepo.size(); i++){
					this.myRepo.get(i).print();
		}
	}
	
	public void filterPrint(String s){
		for (int i = 0; i < myRepo.size(); i++){
			if (this.myRepo.get(i).isRed()) 
					this.myRepo.get(i).print();
		}
	}
}
