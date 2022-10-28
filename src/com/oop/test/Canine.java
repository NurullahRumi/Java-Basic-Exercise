package com.oop.test;

abstract public class Canine extends Animal {
	private String name;
	
	public String getName() {
		return name;
	}
	
	public Canine(String name) {
		this.name = name;
	}
	
	public Canine() {
	}
	
	public void makeLoud() {
		System.out.println("Canine make loud sound");
	}
}
