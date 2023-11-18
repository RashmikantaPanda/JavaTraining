package gov.in.oupp.training.java.corejava.questions.nov15;

class Animal1{
    String name;

    void speak(){};
    public Animal1(String name) {
        this.name = name;
    }
}

class Dog1 extends Animal1 {
    public Dog1(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println("Dog is barking");
    }
}
class Cat1 extends Animal1 {
    public Cat1(String name) {
        super(name);
    }
    void speak(){
        System.out.println("Cat is chattering");
    }
}

class Bird1 extends Animal1 {
    public Bird1(String name) {
        super(name);
    }
    void speak(){
        System.out.println("Bird is whistling");
    }
}
abstract class Factory {
    public abstract Animal1 create();
}

class DogFactory extends Factory {


    @Override
    public Animal1 create() {
        return new Dog1("Dog");
    }
}

class CatFactory extends Factory{


    @Override
    public Animal1 create() {
        return new Cat1("Cat");
    }
}
class BirdFactory extends Factory{


    @Override
    public Animal1 create() {
        return new Bird1("Bird");
    }
}

public class TestFactory {
    public static void main(String[] args) {
        DogFactory dogFactory = new DogFactory();
        Animal1 dog = dogFactory.create();
        dog.speak();

        CatFactory catFactory=new CatFactory();
        Animal1 cat=catFactory.create();
        cat.speak();

        BirdFactory birdFactory=new BirdFactory();
        Animal1 bird=birdFactory.create();
        bird.speak();
    }
}
