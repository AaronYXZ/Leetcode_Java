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
        // This will raise NullPointerException
        //        treeSet.add(null);

        TreeSet<String> treeSet1 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        treeSet1.add("Gosling");
        treeSet1.add("da Vinci");
        treeSet1.add("van Gogh");
        treeSet1.add("Java To Go");
        treeSet1.add("Vanguard");
        treeSet1.add("Darwin");
        treeSet1.add("Darwin"); // TreeSet is Set, ignores duplicates.
        System.out.printf("Our set contains %d elements", treeSet1.size());
        System.out.println("");// Since it is sorted we can easily get various subsets
        System.out.println("Lowest (alphabetically) is " + treeSet1.first());

    }
}
