import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // test your code here

        List<Card> cards = new ArrayList<>();

        Card first = new Card(2, Suit.DIAMOND);
        Card second = new Card(14, Suit.SPADE);
        Card third = new Card(12, Suit.HEART);

        Card forth = new Card(2, Suit.SPADE);
        Card fifth = new Card(2, Suit.HEART);

        cards.add(first);
        cards.add(second);
        cards.add(third);
        cards.add(forth);
        cards.add(fifth);

        Collections.sort(cards);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        System.out.println(cards);

        System.out.println("\n------------------------");

        Hand hand = new Hand();

        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));
        
        System.out.println("\nBefore sorting: \n");
        hand.print();

        hand.sort();
        System.out.println("\nAfter sorting: \n");
        hand.print();

        System.out.println("\n-----Testing Part 4---------\n");

        Hand hand1 = new Hand();

        hand1.add(new Card(2, Suit.DIAMOND));
        hand1.add(new Card(14, Suit.SPADE));
        hand1.add(new Card(12, Suit.HEART));
        hand1.add(new Card(2, Suit.SPADE));
        
        Hand hand2 = new Hand();
        
        hand2.add(new Card(11, Suit.DIAMOND));
        hand2.add(new Card(11, Suit.SPADE));
        hand2.add(new Card(11, Suit.HEART));
        
        int comparison = hand1.compareTo(hand2);
        
        if (comparison < 0) {
            System.out.println("better hand is");
            hand2.print();
        } else if (comparison > 0){
            System.out.println("better hand is");
            hand1.print();
        } else {
            System.out.println("hands are equal");
        }

        System.out.println("\n------Testing Part 5---------\n");

        List<Card> cardList = new ArrayList<>();

        cardList.add(new Card(3, Suit.SPADE));
        cardList.add(new Card(2, Suit.DIAMOND));
        cardList.add(new Card(14, Suit.SPADE));
        cardList.add(new Card(12, Suit.HEART));
        cardList.add(new Card(2, Suit.SPADE));
        
        SortBySuit sortBySuitSorter = new SortBySuit();
        Collections.sort(cardList, sortBySuitSorter);
        
        cardList.stream().forEach(c -> System.out.println(c));

        System.out.println("\n-------Testing Part 6--------\n");

        Hand handBySuit = new Hand();

        handBySuit.add(new Card(12, Suit.HEART));
        handBySuit.add(new Card(4, Suit.SPADE));
        handBySuit.add(new Card(2, Suit.DIAMOND));
        handBySuit.add(new Card(14, Suit.SPADE));
        handBySuit.add(new Card(7, Suit.HEART));
        handBySuit.add(new Card(2, Suit.SPADE));
        
        handBySuit.sortBySuit();
        
        handBySuit.print();

    }
}
