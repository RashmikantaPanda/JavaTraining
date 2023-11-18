package gov.oupp.training.java.corejava.questions.nov15;

abstract class Animal{
     abstract public void sound();
     abstract public void moving();
}
class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("Dog makes sound Bhhow Bhow");
    }

    @Override
    public void moving() {
        System.out.println("Dog moves fast by its leg");
    }
}

class Bird extends Animal{

    @Override
    public void sound() {
        System.out.println("Birds makes silly noise");
    }

    @Override
    public void moving() {
        System.out.println("Birds can move by their legs and they can also fly with their wings");
    }
}

class Cat extends Animal{

    @Override
    public void sound() {
        System.out.println("Cat makes sounds like Meaww Meaww");
    }

    @Override
    public void moving() {
        System.out.println("Cat moves very fast with their legs");
    }
}
public class TestAnimal {
    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.moving();
        dog.sound();

        Animal bird=new Bird();
        bird.moving();
        bird.sound();

        Animal cat=new Cat();
        cat.moving();
        cat.sound();
    }

}
