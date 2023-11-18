package edu.oupp.training.java.corejava.oops.abstraction;
 public class TestVehicle {
	public static void main(String[] args) {
		IVehicle vehicle=new Ship(); 
		vehicle.steering();
		vehicle.applyBreak();
		vehicle.accelerator();
		
	}
}