package Leetcode;

public class XOROperationOnArray {
    // Leetcode 1486. XOR Operation in an Array
    // Time Complexity: O(n) where n is the length of the input array nums.
    // Space Complexity: O(n) since we are creating an array of size n to store
    // Time and space complexity can be optimized to O(1) by calculating the XOR directly without storing the array.
    public int xorOperation(int n, int start) {
        int nums[] = new int[n];
        int ans = nums[0];
        for(int i = 0 ; i<n ; i++){
            nums[i]= start + 2*i;
        }
        for(int i =0; i<n ; i++){
            ans^=nums[i];
        }
        return ans;
    }
    class Solution {
        // A more efficient solution without using an extra array.
        // Time Complexity: O(n) where n is the length of the input array nums.
        // Space Complexity: O(1) since we are using a constant amount of extra space
    public int xorOperation(int n, int start) {
        int ans = start;
        for(int i = 1; i<n;i++){
            ans^=(start+2*i);
        }
        return ans;
    }
}
}
