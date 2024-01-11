package com.techm.spring.di.field.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DISetterUsingCollection {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springcfg.xml");
		Questioin question=(Questioin)context.getBean("id3");
		System.out.println(question);
	}

}
