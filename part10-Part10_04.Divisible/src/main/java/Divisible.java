
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));
    }

    //The exercise template includes a template for the method public static ArrayList<Integer> divisible(ArrayList<Integer> numbers).
    //Implement a functionality there that gathers numbers divisible by two, three or five from the list it receives as a parameter, and returns them as a new list. 
    //The list received as a parameter must not be altered.
    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        ArrayList<Integer> divisibleNumber = numbers.stream()
            .filter(number -> number %2 ==0 || number % 3==0 || number%5==0)
            .collect(Collectors.toCollection(ArrayList::new));
        return divisibleNumber;
    }

}
