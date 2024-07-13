
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here

        List<String> inputList = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        while(true){
            
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }

            inputList.add(input);

        
        }

        //handle collection as stream with lambda expression
        double average = inputList.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();
        System.out.println("average of the numbers: " + average);

    }
}
