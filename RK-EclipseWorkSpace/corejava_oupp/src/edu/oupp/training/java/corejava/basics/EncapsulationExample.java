package edu.oupp.training.java.corejava.basics;

class User{
	private String userName;
	private String password;
	
	private void login(String userName, String password){
		this.userName=userName;
		this.password=password;
	}
	void getDetails(){
		login(userName,password);
	}
}

public class EncapsulationExample {

	public static void main(String[] args) {
	
	}

}
