package com.oop.wildcards;

public class Dog extends Animal{
	public void bark(){
        System.out.println("Dog bark");
    }
    
    @Override
    public void eat(){
        System.out.println("Dog is eatting");
    }
}
