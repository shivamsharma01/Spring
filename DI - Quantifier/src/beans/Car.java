package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	@Qualifier(value="e1")
	@Autowired
	private Engine engine;
	@Override
	public String toString() {
		return this.engine.toString();
	}	
}
