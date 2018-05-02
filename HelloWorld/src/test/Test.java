package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import bean.Pojo;

public class Test {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("resources/spring.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		Pojo helloObj = (Pojo)bf.getBean("t");
	}
}
