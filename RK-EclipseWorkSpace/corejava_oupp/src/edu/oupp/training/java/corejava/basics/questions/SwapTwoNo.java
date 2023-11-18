package edu.oupp.training.java.corejava.basics.questions;

import java.util.Scanner;

//Swap two no without using third variable
public class SwapTwoNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		double number1,number2;
		number1=sc.nextDouble();
		number2=sc.nextDouble();
		System.out.println("Before Swapping \n Number1 = "+number1+" Number2 = "+number2);
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		
		System.out.println("After Swapping \n Number1 = "+number1+" Number2 = "+number2);
		sc.close();

	}

}
