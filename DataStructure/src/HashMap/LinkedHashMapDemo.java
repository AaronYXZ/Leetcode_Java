package HashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    // https://beginnersbook.com/2013/12/linkedhashmap-in-java/
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap  = new LinkedHashMap<>();

        //Adding elements to LinkedHashMap
        linkedHashMap.put(33, "Dawn");
        linkedHashMap.put(22, "Abey");
        linkedHashMap.put(1, "Sherry");
        linkedHashMap.put(2, "Karon");
        linkedHashMap.put(100, "Jim");

        // Generating a set of entries
        Set set = linkedHashMap.entrySet();

        // Displaying elements of LinkedHashMap
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry m = (Map.Entry) iterator.next();
            System.out.println("Key is " + m.getKey() + " Value is " + m.getValue());
        }
    }
}
