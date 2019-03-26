package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://www.geeksforgeeks.org/java-util-collections-disjoint-method-java-examples/
public class DisjointDemo {

    public static void main(String[] args) {
        // Let us create array list of strings
        List<String> mylist1 = new ArrayList<String>();
        mylist1.add("practice");
        mylist1.add("code");

        // Let us create array of strings
        String[] myArray = new String[]{"geeks", "for", "coder"};

        // Let us create a Set of strings
        Set<String> mylist3 = new HashSet<String>();
        mylist3.add("practice");
        mylist3.add("code");

        // Returns true if the two specified collections have no elements in common.
        System.out.println(Collections.disjoint(mylist1, mylist3));


        // Array has to be converted to Collection first
        System.out.println(Collections.disjoint(mylist1, Arrays.asList(myArray)));
    }
}
