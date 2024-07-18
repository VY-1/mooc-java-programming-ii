import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand implements Comparable<Hand>{

    private List<Card> cards;

    public Hand(){
        this.cards = new ArrayList<>();
    }

    public void add(Card card){
        cards.add(card);

    }

    public void print(){
        for(Card card: cards){
            System.out.println(card.toString());
        }
    }


    public void sort(){
        Collections.sort(cards);
    }

    /*
    In a card game, hands are ranked based on the sum of values of its cards. Modify the Hand class to be comparable based on this criteria, 
    i.e. change the class so that interface Comparable<Hand> applies to it.
     */
    @Override
    public int compareTo(Hand otherHand){
        int valueThisHand = 0;
        int valueOtherHand = 0;

        for(Card card: this.cards){
            valueThisHand += card.getValue();
        }
        for(Card card: otherHand.cards){
            valueOtherHand += card.getValue();
        }

        return valueThisHand - valueOtherHand;
    }

    public void sortBySuit(){
        Comparator<Card> comparator = Comparator.comparing(Card::getSuit).thenComparing(Card::getValue);

        Collections.sort(this.cards, comparator);
    }
}
