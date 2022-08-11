package War;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

 //This is an application that runs a simple version of the card game War.
public class App {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Creating a new deck		
		Deck deck1 = new Deck();
	    		
		//Creating two players
		System.out.println("Enter a name for a Player 1: ");
		Player player1= makeNewPlayer();
		
		System.out.println("Enter a name for a Player 2: ");
		Player player2= makeNewPlayer();
		
		//Shuffling the deck
		deck1.shuffle();
		
		//Each player draws
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				player1.draw(deck1);
			}else {
				player2.draw(deck1);
			}
		}
		
		
		
		//Going to war!! Each player flips cards in their hand to compare.
		System.out.println(player1.getName() + " and "+ player2.getName() + " are going to war!");
		try {
		for(int i = 0; i < 26; i++) {
		
			Card p1Flip = player1.flip();
			
			System.out.print(player1.getName()+"'s card is a ");
			p1Flip.describe();
			
			Card p2Flip = player2.flip();
			
			System.out.print(player2.getName() +"'s card is a ");
			p2Flip.describe();
			
			//Comparing cards for scoring
			if (p1Flip.getValue() > p2Flip.getValue()) {
				player1.incrementScore();
			}
			else if (p1Flip.getValue() < p2Flip.getValue()) {
				player2.incrementScore();
			}
			else if (p1Flip.getValue() == p2Flip.getValue()) {
				System.out.println("That one was a tie.");
				
			}
		}
		
	}catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		//Printing each player's score
		player1.describe();
		player2.describe();
		
		//Printing the winner
		if(player1.getScore() > player2.getScore()) {
		        System.out.println( player1.getName() + " is the Winner!");
		}
		else if(player1.getScore() < player2.getScore()) {
				System.out.println(player2.getName() + " is the Winner!");
		}
		else if(player1.getScore() == player2.getScore()) {
				System.out.println("That was a draw.");
		}
		System.out.println("THE END");
	
}
	//Method that takes scanner input for player name	
    public static Player makeNewPlayer() {
	String playerName = scanner.nextLine();
	Player player = new Player(playerName);
	return player;
	}
	
		
}
