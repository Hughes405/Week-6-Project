package War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
	private List <Card> cards = new ArrayList <Card>();
	private String name;
	
	//Deck constructor
	public Deck() {
		
		for(int i = 2; i<=14; i ++) {
		  for(int j = 0; j<= 4; j++) {
			if (j==0) {
				cards.add(new Card(i,"Hearts"));
			}else if(j==1) {
				cards.add(new Card (i,"Spades"));
			}else if(j==2) {
				cards.add(new Card(i,"Clubs"));
			}else if (j==3){
				cards.add(new Card(i,"Diamonds"));
			}
		  }
		}	
}
	//method to check if deck is actually 52 cards, if needed
	public void checkDeckSize() {
		System.out.println(cards.size());
	}
	public void shuffle() {
		Collections.shuffle(cards, new Random());
	}
	public Card draw() {
		
		if (cards.size()>0) {
			Card c = cards.get(0);
			cards.remove(0);
			return c;
		}
		return null;
	}
	public void describeCards() {
		for (Card c: cards) {
			c.describe();
		}
	}
	//This describe method is redundant, but nostalgic
	public void describeCards2() {
		for (Card c: cards) {
			System.out.println(toString(c));
		}
	}
	//Override of toString();	
	public String toString(Card x) {
		return x.getValue() + " of " + x.getName();
	}
}
