package com.oop.inner_class.NestedInterface;

public class NestedInterface2 implements A.Showable{
	
	public void show(){
        System.out.println("Showing here.");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.Showable obj1 = new NestedInterface2();
		obj1.show();
	}

}
