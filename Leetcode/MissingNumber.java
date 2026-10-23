package Leetcode;

public class MissingNumber {
    // Leetcode 268. Missing Number
    // Time Complexity: O(n) where n is the length of the input array nums.
    // Space Complexity: O(1) since the size of the result array is constant (10001) and does not depend on the input size.
    // Not the most efficient solution, but it works for the given constraints.
    public int missingNumber(int[] nums) {
        int max = nums[0];
        for(int i =0 ; i<nums.length;i++){
            if(nums[i]>max) max= nums[i];
        }
        int[] hashArr = new int[10001];
        for(int i =0 ; i<nums.length;i++){
            hashArr[nums[i]]++;
        }   
        for(int i = 0; i<hashArr.length;i++){
            if(hashArr[i] == 0) return i;
        }
        return 0;
    }
    // A more efficient solution using the formula for the sum of the first n natural numbers.
    // Time Complexity: O(n) where n is the length of the input array nums.
    // Space Complexity: O(1) since we are using a constant amount of extra space
    class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n*(n+1)/2;
        int sum =0;
        for(int num: nums){
            sum+=num;
        }
        return totalSum - sum;
    }
}
}
