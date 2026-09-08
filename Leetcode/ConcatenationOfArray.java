public class ConcatenationOfArray {
//Leetcode 1929. Concatenation of Array
// Time Complexity: O(n) space Complexity: O(n) space
// Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] = nums[i] and ans[i + n] = nums[i] for 0 <= i < n (0-indexed).
// Return the array ans.
// use a for loop to fill the new array with the original array and its copy.

    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}

