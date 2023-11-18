package edu.oupp.training.java.corejava.basics.questions;

import java.util.Scanner;

class Account {
	String accNo;
	String accHolderName;
	int balance;

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	void deposit(int amount) {
		this.balance += amount;
		System.out.println("Your account has been credited with " + amount + " Ruppess");
	}

	void withdraw(int amount) {
		if (this.balance < amount) {
			System.out.println("Low Balance ! Withdraw can not be possible");
		} else {
			this.balance -= amount;
			System.out.println("Your account has been debited with " + amount + " Ruppees");
		}
	}

	void checkBalance() {
		System.out.println("Available Balance = " + this.balance);
	}

	void display() {
		System.out.println("Name : " + accHolderName + "\nAccount No : " + accNo + "\nAvailable Balance : " + balance);
	}

}

public class AtmSimulator {
	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.setAccHolderName("Rashmikanta Panda");
		acc1.setAccNo("0737010155497");
		acc1.setBalance(100);

		Scanner sc = new Scanner(System.in);
		int choice = 1;
		int amount;
		while (choice != 0) {

			System.out.println("\nPress 1 for Check Balance");
			System.out.println("Press 2 for Deposite");
			System.out.println("Press 3 for Withdraw");
			System.out.println("Press 4 for AccountDetails");
			System.out.println("Press 5 for EXIT");

			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			System.out.println();
			switch (choice) {
			case 1:
				acc1.checkBalance();
				break;
			case 2:
				System.out.println("Enter the amount : ");
				amount = sc.nextInt();
				acc1.deposit(amount);
				break;
			case 3:
				System.out.println("Enter the amount : ");
				amount = sc.nextInt();
				acc1.withdraw(amount);
				break;
			case 4:
				acc1.display();
				break;
			case 5:
				choice =0;
				System.out.println("Thank you fou usign our service :)\nExited");
				break;
			default:
				System.out.println("Please Enter a Valid Input");
				break;
			}
		}
		sc.close();
	}
}