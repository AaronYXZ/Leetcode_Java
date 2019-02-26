package String;

import java.util.LinkedList;
import java.util.List;
/*
https://leetcode.com/problems/reorder-log-files/description/
You have an array of logs.  Each log is a space delimited string of words.

For each log, the first word in each log is an alphanumeric identifier.  Then, either:

Each word after the identifier will consist only of lowercase letters, or;
Each word after the identifier will consist only of digits.
We will call these two varieties of logs letter-logs and digit-logs.  It is guaranteed that each log has at least one word after its identifier.

Reorder the logs so that all of the letter-logs come before any digit-log.  The letter-logs are ordered lexicographically ignoring identifier, with the identifier used in case of ties.  The digit-logs should be put in their original order.

Return the final order of the logs.



Example 1:

Input: ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]


Note:

0 <= logs.length <= 100
3 <= logs[i].length <= 100
logs[i] is guaranteed to have an identifier, and a word after the identifier.

https://leetcode.com/problems/reorder-log-files/discuss/193872/Java-Nothing-Fancy-15-lines-5ms-all-clear.
 */

public class L937_ReorderLogFiles {
    public static String[] reorderLogFiles(String[] logs){
        List<String> result = new LinkedList<>();
        int digitCount = 0;
        for (String log:logs){
            int letterCount = 0;
            String[] words = log.split(" ");
            if (!Character.isLowerCase(words[1].charAt(0))){
                result.add(log);
                digitCount++;
            }
            else{
                for (int i = 0; i < result.size() - digitCount; i++){
                    if (compareLog(result.get(letterCount), log) < 0){ // first string is smaller than second
                        letterCount ++;
                    }
                    else{
                        break;
                    }
                }
                result.add(letterCount, log);

            }
        }
        String[] resultString = new String[logs.length];
        for (int i = 0; i < logs.length; i++){
            resultString[i] = result.get(i);
        }
        return resultString;
    }
    private static int compareLog(String oriLog, String newLog){
        int s1 = oriLog.indexOf(" ") + 1;
        int s2 = newLog.indexOf(" ") + 1;
        int preCompute = oriLog.substring(s1).compareTo(newLog.substring(s2));
        if (preCompute == 0){
            preCompute = oriLog.substring(0, s1).compareTo(newLog.substring(0, s2));
        }
        return preCompute;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bbc";
        System.out.println(s1.compareTo(s2));
        String[] test = new String[]{"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
        String[] result = reorderLogFiles(test);
        System.out.println(result);
        System.out.println(s1.substring(3));
    }
}
