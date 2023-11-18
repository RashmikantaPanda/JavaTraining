package edu.oupp.training.java.corejava.oops.inheritance;

class Parent {
	public Parent(){
		System.out.println("Constructor of A class");
	}
	void show(){
		System.out.println("class A's show method");
	}

}
class Child extends Parent{
	public Child(){
		super();
		System.out.println("Constructor of B Class");
	}
	void show(){
		super.show();
		System.out.println("Class B's show method");
	}
	
}

public class Test{
	public static void main(String[] args) {
		Child child=new Child();
		child.show();
	}
}