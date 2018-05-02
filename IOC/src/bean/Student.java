package bean;

public class Student {
	private String gender;
	private String name;

	public Student() {
		System.out.println("Student instance created");
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void greet(){
		System.out.println("Hello "+gender+" "+name);
	}

}
