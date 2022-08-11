package War;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {

		private List <Card> hand = new ArrayList<Card>();
		private Integer score = 0;
		private String name;
		
		public Player(String name) {
			this.name =  name;
		}
		public String getName() {
			return name;
		}	
		public int getScore() {
			return score;
		}
		public List getHand() {
			return hand;
		}
		public void describe() {
			System.out.println("Player: " + name + "\tScore: " + score );
			//System.out.println(Arrays.toString(hand.toArray()) );	
			for (Card c: hand) {
				c.describe();
			}
		}
		public Card flip() throws Exception{
			if (hand.size()>0) {
				Card c = hand.get(0);
				hand.remove(0);
				return c;
			}
			throw new Exception("Hand is empty");
		}	
		public void draw(Deck deckName) {
			Card newCard = deckName.draw();
			hand.add(newCard);
		}
		public void incrementScore() {
			this.score +=1;
		}	
}