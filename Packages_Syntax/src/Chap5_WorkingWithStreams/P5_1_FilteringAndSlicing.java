package Chap5_WorkingWithStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class P5_1_FilteringAndSlicing {


    public static void main(String[] args) {
        // filtering with a predicate
        List<Dish> menu = Dish.menu;
        List<Dish> vegetarianMenu = menu.stream()
                .filter(dish -> dish.isVegetarian())
                .collect(Collectors.toList());

        // filtering unique elements
        List<Integer> integers = Arrays.asList(1, 2, 1, 4, 3, 4, 5, 1);
        List<Integer> uniqueIntegers = integers.stream()
                .filter(integer -> integer % 2 != 0)
                .distinct()
                .collect(Collectors.toList());

        // truncating a stream
        List<Dish> dishes = menu.stream().filter(dish -> dish.getCalories() > 300)
                .limit(3)
                .collect(Collectors.toList());


    }
}
