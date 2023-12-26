package org.oupp.basics.basics;

class A{
    int a=10;

    void show(){
        System.out.println("Inside A ,a="+a);
    }
}
class B extends A{
    int a=20;
    void show(){
        System.out.println("Inside B, a="+a);
    }

    void display(){
        System.out.println("Display method inside B, a="+a);
    }
}

public class RuntimePolymerphisimTest {
    public static void main(String[] args) {
        A obj1=new A();
        obj1.show();

        B obj2=new B();
        obj2.show();

        A obj3=new B();
        obj3.show();
    }
}
