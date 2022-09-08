package com.oop.reference_type;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
	    p.setNmae("Rumi");
	    System.out.println(p.getName());
	    p.Walk();
	    
	    personRef(p); //Passing an object
	}
	
	//Reference Type
		static void personRef(Person p){
		    p.setNmae("Oli");
	        p.setAge(35);

	        System.out.println(p.getName());
	        p.Walk();
		}

}
