package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListInitDemo {

    public static void main(String[] args) {
        // 1.use Arrays.asList
        // can't add new items afterwards
        List<String> obj = Arrays.asList("a", "b", "c");
//        obj.add("d");
        for (String string:obj){
            System.out.println(string);
        }

        // 2.Normal way of using add
        List<String> obj2 = new ArrayList<>();
        obj2.add("a");
        obj2.add("b");
        obj2.add("c");

        // 3.use ArrayList plus Arrays.asList
        // Can add new items
        List<String> obj3 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        obj3.add("d");

        for (String string:obj3){
            System.out.println(string);
        }

    }
}
