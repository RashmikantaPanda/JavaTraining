package edu.oupp.training.java.corejava.basics.questions;

import java.util.Scanner;

public class SimpleCalculator {

	static double add(double a, double b) {
		return a + b;
	}

	static double substraction(double a, double b) {
		return a - b;
	}

	static double multiplication(double a, double b) {
		return a * b;
	}

	static double division(double a, double b) {
		return a / b;
	}

	public static void main(String[] args) {
		System.out.println("------SIMPLE CALCULATOR-------");

		Scanner sc = new Scanner(System.in);
		double firstNumber, secondNumber;

		System.out.println("Enter FirstNumber : ");
		firstNumber = sc.nextDouble();
		System.out.println("Enter SecondNumber");
		secondNumber = sc.nextDouble();

		int choice = 1;
		char ch='y';
		while (choice != 0) {
			
			System.out.println("Press 1 for addition");
			System.out.println("Press 2 for substraction");
			System.out.println("Press 3 for multiplication");
			System.out.println("Press 4 for division");
			System.out.println("Press 5 for EXIT");

			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Addition is  : " + add(firstNumber, secondNumber));
				break;
			case 2:
				System.out.println("Substraction is  : " + substraction(firstNumber, secondNumber));
				break;
			case 3:
				System.out.println("Multiplication is  : " + multiplication(firstNumber, secondNumber));
				break;
			case 4:
				System.out.println("Division is  : " + division(firstNumber, secondNumber));
				break;
			case 5:
				choice=0;
				break;
			default :
				System.out.println("Please Enter a Valid Input");
				break;
			}
			
			System.out.println("Do you want to change the input (Y/N) : ");
			ch=sc.next().charAt(0);
			if(Character.toUpperCase(ch)=='Y'){
				System.out.println("Enter FirstNumber : ");
				firstNumber = sc.nextDouble();
				System.out.println("Enter SecondNumber");
				secondNumber = sc.nextDouble();
			}

		}
		sc.close();

	}

}
