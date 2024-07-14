
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();

        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }

            stringList.add(input);
        }

        stringList.stream()
            .forEach(word -> System.out.println(word));

    }


}
