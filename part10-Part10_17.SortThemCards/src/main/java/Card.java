

public class Card implements Comparable<Card>{

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if(value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }
        
        return suit + " " + cardValue;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    /*
    Change the Card class to be Comparable. Implement the compareTo method so that using it sorts the cards in ascending order based on their value. 
    If the cards being compared have the same value, they are sorted by club first, diamond second, heart third, and spade last.
     */
    @Override
    public int compareTo(Card otherCard){

        //return code: -1 = lesser value, 0 = same value, 1 = greater value

        //if the cards have the same values, then compare the index of the Suit to see which one is greater
        if(this.value == otherCard.value){
            return this.suit.ordinal() - otherCard.suit.ordinal();
        }

        //otherwise return the greater value card
        return this.value - otherCard.value;
    }

}
