import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // You can test your program here

        Box originalBox = new BoxWithMaxWeight(12);
        originalBox.add(new Item("Candy", 2));

        ArrayList<Item> itemList = new ArrayList<>(Arrays.asList(new Item("Candy"), new Item("Gun"), new Item("Shoe")));

        originalBox.add(itemList);
        System.out.println(originalBox.isInBox(new Item("Candy")));
        System.out.println(originalBox.isInBox(new Item("Gun")));

        System.out.println("\n---------------");

        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));

        System.out.println("\n---------------");

        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));

        System.out.println("\n---------------");

        MisplacingBox box2 = new MisplacingBox();
        box2.add(new Item("Saludo", 5));
        box2.add(new Item("Pirkka", 5));

        System.out.println(box2.isInBox(new Item("Saludo")));
        System.out.println(box2.isInBox(new Item("Pirkka")));

    }
}
