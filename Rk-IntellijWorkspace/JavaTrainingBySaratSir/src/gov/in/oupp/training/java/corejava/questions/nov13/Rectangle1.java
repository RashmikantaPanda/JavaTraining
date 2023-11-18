package gov.in.oupp.training.java.corejava.questions.nov13;

import java.util.Scanner;

public class Rectangle1 {
    float length;
    float width;

    public Rectangle1(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public double areaOfRectancgle(){
        return this.length* this.width;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of rectangle : ");
        float length=sc.nextFloat();
        System.out.println("Enter width of rectangle : ");
        float width=sc.nextFloat();

        Rectangle1 rectangle=new Rectangle1(length,width);
        System.out.println("Area of the rectangle is : "+rectangle.areaOfRectancgle()+" sq unit");
    }
}
