package gov.in.oupp.training.java.corejava.questions.nov15;

interface Flyable{
    public void fly();
}
class Aeroplane implements Flyable{

    @Override
    public void fly() {
        System.out.println("Aeroplane fly with the speed of 500 Kmph");
    }
}
class Helicopter implements Flyable{

    @Override
    public void fly() {
        System.out.println("Helicopter fly with the speed of 100 kmph");
    }
}
class Rocket implements Flyable{

    @Override
    public void fly() {
        System.out.println("Rocket fly very fast, with the speed of 1200 kmph");
    }
}
public class TestFlayable {
    public static void main(String[] args) {
        Aeroplane aeroplane=new Aeroplane();
        aeroplane.fly();

        Helicopter helicopter=new Helicopter();
        helicopter.fly();

        Rocket rocket=new Rocket();
        rocket.fly();
    }
}
