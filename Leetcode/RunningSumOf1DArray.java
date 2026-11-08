package Leetcode;

public class RunningSumOf1DArray {
    // Leetcode 1480. Running Sum of 1d Array
    // Time Complexity: O(n) where n is the length of the input array.
    // Space Complexity: O(n) where n is the length of the input array.
    // Space complexity can be reduced to O(1)

    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        for(int i =0 ; i<nums.length;i++){
            if(i ==0)  sum[i] =nums[i];
            else sum[i] = sum[i-1]+nums[i]; 
        }
        return sum;
    }
    // Space complexity reduced to O(1)
    class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 1; i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
}
