import java.util.ArrayList;

public class Herd implements Movable{


    private ArrayList<Movable> herdList;

    public Herd(){
        this.herdList = new ArrayList<>();
    }

    public void addToHerd(Movable organism){
        this.herdList.add(organism);
    }

    public void move(int dx, int dy){
        for(Movable organism: this.herdList){
            organism.move(dx, dy);
        }
    }

    public String toString(){
        String herds = "";
        for(Movable organism: this.herdList){
            herds += organism.toString() +"\n";
        }

        return herds;
    }

}
