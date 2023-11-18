package edu.oupp.training.java.corejava.basics;
public class TestReturningAnObject {
    public static void main(String[] args) {
        Addition addition1=new Addition(10,20);
        Addition addition2=addition1.add();

        System.out.println(addition2);
    }

}
