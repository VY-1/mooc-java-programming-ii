
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne

        List<String> inputList = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            String input = scanner.nextLine();

            if(input.equals("end")){
                break;
            }

            inputList.add(input);

            
        }

        System.out.println("Print the average of the negative numbers or the positive numbers?(n/p)");

        String negPos = scanner.nextLine();
        if(negPos.equals("n")){
            double averageNeg = inputList.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number < 0).average().getAsDouble();
            System.out.println("Average of the negative numbers: " + averageNeg);
        }
        if(negPos.equals("p")){
            double averagePos = inputList.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number > 0).average().getAsDouble();
            System.out.println("Average of the positive numbers: " + averagePos);
        }

    }
}
