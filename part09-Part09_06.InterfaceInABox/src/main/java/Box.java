import java.util.ArrayList;

public class Box implements Packable{

    private ArrayList<Packable> packables;
    private double maxCapacity;

    public Box(double maxCapacity){
        this.maxCapacity = maxCapacity;
        this.packables = new ArrayList<>();
    }

    public void add(Packable packable){
        if(this.maxCapacity >= this.weight() + packable.weight()){
            this.packables.add(packable);
        }

    }
    
    @Override
    public double weight(){
        double totalWeight = 0;
        for(Packable packable: packables){
            totalWeight += packable.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString(){
        return "Box: " + this.packables.size() + " items, total weight " + this.weight() + " kg"; 
    }

}
