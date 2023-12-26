package org.oupp.basics.basics;
class ABC{
    {
        System.out.println("Hello");
    }
    static {
        System.out.println("OK");
    }
    ABC(){
        System.out.println("YES");
    }

}
public class StaticBlockTest {
    public static void main(String[] args) {
        ABC ob1=new ABC();
        ABC ob2=new ABC();
        ABC ob3;
    }
}
