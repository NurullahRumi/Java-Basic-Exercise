package com.oop.junkbox;

public class TestClass {
	public void getTest() {
		System.out.println("Testing");
	}
	
	public String toString() {
		return "To string";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 5;
	}
}
