package Leetcode;
//Leetcode 1. Two Sum
//Brute Force Solution
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2 || nums.length > Math.pow(10, 4))
            return new int[] {};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < Integer.MIN_VALUE || nums[i] > Integer.MAX_VALUE)
                return new int[] {};
            if (target < Integer.MIN_VALUE || target > Integer.MAX_VALUE)
                return new int[] {};
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}


