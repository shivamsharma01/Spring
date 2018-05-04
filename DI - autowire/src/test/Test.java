package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Test {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		Car carByType = appContext.getBean("car1", Car.class);
		System.out.println(carByType);
		Car carByName = appContext.getBean("car2", Car.class);
		System.out.println(carByName);
		Car carDefault = appContext.getBean("car3", Car.class);
		System.out.println(carDefault);
	}
}
