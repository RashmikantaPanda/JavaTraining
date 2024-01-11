package com.techm.spring.autowired.usingannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springcfg.xml");
        Calculator cal = (Calculator) context.getBean("calculator");
        System.out.println("SUM IS : "+cal.calculate(10,20));
    }
}
