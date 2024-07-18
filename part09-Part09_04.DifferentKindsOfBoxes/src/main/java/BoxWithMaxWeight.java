import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int maxWeight;

    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity){
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item){
        int totalWeights = 0;
        for(Item itemOnList: this.items){
            totalWeights += itemOnList.getWeight();
        }
        if(totalWeights + item.getWeight() <= maxWeight){
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item){
        if(this.items.contains(item)){
            return true;
        }
        else{
            return false;
        }
    }
}
