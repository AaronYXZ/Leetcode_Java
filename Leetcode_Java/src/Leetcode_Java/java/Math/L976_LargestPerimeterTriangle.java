package Math;

import java.util.Arrays;
/*
https://leetcode.com/problems/largest-perimeter-triangle/
Given an array A of positive lengths, return the largest perimeter of a triangle with non-zero area, formed from 3 of these lengths.

If it is impossible to form any triangle of non-zero area, return 0.



Example 1:

Input: [2,1,2]
Output: 5
Example 2:

Input: [1,2,1]
Output: 0
Example 3:

Input: [3,2,3,4]
Output: 10
Example 4:

Input: [3,6,2,3]
Output: 8


Note:

3 <= A.length <= 10000
1 <= A[i] <= 10^6
 */

public class L976_LargestPerimeterTriangle {
    public int largestPerimeter(int[] A) {
        // sort the array, start from the top 3 largest element, check if they can form a triangle
        // return sum of the 3 elements that form a triangle, otherwise, return 0

        Arrays.sort(A);
        int l=0, m=0, s = 0;
        for (int i = A.length-1; i>=2; i--){
            l = A[i];
            m = A[i-1];
            s = A[i-2];
            if (m + s > l) return m + s + l;
        }
        return 0;
    }
}
