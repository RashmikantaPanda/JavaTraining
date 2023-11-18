package gov.in.oupp.training.java.corejava.basics;

class Employee{
	static int id=0;
	static String name;
	public Employee() {
		id++;
//		static int a;
		System.out.println(id);
	}
	static void display(){
		System.out.println(id+" "+name);
	}
}
public class StaticTest {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
	}

}
