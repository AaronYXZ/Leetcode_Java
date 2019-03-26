package Chap7_Collections;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args){
        String[] strings = {"painful", "mainly", "gaining", "raindrops"};

        for (int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }

        Arrays.sort(strings);

        for (int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }

    }
}
