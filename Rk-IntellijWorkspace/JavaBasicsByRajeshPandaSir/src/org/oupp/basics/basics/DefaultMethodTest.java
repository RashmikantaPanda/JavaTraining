package org.oupp.basics.basics;

interface InterfaceABC {
    public void display();

    default void show() {
        System.out.println("This is the default method");
    }
}

class ClassXYZ implements InterfaceABC {
    @Override
    public void display() {
        System.out.println("This is display method");
    }
}

public class DefaultMethodTest {
    public static void main(String[] args) {
        ClassXYZ ob = new ClassXYZ();
        ob.display();
        ob.show();


        InterfaceABC ob1 = new InterfaceABC() {
            @Override
            public void display() {
                System.out.println("Overriding display() in anonymous class");
            }
        };

        ob1.display();
        ob1.show();
    }
}
