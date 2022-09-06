package com.oop.threads_class;

public class DriverThreadClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Hello h1 = new Hello();
		Hello h2 = new Hello();
		Hello h3 = new Hello();
        h1.start();
        h2.start();
        h3.start();
        Thread.sleep(1);
        h1.run(5);
        
        System.out.println("Welcome");
	}

}
