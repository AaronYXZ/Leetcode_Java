package Chap2_BehaviorParameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz21 {
    // Quiz2.1 is similar to Attempt 4, just another way to practice behavior parameterization
    //

    public static void PrettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
        for (Apple apple : inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }

    public static class AppleColorFormatter implements AppleFormatter{

        public String accept(Apple apple) {
            return apple.getColor();
        }
    }

    public static class AppleFancyFormatter implements AppleFormatter{
        public String accept(Apple apple){
            String isHeavy = apple.getWeight() > 20 ? "Heavy" : "NotHeavy";
            String color = apple.getColor();
            return "This apple is " + isHeavy + " and the color is "+color;
        }
    }

    public static void main(String[] args) {
        Apple apple1 = new Apple("green", 10);
        Apple apple2 = new Apple("green", 30);
        Apple apple3 = new Apple("red", 25);
        Apple apple4 = new Apple("red", 12);

        Apple[] apples = new Apple[] {apple1, apple2, apple3, apple4};
        List<Apple> inventory = Arrays.asList(apples);

        System.out.println("Testing Formatter 1: This is how color formatter works");
        PrettyPrintApple(inventory, new AppleColorFormatter());

        System.out.println("Testing Formatter 2: This is how fancy formatter works");
        PrettyPrintApple(inventory, new AppleFancyFormatter());
    }

}
