package com.oop.family_property_distribution;

public class Children {
	private String name;
	private int age;
	private String gender;
	static int count = 0;
	
	public Children(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		if(this.gender.equals("Male")) {
			count = count + 2;
		}else {
			count++;
		}
	}
	
	public void displayChildren() {
		System.out.println("Name of the child: " + this.name);
		System.out.println("Age of the child: " + this.age);
		System.out.println("Gender of the child: " + this.gender);
	}
	
	
	public double calLand(double totLand) {
		return totLand/count;
	}
}
