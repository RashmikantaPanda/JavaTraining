package gov.oupp.training.java.corejava.questions.nov15;

class Car{
    protected int mileage;

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    
    public void increseMileage(){
        this.mileage+=5;
    }
}
public class TestCar {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setMileage(20);
        System.out.println("Mileage is : "+car1.getMileage()+" Kmph");
        car1.increseMileage();
        System.out.println("Mileage increased (5), Now mileage is "+car1.getMileage()+" Kmph");
    }
}
