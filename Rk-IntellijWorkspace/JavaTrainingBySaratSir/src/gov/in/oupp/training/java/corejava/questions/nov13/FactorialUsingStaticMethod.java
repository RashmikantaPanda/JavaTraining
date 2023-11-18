package gov.in.oupp.training.java.corejava.questions.nov13;

import java.util.Scanner;

public class FactorialUsingStaticMethod {
    public static long factorialOfANumber(int n){
        long fact=1;
        while(n>0){
            fact=fact*n;
            n--;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("-----Factorial of a Number------");
        System.out.println("Enter a number to find it's factorial : ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is : "+factorialOfANumber(n));
    }
}
