package Array;

import java.util.Arrays;
import java.util.List;

public class CollectionToArray {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world");
        String[] arrayInt = list.toArray(new String[0]);
        Arrays.stream(arrayInt).forEach(System.out::println);

    }
}
