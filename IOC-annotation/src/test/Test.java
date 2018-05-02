package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bean.Student;
import config.AppConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student = appContext.getBean("student", Student.class);
		student.setName("Shivam");
		student.greet();
		student.getBook().bookDetails();
	}
}
