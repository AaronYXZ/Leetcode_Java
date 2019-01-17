package String;

/*
Q:
https://leetcode.com/problems/zigzag-conversion/
S:
https://leetcode.com/problems/zigzag-conversion/solution/
Approach 2 Visit by row

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I


 */

public class L6_ZigZagConversion {

    public static String solution1SortByRow(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder stringBuilder = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i< numRows; i++){
            for (int j = 0; j + i<n; j +=cycleLen){
                stringBuilder.append(s.charAt(i+j));
                if (i != 0 && i != numRows-1 && j + cycleLen - i < n){
                    stringBuilder.append(s.charAt(j + cycleLen - i));
                }
            }
        }
        return stringBuilder.toString();
    }
}
