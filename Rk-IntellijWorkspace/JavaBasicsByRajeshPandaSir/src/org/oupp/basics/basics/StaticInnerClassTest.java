package org.oupp.basics.basics;
class Outer{
    static int data=10;
    int a=20;
    static class Inner{
        void show(){
            System.out.println(data);
//            System.out.println(a);   //Non-static field 'a' cannot be referenced from a static context
        }
    }
}

class MemberOuter{
    int a=100;
    static int b=200;
     class MemberInner{
        void display(){
            System.out.println(a);
            System.out.println(b);
        }

    }
}
public class StaticInnerClassTest {
    public static void main(String[] args) {
        Outer.Inner obj=new Outer.Inner();
        obj.show();


        MemberOuter  obj1=new MemberOuter();
        MemberOuter.MemberInner obj2=obj1.new MemberInner();
        obj2.display();

    }
}
