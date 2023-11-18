package org.oupp.assginments.ATMcasestudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestATM {

    public static void main(String[] args) throws IOException {
        System.out.println("----------------------------");
        System.out.println("        ATM SIMULATOR       ");
        System.out.println("----------------------------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String name, city, state, country, email, phone, createAcc, applyForATM, input;
        int pin, selectAccType, choice, depositAmount, withdrawAmount, newAtmPin, oldAtmPin,authenticatePin;
        Customer customer;

        System.out.println("Do you want to continue with existing data or new data ?(Y/N)");
        input = sc.nextLine();
        /*If you want to continue with existing customer's details*/
        if (input.charAt(0) == 'Y' || input.charAt(0) == 'y') {
            Address address = new Address("KDP", "Odisha", "India", 754208);
            Contact contact = new Contact("rkpanda123@gmail.com", "9437539215");
            customer = new Customer("Rk Panda", address, contact);
        }
        /*If you want to provide new customer's details*/
        else {
            System.out.println("Enter your personal details");
            System.out.println("Enter your name : ");
            name = sc.nextLine();
            System.out.println("Enter your address-");
            System.out.println("Enter your city : ");
            city = sc.nextLine();
            System.out.println("Enter your state : ");
            state = sc.nextLine();
            System.out.println("Enter your country : ");
            country = sc.nextLine();
            System.out.println("Enter your pin code : ");
            pin = Integer.parseInt(br.readLine());
            System.out.println("Enter contact details-");
            System.out.println("Enter email id : ");
            email = sc.nextLine();
            System.out.println("Enter phone no : ");
            phone = sc.nextLine();

            Address address = new Address(city, state, country, pin);
            Contact contact = new Contact(email, phone);
            customer = new Customer(name, address, contact);
        }


        System.out.println("Do you want to create account ? (Y/N)");
        createAcc = sc.nextLine();
        if (createAcc.charAt(0) == 'y' || createAcc.charAt(0) == 'Y') {
            /*Which types of account you want to create ?*/
            System.out.println("Which types of account you want to create ?");
            System.out.println("1. Saving Account : ");
            System.out.println("2. Current Account : ");
            selectAccType = Integer.parseInt(br.readLine());
            if (selectAccType == 1) {
                customer.setAccount(customer.createSavingAccount());
                System.out.println("Saving account created successfully");
                System.out.println("Your account number is : " + customer.getAccount().getAccountNo());
            }
            if (selectAccType == 2) {
                customer.setAccount(customer.createCurrentAccount());
                System.out.println("Current account created successfully");
                System.out.println("Your account number is : " + customer.getAccount().getAccountNo());
            }

            /*Apply ATM*/
            System.out.println("Do you want to apply for ATM Card ? (Y/N)");
            applyForATM = sc.nextLine();
            if (applyForATM.charAt(0) == 'y' || applyForATM.charAt(0) == 'Y') {
                customer.getAccount().createCard();
                System.out.println("Card issued successfully");
                System.out.println("Card Number : " + customer.getAccount().getCard().getCardNumber());
                System.out.println("Expiry Date: " + customer.getAccount().getCard().getExpiryDate());


                /*Can do the following things after having an account and ATM Card*/
                do {
                    System.out.println("\nYou can do the following things");
                    System.out.println("0. EXIT");
                    System.out.println("1. Account Details");
                    System.out.println("2. Check Balance");
                    System.out.println("3. Deposit Money");
                    System.out.println("4. Withdraw Money");
                    System.out.println("5. Check Card Details");
                    System.out.println("6. Change ATM Pin");
                    System.out.println("7. View Transaction History");
                    System.out.println("Enter your choice : ");
                    choice = Integer.parseInt(br.readLine());
                    switch (choice) {
                        case 0:
                            choice = 0;
                            System.out.println("Thank you for using our service. \nExited");
                            break;
                        case 1:
                            System.out.println(customer.getAccount());
                            break;
                        case 2:
                            System.out.println("Available Balance : " + customer.getAccount().getBalance());
                            break;
                        case 3:
                            System.out.println("Enter the amount to be deposit : ");
                            depositAmount = Integer.parseInt(br.readLine());
                            if (customer.getAccount().deposit(depositAmount)) {
                                System.out.println("Deposit Success");
                            } else {
                                System.out.println("Something went wrong");
                            }
                            break;
                        case 4:
                            System.out.println("Enter your ATM Pin");
                            authenticatePin=Integer.parseInt(br.readLine());
                            System.out.println("Enter the amount to be withdraw : ");
                            withdrawAmount = Integer.parseInt(br.readLine());
                            if (customer.getAccount().withdraw(authenticatePin,withdrawAmount)) {
                                System.out.println("Withdraw Success");
                            } else {
                                System.out.println("You don't have sufficient balance !");
                            }
                            break;
                        case 5:
                            System.out.println(customer.getAccount().getCard());
                            break;
                        case 6:
                            System.out.println("Enter the old PIN : ");
                            oldAtmPin = Integer.parseInt(br.readLine());
                            System.out.println("Enter the new PIN");
                            newAtmPin = Integer.parseInt(br.readLine());
                            if (customer.getAccount().getCard().changePin(oldAtmPin, newAtmPin)) {
                                System.out.println("Pin changed successfully");
                            } else {
                                System.out.println("Please enter the valid pin");
                            }
                            break;
                        case 7:
//                            System.out.println(customer.getAccount().getTransactions());
                            customer.getAccount().miniStatement();
                            break;

                        default:
                            System.out.println("Please enter a valid choice");
                            break;
                    }
                } while (choice != 0);
            } else {
                System.out.println("You can't do any transactions without ATM");
            }
        } else {
            System.out.println("You can open your saving account which gives 3.5% interest rate.");
        }


    }

    /*Demo method to test ATM functionality*/
    public static void main1(String[] args) {
        Address address1 = new Address("KDP", "Odisha", "India", 754208);
        Contact contact1 = new Contact("rkpanda123@gmail.com", "9437539215");
        Customer customer1 = new Customer("Rk Panda", address1, contact1);

//      Account account=customer1.createSavingAccount();  //Create Saving Account
        Account account = customer1.createCurrentAccount();  //Create Current Account
        customer1.setAccount(account);

//        Card card=customer1.getAccount().createCard();
        System.out.println(customer1.getAccount());

//        customer1.setCard(card);
//        System.out.println(customer1.getCard());
//        customer1.getCard().changePin(1234,1111);
//        System.out.println(customer1.getCard());

//        customer1.getAccount().setCard(card);

        customer1.getAccount().createCard();
        System.out.println("Account Details : " + customer1.getAccount().getCard());

        System.out.println(customer1.getAccount());
        customer1.getAccount().deposit(2000);
        int balance = customer1.getAccount().getBalance();
        System.out.println(balance);

        System.out.println(customer1.getAccount().getTransactions());

        customer1.getAccount().deposit(5000);
        customer1.getAccount().withdraw(1234,1000);


        System.out.println(customer1.getAccount().getTransactions());

        System.out.println(customer1);
    }
}
