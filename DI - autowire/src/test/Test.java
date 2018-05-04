package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;

public class Test {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		System.out.println("============================byType=====================================");
		Car carByType = appContext.getBean("car1", Car.class);
		System.out.println(carByType);
		System.out.println("By Type searches for a bean with compatible type (implementation object base or child)");
		System.out.println("if more than 1 compatible objects are found then error is thrown");
		System.out.println("============================byName=====================================");
		Car carByName = appContext.getBean("car2", Car.class);
		System.out.println(carByName);
		System.out.println("By Name searches for a bean with compatible type (implementation object base or child) which has the same id/name as declared in class");
		System.out.println("id/name should always be unique in XML");
		System.out.println("============================constructor=================================");
		Bus busContructor = appContext.getBean("bus1", Bus.class);
		System.out.println("will try to find the matching autowired constructor");
		System.out.println(busContructor);
		System.out.println("============================autodetect==================================");
		Car carAutoDetect = appContext.getBean("car3", Car.class);
		System.out.println("will try to find no args constructor first, if found, we use it and then inject autowired setters");
		System.out.println(carAutoDetect);
		System.out.println("if not found, inject properties to autowired constructor (there can only be 1 autowired constructor)");
		Bus busAutoDetect = appContext.getBean("bus2", Bus.class);
		System.out.println(busAutoDetect);
	}
}
