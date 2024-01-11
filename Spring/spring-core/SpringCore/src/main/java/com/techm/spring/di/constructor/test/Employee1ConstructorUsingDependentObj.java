package com.techm.spring.di.constructor.test;

import com.techm.spring.di.constructor.model.Employee1;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Employee1ConstructorUsingDependentObj {
    public static void main(String[] args) {
        Resource resource=new ClassPathResource("springcfg.xml");
        BeanFactory factory=new XmlBeanFactory(resource);

        Employee1 employee=(Employee1) factory.getBean("employeeBean1");
        System.out.println(employee);
    }
}
