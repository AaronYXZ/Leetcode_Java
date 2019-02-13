package Math;

import java.util.ArrayList;
import java.util.List;
/*
https://leetcode.com/problems/self-dividing-numbers/description/
A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Example 1:
Input:
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
Note:

The boundaries of each input argument are 1 <= left <= right <= 10000.

https://leetcode.com/problems/self-dividing-numbers/discuss/109424/Java-solution-with-explanation-no-toString()-conversion
 The idea is to traverse each integer sequence from left to right incrementing by one (left, left + 1, left + 2,..., left + n, right). Each time check if the the current number i is self-divided.
 */

public class L728_SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> result = new ArrayList<Integer>();
        for (int i = left; i<=right; i++){
            if (isSelfDividing(i)) result.add(i);
        }
        return result;
    }
    public boolean isSelfDividing(int number){
        if (number < 9) return true;
        int n = number;
        while (n >0){
            int temp = n % 10;
            n /= 10;
            if (temp == 0 || number % temp != 0) return false;
        }
        return true;
    }
}
