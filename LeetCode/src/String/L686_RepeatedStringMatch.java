package String;
/*
https://leetcode.com/problems/repeated-string-match/description/
Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it. If no such solution, return -1.

For example, with A = "abcd" and B = "cdabcdab".

Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").

Note:
The length of A and B will be between 1 and 10000.

https://leetcode.com/problems/repeated-string-match/discuss/108086/Java-Solution-Just-keep-building-(OJ-Missing-Test-Cases)
The idea is to keep string builder and appending until the length A is greater or equal to B.


 */

public class L686_RepeatedStringMatch {
    public int repeatedStringMatch(String A, String B){
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        // build the builder until it's equal or greater than lenght of B
        while (stringBuilder.length() < B.length()){
            stringBuilder.append(A);
            count++;
        }
        // if builder contains B, return count
        if (stringBuilder.toString().contains(B)) return count;
        // append A to builder one more time and check if it contains B. This is the last case A could contain B
        // B is consists of end of A + All of A + start of A
        if (stringBuilder.append(A).toString().contains(B)) return count + 1;
        return -1;

    }
}
