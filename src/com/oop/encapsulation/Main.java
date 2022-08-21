package com.oop.encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account(1001, "Rum", "Netrokona");
		acc1.displayAccount();
		
		acc1.setAccountName("Rumi");
		acc1.displayAccount();
	}

}
