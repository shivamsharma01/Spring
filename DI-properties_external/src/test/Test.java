package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Connection;

public class Test {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("resources/properties.xml");
		Connection connection = appContext.getBean("connection", Connection.class);
		connection.printProperties();
	}
}
