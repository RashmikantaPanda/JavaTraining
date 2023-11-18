package edu.oupp.training.java.corejava.basics;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		boolean bool = true;

		int n = 1;
		while (n != 10) {
			if (bool) {
				System.out.println("n = " + n);
				n++;
				if(n==5){
					bool=false;
				}
			} else {
				n=n+1;
				System.out.println(" Thank You");
			}

		}
	}
}
