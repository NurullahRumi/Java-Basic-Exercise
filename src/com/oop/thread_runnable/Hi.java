package com.oop.thread_runnable;

public class Hi implements Runnable{
	 int count = 0;

    @Override
    public void run(){
        count++;
        System.out.println("Hi " + count);
    }
}
