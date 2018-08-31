package Chap4_IntroToStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                    new Dish("beef", false, 700, Dish.Type.MEAT),
                    new Dish("chicken", false, 400, Dish.Type.MEAT),
                    new Dish("french fries", true, 530, Dish.Type.OTHER),
                    new Dish("rice", true, 350, Dish.Type.OTHER),
                    new Dish("season fruit", true, 120, Dish.Type.OTHER),
                    new Dish("pizza", true, 550, Dish.Type.OTHER),
                    new Dish("prawns", false, 400, Dish.Type.FISH),
                    new Dish("salmon", false, 450, Dish.Type.FISH));

    public static void main(String[] args){

        //Chap 4
//        List<Dish> lowerCaloricDishesName = menu.stream()
//                .filter(dish -> dish.getCalories() < 400)
//                .sorted(Comparator.comparing(Dish::getCalories))
//                .collect(Collectors.toList());
//        System.out.println(lowerCaloricDishesName.size());

//        List<String> names = menu.stream()
//                .filter(dish -> dish.getCalories()>300)
//                .map(dish -> dish.getName())
//                .limit(3)
//                .collect(Collectors.toList());
//
//        System.out.println(names);
//
//        // P168
//        List<String> names2 = menu.stream()
//                .filter(d -> {System.out.println("Filtering "+d.getName());
//                return d.getCalories()>300;})
//                .map(d -> {System.out.println("Mapping "+ d.getName());
//                return d.getName();})
//                .limit(3)
//                .collect(Collectors.toList());
//
//        long count = menu.stream()
//                .filter(dish -> dish.getCalories()>100)
//                .distinct()
//                .count();
//        System.out.println(count);

        // Chap 5
        List<String> vegeDishes = menu.stream()
                .filter(dish -> dish.isVegetarian())
                .map(dish -> dish.getName())
                .collect(Collectors.toList());
        System.out.println(vegeDishes);

        Optional<Integer> count = menu.stream()
                .map(dish -> 1)
                .reduce((a,b) -> a+b);
        System.out.println(count);

    }
}