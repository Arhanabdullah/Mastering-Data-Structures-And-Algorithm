package Leetcode;

public class ComputeAlternatingSum {
    //Leetcode  3701. Compute the Alternating Sum of an Array
    //Given an integer array nums, return the alternating sum of nums.
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public int alternatingSum(int[] nums) {
        int sign = 1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + (sign*nums[i]);
            sign = sign * -1;
        }
        return sum;
    }

}
