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
}
