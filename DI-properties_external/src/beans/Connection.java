package beans;

import java.util.Properties;

public class Connection {
	private Properties property;

	public Properties getProperty() {
		return property;
	}

	public void setProperty(Properties property) {
		this.property = property;
	}
	
	public String getValue(String key) {
		return this.property.getProperty(key);
	}
	public void printProperties() {
		for(Object key: this.property.keySet()) {
			System.out.println("Key: "+key+" Value: "+this.property.getProperty((String) key));
		}
	}
}
