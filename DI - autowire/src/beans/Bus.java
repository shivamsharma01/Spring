package beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Bus {
	private String name;
	private Engine engine;

	@Autowired
	public Bus(Engine engine) {
		System.out.println("Parameterized Bus constructor");
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		System.out.println("Bus Engine Setter");
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Bus Name : "+this.name +this.engine;
	}	

}
