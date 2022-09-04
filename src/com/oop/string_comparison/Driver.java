package com.oop.string_comparison;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// compare by value 
        String s1 = "Nurullah";
        String s2 = "Nurullah";
        String s3 = new String("Nurullah");
        String s4 = "Rumi";
        String s5 = "NURULLAH";

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equals(s4)); //false
        System.out.println(s1.equals(s5)); //false
        System.out.println(s1.equals(s5)); //false
        System.out.println(s1.equalsIgnoreCase(s5)); //true
		

        // compare by referance
        String r1 = "Nurullah";
        String r2 = "Nurullah";
        String r3 = new String("Nurullah");

        System.out.println(r1 == r2); //true
        System.out.println(r1 == r3); //false


        // compareTo() method
        String c1 = "Nurullah";
        String c2 = "Nurullah";
        String c3 = "Rumi";

        System.out.println(c1.compareTo(c2)); //0
        System.out.println(c1.compareTo(c3)); //-4
        System.out.println(c3.compareTo(c1)); //4
	}

}
