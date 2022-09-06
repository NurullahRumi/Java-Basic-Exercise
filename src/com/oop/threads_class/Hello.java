package com.oop.threads_class;

public class Hello extends Thread{
	private int count=0;
    @Override
    public void run(){
        count++;
        System.out.println("Hi " + count);
    }

    public void run(int a){
        System.out.println(a);
    }
}
