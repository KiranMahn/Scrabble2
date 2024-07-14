import java.util.Scanner;  // Import the Scanner class


public class Scrabble2 {

	public static void main(String args[]) { 
		
		boolean endGame = false;
		
		//start dialog 
		Scanner myObj = new Scanner(System.in);
		System.out.println("Welcome to Scrabble");
		System.out.println();
		System.out.println("When you want to end the game enter: 'end game'.");

		
		System.out.println("Enter the number of players?");
		System.out.println();
		
		//Initialise num of players 
		int numOfPlayers = myObj.nextInt();
		while(numOfPlayers < 1) {
			System.out.println("Enter a number over 0");	
		}
		
		int[] scores = new int[numOfPlayers]; 

		//set all players scores to zero 
		for(int i = 0; i < scores.length; i++) {
			scores[i] = 0;
		}
		
		//enter names 
		String[] names = new String[numOfPlayers];

		for(int i = 0; i < numOfPlayers; i++) {
			System.out.println("Enter name number " + (i+1) + ":");
			names[i] = myObj.next();  
		}
		
		System.out.println();
		for(int i = 0; i < numOfPlayers; i++) {
			System.out.println(names[i] + ": " + scores[i]); 
		}
		
		
		
		
		while(endGame == false) {
			
			
			for(int i = 0; i < numOfPlayers; i++) {
				System.out.println("Enter " + names[i] + "'s score: ");
				if(!myObj.hasNextInt()) {
					endGame = true;
				}
				else {
					scores[i] = scores[i] + myObj.nextInt();  
				}
				System.out.println();

				System.out.println("Scores: ");
				System.out.println();
				for(int j = 0; j < numOfPlayers; j++) {
					System.out.println(names[j] + ": " + scores[j]); 
				}
				System.out.println();

			}
			

			
		}
		System.out.println("game over");
		System.out.println();
		int highestScore = 0;
		String highestScorer = "";
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] > highestScore) {
				highestScore = scores[i];
				highestScorer = names[i];
			}
		}
		System.out.println("The winner is: " + highestScorer + "! With " + highestScore + " points!!!");

		
		
		
	}
	
	
	
	
}
