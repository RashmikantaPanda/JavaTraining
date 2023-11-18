package edu.oupp.training.java.corejava.basics.questions;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int principal,time;
		float rate;
		System.out.println("Enter the Principla Amount : ");
		principal=sc.nextInt();
		System.out.println("Enter the time (in years) ");
		time=sc.nextInt();
		System.out.println("Enter Rate of Interest: ");
		rate=sc.nextFloat();
		
		
		System.out.println("Simple Interest is : "+(principal*time*rate)/100);
		sc.close();
	}

}
