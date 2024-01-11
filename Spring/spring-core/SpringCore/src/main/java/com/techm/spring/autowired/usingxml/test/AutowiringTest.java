package com.techm.spring.autowired.usingxml.test;

import com.techm.spring.autowired.usingxml.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("springcfg.xml");
        Employee emp=context.getBean("emp",Employee.class);
        System.out.println(emp);
    }
}
