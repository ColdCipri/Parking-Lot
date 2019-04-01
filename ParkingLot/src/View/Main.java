package View;

import Repository.Repository;
import View.UI;

public class Main {
	public static void main (String[] args) {
		Repository repo = new Repository();
		UI view = new UI();
		try {			
			view.input();
		} catch (Exception e) {
			System.out.println("Error");
			
		}
		
	}
}
