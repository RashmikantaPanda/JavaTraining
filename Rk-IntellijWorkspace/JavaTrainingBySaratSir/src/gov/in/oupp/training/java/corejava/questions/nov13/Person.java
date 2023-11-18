package gov.in.oupp.training.java.corejava.questions.nov13;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonDetails(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
    }

    public static void main(String[] args) {
        Person person1=new Person("Rashmikanta Panda", 23);
        Person person2=new Person("Tarinee Prasad", 24);
        Person person3=new Person("Susobhan Pattanaik", 23);

        person1.displayPersonDetails();
        person2.displayPersonDetails();
        person3.displayPersonDetails();
    }
}
