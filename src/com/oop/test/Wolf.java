package com.oop.test;

public class Wolf extends Canine{
	public Wolf(String name) {
		super(name);
	}
	
	public Wolf() {
		System.out.println("Wolf contractor.");
	}
	
	public void killVam() {
		System.out.println("Kill vampire");
	}
}
