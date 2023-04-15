package week6final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards = new ArrayList<Card>();
	
	Deck() {
		
		String[] suits = {"Spades", "Diamonds", "Clubs", "Hearts"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		for (String suit : suits) {
            for (int i = 0; i < names.length; i++) {
                Card card = new Card(i + 2, names[i] + " of " + suit);
                this.cards.add(card);
            }
        }
		
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
	}
}
