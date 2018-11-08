package Chap4_IntroToStream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("orange");
        list.add("watermelon");
        list.add("");

        List<String> list2 = new ArrayList<>();

        list.forEach(
                e -> {String modifiedName = e.replaceAll("\\W", "");
                        list2.add(modifiedName);}
        );
        list2.stream().forEach(System.out::println);

    }
}
