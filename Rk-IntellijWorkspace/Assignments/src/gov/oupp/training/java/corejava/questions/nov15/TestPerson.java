package gov.oupp.training.java.corejava.questions.nov15;

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
public class TestPerson{
    public static void main(String[] args) {
        Person person1=new Person();
        person1.setName("Rashmikanta Panda");
        System.out.println(person1.getName());
    }
}
