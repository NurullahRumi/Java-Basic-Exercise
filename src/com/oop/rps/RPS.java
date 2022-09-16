package com.oop.rps;

import java.util.Random;
import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
			String[] rps = {"r","p","s"};
				while(true) {
					String computerChose = rps[new Random().nextInt(rps.length)];
					System.out.println("Choose your move (r/p/s) ?");
					String playerChose = in.nextLine();
					if(!(playerChose.equalsIgnoreCase("r")||playerChose.equalsIgnoreCase("p")||playerChose.equalsIgnoreCase("s"))) {
						System.out.println(playerChose + " is not a valid move.");
						continue;
					}
					
					System.out.println("Computer choose: " + computerChose);
					System.out.println("You choose: " + playerChose);
					rpsGame(computerChose, playerChose);
					System.out.println("Do you want to play again? (y/n) ");
					String playAgain = in.nextLine();
					if(!playAgain.equalsIgnoreCase("y")) {
						break;
					}
				}
					
		in.close();
	}
	
	

	private static void rpsGame(String computerChose, String playerChose) {
		if(computerChose.equalsIgnoreCase(playerChose)) {
			System.out.println("game tied.");
		}
		else if(computerChose.equalsIgnoreCase("r")) {
			 if(playerChose.equalsIgnoreCase("p")) {
				 System.out.println("You Win.");
			 }else {
				 System.out.println("You lose.");
			 }
		}
		else if(computerChose.equalsIgnoreCase("p")) {
			 if(playerChose.equalsIgnoreCase("r")) {
				 System.out.println("You lose.");
			 }else {
				 System.out.println("You win.");
			 }
		}
		else if(computerChose.equalsIgnoreCase("s")) {
			 if(playerChose.equalsIgnoreCase("r")) {
				 System.out.println("You Win.");
			 }else {
				 System.out.println("You lose.");
			 }
		}
		
		
	}

}
