package edu.oupp.training.java.corejava.oops.association;

public class Addition {
	int num1;
	int num2;
	
	public Addition(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public Addition() {
		super();
	}
	public Addition add(){
		System.out.println((num1+num2));
		Addition addition=new Addition();
		return addition;
		
	}
	@Override
	public String toString() {
		return "Addition [num1=" + num1 + ", num2=" + num2 + "]";
	}
}
