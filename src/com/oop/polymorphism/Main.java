package com.oop.polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FamilyMember ob1 = new Abba(); //Upcasting
        FamilyMember ob2 = new Amma(); //Upcasting
        FamilyMember ob3 = new Rumi(); //Upcasting

        ob1.likes();
        ob2.likes();
        ob3.likes();

	}

}
