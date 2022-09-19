/*
In simple words, a class that has no name is known as an anonymous inner class 
in Java. It should be used if you have to override a method of 
class or interface.


1. A class is created, but its name is decided by the compiler, which implements the Eatable interface and provides the implementation of the eat() method.
2. An object of the Anonymous class is created that is referred to by 'p', a reference variable of the Eatable type.
*/

package com.oop.inner_class.AnonymousInnerClass;

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
