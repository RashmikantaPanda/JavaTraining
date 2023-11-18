package gov.oupp.training.java.corejava.casestudies.ATMcasestudy;

import java.util.Scanner;

public class Contact {
    String email;
    String phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Contact(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    public Contact() {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your contact details");
//        System.out.println("Enter email id : ");
//        this.email=sc.nextLine();
//        System.out.println("Enter phone no : ");
//        this.phone=sc.nextLine();
//        sc.close();
    }

    @Override
    public String toString() {
        return "Contact{" +
                "email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
