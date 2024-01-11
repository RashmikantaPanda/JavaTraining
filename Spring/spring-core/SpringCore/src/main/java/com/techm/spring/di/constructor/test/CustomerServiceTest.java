package com.techm.spring.di.constructor.test;

import com.techm.spring.di.constructor.model.CustomerService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CustomerServiceTest {
    public static void main(String[] args) {
        Resource resource=new ClassPathResource("springcfg.xml");
        BeanFactory factory=new XmlBeanFactory(resource);

        CustomerService cs1= (CustomerService) factory.getBean("customerServiceBean");
        cs1.setMessage("Message by customer 1");
        System.out.println("Message : "+cs1.getMessage());

        CustomerService cs2= (CustomerService) factory.getBean("customerServiceBean");
        System.out.println("Message : "+cs2.getMessage());
    }
}
