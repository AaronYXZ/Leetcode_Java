package HashTable;

import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<String, String> hashtable =
                new Hashtable<String, String>();

        // Adding Key and Value pairs to Hashtable
        hashtable.put("Key1","Chaitanya");
        hashtable.put("Key2","Ajeet");
        hashtable.put("Key3","Peter");
        hashtable.put("Key4","Ricky");
        hashtable.put("Key5","Mona");

        System.out.println(hashtable.containsKey("Key1"));
        System.out.println(hashtable.containsValue("Anna"));
    }
}
