package com.oop.thread;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new A());
        t.start();
        
        A a = new A();
        a.pause();
        a.test();
	}

}
