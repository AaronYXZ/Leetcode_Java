package Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

    public static void main(String[] args) {

        // Sort Array
        /*
         * Integer class implements Comparable
         * Interface so we can use the sort method
         */
        int[] arr = {11, 55, 22, 0, 89};
        Arrays.sort(arr);
        System.out.print("Sorted Int Array: ");
        System.out.println(Arrays.toString(arr));

        /*
         * String class implements Comparable
         * Interface so we can use the sort method
         */
        System.out.print("Sorted String Array: ");
        String[] names = {"Steve", "Ajeet", "Kyle"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        // Sort Collection - List
        System.out.print("Sorted List: ");
        List<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Guava");
        fruits.add("Grapes");
        Collections.sort(fruits);
        for (String s : fruits)
            System.out.print(s + ", ");
    }
}

