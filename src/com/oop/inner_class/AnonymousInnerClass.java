package com.oop.inner_class;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Person p = new Person(){
            @Override
            public void eat(){
                System.out.println("Person eating mango.");
            }
        };

        p.eat();
	}

}
