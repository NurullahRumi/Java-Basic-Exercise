package com.oop.family_property_distribution;

import java.util.*;

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
			
			
			int intArray[] = new int[totChildren];
			String childName[] = new String[totChildren];
			int childAge[] = new int[totChildren];
			String childGender[] = new String[totChildren];
			 
			List<Children> listChildren = new ArrayList <Children>();
			
			for(int i = 0; i<intArray.length; i++) {
				System.out.println("Input the child name " + (i+1));
				childName[i] = in.next();
				System.out.println("Input the child age " + (i+1));
				childAge[i] = in.nextInt();
				System.out.println("Input the child gender " + (i+1));
				childGender[i] = in.next();
				
			}
			
			for(int j=0;j<intArray.length;j++) {
				Children children = new Children(childName[j], childAge[j], childGender[j]);
				listChildren.add(children);
			}
			
			
			System.out.println();
			System.out.println("Your father name is: " + fatherName);
			System.out.println("Your father have total " + totLand + " katha land.");
			System.out.println("Your father have total " + totChildren + " childrens.");
			System.out.println();
			
			for(int k = 0; k<intArray.length; k++) {
				System.out.println();
				listChildren.get(k).displayChildren();
				if(childGender[k] == "Male") {
					System.out.format("Land get %.2f", 2 * listChildren.get(k).calLand(totLand));
				}else {
					System.out.format("%.2f",listChildren.get(k).calLand(totLand));
				}
				System.out.println();
			}
			
			
			
			// Below code is working fine
//			Children children1 = new Children("Nahid",32,"Male");
//			Children children2 = new Children("Munni",27,"Female");
//			Children children3 = new Children("Tinni",19,"Female");
//			
//			children1.displayChildren();
//			System.out.format("Land get %.2f", 2 * children1.calLand(totLand));
//			children2.displayChildren();
//			System.out.format("Land get %.2f", children2.calLand(totLand));
//			children3.displayChildren();
//			System.out.format("Land get %.2f", children3.calLand(totLand));
			
			}
		
	}

}
