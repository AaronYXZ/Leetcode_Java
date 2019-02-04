package TwoPointer;

/*
Q:
https://leetcode.com/problems/container-with-most-water/description/

Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.

The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

S:
https://leetcode.com/problems/container-with-most-water/discuss/6091/Easy-Concise-Java-O(N)-Solution-with-Proof-and-Explanation
 */
public class L11_ContainsTheMostWater {
    public static int maxArea(int[] height){
        int result = 0, left = 0, right = height.length-1;
        while (left < right){
            result = Math.max(result, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) left ++;
            else right --;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] height = { 1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

}
