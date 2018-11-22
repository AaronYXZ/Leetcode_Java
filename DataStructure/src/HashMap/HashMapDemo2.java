package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "");
        System.out.println(map.get("a").equals(""));
    }
}
