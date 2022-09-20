package com.oop.callby.CallByReference;

public class CallByReference {

	public static void main(String[] args) {
		IntWrapper a = new IntWrapper(5);
		IntWrapper b = new IntWrapper(10);
		
		swapNumber(a,b);
	}
	
	public static void swapNumber(IntWrapper a, IntWrapper b) {
		System.out.println("Before swapping: " + "a = " +a.a + " and " + "b = " + b.a);
		IntWrapper c = new IntWrapper(a.a);
		a.a = b.a;
		b.a = c.a;
		System.out.println("After swapping: " + "a = " + a.a + " and " + "b = " + b.a);
	}

}
