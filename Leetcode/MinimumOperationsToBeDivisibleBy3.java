package Leetcode;

public class MinimumOperationsToBeDivisibleBy3 {
    // Leetcode 3190: Minimum Operations to Make Array Divisible by 3
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    //Simple direct calculation solution
    public int minimumOperations(int[] nums) {
        int count =0;
        for(int num:nums){
            if(num %3 ==0) count +=0;
            else count +=1;
        }
        return count;
    }
}

