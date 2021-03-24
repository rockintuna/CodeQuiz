package leetcode;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int num1;
        int num2;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            num1 = nums[i];
            for (int j=i+1; j < nums.length; j++) {
                num2 = nums[j];
                if ( num1 + num2 == target ) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 12;
        nums[3] = 15;
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
}
