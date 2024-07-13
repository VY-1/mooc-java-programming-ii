
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("matthew", "matt");
        hashMap.put("michael", "mix");
        hashMap.put("arthur", "artie");

        System.out.println(hashMap.get("matthew"));
    }

}
