package edu.oupp.training.java.corejava.basics;

public class Customer {
	int customerId;
	String name;
	byte age;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public Customer() {

	}

	public Customer(int customerId, String name, byte age) {
		this.customerId = customerId;
		this.name = name;
		this.age = age;
	} 
	
	void show(){
		System.out.println("Id :"+this.customerId+" Name :"+this.name+" Age :"+this.age);
	}

	public static void main(String[] args) {
//		Customer customer1 = new Customer(100, "Rashmikanta", (byte) 23);
		Customer customer1=new Customer();
		customer1.setCustomerId(100);;
		customer1.setName("Rashmikanta Panda");
		customer1.setAge((byte) 20);
		
		customer1.show();

	}

}
