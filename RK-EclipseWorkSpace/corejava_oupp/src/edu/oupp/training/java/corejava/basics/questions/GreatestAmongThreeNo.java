package edu.oupp.training.java.corejava.basics.questions;
//Greatest among three numbers

import java.util.Scanner;

public class GreatestAmongThreeNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int number1,number2,number3;
		number1=sc.nextInt();
		number2=sc.nextInt();
		number3=sc.nextInt();
		
		System.out.println("Number1 = "+number1+" Number2 = "+number2+" Number3 = "+number3);
		
		int greatestNo=number1>(number2>number3?number2:number3)?number1:(number2>number1?number2:number1);
		System.out.println("Greatest number is "+greatestNo);
		sc.close();
	}
}
