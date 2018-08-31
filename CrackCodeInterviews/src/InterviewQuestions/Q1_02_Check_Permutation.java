package InterviewQuestions;

import java.util.Arrays;

public class Q1_02_Check_Permutation {

    public static String sort(String str){
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);

    }

    public static boolean Permutation(String str1, String str2){
        return sort(str1).equals(sort(str2));

    }

    public static void main(String[] args) {
        String str1 = "dog";
        String str2 = "god";
        String str3 = "apple";
        String str4 = "Apple";

        System.out.println(str1 + " & " + str2+":"+Permutation(str1, str2));
        System.out.println(str3 + " & " + str4+":"+Permutation(str3, str4));



    }

}
