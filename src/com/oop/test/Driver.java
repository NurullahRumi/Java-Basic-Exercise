package com.oop.test;

public class Driver {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.cat.doPlay();
		d.go();
		//d.cat.drinkMilk(); // Will not run because go() pass null to the reference variable 
		System.out.println(d.getName());
	}

}
