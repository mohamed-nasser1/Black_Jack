package blackjack;

public class Player {

    String name;
    int score;
    Card card[]=new Card[11];


    public Card[] getCard() {
        return card;
    }

    public Player(String name) {
        this.name = name;
    }








}