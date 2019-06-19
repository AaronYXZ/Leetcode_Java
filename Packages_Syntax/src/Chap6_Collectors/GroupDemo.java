package Chap6_Collectors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class GroupDemo {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("cat");
        strings.add("dog");
        strings.add("cat");

        Map<String, Integer> map = new HashMap<>();
        for (String string:strings){
            if (map.containsKey(string)){
                int occurance = map.get(string);
                occurance ++;
                map.put(string, occurance);
            }
            else{
                map.put(string, 1);
            }
        }

        System.out.println(map);
        // sout + tab


//        https://stackoverflow.com/questions/29122394/word-frequency-count-java-8
//        https://www.mkyong.com/java8/java-8-collectors-groupingby-and-mapping-example/
        Map<String, Long> collect =
                strings.stream().collect(Collectors.groupingBy(Function.identity(), counting()));

        System.out.println(collect);

    }
}
