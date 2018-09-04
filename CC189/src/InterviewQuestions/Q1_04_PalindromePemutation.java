package InterviewQuestions;

import java.util.HashMap;

public class Q1_04_PalindromePemutation {

    public static boolean PalindromePemutation(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            char temp = str.charAt(i);
            if (!map.containsKey(temp)) map.put(temp, 1);
            else{
                int count = map.get(temp);
                map.put(temp, count+1);
            }

        }

        int countOfOdd = 0;
        for (Character character : map.keySet()) {
            if (map.get(character) % 2 == 1) countOfOdd++;

        }

        return countOfOdd <=1;
    }


    public static void main(String[] args) {
        System.out.println(PalindromePemutation("cat tac"));
    }
}
