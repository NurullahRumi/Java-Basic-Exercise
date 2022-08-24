/************************************************************
When abstract class implements interface then inside the class 
you can avoid defining the methods of interfaces if you want. 
************************************************************/

package com.oop.interfaces;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape circle = new Circle();

        circle.area();
        circle.name();
	}

}
