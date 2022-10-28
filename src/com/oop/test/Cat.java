package com.oop.test;

public class Cat extends Fenile implements Pet{
	public void drinkMilk() {
		System.out.println("Drink Milk.");
	}
	
	@Override
	public void domastic() {
		System.out.println("Cat kills the rat.");
	}

	@Override
	public void doPlay() {
		System.out.println("Cat is running here and there.");
		
	}
	
}
