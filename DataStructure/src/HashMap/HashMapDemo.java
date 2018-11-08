package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<Integer, String> hmap = new HashMap<>();
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");

        System.out.println("Print out all values ");
        for (String string:hmap.values()){
            System.out.println(string);
        }

        System.out.println("Print out all keys ");
        for (int number:hmap.keySet()){
            System.out.println(number);
        }

        System.out.println("Print out key value pairs");
        for(Map.Entry<Integer, String> entry:hmap.entrySet()){
            System.out.println("Key is " + entry.getKey() + " Value is " + entry.getValue());
        }


        String var = hmap.get(2);
        System.out.println(var);

        hmap.remove(3);
        hmap.containsKey(19);
        hmap.containsValue("test");


    }
}
