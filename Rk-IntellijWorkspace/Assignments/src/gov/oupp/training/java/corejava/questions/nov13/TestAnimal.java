package gov.oupp.training.java.corejava.questions.nov13;

class Animal{
    void eat(){
        System.out.println("Animal Eats");
    }
}

class Dog extends Animal{
    @Override
    void eat() {
        super.eat();
        System.out.println("Dog is eating meat");
    }
}
class Cat extends Animal{
    @Override
    void eat() {
        super.eat();
        System.out.println("Cat is drinking milk");
    }
}

public class TestAnimal {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();

        Cat cat=new Cat();
        cat.eat();
    }
}
