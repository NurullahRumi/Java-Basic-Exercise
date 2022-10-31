package com.oop.singleton;

public class SingleTon {
	
	private static SingleTon obj = new SingleTon();
	
	private SingleTon() {
		
	}
	
	public static SingleTon getObject() {
		return obj;
	}
	
	public void square(int a) {
		System.out.println(a*a);
	}
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
}
