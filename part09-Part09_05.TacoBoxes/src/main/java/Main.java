
public class Main {

    public static void main(String[] args) {
        // Test your code here!

        TripleTacoBox tripleTacoBox = new TripleTacoBox();
        System.out.println(tripleTacoBox.tacosRemaining());
        tripleTacoBox.eat();
        tripleTacoBox.eat();
        System.out.println(tripleTacoBox.tacosRemaining());
        tripleTacoBox.eat();
        tripleTacoBox.eat();
        tripleTacoBox.eat();
        System.out.println(tripleTacoBox.tacosRemaining());


        System.out.println("\n----------------");

        CustomTacoBox customTacoBox = new CustomTacoBox(5);
        System.out.println(customTacoBox.tacosRemaining());
        customTacoBox.eat();
        System.out.println(customTacoBox.tacosRemaining());
        customTacoBox.eat();
        customTacoBox.eat();
        System.out.println(customTacoBox.tacosRemaining());
    }
}
