package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import bean.Hello;

public class Tester {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("resources/spring.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		Hello helloObj = (Hello)bf.getBean("t");
	}
}
