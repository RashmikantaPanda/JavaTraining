package edu.oupp.training.java.corejava.junit;
public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int subtraction(int a, int b){
        return a-b;
    }
    public int multiplication(int a, int b){
        return a*b;
    }
    public int division(int a, int b){
    	 if(b==0){
             throw new ArithmeticException("Can not divide by zero");
         }
        return a/b;
    }

}
