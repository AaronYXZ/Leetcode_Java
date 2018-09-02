package String;

/*
Q:https://leetcode.com/problems/length-of-last-word/description/
S:https://leetcode.com/problems/length-of-last-word/discuss/21878/a-single-line-of-code-in-java
 */
public class L58_LengthOfLastWord {
    public static int solution1(String s){
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }

    public static void main(String[] args) {
        System.out.println(solution1("abc def g   "));
        System.out.println(solution1("abc def g   ad"));

    }
}
