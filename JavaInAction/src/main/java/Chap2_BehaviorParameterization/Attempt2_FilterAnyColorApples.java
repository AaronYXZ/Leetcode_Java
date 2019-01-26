package Chap2_BehaviorParameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Attempt2_FilterAnyColorApples {

    public static List<Apple> filterAppleByColor(List<Apple> inventory, String color){
        List<Apple> result = new ArrayList<>();

        for (Apple apple:inventory){
            if (color.equals(apple.getColor())){
                result.add(apple);
            }
        }

        return result;
    }

    public static void main(String[] args){
        Apple apple1 = new Apple("green", 10);
        Apple apple2 = new Apple("green", 20);
        Apple apple3 = new Apple("red", 25);
        Apple apple4 = new Apple("red", 15);

        Apple[] apples = new Apple[]{apple1, apple2, apple3, apple4};
        List<Apple> invetory = Arrays.asList(apples);

        List<Apple> result = filterAppleByColor(invetory, "red");
        result.stream().forEach(apple -> System.out.println(apple.getWeight()));

        List<Apple> result2 = filterAppleByColor(invetory, "green");
        result2.stream().forEach(apple -> System.out.println(apple.getWeight()));

    }
}
