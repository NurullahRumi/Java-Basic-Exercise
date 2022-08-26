package com.oop.family_property_distribution;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		String fatherName;
		double totLand;
		int totChildren;
		
		
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			System.out.println("What's your father name?");
			fatherName = in.nextLine();
			System.out.println("How much land your father have?");
			totLand = in.nextDouble();
			System.out.println("How many children your father have?");
			totChildren = in.nextInt();
			}
		
		
		System.out.println();
		System.out.println("Your father name is: " + fatherName);
		System.out.println("Your father have total " + totLand + " katha land.");
		System.out.println("Your father have total " + totChildren + " childrens.");
		System.out.println();
		
		Children children1 = new Children("Lucky", 48, "Female");
		Children children2 = new Children("Laily", 44, "Female");
		Children children3 = new Children("Papia", 39, "Female");
		Children children4 = new Children("Wali", 34, "Male");
		
		children1.displayChildren();
		System.out.format("%.2f",children1.calLand(totLand));
		System.out.println();
		
		children2.displayChildren();
		System.out.format("%.2f",children2.calLand(totLand));
		System.out.println();
		
		children3.displayChildren();
		System.out.format("%.2f",children3.calLand(totLand));
		System.out.println();
		
		children4.displayChildren();
		System.out.format("%.2f", 2 * children3.calLand(totLand));
		System.out.println();
		
	}

}
