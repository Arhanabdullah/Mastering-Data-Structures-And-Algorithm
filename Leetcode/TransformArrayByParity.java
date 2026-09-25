package Leetcode;

import java.util.Arrays;

public class TransformArrayByParity {

    // Leetcode 3467: Transform Array by Parity
    // Time Complexity: O(nlogn)
    // Space Complexity: O(1)
    // Not Optimal solution
    // Solution: Iterate through the array and check if the number at the current index is even or odd.
    // If the number is even, set it to 0. If the number is odd
    // set it to 1. Finally, sort the array and return it.
    public int[] transformArray(int[] nums) {
        for(int i =0; i< nums.length;i++){
            if(nums[i]%2 ==0) nums[i]=0;
            else nums[i]=1;
        }
        Arrays.sort(nums);
        return nums;
        
    }
    class Solution {
        // Leetcode 3467: Transform Array by Parity
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        // Optimal solution
    public int[] transformArray(int[] nums) {
        int even =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]%2 ==0) even+=1;
        }
        for(int i =0 ; i<nums.length;i++){
            if(even !=0){
                nums[i]=0;
                even--;
            }
            else{
                nums[i]=1;
            }
        }
        return nums;
    }
}
}

