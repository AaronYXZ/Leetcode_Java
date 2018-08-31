package Chap2_BehaviorParameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Attempt6_LambdaExpression {

    public interface Predicate<T>{
        boolean test(T t);
    }

    public static List<Apple> filterApples(List<Apple> inventory, Predicate predicate){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory){
            if (predicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Apple apple1 = new Apple("green", 10);
        Apple apple2 = new Apple("green", 30);
        Apple apple3 = new Apple("red", 25);
        Apple apple4 = new Apple("red", 12);

        Apple[] apples = new Apple[] {apple1, apple2, apple3, apple4};
        List<Apple> inventory = Arrays.asList(apples);

        System.out.println("Testing Predicate 1: Filter Red and Heavy Apples");
//        List<Apple> results = filterApples(inventory, (Apple apple) -> "red".equals(apple.getColor()));
//        results.stream().forEach(apple -> System.out.println(apple.getWeight()));

        System.out.println("Testing Predicate 2: Filter Green and Light Apples");
//        List<Apple> results2 = filterApples(inventory, (Apple apple) -> apple.getWeight()<20);
//        results2.stream().forEach(apple -> System.out.println(apple.getWeight()));
    }
}
