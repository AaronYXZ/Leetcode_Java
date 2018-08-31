package InterviewQuestions;

import java.util.Arrays;

public class Q1_05_OneAway {

    public static boolean OneAway(String str1, String str2) {
        if (str1.length() == str2.length()) {
            return OneReplace(str1,  str2);
        } else if (str1.length() + 1 == str2.length()) {
            return OneInsert( str1,  str2);
        } else if (str2.length() + 1 == str1.length()) {
            return OneInsert( str2,  str1);
        } else {
            return false;
        }
    }

    public static boolean OneReplace(String str1, String str2) {
        boolean foundDifference = false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (foundDifference) {
                    return false;
                } else {
                    foundDifference = true;
                }
            }
        }
        return true;
    }

    public static boolean OneInsert(String str1, String str2) {
        int index1 = 0;
        int index2 = 0;
        while(index1 < str1.length() && index2<str2.length() ){
            if (str1.charAt(index1) != str2.charAt(index2)){
                if (index1 != index2) return false;
                else index2++;
            }
            else{
                index1++;
                index2++;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(OneAway("abc", "abd"));
        System.out.println(OneAway("pales", "pale"));
        System.out.println(OneAway("pale", "bae"));

    }
}
