package com.techm.spring.autowired.usingannotation;

import org.springframework.stereotype.Component;

@Component
public class Operation {
    public int performOperation(int a, int b){
        return a+b;
    }

}
