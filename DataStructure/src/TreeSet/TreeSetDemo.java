package TreeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        // HashSet allows one null element
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(null);


        //TreeSet doesn't allow null element
        TreeSet<Object> treeSet = new TreeSet<>();
        treeSet.add(null);


    }
}
