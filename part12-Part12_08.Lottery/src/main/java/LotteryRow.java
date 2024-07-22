
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        Random randomGenerator = new Random();
        int count =0;
        while(count< 7){
            int number = randomGenerator.nextInt(40)+1;
            if(this.containsNumber(number)){
                continue;
            }

            this.numbers.add(number);
            count++;

        }


    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        
        return this.numbers.contains(number);
    }

    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        if(!(other instanceof LotteryRow)){
            return false;
        }
        LotteryRow comparedLotteryRow = (LotteryRow) other;
        if(this.numbers == comparedLotteryRow.numbers){
            return true;
        }
        return false;
        
    }
}

