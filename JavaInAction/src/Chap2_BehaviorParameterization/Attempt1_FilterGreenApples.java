package Chap2_BehaviorParameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Attempt1_FilterGreenApples {


    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory){
            if("green".equals(apple.getColor())){
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

        List<Apple> result = filterGreenApples(invetory);
        result.stream().forEach(apple -> System.out.println(apple.getWeight()));
    }

}
