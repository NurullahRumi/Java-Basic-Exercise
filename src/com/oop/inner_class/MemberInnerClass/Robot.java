/*********************************************************************
without existing one type of object there is no chance of existing 
another type of object then we should go for inner class class.
*********************************************************************/

package com.oop.inner_class.MemberInnerClass;

public class Robot {
	  double height;
	    private String name;

	    public Robot(double height, String name){
	        this.height = height;
	        this.name = name;
	    }

	    public void run(){
	        System.out.println(this.name + " can run.");
	    }

	    class Hand{
	        double length;
	        double weigth;

	        void move(){
	            run();
	            System.out.println(name + "'s hand moving.");
	        }
	    }


}
