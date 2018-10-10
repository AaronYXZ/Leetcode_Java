package Array;

public class L26_RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 1, j = 1;
        int pre = nums[0];
        while (i < nums.length) {
            if (nums[i] == pre) {
                i++;
            } else {
                nums[j] = nums[i++];
                pre = nums[j++];
            }
        }

        return j;
    }
}
