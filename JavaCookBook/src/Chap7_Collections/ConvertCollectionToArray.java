package Chap7_Collections;

import java.util.ArrayList;
import java.util.List;

public class ConvertCollectionToArray {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("apple");
        list.add("banana");

        Object[] ol = list.toArray();
        System.out.println(ol.length);

        String[] strings = (String[]) list.toArray(new String[0]); // why new String[0] has to be passed as a parameter
        System.out.println(strings.length);

    }
}
