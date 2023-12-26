package org.oupp.basics.basics;

interface OuterInterface {

    void display();
    static class NestedClass {
        static void nestedMethod() {
            System.out.println("Static method in the nested class");
        }
    }
}

public class InterfaceWithNestedClassExample {
    public static void main(String[] args) {
        OuterInterface.NestedClass nestedInstance = new OuterInterface.NestedClass();
        // Call the static method in the nested class
        nestedInstance.nestedMethod();
        // You can also directly call the static method without creating an instance
        OuterInterface.NestedClass.nestedMethod();
    }
}
