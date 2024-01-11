package com.techm.spring.di.constructor.test;

import com.techm.spring.di.constructor.model.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeConstructorTest {
    public static void main(String[] args) {
        Resource resource=new ClassPathResource("springcfg.xml");
        BeanFactory factory=new XmlBeanFactory(resource);

        Employee employee=(Employee) factory.getBean("employeeBean");
        System.out.println(employee);
    }
}
