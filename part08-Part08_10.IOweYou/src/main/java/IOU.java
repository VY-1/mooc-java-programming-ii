import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> oweToAndAmount;

    public IOU(){
        this.oweToAndAmount = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        this.oweToAndAmount.put(toWhom, amount);

    }

    public double howMuchDoIOweTo(String toWhom){
        return this.oweToAndAmount.getOrDefault(toWhom, 0.0);
    }
}
