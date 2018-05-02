package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import bean.Pojo;

public class Test {
	public static void main(String[] args) {
		coreContainer();
		System.out.println("============================================");
		J2EEContainer();
	}
	public static void coreContainer() {
		System.out.println("Core Container(BeanFactory) Called");
		Resource r = new ClassPathResource("resources/spring.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		System.out.println("BeanFactory instantiates beans on request using getBean method");
		Pojo helloObj = (Pojo)bf.getBean("t");
		System.out.println("Use this when memory utilization is important.,\nToo many beans onload of server will affect the memory");		
	}
	
	public static void J2EEContainer() {
		System.out.println("J2EE Container(ApplicationContext) Called");
		ApplicationContext appc = new ClassPathXmlApplicationContext("resources/spring.xml");
		// Pojo helloObj = (Pojo)appc.getBean("t");
		System.out.println("ApplicationContext instantiates singleton beans on load");
		System.out.println("Use this when bean creation takes time.");
	}
}
