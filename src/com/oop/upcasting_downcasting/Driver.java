package com.oop.upcasting_downcasting;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Dog myAnimal = new Dog();
	        cast(myAnimal);
	}
	
	 public static void cast(Animal animal){
	        animal.makeNoise();

	        Dog myDog = (Dog)animal;
	        myDog.Eat();
	 }

}
