package TwoPointer;
/*
Q:
https://leetcode.com/problems/trapping-rain-water/description/

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.


The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!

Example:

Input: [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6

S:
https://leetcode.com/problems/trapping-rain-water/discuss/17391/Share-my-short-solution.
 */

public class L43_TrappingRainWater {

    public int trap(int[] height) {
        int a = 0;
        int b = height.length - 1;
        int max = 0;
        int leftmax = 0;
        int rightmax = 0;
        while (a <= b) {
            leftmax = Math.max(leftmax, height[a]);
            rightmax = Math.max(rightmax, height[b]);
            if (leftmax < rightmax) {
                max += (leftmax - height[a]);       // leftmax is smaller than rightmax, so the (leftmax-A[a]) water can be stored
                a++;
            } else {
                max += (rightmax - height[b]);
                b--;
            }
        }
        return max;
    }
}
