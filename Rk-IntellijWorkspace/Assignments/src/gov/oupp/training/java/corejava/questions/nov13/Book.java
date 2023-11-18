package gov.oupp.training.java.corejava.questions.nov13;

import java.util.Scanner;

public class Book {
    String title;
    String author;
    float price;

    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void printBookDetails(){
        System.out.println("------Book Details------");
        System.out.println("Title : "+this.title);
        System.out.println("Author : "+this.author);
        System.out.println("Price : "+this.price);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter book details-");
        System.out.println("Enter book title : ");
        String title=sc.nextLine();
        System.out.println("Enter book author name : ");
        String authorName=sc.nextLine();
        System.out.println("Enter book price : ");
        float price=sc.nextFloat();

        Book book1=new Book(title,authorName,price);
        book1.printBookDetails();
    }
}
