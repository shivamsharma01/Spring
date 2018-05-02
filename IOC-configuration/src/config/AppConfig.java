package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bean.Book;
import bean.Student;

@Configuration
public class AppConfig {

	@Bean
	public Student student() {
		Student student = new Student();
		student.setGender("Mr.");
		student.setBook(book());
		return student;
	}
	
	@Bean
	public Book book() {
		return new Book("Pro Spring 5", "Iuliana Cosmina");
	}
	
}
