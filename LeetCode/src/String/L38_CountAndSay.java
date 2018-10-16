package String;

/*
Q:
https://leetcode.com/problems/count-and-say/description/
S:
    https://www.jiuzhang.com/solutions/count-and-say/
 */

public class L38_CountAndSay {
    public static String countAndSay(int n){
        String oldString = "1";
        while(--n>0){
            StringBuilder stringBuilder = new StringBuilder();
            char[] oldChars = oldString.toCharArray();

            for(int i =0; i < oldChars.length; i++){
                int count = 1;
                while(i+1< oldChars.length && oldChars[i] == oldChars[i+1]){
                    count++;
                    i++;
                }
                stringBuilder.append(String.valueOf(count) + String.valueOf(oldChars[i]));
            }
            oldString = stringBuilder.toString();
        }

        return oldString;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(6));
    }
}
