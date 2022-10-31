package com.oop.singleton;

public class Driver {

	public static void main(String[] args) {
		SingleTon s =  SingleTon.getObject();  // get the object of singleton class
		s.square(2); 
		s.add(5, 6);
	}

}
