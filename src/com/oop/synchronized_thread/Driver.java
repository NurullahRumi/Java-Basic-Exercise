package com.oop.synchronized_thread;

public class Driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Hi h = new Hi();
		
		Thread t1 = new Thread(h);
		Thread t2 = new Thread(h);
		Thread t3 = new Thread(h);
		
		t1.start();
		t2.start();
		t3.start();
		
		Thread.sleep(50);
		
		System.out.println("Welcome");
	}

}
