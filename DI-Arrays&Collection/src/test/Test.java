package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;
import beans.Restaurant;

public class Test {
	public static void main(String[] args) {
		String[] files = new String[]{"resources/car.xml","resources/engine.xml", "resources/restaurant.xml"};
		ApplicationContext appContext = new ClassPathXmlApplicationContext(files);
		Car car = appContext.getBean("car", Car.class);
		System.out.println(car);
		Restaurant restaurant = appContext.getBean("restaurant", Restaurant.class);
		restaurant.displayMenu();
		restaurant.displayMenuAndPrice();
	}
}
