package com.oop.thread;

public class A implements Runnable {
	public void run(){
        System.out.println("From Run method.");
    }

    public void pause(){
        try{
            Thread.sleep(2500);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void test(){
        System.out.println("after 2 and half mins From method test .");
    }
}
