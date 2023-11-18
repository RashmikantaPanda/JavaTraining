package edu.oupp.training.java.corejava.annotations;

import java.util.ArrayList;

class A{
	@Deprecated
	void show(){
		System.out.println("I am in base class (A)");
	}
}
class B extends A{

	@Override
	void show() {
		System.out.println("I am in sub class (B)");
	}
	
}
public class TestOverride {
	public static void main(String[] args) {
		A a1=new A();
		a1.show();
		
		@SuppressWarnings({"rawtypes","unused"})
		ArrayList al=new ArrayList<>();
	}

}
