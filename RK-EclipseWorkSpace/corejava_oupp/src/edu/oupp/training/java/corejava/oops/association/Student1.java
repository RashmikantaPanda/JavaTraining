package edu.oupp.training.java.corejava.oops.association;

public class Student1 {
	int id;
	String name;
	Address1 address;
	

	public Student1(int id, String name, Address1 address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}


	public Student1() {
		address=new Address1();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address1 getAddress() {
		return address;
	}


	public void setAddress(Address1 address) {
		this.address = address;
	}


	@Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
