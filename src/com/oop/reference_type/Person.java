package com.oop.reference_type;

public class Person {
	private String name;
    private int age;
    
    public void setNmae(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void Walk(){
        System.out.println(this.name + " Can walk.");
    }
}
