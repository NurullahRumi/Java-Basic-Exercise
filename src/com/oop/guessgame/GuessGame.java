package com.oop.guessgame;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	
	Player p1;
	Player p2;
	
	public void GuessPlay() {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		p1 = new Player();
		p2 = new Player();
		p1.setName("Rumi");
		p2.setName("Munni");
		int computerGuess = 0;
		boolean p1GuessRt = false;
		boolean p2GuessRt = false;
		String againPlay = "";
		
		while(true) {
			System.out.println(p1.getName() + " choose a number between 0 to 9.");
			p1.setNumber(in.nextInt());
			in.nextLine();
			System.out.println(p2.getName() + " choose a number between 0 to 9.");
			p2.setNumber(in.nextInt());
			computerGuess = random.nextInt(9);
			
			System.out.println("Computer choose " + computerGuess);
			System.out.println(p1.getName() + " choose " + p1.getNumber());
			System.out.println(p2.getName() + " choose " + p2.getNumber());
			
			if(p1.getNumber() == computerGuess){
				p1GuessRt = true;
			} 
			if(p2.getNumber() == computerGuess){
				p2GuessRt = true;
			}
			
			if(p1GuessRt || p2GuessRt){
				System.out.println("We have winner.");
				System.out.println(p1.getName() + " got it right? " + p1GuessRt);
				System.out.println(p2.getName() + " got it right? " + p2GuessRt);
				System.out.println("Do you want to play again? (y/n)");
				againPlay = in.next();
				if(againPlay.equalsIgnoreCase("y")) {
					p1GuessRt = false;
					p2GuessRt = false;
					continue;
				}else {
					break;
				}
			}else {
				System.out.println("Players have to try again.");
			}
			
		}
		
		in.close(); 
	}
}
