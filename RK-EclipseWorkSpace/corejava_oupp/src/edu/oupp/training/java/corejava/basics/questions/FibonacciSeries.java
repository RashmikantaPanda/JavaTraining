package edu.oupp.training.java.corejava.basics.questions;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the term upto which you want to print the fibonacci series : ");
		int n=sc.nextInt();
		int a,b;
		
		a=0;
		b=1;
		System.out.print(a+" ");
		for(int i=1; i<n; i++){
			a=a+b;
			b=a-b;
			System.out.print(a+" ");

		}
		sc.close();
		
		
	}

}
