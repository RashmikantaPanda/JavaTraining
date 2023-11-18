package edu.oupp.training.java.corejava.basics.questions;
//Armstrong number check

import java.util.Scanner;

public class ArmstrongNoCheck {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=sc.nextInt();
		int digits=(int)Math.log10(number)+1;
		
		System.out.println(digits);
		
		int rem,sum=0,temp=number;
		while(number!=0){
			rem=number%10;
			sum=sum+(int)Math.pow(rem,digits);
			number=number/10;
		}
		
		if(sum==temp)
			System.out.println(temp+" is an Armstrong Number");
		else
			System.out.println(temp+" is not an Armstrong Number");
		
		sc.close();
	}

}
