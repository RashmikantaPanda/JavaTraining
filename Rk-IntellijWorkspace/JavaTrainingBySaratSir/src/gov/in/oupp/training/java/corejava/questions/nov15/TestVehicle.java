package gov.in.oupp.training.java.corejava.questions.nov15;

interface Vehicle{
    void move();
}
class Car1 implements Vehicle{

    @Override
    public void move() {
        System.out.println("Car uses both petrol and diesel to move");
        System.out.println("It moves on plain roads");
    }
}

class Train implements Vehicle{

    @Override
    public void move() {
        System.out.println("Train uses diesel and electricity to move");
        System.out.println("Train moves only on it's track");
    }
}

class Ships implements Vehicle{

    @Override
    public void move() {
        System.out.println("Ships uses only diesel to move");
        System.out.println("Ships moves only in water");
    }
}
public class TestVehicle {
    public static void main(String[] args) {
        Car1 car1=new Car1();
        car1.move();

        Train train=new Train();
        train.move();

        Ships ships=new Ships();
        ships.move();
    }
}
