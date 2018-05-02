package test;

import org.springframework.context.support.GenericXmlApplicationContext;

import beans.InjectSimpleSpel;

public class TestClass {
	public static void main(String... args) {
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
	ctx.load("classpath:resources/spring-annotation.xml");
	ctx.refresh();
	InjectSimpleSpel simple = (InjectSimpleSpel)ctx.getBean("injectSimpleSpel");
	System.out.println(simple);
	ctx.close();
	}
}	
