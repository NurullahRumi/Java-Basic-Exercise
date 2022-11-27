package com.oop.functionainterface;

public class Driver {

	public static void main(String[] args) {
		FunctionalNoParam noParam = () -> System.out.println("Hello");
		noParam.show();
		
		FunctionalWithType<String> withType = (str) -> System.out.println(str + " Hello");
		withType.show("Rumi");
		
		FunctionalReturn<String, Integer> funReturn = (number) -> "Number " + number;
		System.out.println(funReturn.show(10));
	}

}
