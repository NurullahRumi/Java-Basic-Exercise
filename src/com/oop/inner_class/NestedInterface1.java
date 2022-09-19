/* 
    1.The nested interface must be public if it is declared inside 
      the interface, but it can have any access modifier if declared 
      within the class.
    2.Nested interfaces are declared static
*/

package com.oop.inner_class;

public class NestedInterface1 implements Message.Showable {
	
	public void show(){
        System.out.println("Showing.");
    }
	
	public static void main(String[] args) {
		Message.Showable show = new NestedInterface1(); // upcasting here  
        show.show();
	}

}
