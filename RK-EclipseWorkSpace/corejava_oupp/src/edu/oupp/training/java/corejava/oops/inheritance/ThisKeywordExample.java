package edu.oupp.training.java.corejava.oops.inheritance;

class AA{
	int a,b;
	
	AA(){
		this(10,20);
	}
	
	public AA(int i, int j) {
		this.a=i;
		this.b=j;
	}

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}
public class ThisKeywordExample {

	public static void main(String[] args) {
		AA aa=new AA();
		System.out.println(aa.getA());
		System.out.println(aa.getB());
		
		aa.setA(50);
		aa.setB(100);
		System.out.println(aa.getA());
		System.out.println(aa.getB());

	}

}
