package TwoPointer;

public class L283_MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        int zero = 0;
        int nonZero = 0;
        while (zero < len && nonZero < len){
            if (nums[zero] != 0){
                zero++;
            }
            if (nums[nonZero] == 0){
                nonZero++;
            }
            if (nums[nonZero] != 0 && nums[zero] == 0 && nonZero > zero){
                nums[zero] = nums[nonZero];
                nums[nonZero] = 0;
                zero++;
                nonZero++;
                continue;
            }
            if (nums[nonZero] != 0 && nums[zero] == 0 && nonZero < zero){
                nonZero++;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}

