package Chap2_BehaviorParameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Attempt4_FilterByAbstractCriteria {

    // The behavior of filterApples method depends on the code you pass to it via the ApplePredicate object
    // In other words, we've parameterized the behavoir of filterApples method!!

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory){
            if (predicate.test(apple)){
                result.add(apple);
            }
        }

        return result;
    }

    public static class AppleRedAndHeavyPredicate implements ApplePredicate{
        public boolean test(Apple apple){
            return "red".equals(apple.getColor()) && apple.getWeight()>20;
        }
    }

    public static class AppleGreenAndLightPredicate implements ApplePredicate{
        public boolean test(Apple apple){
            return "green".equals(apple.getColor()) && apple.getWeight()<15;
        }
    }

    public static void main(String[] args) {
        Apple apple1 = new Apple("green", 10);
        Apple apple2 = new Apple("green", 30);
        Apple apple3 = new Apple("red", 25);
        Apple apple4 = new Apple("red", 12);

        Apple[] apples = new Apple[] {apple1, apple2, apple3, apple4};
        List<Apple> invetory = Arrays.asList(apples);

        System.out.println("Testing Predicate 1: Filter Red and Heavy Apples");
        List<Apple> results = filterApples(invetory, new AppleRedAndHeavyPredicate());
        results.stream().forEach(apple -> System.out.println(apple.getWeight()));

        System.out.println("Testing Predicate 2: Filter Green and Light Apples");
        List<Apple> results2 = filterApples(invetory, new AppleGreenAndLightPredicate());
        results2.stream().forEach(apple -> System.out.println(apple.getWeight()));
    }

}
