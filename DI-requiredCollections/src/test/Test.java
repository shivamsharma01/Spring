package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Restaurant;

public class Test {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("resources/collection.xml");
		System.out.println("By Default List returns ArrayList\nSet returns LinkedHashSet \nAnd Map returns LinkedHashMap");
		System.out.println("If the bean being instantiated is not using Interface declaration eg. 'List attr;'but is using implementation class 'Vector attr;'");
		System.out.println("util namespace is required to inject the appropriate type collection");
		System.out.println("util namespace is not supported by dtd therefore in the collection.xml we have used xml schemas");
		Restaurant restaurant = appContext.getBean("restaurant", Restaurant.class);
		restaurant.displayLocations();
		restaurant.displayMenu();
		restaurant.displayMenuAndPrice();
	}
}
