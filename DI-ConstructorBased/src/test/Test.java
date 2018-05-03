package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Test {
	public static void main(String[] args) {
		String[] files = new String[]{"resources/car.xml","resources/engine.xml"};
		ApplicationContext appContext = new ClassPathXmlApplicationContext(files);
		Car car = appContext.getBean("car", Car.class);
		System.out.println(car);
	}
}
