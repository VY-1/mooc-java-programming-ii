
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random randomGenerator = new Random();

        System.out.println("How many number should be printed?");
        int userInput = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < userInput; i++){
            System.out.println(randomGenerator.nextInt(11));
        }
    }

}
