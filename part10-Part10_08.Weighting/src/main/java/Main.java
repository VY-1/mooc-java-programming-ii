import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!

        Scanner scanner = new Scanner(System.in);

        Hold hold = new Hold(100);
        Suitcase suitcase = new Suitcase(30);
        List<Item> items = new ArrayList<>();

        System.out.println("Add items to suitcase: 'quit' to stop.");
        while(true){
            System.out.print("Item name: ");
            String input = scanner.nextLine();

            if(input.equals("quit")){
                break;
            }

            System.out.print("Item weight: ");
            int weight = Integer.valueOf(scanner.nextLine());


            Item item = new Item(input, weight);
            items.add(item);
        }

        suitcase = addItems(items, suitcase);

        hold.addSuitcase(suitcase);
        
        System.out.println(suitcase);
        System.out.println(hold);

        items.stream().map(item -> item.getName() + " " + item.getWeight() + " kg").sorted().forEach(name -> System.out.println(name));

    }

    public static Suitcase addItems(List<Item> items, Suitcase suitcase){
        for(Item item: items){
            suitcase.addItem(item);
        }
        return suitcase;
        
    }

}
