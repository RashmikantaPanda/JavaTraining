package edu.oupp.training.java.corejava.basics.questions;
//Even Odd Check

import java.util.Scanner;

public class EvenOddCheck {
	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number%2==0)
			System.out.println(number+" is an Even Number");
		else
			System.out.println(number+" is an Odd Number");
		
		sc.close();
	}
}
