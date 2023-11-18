package gov.oupp.training.java.corejava.questions.nov13;

class Shape{
    void draw(){
        System.out.println("Drawing .....");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        super.draw();
        System.out.println("Drawing a Circle");
    }
}
class Rectangle extends Shape{
    @Override
    void draw() {
        super.draw();
        System.out.println("Drawing a Rectangle");
    }
}
public class TestShape {
    public static void main(String[] args) {
        Shape circle=new Circle();
        circle.draw();

        Shape rectangle=new Rectangle();
        rectangle.draw();
    }
}
