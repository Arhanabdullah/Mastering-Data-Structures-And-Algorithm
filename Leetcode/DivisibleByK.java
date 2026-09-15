package Leetcode;
//3521. Minimum Operations to Make Array Sum Divisible by K
//Time Complexity: O(n)
//Space Complexity: O(1)
//Given an array of integers nums and an integer k, return the minimum number of operations to make the sum of nums divisible by k. In one operation, you can choose an index i and replace nums[i] with nums[i] + 1.
public class DivisibleByK {

    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i<nums.length;i++){
            sum+=nums[i];
            
        }
        return sum%k;
    }
}

