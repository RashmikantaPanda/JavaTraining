package edu.oupp.training.java.corejava.oops.association;

public class TestAggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address=new Address();
		address.setCity("Bhubaneswar");
		address.setState("Odisha");
		address.setCountry("India");
		
		Address address2=null;
	
		
		Student student=new Student();
		student.setId(100);
		student.setName("Rk Panda");;
		student.setAddress(address);
		
		Student student2=new Student();
		student2.setId(101);
		student2.setName("TP Panda");;
		student2.setAddress(address2);
		
		System.out.println(student);
		System.out.println(student2);
		
	}

}
