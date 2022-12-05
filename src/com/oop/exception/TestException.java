package com.oop.exception;

public class TestException {

	public static void main(String[] args)  {
			try {
				checkCloth("teeshirt");
				//checkCloth("dressshirt");
			} catch (ShirtException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
	}
	
	public static void checkCloth(String shirt) throws ShirtException { // ShirtException is super calss of TeeShirt and DressShirt
		if(shirt.equals("teeshirt")) {
			throw new TeeShirtException("Wrong Tee shirt");
		}
		if(shirt.equals("dressshirt")) {
			throw new DressShirtException("Wrong dress shirt");
		}
	}

}
