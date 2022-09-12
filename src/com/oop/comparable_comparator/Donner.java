package com.oop.comparable_comparator;

public class Donner implements Comparable<Donner>{
	private String name;
	private int age;
	private String gender;
	private int amount;
	

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Donner(String name, int age, String gender, int amount) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.amount = amount;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Donner [name=" + name + ", age=" + age + ", gender=" + gender + ", amount=" + amount + "]";
	}

	@Override
	public int compareTo(Donner donner) {
		if(this.getAge()>donner.getAge()) {
			return 1;
		}else {
			return -1;
		}
	}

}
