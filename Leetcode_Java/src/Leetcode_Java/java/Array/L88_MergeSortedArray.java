package Array;

import java.util.Arrays;

/*
Q:
https://leetcode.com/problems/merge-sorted-array/description/
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]

S：

 */

public class L88_MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] dummy = Arrays.copyOfRange(nums1, 0, m);
        int i = 0, j = 0, k = 0;
        while (i < m && j < n){
            if (dummy[i] <= nums2[j]){
                nums1[k++] = dummy[i++];
            }
            else{
                nums1[k++] = nums2[j++];
            }
        }
        if (i < m){
            for (int l = i; l < m; l++){
                nums1[k++] = dummy[l];
            }
        }
        if (j < n){
            for (int l = j; l < n; l++){
                nums1[k++] = nums2[l];
            }
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3, nums2,3);
    }
}
