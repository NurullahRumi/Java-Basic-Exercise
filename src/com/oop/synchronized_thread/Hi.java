package com.oop.synchronized_thread;

public class Hi implements Runnable{
	
	private int count = 0;
	
	@Override
	public synchronized void run() {
		for(int i=0; i<1000; i++) {
			count++;
		}
		
		System.out.println("Hi " + count);
	}
}
