package Array;
// Passed

/*
Q:
https://leetcode.com/problems/remove-element/description/

 */

public class L27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i=0, j = 0;
        while(i < nums.length){
            if (nums[i] != val){
                nums[j++] = nums[i++];
            }
            else{
                i++;
            }
        }
        return j;
    }
}
