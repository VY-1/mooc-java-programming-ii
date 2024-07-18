import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory(){
        this.history = new ArrayList<>();
    }

    public void add(double status){
        this.history.add(status);
    }

    public void clear(){
        this.history.clear();
    }

    @Override
    public String toString(){
        return this.history.toString();
    }

    public double maxValue(){
        double maxValue = Integer.MIN_VALUE;
        if(this.history.isEmpty()){
            return 0;
        }
        else{
            
            for(double value: this.history){
                if(value >= maxValue){
                    maxValue = value;
                }
            }
        }
        return maxValue;
    }

    public double minValue(){
        double minValue = Integer.MAX_VALUE;
        if(this.history.isEmpty()){
            return 0;
        }
        else{
            for(double value: this.history){
                if(value<=minValue){
                    minValue = value;
                }
            }
        }
        return minValue;
    }

    public double average(){
        double averageValue = 0;
        double sum = 0;
        
        if(this.history.isEmpty()){
            return 0;
        }
        else{
            for(double value: this.history){
                sum += value;
                
            }
            averageValue = sum/this.history.size();

        }
        return averageValue;
    }
}
