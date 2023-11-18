package com.banking.management;

import java.util.Scanner;

public class ManageAccount {
    public static void main(String[] args) {
        System.out.println("-----BANKING MANAGEMENT SYSTEM------\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account number : ");
        Integer accNo=sc.nextInt();
        System.out.println("Enter account holder name : ");
        String accHolderName=sc.next();

//        Account account1=new Account(accNo,accHolderName,0);

        Account account1=new Account();
        account1.setAccNo(accNo);
        account1.setAccHolderName(accHolderName);
        account1.setBalance(0);
        int check=1;
        while(check!=0){
            System.out.println("\nWhat you want to do \n");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit ");
            System.out.println("3. Withdraw");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.println("Enter your choice : ");
            check=sc.nextInt();
            System.out.println();
            switch (check){
                case 1:
                    System.out.println("Your balance is : "+account1.checkBalance());
                    break;
                case 2:
                    System.out.println("How much amount you want to deposit ? ");
                    Integer depositAmount=sc.nextInt();
                    account1.deposit(depositAmount);
                    System.out.println("Amount "+depositAmount+" is credited to your account");
                    break;
                case 3:
                    System.out.println("How much amount you want to withdraw ? ");
                    Integer withdrawAmount=sc.nextInt();
                    if(account1.withdraw(withdrawAmount)){
                        System.out.println(withdrawAmount+" amount has been debited from your account");
                    }
                    else {
                        System.out.println("Low Balance ! ");
                    }
                    break;
                case 4:
                    System.out.println(account1.toString());
                    break;
                case 5:
                    check =0;
                    break;
                default:
                    System.out.println("Please Enter a valid input !");
                    break;
            }
        }
    }
}
