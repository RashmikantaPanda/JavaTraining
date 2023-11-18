package edu.oupp.training.java.corejava.oops.inheritance;

class A1 {
	int a,b;

	public A1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	void show(){
		System.out.println("This is in parent class A");
		System.out.println("a= "+a+" b= "+b);
	}
	
}
class B extends A1{
	int c,d;
	
	public B(int a, int b,int c, int d){
		super(a,b);
		this.c=c;
		this.d=d;
	}
	void show(){
		System.out.println("This is in child class B");
		System.out.println("a= "+a+" b= "+b);
		System.out.println("c= "+c+" d= "+d);
	}
		
}

public class InheritanceExample{
	public static void main(String[] args) {
		A1 obj=new A1(10,20);
		B obj1=new B(30,40,50,60);
		obj.show();
		obj1.show();
		
	}
}
