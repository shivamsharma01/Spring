package beans;

import java.util.Map;
import java.util.Set;

public class Restaurant {
	public Set<String> menu;
	public Map<String, Integer> price;

	public Set<String> getMenu() {
		return menu;
	}

	public void setMenu(Set<String> menu) {
		this.menu = menu;
	}

	public Map<String, Integer> getPrice() {
		return price;
	}

	public void setPrice(Map<String, Integer> price) {
		this.price = price;
	}

	public void displayMenu() {
		for (String item : menu) {
			System.out.println(item);
		}
	}

	public void displayMenuAndPrice() {
		for (String item : this.price.keySet()) {
			System.out.println(item + " Rs." + this.price.get(item));
		}
	}
}
