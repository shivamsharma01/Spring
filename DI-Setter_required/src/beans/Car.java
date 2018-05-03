package beans;

import org.springframework.beans.factory.annotation.Required;

public class Car {
	private String carName;
	private Engine engine;

	@Required
	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Required
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void printData() {
		System.out.println(this.carName +" "+this.engine.getModelName());
	}
	
}
