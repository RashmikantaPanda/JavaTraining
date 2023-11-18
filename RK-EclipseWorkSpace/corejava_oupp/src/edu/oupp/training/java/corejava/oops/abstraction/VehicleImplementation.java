package edu.oupp.training.java.corejava.oops.abstraction;

class Ship implements IVehicle {

	@Override
	public void steering() {
		System.out.println("Power Steering");
	}

	@Override
	public void applyBreak() {
		System.out.println("Disc Break");
	}

	@Override
	public void accelerator() {
		System.out.println("Incremental Accelerator");
	}
}

class Cycle implements IVehicle {

	@Override
	public void steering() {
		System.out.println("Normal Steering");
	}

	@Override
	public void applyBreak() {
		System.out.println("Normal Break");
	}

	@Override
	public void accelerator() {
		System.out.println("Normal Accelerator");
	}
}
