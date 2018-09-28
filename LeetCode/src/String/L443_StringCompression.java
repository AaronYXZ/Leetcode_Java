package String;

import java.util.Stack;

/*

Q:
https://leetcode.com/problems/string-compression/

Given an array of characters, compress it in-place.

The length after compression must always be smaller than or equal to the original array.

Every element of the array should be a character (not int) of length 1.

After you are done modifying the input array in-place, return the new length of the array.


Follow up:
Could you solve it using only O(1) extra space?


Example 1:
Input:
["a","a","b","b","c","c","c"]

Output:
Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]

Explanation:
"aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".
Example 2:
Input:
["a"]

Output:
Return 1, and the first 1 characters of the input array should be: ["a"]

Explanation:
Nothing is replaced.
Example 3:
Input:
["a","b","b","b","b","b","b","b","b","b","b","b","b"]

Output:
Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].

Explanation:
Since the character "a" does not repeat, it is not compressed. "bbbbbbbbbbbb" is replaced by "b12".
Notice each digit has it's own entry in the array.
Note:
All characters have an ASCII value in [35, 126].
1 <= len(chars) <= 1000.

S:
https://leetcode.com/problems/string-compression/discuss/92559/Simple-Easy-to-Understand-Java-solution
 */

public class L443_StringCompression {
    public int compress(char[] chars){
        int indexAns = 0, index = 0;
        while (index <chars.length){
            char currentChar = chars[index];
            int count = 0;
            while (index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if (count != 1){
                for (char c:Integer.toString(count).toCharArray()){
                    // convert char count to string then to char array ()
                    // use loop to fix problems where char count greater than 2 digits
                    chars[indexAns++] = c;
                }
            }
        }
        return indexAns;
    }

    public int compressNaive(char[] chars){
        int outerCounter = 0;
        Stack<Character> stack = new Stack<>();
        stack.push(chars[0]);
        int innercounter = 1;

        for (char c:chars){
            if (stack.peek() == c){
                innercounter ++;
            }
            else {
                if (innercounter > 1) outerCounter +=2;
                else outerCounter ++;
                stack.push(c);
                innercounter = 1;
            }
        }
        if (innercounter > 1) outerCounter +=2;
        else outerCounter ++;

        return Math.min(chars.length, outerCounter);
    }

    public static void main(String[] args) {
        Character z = 'z';
        Character z2 = 'z';
        System.out.println(z == z2);
    }
}
