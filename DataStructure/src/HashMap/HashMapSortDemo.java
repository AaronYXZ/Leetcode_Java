package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSortDemo {

    public static void main(String[] args) {
        Map<Integer, String> hmap = new HashMap<>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");

        System.out.println("Before Sorting:");
        for (Map.Entry<Integer, String> entry:hmap.entrySet()){
            System.out.println("Key is "+entry.getKey()+" Value is "+entry.getValue());
        }

        System.out.println("After Sorting");
        Map<Integer, String> hmap2 = new TreeMap<>(hmap);
        for (Map.Entry<Integer, String> entry:hmap2.entrySet()){
            System.out.println("Key is "+entry.getKey()+" Value is "+entry.getValue());
        }

        // ToDo
        // Sort by Value
        // https://beginnersbook.com/2013/12/how-to-sort-hashmap-in-java-by-keys-and-values/
        // https://stackoverflow.com/questions/8119366/sorting-hashmap-by-values



    }
}
