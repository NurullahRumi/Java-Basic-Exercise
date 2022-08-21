package com.oop.hierarchical_inheritance;

public class Person {
	String name;
    String address;
    int age;
    
    // Person(String name, String address, int age){
    //     this.name = name;
    //     this.address = address;
    //     this.age = age;
    // }
    
    public void displayPerson(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }

    public void contributeFamily(){
        System.out.println(name + " Has passed away.");
    }
	
	
}
