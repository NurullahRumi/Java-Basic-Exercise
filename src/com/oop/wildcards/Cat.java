package com.oop.wildcards;

public class Cat extends Animal{
	public void mew(){
        System.out.println("Cat mew");
    }
    
    @Override
    public void eat(){
        System.out.println("Cat is eatting");
    }
}
