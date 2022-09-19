package com.oop.inner_class;

public class StaticNestedClass {
	
	int value = 100; // non-static cannot be access
    static private int data = 50; //It can access static data members of the outer class, including private.
    static class Inner{
        void display(){
            System.out.println(data);
        }

        static void returnDouble(){
            System.out.println(2 * data);
        }
    }
	
	public static void main(String[] args) {
		
		StaticNestedClass.Inner i = new StaticNestedClass.Inner();
        i.display();
        StaticNestedClass.Inner.returnDouble();
		
	}

}
