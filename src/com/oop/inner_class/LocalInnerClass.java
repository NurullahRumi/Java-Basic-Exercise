/* Local inner class cannot access non-final local variable till JDK 1.7. 
Since JDK 1.8, it is possible to access the non-final local variable 
in the local inner class.*/

package com.oop.inner_class;

public class LocalInnerClass {

	private int data = 10; // instance variable


    void display(){
         int value = 50; //Local variables can't be private, public, or protected.
                         ///local variable must be final till jdk 1.7 only  

        class Local{
            private int local_var = 100;
            void print(){
                System.out.println("Instance variable of main class: " + data);
                System.out.println("Block variable: " + value);
                System.out.println("Innerclass variable: " + local_var);
                }
        }

        Local l = new Local();
        l.print(); //Local inner class cannot be invoked from outside the method.
    }
	
	public static void main(String[] args) {
		LocalInnerClass i = new LocalInnerClass();
        i.display();
	}

}
