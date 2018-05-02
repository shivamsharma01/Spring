package bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("book")
public class Book {
	private String name;
	private String author;

	public Book(@Value("Pro Spring 5") String name,@Value("Iuliana Cosmina") String author) {
		super();
		this.name = name;
		this.author = author;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void bookDetails() {
		System.out.println("Book Name: "+this.name +"\nBy: "+this.author);
	}

}
