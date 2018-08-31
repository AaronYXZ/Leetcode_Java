package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.tools.javac.util.ArrayUtils;

/*
Demonstrate basic Array attributes and Arrays methods
 */
public class ArrayDemo {


    public static void main(String[] args) {

        // 1.ways to initialize an array
        int[] a = new int[] {1, 2, 3};
        int[] b = {1, 2, 3};
        String[] c = {"a", "b", "c"};

        // 2.ways to iterate an array
        // the for-loop approach
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        // the for-each approach
        for (String s : c) {
            System.out.println(s);
        }

        // 3.convert array to List
        // String array is easy with Arrays.asList
        String[] stringArray = {"a", "b", "c", "d", "e"};
        List<String> stringList = Arrays.asList(stringArray);

        // int array is hard because of the box issue
        int[] intArray = {1, 2, 3, 4, 5};
        //        List<Integer> listB = Arrays.asList(intArray); won't work

        //        https://www.mkyong.com/java/java-how-to-convert-a-primitive-array-to-list/
        List<Integer> listA = new ArrayList<>();
        for (int item:intArray){
            listA.add(item);
        }

        // 4.Check if an array contains a certain value
        // convert array to list first using Arrays.asList then use List's contains method
        String[] stringArray2 = {"a", "b", "c", "d", "e"};
        List<String> stringList2 = Arrays.asList(stringArray2);
        System.out.println(stringList2.contains("f"));


        // 5.Print array using Arrays.toString
        int[] intArray2 = { 1, 2, 3, 4, 5 };
        String intArrayString = Arrays.toString(intArray2);

        // print directly will print reference value
        System.out.println(intArray2);
        // [I@7150bd4d

        System.out.println(intArrayString);
        // [1, 2, 3, 4, 5]




        // 6.How to join arrays
        // using Apache Commons Lang - ArrayUtils
        String[] s1 = new String[]{"a", "b", "c"};
        String[] s2 = new String[]{"d", "e", "f"};

//        String[] result = ArrayUtils.addAll(s1, s2);

//        System.out.println(Arrays.toString(result));




    }




}
