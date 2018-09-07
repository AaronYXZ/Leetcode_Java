package Chap4_IntroToStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamVsCollections {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java8", "Lambdas", "In", "Action");
        Stream<String> stringStream = strings.stream();

        strings.forEach(System.out::println);
        System.out.println("-----------------");

        strings.forEach(System.out::println);
        System.out.println("-----------------");

        stringStream.forEach(System.out::println);
        System.out.println("-----------------");

        // uncommenting this line will result in an IllegalStateException
        // because streams can be consumed only once
//        stringStream.forEach(System.out::println);
    }
}

