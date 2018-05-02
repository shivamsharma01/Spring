package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Student;

public class Test {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		Student student = (Student)appContext.getBean("t");
		student.setName("Shivam");
		student.greet();
	}
}
