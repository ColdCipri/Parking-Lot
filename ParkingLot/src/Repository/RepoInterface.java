package Repository;

import java.util.ArrayList;

import Model.Vehicle;

public interface RepoInterface {
	
	public ArrayList<Vehicle> getRepo();
	public void addItem(Vehicle v);
	public void removeItem();
	public void printItem();
	public void filterPrint(String s);
	
}
