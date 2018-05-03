package beans;

import java.util.Hashtable;
import java.util.TreeSet;
import java.util.Vector;
	
public class Restaurant {
	private Vector ourLocations;
	public TreeSet menu;
	public Hashtable price;

	public void setOurLocations(Vector ourLocations) {
		this.ourLocations = ourLocations;
	}

	public void setMenu(TreeSet menu) {
		this.menu = menu;
	}

	public void setPrice(Hashtable price) {
		this.price = price;
	}

	public void displayLocations() {
		System.out.println("Our Locations");
		for (Object location : this.ourLocations) {
			System.out.println(location);
		}
	}

	public void displayMenu() {
		System.out.println("Presenting the Menu");
		for (Object item : this.menu) {
			System.out.println(item);
		}
	}

	public void displayMenuAndPrice() {
		System.out.println("Here is the Menu with Price");
		for (Object item : this.price.keySet()) {
			System.out.println(item + " Rs." + this.price.get(item));
		}
	}

}
