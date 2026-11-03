package Leetcode;

public class MinimumMovestoEqualArrayElementsIII {
    //Leetcode 3736: Minimum Moves to Equal Array Elements III
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    //not optimal. need a better solution
    public int minMoves(int[] nums) {
        int max =0;
        int count =0;
        for(int i = 0 ; i<nums.length; i++){
            if(max<nums[i]) max= nums[i];
        }
        for(int i = 0 ; i<nums.length; i++){
            count = count + max-nums[i];
        }
        return count;
    }
    //optimal solution
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    
    class Solution {
    public int minMoves(int[] nums) {
        int max =0;
        int sum =0;
        for(int i = 0 ; i<nums.length; i++){
            if(max<nums[i]) max= nums[i];
            sum+= nums[i];
        }
        return nums.length*max-sum;
    }
}
}
