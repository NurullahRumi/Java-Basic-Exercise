package com.oop.generics;

import java.util.ArrayList;

public class A <T extends Number> {
	 // Only number type

    T value;

    public void show(){
        System.out.println(value.getClass().getName());
    }

    public void demo(ArrayList<? extends T> obj){
        for(Object i:obj){
            System.out.println(i);
        }
        
    }
}
