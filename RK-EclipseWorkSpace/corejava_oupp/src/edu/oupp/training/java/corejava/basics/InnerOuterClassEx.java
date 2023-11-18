package edu.oupp.training.java.corejava.basics;

import edu.oupp.training.java.corejava.basics.Outer.Inner;

class Outer{
	int a=5;
	void show(){
		System.out.println(a);
	}
	class Inner{
		int b=100;
		void display(){
			System.out.println(b+" "+a);
			show();
		}
	}
}
public class InnerOuterClassEx {
	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.show();
		
		Inner inner=outer.new Inner();
		inner.display();
	}
}
