package com.oop.battlefiledv1;

import java.util.Scanner;

public class GameHelper {
	Scanner in = new Scanner(System.in);
	public int userInput(String text) {
		System.out.print(text + " " );
		return in.nextInt();
	}
}
