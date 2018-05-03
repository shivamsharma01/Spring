package beans;

public class Engine {
	private String name;
	
	public Engine(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "\nEngine : "+this.name;
	}
}
