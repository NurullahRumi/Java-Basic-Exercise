package com.oop.e_num;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(Days.SATERDAY.dayActivity);
		// System.out.println(Days.FRIDAY.dayActivity);
				
		for(Days d : Days.values()){
			System.out.println(d + " is "+ d.dayActivity);
		}
	}

}
