package com.oop.test;

public class Dog extends Canine implements Pet{
	
	Dog(String name) {
		super(name); // calling the superclass constructor
	}
	
	Dog(){
		this("Rumi"); // calling the main constructor
	}
	
	public void burkMuch() {
		System.out.println("Burk too much");
	}
	
	@Override
	public void domastic() {
		System.out.println("Dog gives security.");
	}

	@Override
	public void doPlay() {
		System.out.println("Dog is playing with ball");
	}
}
