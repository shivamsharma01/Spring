package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Student;

public class Test {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("resources/spring-annotation.xml");
		Student student = appContext.getBean("student", Student.class);
		student.setName("Shivam");
		student.greet();
		student.getBook().bookDetails();
	}
}
