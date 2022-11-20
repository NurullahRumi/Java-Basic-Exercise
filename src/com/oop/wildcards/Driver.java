package com.oop.wildcards;

import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<Dog> animals = List.of( new Dog(), new Dog());  // Using Convenience Factory Methods 
	    takeAnimal(animals);
	    try{
	        animals.add(new Dog());
	    }catch(Exception e){
	        System.out.println(e);
	    }
	}

	private static void takeAnimal(List<? extends Animal> list) { //Using wildcard to pass all the subtypes of animals
		for(Animal a:list){
	        a.eat();
	    }
	}

}
