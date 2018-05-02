package bean;

public class Student {
	private String gender;
	private String name;
	private Book book;

	public Student() {
		System.out.println("Student instance created");
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void greet(){
		System.out.println("Hello "+gender+" "+name);
	}

}
