
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

        List<String> inputList = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            String input = scanner.nextLine();

            if(input.equals("end")){
                break;
            }

            inputList.add(input);

            
        }

        //Convert List<String> to List<Integer> type
        List<Integer> numberList = inputList.stream().map(Integer::valueOf).collect(Collectors.toList());

        System.out.println("Positive Numbers: " + positive(numberList) );
        



    }

    public static List<Integer> positive(List<Integer> numbers){
        ArrayList<Integer> intList = numbers.stream().filter(number -> number >0).collect(Collectors.toCollection(ArrayList::new));
        return intList;
    }

}
