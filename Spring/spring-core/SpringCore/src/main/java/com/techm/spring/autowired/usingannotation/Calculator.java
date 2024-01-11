package com.techm.spring.autowired.usingannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Operation operation;

    @Autowired
    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public int calculate(int a, int b){
        return operation.performOperation(a,b);
    }
}
