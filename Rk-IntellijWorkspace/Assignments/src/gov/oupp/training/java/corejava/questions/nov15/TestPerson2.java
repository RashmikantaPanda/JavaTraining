package gov.oupp.training.java.corejava.questions.nov15;

class Person2{
    private String name;

    public Person2(String name) {
        this.name = name;
    }

    public void displayPerson2(){
        System.out.println("Name : "+this.name);
    }
}
public class TestPerson2 {
    public static void main(String[] args) {
        Person2 person=new Person2("Rashmikanta ");
        person.displayPerson2();
    }
}
