package edu.oupp.training.java.corejava.basics.questions;
//Greatest among two Number

import java.util.Scanner;

public class GreatestAmongTwoNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int number1,number2;
		number1=sc.nextInt();
		number2=sc.nextInt();
		
		System.out.println("Number1 = "+number1+" Number2 = "+number2);
		
		int greatestNo=(number1>number2)?number1:number2;
		System.out.println("Greatest number is "+greatestNo);
		sc.close();
	}
}
