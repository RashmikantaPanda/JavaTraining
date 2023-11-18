package edu.oupp.training.java.corejava.oops.association;

public class TestComposition {
	public static void main(String[] args) {

		Student1 stud1=new Student1();
		stud1.setId(100);
		stud1.setName("Rk Panda");
		stud1.getAddress().setCity("KDP");
		stud1.getAddress().setState("Odisha");
		stud1.getAddress().setCountry("India");
		
		System.out.println(stud1);
		
//		stud1=null;
		if(stud1!=null){
			stud1.getAddress().setCity("BBSR");
			System.out.println(stud1);
		}
		else{
			System.out.println("Address can not found");
		}
			
	}

}
