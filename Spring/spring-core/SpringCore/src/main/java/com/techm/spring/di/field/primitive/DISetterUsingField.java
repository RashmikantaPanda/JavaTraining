package com.techm.spring.di.field.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DISetterUsingField {

	public static void main(String[] args) {
		
		ApplicationContext context;
		context=new ClassPathXmlApplicationContext("springcfg.xml");
		Employee emp=(Employee)context.getBean("id1");
		System.out.println(emp);
	}

}
