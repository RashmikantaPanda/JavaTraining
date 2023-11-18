package edu.oupp.training.java.corejava.basics;
import java.util.Scanner;

class Calculator{
    private int number1;
    private int number2;

    public int add(){
        return  number1 + number2;
    }
    public int subtraction(){
        return number1 - number2;
    }
    public int multiplication(){
        return number1 * number2;
    }
    public int division(){
        return number1 / number2;
    }

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Calculator() {
    }
}

public class TestCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int number1, number2;
        number1=sc.nextInt();
        number2=sc.nextInt();
        Calculator c1=new Calculator(number1,number2);
        System.out.println("Addition : "+c1.add());
        System.out.println("Subtraction : "+c1.subtraction());
        System.out.println("Multiplication : "+c1.multiplication());
        System.out.println("Division : "+c1.division());
        
        sc.close();

    }
}
