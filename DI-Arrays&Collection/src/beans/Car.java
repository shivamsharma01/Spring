package beans;

import java.util.List;
import java.util.stream.Collectors;

public class Car {
	private String name;
	private Engine engine;
	private String[] features;
	private List<String> availableColors;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String[] getFeatures() {
		return features;
	}
	public void setFeatures(String[] features) {
		this.features = features;
	}
	public List<String> getAvailableColors() {
		return availableColors;
	}
	public void setAvailableColors(List<String> availableColors) {
		this.availableColors = availableColors;
	}
	@Override
	public String toString() {
		return "Car Name : "+this.name +this.engine+"\nTop features :\n"+String.join("\n", this.features)+"\nAvailable Colors :\n"+String.join("\n", this.availableColors.stream().map(str -> str.toUpperCase()).collect(Collectors.toList()));
	}
}
