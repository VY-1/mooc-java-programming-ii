import java.util.ArrayList;

public class MisplacingBox extends Box{

    private ArrayList<Item> items;
    public MisplacingBox(){
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item){
        this.items.add(item);
        this.items.clear();
    }

    @Override
    public boolean isInBox(Item item){
        if(this.items.contains(item)){
            return true;

        }
        return false;
    }

}
