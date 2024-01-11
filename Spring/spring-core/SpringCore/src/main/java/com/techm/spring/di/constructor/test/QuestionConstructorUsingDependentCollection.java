package com.techm.spring.di.constructor.test;

import com.techm.spring.di.constructor.model.Question;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class QuestionConstructorUsingDependentCollection {
    public static void main(String[] args) {
        Resource resource=new ClassPathResource("springcfg.xml");
        BeanFactory factory=new XmlBeanFactory(resource);

        Question question=(Question) factory.getBean("questionBean");
        System.out.println(question);
    }
}

