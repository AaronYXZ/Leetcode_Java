package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetConvert {

    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();

        //add elements to HashSet
        hset.add("Element1");
        hset.add("Element2");
        hset.add("Element3");
        hset.add("Element4");

        // Convert to Array
        String[] array = new String[hset.size()];
        hset.toArray(array);

        // Convert to a List/ArrayList
        List<String> list = new ArrayList<>(hset);
        for (String s:list){
            System.out.println(s);
        }

        // Convert to a TreeSet
        Set<String> tset = new TreeSet<String>(hset);
        for (String s:tset){
            System.out.println(s);
        }

    }
}
