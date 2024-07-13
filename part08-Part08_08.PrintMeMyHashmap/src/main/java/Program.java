
import java.util.HashMap;

public class Program {

    public static void printKeys(HashMap<String, String> hashmap){
        for(String key: hashmap.keySet()){
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hasmap, String text){
            
        for(String key: hasmap.keySet()){
            if(key.contains(text)){
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hasmap, String text){
        for(String key: hasmap.keySet()){
            if(key.contains(text)){
                System.out.println(hasmap.get(key));
            }
        }
    }

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("first", "value1");
        hashMap.put("second", "value2");
        hashMap.put("third", "value3");

        printKeys(hashMap);
        printKeysWhere(hashMap, "first");
        printValuesOfKeysWhere(hashMap, "first");
    }

}
