package com.oop.anonymous_classes;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotChkOut Customer = new TotChkOut();
		System.out.println("Customer total amount after discount " + Customer.TotAmount(10000));
		
		TotChkOut Employee = new TotChkOut(){
		    @Override
		    public int TotAmount(int a){
		        return a - (a*20)/100;
		    }
		};
		
		System.out.println("Employee total amount after discount " + Employee.TotAmount(100000));
	}

}
