package Chap7_Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Adobe", "Mountain View, CA");
        map.put("IBM", "White Plains, NY");
        map.put("Learning Tree", "Los Angeles, CA");
        map.put("Microsoft", "Redmond, WA");
        map.put("Netscape", "Mountain View, CA");
        map.put("O'Reilly", "Sebastopol, CA");
        map.put("Sun", "Mountain View, CA");

        String queryString = "O'Reilly";
        System.out.println("Key is " + queryString + "; " + "Value is " + map.get(queryString));

        for (String key : map.keySet()) {
            System.out.println("Key is " + key + "; " + "Value is " + map.get(key));
        }

        map.entrySet().forEach(eS -> System.out.println("Key is " + eS.getKey() + "; " + "Value is " + eS.getValue()));
    }


}
