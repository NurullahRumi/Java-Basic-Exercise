package com.oop.linkedlist;

import java.util.LinkedList;	

public class Linky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linky = new LinkedList<>();
		linky.add("A");
		linky.add("B");
		linky.add("C");
		
		System.out.println(linky);
		linky.remove("C");
		System.out.println(linky);
	}

}
