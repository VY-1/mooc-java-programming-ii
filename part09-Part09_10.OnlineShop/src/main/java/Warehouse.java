import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productsStock;
    private Map<String, Integer> productsPrice;

    public Warehouse(){
        this.productsStock = new HashMap<>();
        this.productsPrice = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        this.productsStock.put(product, stock);
        this.productsPrice.put(product, price);
    }

    public int price(String product){
        if(!this.productsPrice.containsKey(product)){
            return -99;
        }
        return this.productsPrice.get(product);
    }

    public int stock(String product){
        if(!productsStock.containsKey(product)){
            return 0;
        }
        return this.productsStock.get(product);
    }

    public boolean take(String product){
        if(this.stock(product)>0){
            this.productsStock.put(product, this.stock(product)-1);
            return true;
        }
        else{
            return false;

        }
    }

    public Set<String> products(){
        Set<String> products = new HashSet<>();
        return products = productsPrice.keySet();
    }


}
