package Math;
/*
https://leetcode.com/problems/minimum-moves-to-equal-array-elements/description/
Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.

Example:

Input:
[1,2,3]

Output:
3

Explanation:
Only three moves are needed (remember each move increments two elements):

[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
S:
every time add 1 for n-1 elements equals to minus 1 from one element. For element n_i, it takes n_i - n_min times to
make it equal to n_min. Result is sum of all n_i - n_min = sum of nums - n * n_min
 */

public class L453_MinimumMovesToEqualArrayElements {
    public int minMoves(int[] nums){
        int min = nums[0];
        int result = 0;
        for (int n:nums){
            result += n;
            if (n < min) min = n;
        }
        return result - nums.length * min;
    }
}
