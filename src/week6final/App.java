package week6final;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        deck.shuffle();//shuffle cards

        //deal cards
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

     //flip cards
        for (int i = 0; i < 26; i++) {
        	 Card player1Card = player1.flip();
             Card player2Card = player2.flip();
             
             System.out.println("Player 1 plays " + player1Card.getName());
             System.out.println("Player 2 plays " + player2Card.getName());
             //compare values
             if (player1Card.getValue() > player2Card.getValue()) {
                 player1.incrementScore();
                 System.out.println("Player 1 wins");
             } else if (player2Card.getValue() > player1Card.getValue()) {
                 player2.incrementScore();
                 System.out.println("Player 2 wins");
             } else {
                 System.out.println("It's a tie!");
             }
        	
        }
        
        System.out.println("Final score:");//print final score
        System.out.println("Player 1: " + player1.getScore());//print player1 score
        System.out.println("Player 2: " + player2.getScore());//print player2 score
        //winner determined
        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player 1 wins the game");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println("Player 2 wins the game");
        } else {
            System.out.println("The game is a draw");
        }

      
    }
	}


