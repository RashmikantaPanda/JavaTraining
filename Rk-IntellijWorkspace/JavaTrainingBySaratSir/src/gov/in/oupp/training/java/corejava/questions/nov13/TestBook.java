package gov.in.oupp.training.java.corejava.questions.nov13;

import java.util.Scanner;

class Book1 {
    String title;
    String author;
    double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class TestBook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Book1 book1=new Book1();

        System.out.println("Enter book title : ");
        String title=sc.nextLine();
        System.out.println("Enter book author name : ");
        String authorName=sc.nextLine();
        System.out.println("Enter book price : ");
        double price=sc.nextFloat();

        book1.setTitle(title);
        book1.setAuthor(authorName);
        book1.setPrice(price);

        System.out.println("Book title : "+book1.getTitle());
        System.out.println("Book author : "+book1.getAuthor());
        System.out.println("Book price : "+book1.getPrice());
    }
}
