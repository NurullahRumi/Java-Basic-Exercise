package com.oop.generics;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A<Double> obj = new A<>();
        obj.value = 9.9;
        obj.show();

        ArrayList<Double>  l = new ArrayList<>();
        l.add(4.3);
        l.add(6.5);
        l.add(8.6);
        obj.demo(l);
	}

}
