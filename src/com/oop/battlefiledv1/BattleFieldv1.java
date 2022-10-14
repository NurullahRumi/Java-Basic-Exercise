package com.oop.battlefiledv1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BattleFieldv1 {

	public static void main(String[] args) {
		Random rn = new Random();
		Scanner in = new Scanner(System.in);
		boolean isFalse = true;
		int noOfGuess = 0;
		int firstValue = rn.nextInt(9);
		
		ArrayList<Integer> locationCell = new ArrayList<Integer>();
		locationCell.add(firstValue);
		locationCell.add(firstValue+1);	
		locationCell.add(firstValue+2);
		
		GamePlay obj1 = new GamePlay();
		GameHelper gameHelper = new GameHelper();
		
		while(isFalse) {
			int userGuess = gameHelper.userInput("Enter a number ");
			noOfGuess++;
			obj1.setLocationCell(locationCell);
			String result = obj1.checkYourself(userGuess);
			System.out.println(result);
			if(result.equals("kill")) {
				isFalse = false;
				System.out.println("You took " + noOfGuess + " guesses.");
				break;
			}
		}
		in.close();
	}

}
