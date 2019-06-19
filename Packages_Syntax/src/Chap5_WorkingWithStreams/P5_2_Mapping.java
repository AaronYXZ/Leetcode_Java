package Chap5_WorkingWithStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class P5_2_Mapping {
    // streams support the method map, which takes a functoion as argument, the function is applied to
    // each element, mapping it into a new element

    public static void main(String[] args) {
        List<Dish> menu = Dish.menu;

        // Applying a function to each element in stream
        List<String> dishNames = menu.stream().map(Dish::getName)
                .collect(Collectors.toList());

        List<String> strings = Arrays.asList("Java8", "Lambdas", "In", "Action");
        List<Integer> stringLen = strings.stream().map(String::length).collect(Collectors.toList());

        List<Integer> dishNameLen = menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(Collectors.toList());

        // Flattening streams
        // Todo P183
        List<String> words = Arrays.asList("Hello", "World");
        List<String> uniqueChars = words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        // quiz
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = integers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        // Finding and matching
        // allMatch, anyMatch, noneMatch, findFirst, findAny

        //        if (menu.stream().anyMatch(dish -> dish.isVegetarian())){
        if (menu.stream().anyMatch(Dish::isVegetarian)) {

            System.out.println("menu is somewhat vegetarian firendly");
        }
        boolean isHealth = menu.stream().allMatch(dish -> dish.getCalories()<1000);
        boolean isHealth2 = menu.stream().noneMatch(dish -> dish.getCalories()>=1000);

        Optional<Dish> dish = menu.stream().filter(Dish::isVegetarian).findAny();

        // Reducing
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int sum = numbers.stream().reduce(0, (a,b)->a + b);
        int sum2 = numbers.stream().reduce(0,Integer::sum);
        Optional<Integer> max = numbers.stream().reduce((x, y) -> (Math.max(x,y)));
        Optional<Integer> max2 = numbers.stream().reduce(Integer::max);

        // Quiz


    }
}
