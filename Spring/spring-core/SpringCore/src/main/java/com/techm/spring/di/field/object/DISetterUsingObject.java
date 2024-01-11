package com.techm.spring.di.field.object;

import com.techm.spring.di.field.object.Employee2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DISetterUsingObject {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springcfg.xml");
		Employee2 emp=(Employee2)context.getBean("id2.2");
		System.out.println(emp);
	}

}
