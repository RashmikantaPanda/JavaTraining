package gov.oupp.training.java.corejava.questions.nov13;

import java.util.Scanner;

public class Student {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void displayStudentInformation(){
        System.out.println("-------Student Details--------");
        System.out.println("Name : "+this.name);
        System.out.println("Roll No : "+this.rollNo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student details :- ");
        System.out.println("Name : ");
        String name=sc.nextLine();
        System.out.println("Roll No : ");
        int rollNo=sc.nextInt();

        Student student1=new Student(name,rollNo);
        student1.displayStudentInformation();
    }
}
