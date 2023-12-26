package org.oupp.basics.basics;

class XYZ{
    int data;

    XYZ(){
        data=1;
    }

    public XYZ(int data) {
        this.data = data;
    }

    void display(){
        System.out.println("Data : "+data);
    }
}
public class DeepCopyShallowCopyTest {
    public static void main(String[] args) {
        XYZ ob1=new XYZ();
        ob1.display();
        XYZ ob2=ob1;
        ob2.display();
        ob1.data=10;
        ob2.display();
    }
}
