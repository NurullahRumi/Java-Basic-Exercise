package com.oop.inner_class;

public class NestedInterface2 implements A.Showable{
	
	public void show(){
        System.out.println("Showing here.");
    }
	
	public static void main(String[] args) {
		A.Showable obj1 = new NestedInterface2();// Upcasting here
        obj1.show();
	}

}
