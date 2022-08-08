package blackjack;

public class Card {

    final private int rank; // Index of shape: rank0>>card1(Ace card) , rank1>>card2 , .. , //rank10>>Jackcard , rank11>>Queen card , rank13>>King card
    final private int suit;// Shape of card : 0>Clubs ♣ , 1>Diamonds ♦ , 2>Hearts ♥ , 3 Spades ♠
    final private int value;// the value of each card : value of card 1 = 1 and so on ... / value of any picture = 10


    public Card(int rank, int suit, int value) {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    public Card(Card d){
        this.rank=d.rank;
        this.suit=d.suit;
        this.value=d.value;

    }

    public int getValue() {
        return value;
    }


    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }



}
