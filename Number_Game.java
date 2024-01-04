package com.codesoft;

import java.util.Random;
import java.util.Scanner;

public class Number_Game {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Random random = new Random();
			
			int a=1;
			int b=100;
			
			int numberOfAttempts = 10;
			int score = 0;
			
			System.out.println("Welcome to the Number Game!");
			
			do {
				int targetNumber = random.nextInt(b-a+ 1) + a;
				int attempts = 0;
				boolean guessCorrectly = false;
				
				System.out.println("\nI have selected a number between "+ a+ " and " + b+ ". Can u guess it?");
				
				while(attempts < numberOfAttempts) {
					System.out.print("Enter your guess : ");
					int userGuess = sc.nextInt();
					attempts++;
					
					if(userGuess == targetNumber) {
						System.out.println("Congratulations!! You guessed correct number " + attempts + " attempts.");
						guessCorrectly = true;
						score += numberOfAttempts - attempts + 1;
						break;
					}
					else if(userGuess < targetNumber) {
						System.out.println("Number is too low. ");
					}
					else {
						System.out.println("Number is too high. ");
					}
				}
				
				if(!guessCorrectly) {
					System.out.println("Sorry, you have run out of limit.correct number was: " + targetNumber);
				}
				
				System.out.print("Do you want to play again? (Y/N): ");
				String playAgain = sc.next().toLowerCase();
				
				if(!playAgain.equals("yes")) {
					break;
				}
			}
			
			while(true);
			
			System.out.println("Thanks for playing!!! Your total score is: " + score);
			sc.close();
		}
}

