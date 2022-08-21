package com.oop.hierarchical_inheritance;

public class Programmer extends Person {

	String officeName;
    String job;

    public void displayProgrammer(){
        super.displayPerson();
        System.out.println("Occupation: " + job);
        System.out.println("Office name: " + officeName);
    }

    public void contributeFamily(){
        System.out.println(super.name + " is contributing family.");
    }
}
