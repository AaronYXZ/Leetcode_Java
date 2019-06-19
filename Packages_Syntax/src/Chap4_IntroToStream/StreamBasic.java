package Chap4_IntroToStream;

// https://github.com/java8/Java8InAction/blob/master/src/main/java/lambdasinaction/chap4/StreamBasic.java

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasic {

    // Java 7
    public static List<String> getLowerCalorieDishesInJava7(List<Dish> dishes) {
        List<Dish> lowCaloriesDishes = new ArrayList<>();
        for (Dish dish : dishes) {
            if (dish.getCalories() < 400) {
                lowCaloriesDishes.add(dish);
            }
        }

        List<String> lowCalorieDishNames = new ArrayList<>();
        Collections.sort(lowCaloriesDishes, new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(), o2.getCalories());
            }
        });
        for (Dish dish : lowCaloriesDishes) {
            lowCalorieDishNames.add(dish.getName());
        }
        return lowCalorieDishNames;
    }

    // Java 8
    public static List<String> getLowerCalorieDishesInJava8(List<Dish> dishes) {
        return dishes.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        getLowerCalorieDishesInJava7(Dish.menu).forEach(System.out::println);

        System.out.println("--------------------");

        getLowerCalorieDishesInJava8(Dish.menu).forEach(System.out::println);
    }
}
