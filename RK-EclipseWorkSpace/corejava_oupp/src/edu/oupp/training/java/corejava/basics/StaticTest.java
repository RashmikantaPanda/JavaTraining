package edu.oupp.training.java.corejava.basics;

class Employee{
	int id;
	String name;
	static String addr="BBSR";
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Employee() {
		id++;
//		static int a;
		System.out.println(id);
	}
	
	void display(){
		System.out.println(id+" "+name+" "+addr);
	}
	
	
}
public class StaticTest {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		
//		Employee.display();
//		Employee.display();
		
		e1.display();
		e2.display();
		
		Employee e3=new Employee(100,"RK Panda");
		e3.display();
	}

}
