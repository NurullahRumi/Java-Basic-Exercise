package com.oop.callby.CallByValue;

public class CallByValue {
	public static void main(String[] args) {

        int a = 5, b = 10;

        swapNumbers(a,b);  // Call by value
		
	}

    public static void swapNumbers(int a, int b){
        System.out.println("Before swapping: " + "a = " + a + " and " + "b = " + b);

        int c = a;
        a = b;
        b = c;
         
        System.out.println("After swapping: " + "a = " +a + " and " + "b = " + b);
    }
}
