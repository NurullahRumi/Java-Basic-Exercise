package com.oop.hierarchical_inheritance;

public class Teacher extends Person {
	
	String schoolName;
    String job;
    
    // Teacher(String schoolName){
    //     this.schoolName = schoolName;
    // }
    
    public void displayTeacher(){
        super.displayPerson();
        System.out.println("Occupation: " + job);
        System.out.println("School Name: " + schoolName);
    }

    public void contributeFamily(){
        System.out.println(super.name + " is retired.");
    }

}
