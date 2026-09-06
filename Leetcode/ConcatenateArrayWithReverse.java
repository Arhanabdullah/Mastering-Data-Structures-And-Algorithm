public class ConcatenateArrayWithReverse {
//Leetcode 3925. Concatenate Array With Reverse
// Time Complexity: O(n) space Complexity: O(n) space
// Given an integer array nums, create a new array ans of length 2 * nums.length where ans[i] = nums[i] and ans[i + nums.length] = nums[nums.length - 1 - i] for 0 <= i < nums.length (0-indexed).
// Return the array ans.
// use two for loops to fill the new array with the original array and its reverse.
// use a new array to store the result and return it.
    public int[] concatWithReverse(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for(int i = 0 ; i<nums.length;i++){
            ans[i]= nums[i];
        }
        for(int i=0;i< nums.length ; i++){
            ans[nums.length+i] = nums[nums.length-1-i];
        }
        return ans;
    }

}
