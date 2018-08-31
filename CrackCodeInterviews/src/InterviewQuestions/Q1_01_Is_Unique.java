package InterviewQuestions;


// August 20 2018
// https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2001.%20Arrays%20and%20Strings/Q1_01_Is_Unique/QuestionA.java
public class Q1_01_Is_Unique {

    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abc", "abcd", "abca", "kite"};
        for (String word : words) {
            System.out.println(word + ":" + isUniqueChars(word));

        }

    }
}
