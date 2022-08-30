package com.oop.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		       
		        ArrayList<Integer> evennums = new ArrayList<Integer>();
		        int sum = 0;
		        int count = 0;
		       try{
		           while(evennums.size()<5){
		            int num = scanner.nextInt();
		            evennums.add(num);
		            if(num%2==0){
		                sum += num;
		                count++;
		            }
		        }

		        int avg = sum/count;
		        System.out.println("Avarage of even numbers of the inputs: " + avg);
		       } catch(Exception e){
		           System.out.println("Input total 5 elements.");
		       }
	}

}
