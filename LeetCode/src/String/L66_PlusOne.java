package String;

/*
Q:
https://leetcode.com/problems/plus-one/description/
S:
https://www.programcreek.com/2014/05/leetcode-plus-one-java/

Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

 */
public class L66_PlusOne {

    public static int[] plusOne(int[] digits){

        int flag = 1;
        for(int i = digits.length-1; i>=0; i--){
            int sum = digits[i] + flag;
            if (sum>=10){
                digits[i] = sum%10;
                flag = 1;
            }
            else{
                digits[i] = sum;
                flag = 0;
            }
        }

        if (flag == 1){
            int[] results = new int[digits.length + 1];
            System.arraycopy(digits, 0, results, 1 , digits.length);
            results[0] = 1;
            return results;
        }
        else return digits;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{9,9,9,9};
        for (int item:plusOne(digits))
            System.out.println(item);
        int[] digits2 = new int[]{1,9,9,9};
        for (int item:plusOne(digits2))
            System.out.println(item);
    }


}
