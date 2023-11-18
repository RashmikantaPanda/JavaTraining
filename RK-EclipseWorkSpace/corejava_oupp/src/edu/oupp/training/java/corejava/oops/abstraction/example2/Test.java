package edu.oupp.training.java.corejava.oops.abstraction.example2;

class A{
	int a=100;
	void m1(){}
	void m2(){}
	void show(){
		System.out.println(a);
	}
}
class B extends A{
	int a=1000;
	void m3(){}
	void m4(){}
	void show(){
		System.out.println(a);
	}
}

public class Test {

	public static void main(String[] args) {

		A b1=new B(); //OK
	
		b1.show(); //1000
		b1.m1();//OK
		b1.m2();//OK
//		b1.m3();//Compile Error
//		b1.m4();//Compile Error		
	}
}
