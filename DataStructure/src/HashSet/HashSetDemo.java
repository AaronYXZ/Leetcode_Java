package HashSet;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();
        // Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");
        //Addition of null values
        hset.add(null);
        hset.add(null);

        //Displaying HashSet elements
        System.out.println(hset);

        // Iterate over a HashSet
        for (String temp : hset) {
            System.out.println(temp);

            hset.clear();
            System.out.println(hset);
            System.out.println(hset.isEmpty());

            hset.add("Apple");
            hset.add("Mango");
            hset.add("Grapes");
            hset.add("Orange");
            hset.add("Fig");
            hset.remove("Fig");
            System.out.println(hset.contains("Fig"));
        }
    }

}
