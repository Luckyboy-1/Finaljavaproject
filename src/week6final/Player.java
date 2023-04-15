package week6final;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand;
	private int score;
	private String name;
	
	public Player(String name) {
		this.score = 0;
		this.name = name;
		this.hand = new ArrayList<Card>();
	}
	
	public void describe() {
        System.out.println("Player " + this.name + " has the following cards");
        for (Card card : hand) {
            card.describe();
        }
    }
	
	public Card flip() {
		return hand.remove(0);
	}
	
	 public void draw(Deck deck) {
	        hand.add(deck.draw());
	    }
	 
	 public void incrementScore() {
	        score++;
	    }
	 public int getScore() {
	        return score;
	    }
}
