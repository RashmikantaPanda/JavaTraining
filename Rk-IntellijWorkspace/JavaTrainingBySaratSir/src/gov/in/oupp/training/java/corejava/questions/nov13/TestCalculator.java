package gov.in.oupp.training.java.corejava.questions.nov13;

class Calculator{
    int  calculate(int a, int b){
        return a+b;
    }
}
class Subtraction extends Calculator{
    int calculator(int a,int b){
        return a-b;
    }
}
class Multiplication extends Calculator{
    int calculator(int a,int b){
        return a*b;
    }
}
class Division extends Calculator{
    int calculator(int a,int b){
        return a/b;
    }
}
public class TestCalculator {
    public static void main(String[] args) {
        Calculator addition= new Calculator();
        System.out.println("Addition : "+addition.calculate(20,10));

        Calculator substraction=new Subtraction();
        System.out.println("Substraction : "+substraction.calculate(20,10));

        Calculator multiplication=new Multiplication();
        System.out.println("multiplication : "+multiplication.calculate(20,10));

        Calculator division=new Division();
        System.out.println("Division : "+division.calculate(20,10));
    }
}
